public class BankAccount {
    private BankName BankName;
    private String AccountID;

    public BankAccount(BankName name, String id) {
    	this.AccountID=id;
    	this.BankName=name;
    }
    public BankName getBankName() {
        return BankName;
    }

    public void setBankName(BankName bankName) {
        BankName = bankName;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }
}