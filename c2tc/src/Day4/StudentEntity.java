package Day4;

public class StudentEntity {
	private static StudentEntity obj=new StudentEntity();
	private int id;
	private String name;
	public static StudentEntity getObj() {
		return obj;
	}
	public static void setObj(StudentEntity obj) {
		StudentEntity.obj = obj;
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
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + "]";
	}
	
		
	}
	
	
	


