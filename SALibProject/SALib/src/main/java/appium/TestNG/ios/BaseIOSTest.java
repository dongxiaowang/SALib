package appium.TestNG.ios;

import appium.TestNG.Bases.BaseAppTest;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

import org.openqa.selenium.Capabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseIOSTest extends BaseAppTest {



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



    /**
     * Initialization. Overriding to empty block to test remote.
     */
    @BeforeSuite(alwaysRun = true)
    public static void createService() {

        /* Use Service Builder for further configuration.
       service = new AppiumServiceBuilder()
       .usingPort(PORT).build();
        */

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();


    }

    @BeforeClass
    public void createDriver() throws MalformedURLException {

        String urlstr = getRemoteUrl();
        URL url;
        if (urlstr !=null) {

            url = new URL(urlstr);

        }else {
            if (service == null || !service.isRunning()) {
                throw new AppiumServerHasNotBeenStartedLocallyException(
                        "An appium server node is not started!");
            }else {
                url = service.getUrl();
            }
        }

        Capabilities capabilities = getCapabilities();
        if ((capabilities != null)||(url != null)) driver = new IOSDriver<>(service.getUrl(), getCapabilities());
    }
}
