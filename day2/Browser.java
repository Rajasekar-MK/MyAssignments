package week1.day2;

public class Browser {
	
	public String launchBrowser(String browsername)
	{
		System.out.println("Browser launched successfully");
		return browsername;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser p1 = new Browser();
		System.out.println(p1.launchBrowser("chrome"));
		p1.loadUrl();
		

	}

}
