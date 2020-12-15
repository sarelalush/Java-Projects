import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
	public static final double MaxItem = 5.0E8;
	public static final double MaxVal = 1000000;
	public static final double MaxLine = 1000;
	
	public void process (String fileName) {
		File f = new File(fileName);
		int line_cnt = 0 ;
		boolean flag = true;
		double sum_numbers = 0 ;
		try {
		Scanner sc = new Scanner(f);
			try {
				if(!sc.hasNext()) {
					throw new FileEmptyException("Exception program - file empty");
				}
				while(sc.hasNext()) {
					String s = sc.nextLine();
					String[] n = s.split(" ");
					double number = 0;
					try {
						number = Double.parseDouble(n[0]);	
						
						if(n.length>1) {
							throw new MultipleEntriesPerLine("Exception program - multiple entries in a line.\n"+
									(((n.length)/2)+1) + " entries in line "+line_cnt);
						}
						else if (number>=MaxVal || number<=(-MaxVal)) 
						{
							throw new NumberTooLarge("Exception program - entry too big\r\n"
									+ "offending entry: " +number+ " after processing "+line_cnt+" lines.");
						
						}
						else if(line_cnt > MaxLine&& flag)
						{
							
							flag = false;
							sum_numbers +=  number;
							throw new SumOfLinesException("Exception program - Too many entries\n"
									+ "after processing " +line_cnt+ " lines."
									+ "");
							
						}
						else if(sum_numbers > MaxItem && flag)
						{
							flag = false;
							line_cnt--;
							sum_numbers +=  number;
							throw new SumEntriesTooLarge("Exception program - sum too large.\n"
									+ "is 5.00999499E8(exceeding 5.0E8) after processing "+line_cnt+" lines."
									+ "");
							
						}
						else {
							sum_numbers += number;
							line_cnt++;
						}
						
					}
					catch(NumberFormatException e) {
						System.err.println("Exception program - not a number.\n"
								+ "For input string: "+'"'+s+'"'+" after processing "+line_cnt+" lines.");
					}
					catch(MultipleEntriesPerLine e){ 
						System.err.println(e.getMessage());
					}
					catch(NumberTooLarge e) {
						System.err.println(e.getMessage());
					}
					catch(SumOfLinesException e) {
						System.err.println(e.getMessage());
						line_cnt ++;

					}
					catch(SumEntriesTooLarge e) {
						System.err.println(e.getMessage());
						line_cnt++;
					}
					
				}
				sc.close();
			}
			catch(FileEmptyException e) {
				System.err.println(e.getMessage());
			}
				
		}
		catch (FileNotFoundException e) {
			System.err.println("Exception program - file not found");
		}

		if(line_cnt!=0 && sum_numbers!=0)
		{
		System.out.println(line_cnt+" lines were processed.\n"
				+ "Sum of all entries is "+sum_numbers);
		}

	}
}
