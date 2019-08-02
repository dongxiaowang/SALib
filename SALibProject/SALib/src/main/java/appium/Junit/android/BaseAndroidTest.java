package appium.Junit.android;

import appium.Junit.Bases.BaseAppTest;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

import org.junit.Before;
import org.junit.BeforeClass;

import org.openqa.selenium.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseAndroidTest extends BaseAppTest {


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
    @BeforeClass
    public static void createService() {

        /* Use Service Builder for further configuration.
       service = new AppiumServiceBuilder()
       .usingPort(PORT).build();
        */

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }


    @Before
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
        if ((capabilities != null)||(url != null)) driver = new AndroidDriver<>(service.getUrl(), getCapabilities());
    }

}
