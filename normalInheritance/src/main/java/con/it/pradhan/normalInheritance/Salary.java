package con.it.pradhan.normalInheritance;

public class Salary{
	
	private int id;
	private int basic;
	private int ta;
	private int da;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	
	public void getSalaryInfo() {
		System.out.println(id+" " + basic + " " + ta + " "+ da);
	}
	
	

}
