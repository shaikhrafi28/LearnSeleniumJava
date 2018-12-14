package InterfaceConcept;

public class Developing implements Bankingclient, Domainclient {
//THIS CLASS IS RESPONSIBLE TO IMPLEMENT ALL THE METHODS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CREATE OBJECT USING CURRENT CLASS
		Developing d = new Developing();// WILL CALL ALL THE Developing() METHODS

//CREATE OBJECT USING INTERFACE CLASS -JAVA RULE
		Bankingclient dr = new Developing();// WILL CALL ALL THE Bankingclient() METHODS
		
		Domainclient ds = new Developing();
		
		d.checkingbalance();// PRESENT IN Bankingclient INTERFACE
		d.transferbalance();// PRESENT IN Bankingclient INTERFACE
		d.paycreditcard();// PRESENT IN Bankingclient INTERFACE
		
		d.investment();// PRESENT IN Domainclient INTERFACE
		d.savings();// PRESENT IN Domainclient INTERFACE
		
		d.extramethod();// PRESENT IN Developing CLASS ONLY
		
		
		dr.checkingbalance();// PRESENT IN Bankingclient INTERFACE
		dr.transferbalance();// PRESENT IN Bankingclient INTERFACE
		dr.paycreditcard();// PRESENT IN Bankingclient INTERFACE
		
		ds.investment();// PRESENT IN Domainclient INTERFACE
		ds.savings();// PRESENT IN Domainclient INTERFACE

		
	}

	// FROM Bankingclient
	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard implemented");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance implemented");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance implemented");
	}

//FROM Domainclient
	@Override
	public void investment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void savings() {
		// TODO Auto-generated method stub

	}

	// EXTRA METHOD OTHER THAN INTERFACE CLASS METHODS
	public void extramethod() {
		// TODO Auto-generated method stub
		System.out.println("extramethod implemented");
	}
}
