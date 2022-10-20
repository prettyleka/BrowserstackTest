package test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Test
public class test {

    public void testForBS() throws InterruptedException {
        InstallAndLaunchKApp("ios", "bs://990db34260228d6cfdf3ef0a2676722c6951d16b", "iPhone 11", "13", "iOS for Camera", "Camera_BS_iOS", "bs://990db34260228d6cfdf3ef0a2676722c6951d16b");
        //click on login
        WebDriverWait wait = new WebDriverWait(mDriver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("welcome.login"))).click();
        //Click LogIn with phone
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAccessibilityId("Log in with phone"))).click();
        //Enter Phone Number
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")));
        element.click();
        element.clear();
        element.sendKeys("8647788422");
        //Click LogIn button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("Log in"))).click();
        //Get OTP code
        String OTP = GetPhoneCode("8");
        //Enter OTP code
        List<WebElement> Digits = mDriver.findElements(By.xpath("//XCUIElementTypeTextField[contains(@name, \"Digit\")]"));
        char[] Codes = OTP.toCharArray();
        for(int i = 0; i < Digits.size(); i++) {
            Digits.get(i).clear();
            Digits.get(i).click();
            Digits.get(i).sendKeys(Character.toString(Codes[i]).trim());
        }
        //Click continue button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("Continue"))).click();
        //Click allow in notification
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Allow\"]"))).click();
        //Click pediatrics button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("tab.chat.option.add_children"))).click();
        //Click child button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("option_1"))).click();
        //Click Search TextBox
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("symptom_footer.container"))).click();
        //Enter text to search
        WebElement Search_TextEdit = wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAccessibilityId("search_text_input")));
        Search_TextEdit.click();
        Search_TextEdit.clear();
        Search_TextEdit.sendKeys("Itchy");
        Thread.sleep(5000);
        //Select symptom from list
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAccessibilityId("option+itchy skin"))).click();
        Thread.sleep(3000);
        // Click 1-3 days ago button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("option_1"))).click();
        Thread.sleep(3000);
        //Click mark locations button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(3000);
        //Click back side button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("location.segment.back"))).click();
        Thread.sleep(3000);
        //Click right butt cheek PopUpDiagram
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("location.area.136"))).click();
        Thread.sleep(3000);
        //Click done
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("entire.done"))).click();
        Thread.sleep(5000);
        //Click a little itchy button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("option_0"))).click();
        Thread.sleep(9000);
        //Click Iam not sure button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(3000);
        //Click no button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(9000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(9000);
        //Click I wanted to speak with clinician button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("option_1"))).click();
        Thread.sleep(9000);
        //Click no button
        wait.until(ExpectedConditions.elementToBeClickable(new AppiumBy.ByAccessibilityId("chat_screen.tapToRespond"))).click();
        Thread.sleep(5000);
        //Click OK show me button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("option_0"))).click();
        Thread.sleep(5000);
        //Click chat with doctor now button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("kmd_promo_button"))).click();
        Thread.sleep(5000);
        //Click disclaimer I accept button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("info_disclaimer_button"))).click();
        Thread.sleep(5000);
        //Select state where located wheelPicker
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypePicker[@name=\"first_wheel_picker\"]/XCUIElementTypePickerWheel"))).sendKeys("California");
        Thread.sleep(5000);
        //Click select button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("wheelpicker-submit"))).click();
        Thread.sleep(3000);
        //Click Im parent button
        wait.until(ExpectedConditions.presenceOfElementLocated(new AppiumBy.ByAccessibilityId("option_0"))).click();
        Thread.sleep(5000);
        //Click next button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("next_button_account_name"))).click();
        Thread.sleep(5000);
        //Set street text
        WebElement Street_TextEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("street_text_input")));
        Street_TextEdit.clear();
        Street_TextEdit.sendKeys("123 street");
        //Set details text
        WebElement Details_TextEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("address_details_input")));
        Details_TextEdit.clear();
        Details_TextEdit.sendKeys("Apt 6");
        //Hide Keyboard
        mDriver.findElement(new AppiumBy.ByAccessibilityId("Done")).click();
        //Click next button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("vnet.account.address.next_button_account_details"))).click();
        Thread.sleep(5000);
        //Click open camera button
        wait.until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAccessibilityId("vnet.open_camera_button"))).click();
        Thread.sleep(5000);
        //Click Allow access button
        mDriver.findElement(new AppiumBy.ByAccessibilityId("OK")).click();
        Thread.sleep(5000);
        //Click take picture button

    }




    public static AppiumDriver mDriver = null;



    public void  InstallAndLaunchKApp(String OS, String ApplicationFileName, String DeviceName, String PlatformVersion, String SuiteName, String TestName, String AppBuildVersion) {
        try {
            mDriver = null;
            String ApplicationPath = "";

            String version;

            ApplicationPath = ApplicationFileName;

            URL url = new URL("http://hub.browserstack.com/wd/hub");

            DesiredCapabilities Capabilities = GetDesiredCapability_BrowserStack(OS, ApplicationPath, DeviceName, PlatformVersion, SuiteName, TestName, AppBuildVersion);
            mDriver = new IOSDriver(url, Capabilities);


        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static DesiredCapabilities GetDesiredCapability_BrowserStack(String OS, String ApplicationPath, String DeviceName, String PlatformVersion, String SuiteName, String TestName, String AppBuildVersion) {

        try {
            DesiredCapabilities Capabilities = new DesiredCapabilities();
            HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();

            // Set your access credentials
            browserstackOptions.put("userName", "khealth_Tu0tzA");
            browserstackOptions.put("accessKey", "AxYxKCbqpe5S68AqRZqM");
            Capabilities.setCapability("bstack:options", browserstackOptions);

            //Capabilities.setCapability("appiumVersion", "1.22.0");
            Capabilities.setCapability("browserstack.appium_version", "1.22.0");
            Capabilities.setCapability("browserstack.enableCameraImageInjection", "true");
            Capabilities.setCapability("browserstack.geoLocation", "US");
            Capabilities.setCapability("browserstack.resignApp", "true");
            Capabilities.setCapability("autoGrantPermissions", "true");

            Capabilities.setCapability("browserstack.idleTimeout", "7200");
            Capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
            Capabilities.setCapability("browserstack.local", "false");
            Capabilities.setCapability("real_mobile", "true");

            switch (OS.toLowerCase().trim()) {
                case "android":
                    Capabilities.setCapability(MobileCapabilityType.APP, ApplicationPath);
                    //Capabilities.setCapability("os_version", PlatformVersion);
                    //Capabilities.setCapability("device", DeviceName);

                    Capabilities.setCapability("project", AppBuildVersion);
                    Capabilities.setCapability("build", SuiteName);
                    Capabilities.setCapability("name", TestName);

                    Capabilities.setCapability("platformVersion", PlatformVersion);
                    Capabilities.setCapability("deviceName", DeviceName);
                    Capabilities.setCapability("platformName", "android");
                    break;
                case "ios":
                    Capabilities.setCapability(MobileCapabilityType.APP, ApplicationPath);
                    Capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DeviceName);
                    Capabilities.setCapability("os_version", PlatformVersion);

                    Capabilities.setCapability("project", AppBuildVersion);
                    Capabilities.setCapability("build", SuiteName);
                    Capabilities.setCapability("name", TestName);

                    Capabilities.setCapability("platformVersion", PlatformVersion);
                    Capabilities.setCapability("platformName", "ios");
                    break;
            }

            return Capabilities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String GetPhoneCode(String UserID){
        try {

            Thread.sleep(5000);//need wait 30 sec before get code after code page loaded

            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet("https://us-central1-k-sandbox-1.cloudfunctions.net/qa_automation_receive_sms?user=" + UserID + "&limit=3");

            HttpResponse httpresponse = httpClient.execute(httpget);

            Scanner sc = new Scanner(((CloseableHttpResponse) httpresponse).getEntity().getContent());

            int ResponseCode = httpresponse.getCode();

            String Response = "";

            while (sc.hasNext()) {
                Response = Response + sc.nextLine();
            }

            Document document = Jsoup.parse(Response);

            Elements rows = document.getElementsByTag("tr");

            Map<String, String> tdCollection = new HashMap<String, String>();

            for (Element row : rows) {

                if (row.attr("otp").equalsIgnoreCase("otp")) {

                    Elements tds = row.getElementsByTag("td");

                    if (tds.size() > 0) {
                        tdCollection.put(tds.get(0).html(), tds.get(1).html());
                        break;
                        //System.out.println(tds.get(0).html() + " = " + tds.get(1).html());
                    }
                }

            }

            //SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd Y hh:mm:ss");//EEE MMM d Y hh:mm:ss zZ
            String PhoneCode = "";

            for (Map.Entry<String, String> entry : tdCollection.entrySet()) {

                //String FoundDate = entry.getKey().substring(0, entry.getKey().indexOf("GMT")).trim();
                //FoundDate = FoundDate.substring(4).trim();

                //Date FoundParsedDate = dateFormat.parse(FoundDate);

                Pattern p = Pattern.compile("[0-9]+");
                Matcher m = p.matcher(entry.getValue());
                while (m.find()) {
                    PhoneCode = m.group();
                }

                if (PhoneCode != "") {
                    break;
                }
            }

            if (PhoneCode == "") {
                System.out.println("PhoneCode is empty");
                return PhoneCode;
            } else {
                System.out.println("PhoneCode is : " + PhoneCode);
                return PhoneCode;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}
