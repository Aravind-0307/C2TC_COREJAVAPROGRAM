package Day4;

public class StudentDemo {

	public static void main(String[] args) {
StudentEntity st=StudentEntity.getObj();

st.setId(101);
st.setName("Aravind");

StudentEntity st1=StudentEntity.getObj();
System.out.println(st1);
System.out.println(st);
	}

}
