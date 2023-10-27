package calcInterfacePackage;



public class Werte implements RechnenInterface {
	
	int nummer1;
	int nummer2;
	
	public Werte(int nummer1, int nummer2) {
		this.nummer1 = nummer1;
		this.nummer2 = nummer2;
	}

	@Override
	public int add(int nummer1, int nummer2) {
		int addieren = nummer1 + nummer2;
		System.out.println("nummer1 + nummer2 : " + addieren);
		return addieren;
		
	}
	

}