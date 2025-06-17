package Day3;

public class Student {
	private int sid;
	private String sname;
	private String course;
	
	public Student()
	{
		this.sid=101;
	    this.sname="aravind";
	    this.course="JFS";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}

}
