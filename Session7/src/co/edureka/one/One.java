package co.edureka.one;

// One is public
public class One {

	private void pvtShow() {
		System.out.println("[One] private show of One");
	}
	
	void defShow() {
		System.out.println("[One] default show of One");
	}
	
	protected void protShow() {
		System.out.println("[One] protected show of One");
	}
	
	public void pubShow() {
		System.out.println("[One] public show of One");
	}
	
}


// Two is default
class Two{
	
	private void pvtShow() {
		System.out.println("[Two] private show of Two");
	}
	
	void defShow() {
		System.out.println("[Two] default show of Two");
	}
	
	protected void protShow() {
		System.out.println("[Two] protected show of Two");
	}
	
	public void pubShow() {
		System.out.println("[Two] public show of Two");
	}
	
}