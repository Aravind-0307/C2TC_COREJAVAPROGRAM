package Day8;

public class Jio implements Phone{
	
	@Override
	public void call() {
	System.out.println("Calling using jio");
}

	@Override
public void sms() {
		System.out.println("Message using jio");
	}
}

