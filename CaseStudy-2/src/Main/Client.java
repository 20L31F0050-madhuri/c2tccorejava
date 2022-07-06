package Main;
import ApplicationPart.GSNormalAcc;
import ApplicationPart.GSPrimeAcc;
import ApplicationPart.GSShopFactory;
public class Client {
	public static void main(String[] args) 
	{
		//step a
		GSShopFactory gsshopfactory =new GSShopFactory();
		gsshopfactory.getNewPrimeAccount(101, "xyz", 10000, true);
		gsshopfactory.getNormalAccount(102, "abc", 879837, 50);
		
		//step b
		GSPrimeAcc gsprime=new GSPrimeAcc(101, "xyz", 10000, true);
		
		
		//step c
		GSNormalAcc gsnormal=new GSNormalAcc(102, "abc", 879837, 50);
		
		//step d
		gsprime.bookProduct(10000);
		gsnormal.bookProduct(879837);
		
		//step e
		gsprime.toString();
		gsnormal.toString();
		
	}

}
