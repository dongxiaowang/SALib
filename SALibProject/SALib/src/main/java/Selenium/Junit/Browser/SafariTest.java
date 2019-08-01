package Selenium.Junit.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriverService;

import java.io.IOException;

public class SafariTest extends BaseWebTest {

    /**
     * 默认需要webdriver设置环境变量，safari浏览器不用。
     *
     */
    @BeforeClass
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
