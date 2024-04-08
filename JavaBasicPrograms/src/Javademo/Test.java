package Javademo;
//Singleton class Demo 
public class Test {

	public static Test t=null;
	private Test() // Private Constructor
	{
	
	
	}
	public static Test getTest() { //Factory method
		if(t==null)
		{
			t=new Test();
		}
		return t;
	
	}
public class Client{
}
public static void main(String[] args) {
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());

	}

}

