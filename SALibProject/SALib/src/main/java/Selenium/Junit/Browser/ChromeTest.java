package Selenium.Junit.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.IOException;

/**
 * 默认为远程测试。
 */
public class ChromeTest extends BaseWebTest {


    /**
     * 默认需要webdriver设置环境变量，若要手动传入webdriver的，需重写方法并设置。
     *  .usingDriverExecutable(new File("path/to/my/ChromeDriver.exe")
     */
    @BeforeClass
    static public void createService() {
        service = new ChromeDriverService.Builder()
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
        return DesiredCapabilities.chrome();
    }


}
