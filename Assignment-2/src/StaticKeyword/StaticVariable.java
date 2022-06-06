package StaticKeyword;
class Student{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="Vignan";//static variable  
	   Student(int r, String n){  //constructor  
	   rollno = r;  
	   name = n;  
	   }   
	   void display () //method to display the values  
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   }  
	}  



public class StaticVariable {
	public static void main(String[] args) {
		 Student s1 = new Student(50,"Madhuri");  
		 Student s2 = new Student(11,"Sravya");  
		 //we can change the college of all objects by  
		 //Student.college="BBDIT";  
		 s1.display();  
		 s2.display(); 
	}
	

}
