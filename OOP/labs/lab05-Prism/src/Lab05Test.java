public class Lab05Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle c = new Circle( 1.784 );
		 Prism p1 = new Prism( c, 3 );
		 Square s = new Square( 2.828 );
		 Prism p2 = new Prism( s, 3.75 );

		 System.out.println( "p1: " + p1.volume() );
		 System.out.println( "p2: " + p2.volume() ); 
	}

}
