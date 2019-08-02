package Selenium.Junit.Bases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;


import java.net.MalformedURLException;
import java.net.URL;

@RunWith(JUnit4.class)
public abstract class BaseWebTest {

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





    @Before
    public void createDriver() {

        if (getRemoteUrl() != null){
            URL url = null;
            try {
                url = new URL(getRemoteUrl());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            if (null != url)driver = new RemoteWebDriver(url,
                    getCapabilities());
        }else {
            if (service!=null)driver = new RemoteWebDriver(service.getUrl(),
                    getCapabilities());
        }
    }







    @AfterClass
    public static void stopService() {
        if (service != null)service.stop();
    }

    @After
    public void quitDriver() {
        if (driver != null)driver.quit();
    }

}
