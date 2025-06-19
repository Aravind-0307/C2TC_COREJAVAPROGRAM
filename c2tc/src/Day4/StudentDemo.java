package Day4;

public class StudentDemo {

	public static void main(String[] args) {
StudentEntity st=StudentEntity.getObj();
StudentEntity st2=StudentEntity.getObj();

st.setId(101);
st.setName("Aravind");
System.out.println(st);
st2.setId(102);
st2.setName("Mohanraj");


System.out.println(st2);
	}

}
