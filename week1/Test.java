package week1;

public class Test {
	public static void main(String[] args){
		/*just use width and length as (x,y) to calculate distance*/
		Rectangle r1 = new Rectangle(1.5, 2.9);
		Rectangle r2 = new Rectangle(3.0, 5.0);

		System.out.println(r1);
		System.out.println(r1.getHeight());
		System.out.println(r1.area());
		System.out.println(Rectangle.distance(r1, r2));
		/*Test for sum from even 2-200 && not multiple of 7*/
		System.out.println(Example.sum());
		/*Test of String*/
		String x1 = "woxiangshuijiaojiao";
		String x2 = x1;
		String x3 = "WOXI123ANGSHUIJIAOJIAO";
		String x4 = "woxiangshuijiaojao";
		
		System.out.println(x1.charAt(1));
		System.out.println(x1.length());
		System.out.println(x1.indexOf("j"));
		//need regular expression test
		System.out.println(x1.toUpperCase());
		/*substring(x), after index x, include x;
		 *substring(x,y), after index x, slice length y;
		 */
		System.out.println(x1.substring(1));
		System.out.println(x1.substring(0,6));
		
		System.out.println(x1 == x2);
		System.out.println(x1.equals(x2));
		
		System.out.println(x1 == x3);
		System.out.println(x1.equals(x3));
		/*this method return int, 0 means equal, others means differ words*/
		System.out.println(x1.compareToIgnoreCase(x3) );
		
		
		System.out.println(x1 == x4);
		System.out.println(x1.equals(x4));
		
		
	}
}
