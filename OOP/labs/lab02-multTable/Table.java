
public class Table {
	private int[][] arr;
	private int width;
	private int height;
	
	public Table(int w, int h) 
	{
		this.width = w;
		this.height = h;
		this.arr = new int[w+1][h+1];
		for(int i=0;i<=w;i++) {
			for(int j=0;j<=h;j++)
			{
				this.arr[i][j]=i*j;
			}
		}
	}
	
	void display(int w , int h)
	{
		System.out.printf("Multiplication Table ([1..%d]x[1..%d]) \n\n",w,h);
		int i =0, j = 0;
		for(i=0;i<=w;i++) {
			for(j=0;j<=h;j++)
			{
				if(i==0 && j==0)
				{
					System.out.printf("%4s"," ");
				}
				else if(i == 0)
				{
					System.out.printf("%4d",j);
				}
				else if(j==0)
				{
					System.out.printf("%4d",i);
				}
				
				else
				{
					System.out.printf("%4d",arr[i][j]);
				}
			}
			System.out.printf("\n");
		}
	}
	
	void display( int fc, int tc, int fr, int tr )
	{
		System.out.printf("Multiplication Table ([%d..%d]x[%d..%d])\n\n",fc,tc,fr,tr);
		
		int i =0, j = 0;
		for(i=fr-1;i<=tr;i++) {
			for(j=fc-1;j<=tc;j++)
			{
				if(i==fr-1 && j == fc-1)
				{
					System.out.printf("%6s"," ");
				}
				else if(i == fr-1) {
					System.out.printf("%6d",j);
				}
				else if(j==fc-1)
				{
					System.out.printf("%6d",i);
				}
				else
				{
					System.out.printf("%6d",arr[i][j]);
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
		System.out.printf("\n");
	}
	
}



