package egtry.hello;

public class ayNeeela {

	public static void main(String[] args) {
		
		try {
			new egtry.hello.Hello(System.in).words();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
