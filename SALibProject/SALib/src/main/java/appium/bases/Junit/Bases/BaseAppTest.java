package appium.bases.Junit.Bases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.After;
import org.junit.AfterClass;

public class BaseAppTest {



    protected static AppiumDriverLocalService service;
    protected AppiumDriver<MobileElement> driver;




    /**
     * finishing.
     */
    @After
    public  void quitDriver() {

        if (driver != null) {
            driver.quit();
        }
    }


    /**
     * finishing.
     */
    @AfterClass
    public static void stopService() {

        if (service != null) {
            service.stop();
        }
    }
}
