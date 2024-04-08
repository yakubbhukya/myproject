package Javademo;

public class PrintBeforeInt {

	public static void main(String[] args) {
		   int[] num={24,0,26,0,7,0,35};

		for(int i=0;i<num.length;i++) {
		if(num[i]==0){
		System.out.print(num[i]+" ");
		} }
		for(int i=0;i<num.length;i++) {
		    if(num[i]!=0){
		System.out.print(num[i]+" ");
		}
		}
	}
}  
		
