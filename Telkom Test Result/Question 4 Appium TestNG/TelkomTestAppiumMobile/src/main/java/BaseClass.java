import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {


@BeforeTest
public void setup(){
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
    caps.setCapability(MobileCapabilityType.DEVICE_NAME,"vivo 1818");
    caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
    caps.setCapability(MobileCapabilityType.APP, "src/main/resources/apps/ecommerce-test.apk");


}
@AfterTest
public void teardown(){

}


}
