
public class SmartTV extends Product{

	private int channel;
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public boolean isConnected()
	{
		return false;
	}
	
	public double maxSpeed()
	{
		return 2;
	}
	@Override
	public String getName()
	{
		return "samsung";
	}
	
}
  