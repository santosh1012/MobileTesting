/*package autostart;



	import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;


	public class Appiumautostart {
		
		
		//Appium Launch on Windows
		private static Process process;

		//Calling the node.exe and appium.js
		private static String STARTSERVER = "C:\\Program Files (x86)\\Appium\\node.exe C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";

		//Starting the Appium Server
		
		public static void startAppiumServer() throws IOException, InterruptedException {

		Runtime runtime = Runtime.getRuntime();

		process = runtime.exec(STARTSERVER);

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

		stopAppiumServer();

		startAppiumServer();

		File f=new File("C:\\Mobile Setup\\Jars\\pressie-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		cap.setCapability("deviceName", "Lenovoa2010");
		cap.setCapability("app", f);
		cap.setCapability("appActivity", "jaarwis.pressie.ActivitySplash");
		cap.setCapability("appPackage", "jaarwis.pressie");
	AndroidDriver	driver=new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//		driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Hello Appium");

		Thread.sleep(3000);

		driver.quit();

		stopAppiumServer();

		}
	}

	

*/