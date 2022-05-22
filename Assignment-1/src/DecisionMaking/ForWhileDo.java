package DecisionMaking;

public class ForWhileDo {

	public static void main(String[] args) {
		 // for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
			  int k=1,l=1;
			  while(k<10 || l<10)
			  { 
				  k++; l++;
			      System.out.println("k="+k+" and l="+l); 
			  }	
			
		// Do while loop
			int x = 1, y= 1;
			do {
				x++;
				y++;
				System.out.println("x=" + x + " and y=" + y);
			    } while (x < 10 || y < 10);

	}

}
