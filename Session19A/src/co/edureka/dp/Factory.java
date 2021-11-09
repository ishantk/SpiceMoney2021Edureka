package co.edureka.dp;

interface Plan{
	String getData();
	String getValidity();
	int getPrice();
}

class TrulyUnlimited implements Plan{

	@Override
	public String getData() {
		return "1.5GB / day";
	}

	@Override
	public String getValidity() {
		return "TrulyUnlimited: 84 days";
	}

	@Override
	public int getPrice() {
		return 598;
	}
	
}

class SmartRecharge implements Plan{

	@Override
	public String getData() {
		return "0 MB";
	}

	@Override
	public String getValidity() {
		return "SmartRecharge: 28 days";
	}

	@Override
	public int getPrice() {
		return 128;
	}
	
}

class Data implements Plan{

	@Override
	public String getData() {
		return "12 MB ";
	}

	@Override
	public String getValidity() {
		return "Data: Exisiting Validity";
	}

	@Override
	public int getPrice() {
		return 98;
	}
	
}

class PlanFactory{
	
	public static Plan getPlan(int typeOfPlan) {
		
		Plan plan = null;
		
		switch(typeOfPlan) {
			case 1:
				plan = new TrulyUnlimited();
				break;
				
			case 2:
				plan = new SmartRecharge();			
				break;
							
			case 3:
				plan = new Data();
				break;
		}
		
		return plan;
	}
	
}

public class Factory {

	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan(3);
		
		if(plan!=null) {
			System.out.println(plan.getPrice());
			System.out.println(plan.getData());
			System.out.println(plan.getValidity());
		}else {
			System.out.println("Invalid Plan");
		}
		
	}

}
