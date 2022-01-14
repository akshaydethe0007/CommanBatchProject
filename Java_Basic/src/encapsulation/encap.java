package encapsulation;

public class encap {
	
	private String userid="Admin";
    private String password="Password123";
    
	public String getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
    
    
	private boolean isvoter=false;
	
	public boolean getIsvoter(int a)
	{
		
		if(a>18)
		{
			System.out.println("You are eligible for Voting");
			return isvoter=true;
		}
		
		return isvoter=false;
	}
	////////////////////////Settter Part////////////////////////////////
	
	
	private int popcount=1000;
	
	public int getPopcount()
	{
		return popcount;
	}
	
	public int setPopcount(int  num)
	{
		this.popcount+=num;
		return popcount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
