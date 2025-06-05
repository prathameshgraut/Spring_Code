package Spring_Demo;

public class Student {
	private int StdID;
	private String Name;
	private long MobNo;
	private String Email;
	private String Dept;
	public int getStdID() {
		return StdID;
	}
	public void setStdID(int stdID) {
		StdID = stdID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	
	public void Show() {
		System.out.println("|StdID : "+StdID+" | Name : "+Name+" | MobNo :"+MobNo+" | Email : "+Email+" | DepartMent :"+Dept);
	}
}
