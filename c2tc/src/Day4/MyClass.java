package Day4;

public class MyClass {
	private static MyClass obj=new MyClass();
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private MyClass() {
		System.out.println("MyClass Object Created");
	}
	public static MyClass getObject() {
		// TODO Auto-generated method stub
		return null;
	}

}
