package week2;
/* this is for lecture 1 page50-->end page example
 * */
public class Example {
/*compute sum of all even number from 2- 200 unless they r multiples of 7
 * such as 2, 4, 6 and etc*/
	public static int sum(){
		int j = 2;
		int sum = 0;
//		for(int i=1;i<=100;i++){
//			if(j%7 != 0){
//				sum = sum + j;
////				System.out.println(j);
//				j = j + 2;
//			}else{
////				System.out.println(j);
//				j = j + 2;
//			}
//		}
		do{
			if((j%7 !=0) && (j%2 ==0)){
			sum = sum+j;
			}

			j++;
		}while(j<=200);
		
		return sum;
	}
}
