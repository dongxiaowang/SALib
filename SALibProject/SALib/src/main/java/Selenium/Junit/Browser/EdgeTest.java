package Selenium.Junit.Browser;

import Selenium.Junit.Bases.BaseWebTest;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EdgeTest extends BaseWebTest {

    @Override
    protected Capabilities getCapabilities() {
        return DesiredCapabilities.edge();
    }
}
