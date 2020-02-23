package day54.selenium;

public class Automation {

    public static void main(String[] args) {

        WebDriver c1 = new ChromeDriver();
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();

        System.out.println("Running on Firefox");
        c1 = new FireFoxDriver();
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();
    }
}
