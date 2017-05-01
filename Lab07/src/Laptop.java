
public class Laptop extends Product {
	private double totalCapacity;
	private double usedCapcity;
	
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapcity() {
		return usedCapcity;
	}

	public void setUsedCapcity(double usedCapcity) {
		this.usedCapcity = usedCapcity;
	}

	public double getFreeCapacity(){
		return totalCapacity-usedCapcity;
	}
	public void format(){
		setUsedCapcity(0.0);
	}
	//public boolean isConnected{
		
	//}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
