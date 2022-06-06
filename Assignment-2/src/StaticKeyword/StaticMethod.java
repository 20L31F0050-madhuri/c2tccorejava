package StaticKeyword;

public class StaticMethod {
	static void m1()
    {
        System.out.println("from m1");
        System.out.println("This the static method");    }
	public static void main(String[] args) {
		
		 // calling m1 without creating
        // any object of class StaticMethod
         m1();

	}

}
