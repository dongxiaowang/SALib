package appium.bases.TestNG.Bases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;


public class BaseAppTest {



    protected static AppiumDriverLocalService service;
    protected AppiumDriver<MobileElement> driver;




    /**
     * finishing.
     */
    @AfterClass
    public  void quitDriver() {

        if (driver != null) {
            driver.quit();
        }
    }


    /**
     * finishing.
     */
    @AfterSuite(alwaysRun = true)
    public static   void stopService() {

        if (service != null) {
            service.stop();
        }
    }
}
