package ApplicationPart;
import Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	public GSNormalAcc(int accNo, String accName, float charges, float deliverycharges) {
		super(accNo, accName, charges, deliverycharges);
	}
	public void bookProduct(float charges)
	{
		System.out.println("Dear Normal user your product charges are" +charges+ "with deliverycharges" +deliverycharges);
		
	}
	@Override
	public String toString() {
		return "GSNormalAcc [deliverycharges=" + deliverycharges + ", accNo=" + accNo + ", accName=" + accName
				+ ", charges=" + charges + "]";
	}

}
