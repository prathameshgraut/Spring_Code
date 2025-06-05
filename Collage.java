package Spring_Demo;

public class Collage {
	private String ClgName;
	private String city;
	private long since;
	public String getClgName() {
		return ClgName;
	}
	public void setClgName(String clgName) {
		ClgName = clgName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getSince() {
		return since;
	}
	public void setSince(long since) {
		this.since = since;
	}
	
	public void Show() {
		System.out.println("| Collage_Name : "+ClgName+" | City :"+city+" | Since : "+since);
	}
}
