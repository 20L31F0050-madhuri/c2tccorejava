package StaticKeyword;
//A class can be made static only if it is a nested class.
//We cannot declare a top-level class with a static modifier but can declare nested classes as static. 
//Such types of classes are called Nested static classes.
//Nested static class doesn’t need a reference of Outer class. 
//In this case,
//a static class cannot access non-static members of the Outer class. 
public class StaticClass {
		  
	
	    private static String str = "Madhuri";
	  
	    // Static class
	    static class MyNestedClass {
	        
	        // non-static method
	        public void disp(){ 
	          System.out.println(str); 
	          
	        }
	    }
	public static void main(String[] args) {
          StaticClass.MyNestedClass obj= new StaticClass.MyNestedClass();
          obj.disp();

	}

}
