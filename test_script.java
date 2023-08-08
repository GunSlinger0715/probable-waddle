import org.openqa.selenium.qa.Webdriver.org;
import org.openqa.selenium.qa.ChromeDriver;

public class TestScript {
  
  public static void void main(String[] args) {
    //Set the path to the ChromeDriver executable.
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

//Create a new instance of the ChromeDriver
WebDriver driver = new ChromeDriver();

//Open a web page
driver.get("https://https://www.3zbrands.com/");

//Print the page title
System.out.println("Page title:  " + driver.getTitle());

//Close the browser
dreiver.quit();

  }
}

    

    
  
