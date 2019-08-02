/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package appium.bases.Junit.ios;

import appium.bases.Junit.Bases.BaseAppTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

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
        if ((capabilities != null)||(url != null)) driver = new IOSDriver<>(service.getUrl(), getCapabilities());
    }
}
