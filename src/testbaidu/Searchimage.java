package testbaidu;

import javax.lang.model.element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Searchimage {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		Element text_input;
		driver = new FirefoxDriver();
		driver.navigate().to("image.baidu.com");
		text_input = driver.find_element(By.ID,"kw");
	    text_input.send_keys("pwcc");
	    text_input.send_keys(Keys.ENTER);
        Object wait = WebDriverWait(driver,100) ;
        var imgElemet = driver.FindElement(By.ClassName("main_img img-hover"));

        Screenshot screenshot = ((ITakesScreenshot)imgElemet).GetScreenshot();
                                                                           
        var dirpath = “C:\Image”;
        if (!Directory.Exists(dirpath))
        {
            Directory.CreateDirectory(dirpath);
        }

        List<string> list = new List<string>();
        string filepath = "C:\Image\" + Guid.NewGuid().ToString() + ".png";
        screenshot.SaveAsFile(filepath, ScreenshotImageFormat.Png);
	
		
	
	
	   }
