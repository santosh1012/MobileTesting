package autostart;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
	import java.net.URL;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.SessionId;

import com.google.gson.JsonObject;


	public class Appiumautostart2 {
		
		
		//Appium Launch on Windows
		private static Process process;

		//Calling the node.exe and appium.js
	//	private static String STARTSERVER = "C:\\Program Files (x86)\\Appium\\node.exe", "C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";

		//Starting the Appium Server
		
		public static void startAppiumServer() throws IOException, InterruptedException {

		Runtime runtime = Runtime.getRuntime();
        process=runtime.exec(new String[]{"C:\\Program Files (x86)\\Appium\\node.exe","C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js"});


	//	process = runtime.exec(STARTSERVER);

		Thread.sleep(7000);

		if (process != null) {

		System.out.println("Appium server started");

		}
		}

		
		//Stopping the Appium Server
		
		public static void stopAppiumServer() throws IOException {

		if (process != null) {

		process.destroy();

		}

		System.out.println("Appium server stopped");

		}

		public static void main(String[] args) throws Exception{

	//	stopAppiumServer();

	//	startAppiumServer();

//		File f=new File("C:\\Mobile Setup\\Jars\\pressie-qa.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		cap.setCapability("deviceName", "Lenovoa2010");
//		cap.setCapability("app", f);
		cap.setCapability("appActivity", "jaarwis.signin.ActivitySplash");
		cap.setCapability("appPackage", "jaarwis.pressie");
	AndroidDriver	driver=new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),cap);

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement findElementByName = driver.findElementByName("Log In");
		findElementByName.click();
		driver.findElementByName("Mobile").click();
		driver.findElementByName("+91").click();
		/*driver.scrollTo("Hong Kong (HK)");
		driver.findElementByName("Hong Kong (HK)").click();
*/	//	driver.swipe(100, 100, 100, 1000, 10);

		WebElement element = driver.findElementById("jaarwis.pressie:id/activity_main_container");
	//	String appStrings = driver.getAppStrings();
		Set contextHandles = driver.getContextHandles();
	//	System.out.println(appStrings);
		for (Object object : contextHandles) {
			System.out.println(object.toString());
		}
		ExecuteMethod executeMethod = driver.getExecuteMethod();
		FileDetector fileDetector = driver.getFileDetector();
		Keyboard keyboard = driver.getKeyboard();
		ScreenOrientation orientation = driver.getOrientation();
		URL remoteAddress = driver.getRemoteAddress();
		SessionId sessionId = driver.getSessionId();
		JsonObject settings = driver.getSettings();
		boolean locked = driver.isLocked();
		Location location = driver.location();
		driver.longPressKeyCode(4);
		System.out.println("getExecuteMethod:-"+executeMethod+"FileDetector:-"+fileDetector);
		System.out.println("keyboard:-"+keyboard+"orientation"+orientation+"Remoteadd:-"+remoteAddress);
		System.out.println("sessionId"+sessionId+"settings"+settings);
		System.out.println("locked:-"+locked+"location:-"+location);

/*driver.findElementById("android.widget.ListView");
driver.swipe(200, 700, 200, 300, 2000);
driver.swipe(200, 700, 200, 300, 2000);
driver.swipe(200, 700, 200, 300, 2000);*/
//driver.findElementByName("Belgium (BE)").click();
//driver.swipe(200, 700, 200, 300, 2000);
//driver.scrollTo("Hong Kong (HK)");
//scrollto check
/*WebElement element = driver.findElement(By.name("Element Name"));
HashMap<String, String> arguments = new HashMap<String, String>();
arguments.put("Hong Kong", element.getText());
(JavascriptExecutor)driver.executeScript("mobile: scrollTo", arguments);
*/


		Thread.sleep(10000);

		driver.quit();

		//stopAppiumServer();

		}
	}

	

