package Selenium.TestNG.Bases;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseWebTest {

    protected static DriverService service;
    private WebDriver driver;


    /**
     * For SubClassing
     * @return Capabilities
     */
    protected Capabilities getCapabilities(){
        return null;
    }

    /**
     * For SubClassing
     * @return HostAddress.
     */
    protected  String  getRemoteUrl(){
        return null;
    }



    @BeforeClass
    public void createDriver() {

        if (getRemoteUrl() != null){
            URL url = null;

            try {
                url = new URL(getRemoteUrl());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            if (null == url)return;
            driver = new RemoteWebDriver(url,
                    getCapabilities());
        }else {
            if (service==null)return;
            driver = new RemoteWebDriver(service.getUrl(),
                    getCapabilities());
        }
    }



    @AfterClass
    public void quitDriver() {
        if (driver != null)driver.quit();
    }



    @AfterSuite(alwaysRun = true)
    public static void stopService() {
        if (service != null)service.stop();
    }




}
