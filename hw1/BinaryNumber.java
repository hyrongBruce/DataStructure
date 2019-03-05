package hw1;

import java.util.Arrays;



/*This is 1st homework about Java Programming
 *BinaryNumber: Using Little-endian format
 *Author:Haoyu Rong
 *@stevens CS-570
 *used Exception, plz use try catch to test!!!
 */
public class BinaryNumber {
	//data field
	/*Overflow shows if add 2 number together which the length is overflow
	 *char[] b is using to save numbers
	 */
	
	private char[] b;
	private boolean overflow;
	//constructor
	public BinaryNumber(int length) {
		// return length with only 0
		this.b = new char[length];
		for(int i=0;i<length;i++){
			b[i] = '0';
		}
	}
	public BinaryNumber(String str) throws Exception {
		// return what number you input
		this.b = str.toCharArray();
		//check if valid input
		for(int i=0;i<b.length;i++){
			if(b[i] == '0' || b[i] == '1'){
				System.out.println("Valid Input");
			}else{
				System.out.println("Wrong Input"+b[i]);
				throw new Exception("Wrong Input");
			}
		}
	}
	
	//Basic Method
	public int getLength() {
		//return number length
		int x = this.b.length;
		return x;
	}
	public int getDigit(int index){
		
		if(index>=0 && index<b.length ){
			int a =Character.getNumericValue(this.b[index]);
			return a;
		}else{
			System.out.println("index out of bounder @getDigit() method, return -1");
			return -1;
		}
		
	}
	public int toDemical(){
		//real demical number
		int sum = 0;
		for(int i = 0; i< b.length; i++){
			//Math.pow(x,y) returns double type; also b[i] is char type
			double j = (Character.getNumericValue(b[i])*Math.pow(2, i));
			//remember to change the type: double to int
			sum = (int)(j+ sum);
		}
		return sum;
	}
	public void shiftR(int amount) throws Exception{
		/*shift to right, new digit fill with '0'
		 * int digit : is using for fill '0' in the amount we shift.
		 * in the loop. Everytime we fill a '0', let digit --; 
		 */
		if(amount<0){
			System.out.println("amount should >0");
			throw new Exception("invalid input");
		}
		char[] b1 = new char[b.length + amount];
		int digit =amount;
		for(int i=0; i<b1.length; i++){
			if(digit>0){
				b1[i]='0';
				digit --;
			}else{
				b1[i]= b[i-amount];
			}
		}
		//let b covered with new b1;
		b = b1.clone();
	}
	//Advanced Method
	public void add(BinaryNumber b2) {
		//remember to set overflow flag
		if(b.length != b2.getLength()){
			System.out.println("The 2 numbers are not COINCIDE, but still works");
		}
		char[] bNew = new char[b.length];
		//carried digit
		int carried=0;
		
		for(int i =0 ; i<b.length; i++){
			int tem =Character.getNumericValue(b[i])+b2.getDigit(i);
			if(tem == 0 && carried ==0){
				bNew[i] = '0';
			}
			if(tem == 0 && carried ==1){
				bNew[i] = '1';
				carried = 0;
			}
			if(tem == 1 && carried ==0){
				bNew[i] = '1' ;
			}
			if (tem ==1 && carried == 1) {
				bNew[i] = '0';
				carried = 1;
			}
			if(tem == 2 && carried == 0){
				bNew[i] = '0';
				carried = 1;
			}
			if(tem == 2 && carried == 1){
				bNew[i] = '1';
				carried = 1;
			}
		}
		b = bNew.clone();
		if (carried == 1) {
			overflow = true;
		}else{
			overflow = false;
		}
		
	}
	public void clearOverflow() {
		this.overflow = false;
	}
	
	public String toString(){
		String s1 ="";
		for(int i =0 ; i<b.length; i++){
			s1= s1 +b[i];
		}
		if (overflow == false) {
			return "the number is: "+ s1;
		}else {
			return "the number is: "+ s1 + ";  Overflow.";
		}
		
	}
//	public static void main(String[] args) {
//		try {
//			BinaryNumber b1= new BinaryNumber("111");
//			System.out.println(b1.b);
//			System.out.println(b1.getDigit(0));
//			System.out.println(b1.toString());
//			System.out.println(b1.toDemical());
//			System.out.println(b1.getLength());
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
}
