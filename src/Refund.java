
public class Refund extends Transaction{
	Purchase refundPurchase;
	double amnt;
	
	public Refund (Purchase p, double amnt) {
		super(p);
		refundPurchase=p;
		if (p.getAmount() <amnt) {
			this.amnt=amnt;
		}
	}
	
}
