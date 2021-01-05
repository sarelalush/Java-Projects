
public class Lab10Test {

	public static void main( String[] args )
	{
		BasicPizza p4 = new BasicPizza( 2, 34 );
		System.out.println( p4 );
		IPizza p3 = new OlivesTopping( p4, 8 );
		System.out.println( p3 );
		OnionTopping p2 = new OnionTopping( p3, 16 );
		System.out.println( p2 );
		IPizza p1 = new OlivesTopping( p2, 8 );
		System.out.println( p1 );
	}

}
