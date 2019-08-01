package Selenium.Junit.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class IETest extends BaseWebTest {



    /**
     * 默认需要webdriver设置环境变量，若要手动传入webdriver的路径，需重写方法并设置。
     *  .usingDriverExecutable(new File("path/to/my/IEDriver.exe")
     */
    @BeforeClass
    static public void createService() {
        service = new InternetExplorerDriverService.Builder()
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
        return DesiredCapabilities.internetExplorer();
    }
}
