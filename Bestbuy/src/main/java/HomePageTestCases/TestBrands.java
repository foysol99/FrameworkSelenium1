package HomePageTestCases;

        import base.CommonAPI;
        import org.testng.annotations.Test;

public class TestBrands extends CommonAPI {


    public void Brandsvalue() {
        clickOnElementByXpath("//button[@class='close']//span[contains(text(),'×')]");

        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//button[contains(text(),'Brands')]");
        sleepFor(2);
        clickOnElementByXpath("//div[contains(text(),'Apple')]");

    }
}
