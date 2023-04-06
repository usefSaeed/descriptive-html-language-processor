package Test;


public class Main {

	public static void main(String[] args) {
		try {
			new Test.Parser(System.in).start();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
