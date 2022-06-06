package constructor;
class Student1
{
		String name;
	    int id;
	    Student1(String name, int id)
	    {
	        this.name = name;
	        this.id = id;
	    }
	}

public class Parameterised {

	public static void main(String[] args) {
		 Student1 obj = new Student1("adam", 1);
	     System.out.println("GeekName :" + obj.name
	                           + " and GeekId :" + obj.id);
	    }

	
}
