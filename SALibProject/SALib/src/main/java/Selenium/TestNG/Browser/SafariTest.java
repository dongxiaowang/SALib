package Selenium.TestNG.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriverService;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class SafariTest extends BaseWebTest {

    /**
     * 默认需要webdriver设置环境变量，safari浏览器不用。
     *
     */
    @BeforeSuite(alwaysRun = true)
    static public void createService() {
        service = new SafariDriverService.Builder()
                .usingAnyFreePort()
                .build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected Capabilities getCapabilities() {
        return DesiredCapabilities.safari();
    }
}
