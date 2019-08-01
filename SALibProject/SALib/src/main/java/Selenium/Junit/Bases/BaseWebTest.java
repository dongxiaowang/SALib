package Selenium.Junit.Bases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(JUnit4.class)
public abstract class BaseWebTest {

    private static DriverService service;
    private static boolean isRemoteTest;
    private WebDriver driver;

    @BeforeClass
    public static void createAndStartService() {

        // 如果是远程调用则不初始化service。
        String url = getRemoteUrl();
        if (url != null){
            isRemoteTest = true;
            return;
        }

        service = getDriverService();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected  static  DriverService getDriverService(){
        return null;
    };

    @AfterClass
    public static void createAndStopService() {
        if (service == null)return;
        service.stop();
    }

    @Before
    public void createDriver() {

        if (isRemoteTest){
            URL url = null;
            try {
                url = new URL(getRemoteUrl());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            if (null == url)return;
            driver = new RemoteWebDriver(service.getUrl(),
                    getCapabilities());
        }else {
            driver = new RemoteWebDriver(service.getUrl(),
                    getCapabilities());
        }
    }


    protected Capabilities getCapabilities(){
        return null;
    }

    protected static String  getRemoteUrl(){
        return null;
    }


    @After
    public void quitDriver() {
        if (driver != null)driver.quit();
    }

}
