package homepagetest;

import HomePageTestCases.*;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestAllCases extends CommonAPI {

    Login login;

    @BeforeMethod
    public void getloginclass() {
        login = PageFactory.initElements(driver, Login.class);
    }

    @Test
    public void testLoginclass() {
        login.loginSearchbar();
        sleepFor(2);
    }

    TestBrands testBrands;

    @BeforeMethod
    public void testTestBrandsclass() {
        sleepFor(3);
        testBrands = PageFactory.initElements(driver, TestBrands.class);
    }

    @Test
    public void runTestBrandsclass() {
        testBrands.Brandsvalue();
    }

    TestCustomerService testCustomerService;

    @BeforeMethod
    public void testTestCustomerServiceclass() {
        testCustomerService = PageFactory.initElements(driver, TestCustomerService.class);
    }

    @Test
    public void runTestCustomerServiceclass() {
        testCustomerService.CustomerService();
    }

    TestGiftCards testGiftCards;

    @BeforeMethod
    public void testTestGiftCardsclass() {
        testGiftCards = PageFactory.initElements(driver, TestGiftCards.class);
    }

    @Test
    public void runTestGiftCardsGiftCardsclass() {
        testGiftCards.GiftCards();
    }

    TestGiftIdeas testGiftIdeas;

    @BeforeMethod
    public void testTestGiftIdeas() {
        testGiftIdeas = PageFactory.initElements(driver, TestGiftIdeas.class);
    }

    @Test
    public void runTestGiftIdeasclass() {
        testGiftIdeas.GiftIdeas();
    }

    TestPriceMatchGuarantee testPriceMatchGuarantee;

    @BeforeMethod
    public void testTestPriceMatchGuarantee() {
        testPriceMatchGuarantee = PageFactory.initElements(driver, TestPriceMatchGuarantee.class);
    }

    @Test

    public void runTestPriceMatchGuaranteeclass() {
        testPriceMatchGuarantee.PriceMatchGuarantee();
    }

    TestProducts testProducts;

    @BeforeMethod
    public void testTestProducts() {
        testProducts = PageFactory.initElements(driver, TestProducts.class);
    }

    @Test
    public void runTestProductsclass() {
        testProducts.ProductsValue();
    }

    TestServices testServices;

    @BeforeMethod
    public void testTestService() {
        sleepFor(3);
        testServices = PageFactory.initElements(driver, TestServices.class);
    }

    @Test
    public void runTestServicesclass() {
        testServices.ValueServices();
//    }
//    HomePagePOM homePagePOM;
//    @BeforeMethod
//    public void testHomePagePom(){
//        homePagePOM=PageFactory.initElements(driver,HomePagePOM.class);
//    }
//    @Test
//    public void runtesthomepagepom(){
//        homePagePOM.validateShopperDisplayed();
//        homePagePOM.validateShopperClickAble();
//
//    }

    }
}
