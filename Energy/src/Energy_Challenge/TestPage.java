package Energy_Challenge;

public class TestPage {

	public static void main(String[] args) {
		Utility ut = new Utility();
		ut.launchBrowser("Chrome");
		System.out.println("Browser launch Successfully");
		ut.navigateToURL("https://www.google.com");
		System.out.println("Congralution! URL Launch Suceessfully");

	}

}
