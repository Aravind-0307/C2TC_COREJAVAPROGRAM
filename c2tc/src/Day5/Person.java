package Day5;

public class Person {
	private int id;
	private String name;
	private String city;
	
	public Person()
	{
		this.id=100;
		this.name="aravind";
		this.city="chennai";
	}
	
	public Person(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	
}

