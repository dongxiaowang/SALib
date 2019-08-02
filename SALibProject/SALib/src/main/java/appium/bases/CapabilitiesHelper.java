package appium.bases;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CapabilitiesHelper {



    /**
     * Android Simulator (Android 模拟器)
     * According to following Json
     *{
     *   "platformName": "Android",
     *   "platformVersion": "8.0",
     *   "deviceName": "Android Emulator",
     *   "automationName": "UiAutomator2",
     *   "app": "D:\\ApiDemos-debug.apk",
     * }
     *
     * Optional:"avd": "Nexus_5_API_26"
     *
     * @return Capabilities
     */
    public static Capabilities getDefaltAndroidSimulatorCap(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(MobileCapabilityType.APP,"D:\\ApiDemos-debug.apk");
        return capabilities;
    }



    /**
     * Android Simulator chrome (Android 模拟器 Chrome浏览器)
     * According to following Json
     * {
     *   "platformName": "Android",
     *   "platformVersion": "8.0",
     *   "deviceName": "Android Emulator",
     *   "automationName": "UiAutomator2",
     *   "browserName": "Chrome"
     * }
     *
     * Optional:"avd": "Nexus_5_API_26"
     *
     * @return Capabilities
     */
    public static Capabilities getDefaltAndroidChromeCap(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,MobileBrowserType.CHROME);
        return capabilities;
    }


    /**
     * Android real  (Android 真机)
     * According to following Json
     *  {
     *   "platformName": "Android",
     *   "platformVersion": "7.0",
     *   "deviceName": "Android Emulator",
     *   "automationName": "UiAutomator2",
     *   "app": "D:\\ApiDemos-debug.apk",
     *  }
     *
     * Optional:"adb": "d1fcbebb"
     *
     * @return Capabilities
     */
    public static Capabilities getDefaltAndroidRealCap(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(MobileCapabilityType.APP,"D:\\ApiDemos-debug.apk");
        return capabilities;
    }


    /**
     * IOS simulator  (IOS 模拟器)
     * According to following Json
     *  {
     *      "platformName": "ios",
     *      "automationName": "XCuiTest",
     *      "deviceName": "iPhone X",
     *      "platformVersion": "12.2",
     *      "bundleId": "io.appium.TestApp",
     *      "app": "/Users/dong/Desktop/TEST.NOTE/Appium/java-clientTest/src/test/java/io/appium/java_client/TestApp.app.zip"
     *  }
     *
     * @return Capabilities
     */
    public static Capabilities getDefaltIOSSimulatorCap(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"test");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/dong/**.app");
        return capabilities;
    }


    /**
     * IOS simulator  safari (IOS 模拟器 Safari浏览器)
     * According to following Json
     *  {
     *      "platformName": "ios",
     *      "automationName": "XCuiTest",
     *      "deviceName": "iPhone X",
     *      "platformVersion": "12.2",
     *      "device": "iphone",
     *      "browserName": "Safari"
     *  }
     *
     * @return Capabilities
     */
    public static Capabilities getDefaultAIosSafariCap(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"test");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,MobileBrowserType.SAFARI);
        return capabilities;
    }


    /**
     * IOS Real  (IOS 真机)
     * According to following Json
     *  {
     *      "platformName": "ios",
     *      "automationName": "XCuiTest",
     *      "deviceName": "iPhone X",
     *      "platformVersion": "12.4",
     *      "bundleId": "com.sjg.sj",
     *      "app": "/Users/peterhu/Desktop/sj.ipa",
     *      "udid": "a78ac843ef463635aa05d6174ec7f309f6f258c3",
     *      "xcodeOrgId": "<7N2QQ9G47C>",
     *      "xcodeSigningId": "iPhone Developer",
     *      "updatedWDABundleId": "io.appium.WebDriverAgentRunner"
     *  }
     *
     * @return Capabilities
     */
    public static Capabilities getDefaultIOSRealCap(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"test");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/dong/**.ipa");
        capabilities.setCapability(MobileCapabilityType.UDID,"23***********da");
        capabilities.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID,"<13wdasda12>");
        capabilities.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID,"iPhone Developer");
        return capabilities;
    }


}
