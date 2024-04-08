package java8BasicPrograms;

public class RunnableMethod {

	public static void main(String[] args) {
		Thread myThread=new Thread(new Runnable(){

			@Override
			public void run() {
			System.out.println("Print inside Runnable");
				
			}
		
		});
		myThread.run();
	
		Thread myLambdaThread= new Thread(()->System.out.println("Printed inside my LambdaThread Runnable"));
		myLambdaThread.run();
}
}