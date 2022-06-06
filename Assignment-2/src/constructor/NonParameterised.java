package constructor;
class Student
{
int num;
String name;
	Student()
    { 
	 System.out.println("Non parameterised Constructor called");
	 }
}
public class NonParameterised {
	   
	public static void main(String[] args) {
		Student obj = new Student();
        System.out.println(obj.name);
        System.out.println(obj.num);

	}

}
