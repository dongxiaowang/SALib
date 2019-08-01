package Selenium.Junit.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.service.DriverService;

public class ChromeTest extends BaseWebTest {



    protected  static DriverService getDriverService(){
        return null;
    };

    @Override
    protected Capabilities getCapabilities() {
        return DesiredCapabilities.chrome();
    }


}
