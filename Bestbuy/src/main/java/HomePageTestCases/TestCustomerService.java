package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestCustomerService extends CommonAPI {


    public void CustomerService(){
        clickOnElementByXpath("//button[@class='close']//span[contains(text(),'×')]");

        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//li[contains(@class,'link')]//a[contains(text(),'Customer Service')]");
        sleepFor(2);
        clickOnElementByXpath("//a[contains(text(),'Check your order status')]");
    }
}
