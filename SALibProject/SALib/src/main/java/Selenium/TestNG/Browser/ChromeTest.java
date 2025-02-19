package Selenium.TestNG.Browser;

import Selenium.Junit.Bases.BaseWebTest;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;


import java.io.IOException;


public class ChromeTest extends BaseWebTest {


    /**
     * 默认需要webdriver设置环境变量，若要手动传入webdriver的路径，需重写方法并设置。
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
