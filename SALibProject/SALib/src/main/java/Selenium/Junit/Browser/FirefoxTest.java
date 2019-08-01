package Selenium.Junit.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxTest extends BaseWebTest {

    @Override
    protected Capabilities getCapabilities() {
        return DesiredCapabilities.firefox();
    }
}
