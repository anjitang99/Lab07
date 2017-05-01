
public class Laptop extends Product implements Networked {
	private double totalCapacity;
	private double usedCapcity;
	
	
	

	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public double maxSpeed() {
		return 100.0;
	}

	public double getUsedCapcity() {
		return usedCapcity;
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
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
