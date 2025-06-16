package day1;

public class TypeCaste {
	public static void main(String[] args) {
		 byte b = 10;
		 int i = b;
		 System.out.println(i);
		 
		 float f = 22.14f;
		 double d = f;
		 System.out.println(d);
		 
		 char ch = 'A';
		 int i3 = ch;
		 System.out.println(i3);
		 
		 char var1 = '\u00A7';
		 int i4 = var1;
		 System.out.println(i4);
		 
		 long l1 = 923372036854775806l;
		 int i2 = (int) l1;
		 System.out.println(i2);
		 
		 byte b1 = 90;
		 char ch1 = (char) b1;
		 System.out.println(ch1);
		 
	}

}
