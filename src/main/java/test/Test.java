package test;

import core.BaseTest;
import function.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.MainPage;
import page.PurchasePage;
import page.SalePage;

import java.util.Collections;
import java.util.List;

public class Test extends BaseTest {
    @org.testng.annotations.Test
    public void testcase1(){
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.isUserNameDisplayed();
        loginFunction.isPassWordDisplayed();
        loginFunction.isLoginBtnDisplayed();
        loginFunction.isRemembermeDisplayed();
    }

    @org.testng.annotations.Test
    public void testcase2(){
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com","12345678");
        loginFunction.isSucessfullAlertDisplayed();
        loginFunction.isBestSaleDisplayed();
        loginFunction.isQuickLinkDisplayed();
        loginFunction.isOverChartDisplayed();
        loginFunction.isLastFiveDisplayed();
    }

    @org.testng.annotations.Test
    public void testcase3() throws InterruptedException {
        MainPage mainPage = new MainPage();
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com","12345678");
        Thread.sleep(5000);
        mainPageFunction.product();
        commonFunction.isDisplayed(mainPage.image);
        commonFunction.isDisplayed(mainPage.code);
        commonFunction.isDisplayed(mainPage.name);
        commonFunction.isDisplayed(mainPage.brand);
        commonFunction.isDisplayed(mainPage.category);
        commonFunction.isDisplayed(mainPage.price);
        commonFunction.isDisplayed(mainPage.quantity);
        commonFunction.isDisplayed(mainPage.alertQuantity);
        commonFunction.isDisplayed(mainPage.actions);
    }
    @org.testng.annotations.Test
    public void testcase4() throws InterruptedException {
        MainPage mainPage = new MainPage();
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com","12345678");
        Thread.sleep(5000);
        mainPageFunction.product();
        Thread.sleep(5000);
        mainPageFunction.clickLemon();
        mainPageFunction.isLemonImgDisplayed();
        mainPageFunction.isLemonTypeDisplayed();
        mainPageFunction.isLemonNameDisplayed();
        mainPageFunction.isLemonCodeDisplayed();
        mainPageFunction.isLemonCategoryDisplayed();
        mainPageFunction.isLemonUnitDisplayed();
        mainPageFunction.isLemonCostDisplayed();
        mainPageFunction.isLemonPriceDisplayed();
        mainPageFunction.isLemonTaxMethodDisplayed();
        mainPageFunction.isTaxRateDisplayed();
        mainPageFunction.isLemonAlertQuantityDisplayed();

    }
    @org.testng.annotations.Test
    public void testcase5() throws InterruptedException {
        MainPage mainPage = new MainPage();
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com","12345678");
        Thread.sleep(5000);
        mainPageFunction.product();
        mainPageFunction.editMouse();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test
    public void testcase6() throws InterruptedException {
        MainPage mainPage = new MainPage();
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com","12345678");
        Thread.sleep(5000);
        mainPageFunction.barcodeView();
        Thread.sleep(2000);
        commonFunction.isDisplayed(mainPage.addProduct);
        commonFunction.isDisplayed(mainPage.style);
        commonFunction.isDisplayed(mainPage.printLabel);
        commonFunction.isDisplayed(mainPage.siteNameLabel);
        commonFunction.isDisplayed(mainPage.productNameLabel);
        commonFunction.isDisplayed(mainPage.priceLabel);
        commonFunction.isDisplayed(mainPage.curenciesLabel);
        commonFunction.isDisplayed(mainPage.unitLabel);
        commonFunction.isDisplayed(mainPage.categoyLabel);
        commonFunction.isDisplayed(mainPage.variantsLabel);
        commonFunction.isDisplayed(mainPage.productImgLabel);
        commonFunction.isDisplayed(mainPage.promotionalPrice);
    }
    @org.testng.annotations.Test
    public void testcase7() throws InterruptedException {
        MainPage mainPage = new MainPage();
        MainPageFunction mainPageFunction = new MainPageFunction(driver);
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com","12345678");
        Thread.sleep(5000);
        mainPageFunction.barcodeView();
        Thread.sleep(2000);
        mainPageFunction.addProduct("Kiwi");

        commonFunction.isDisplayed(mainPage.kiwiImg);
        commonFunction.isDisplayed(mainPage.stockManagerAdvance);
        commonFunction.isDisplayed(mainPage.kiwi);
        commonFunction.isDisplayed(mainPage.kiwiPice);
        commonFunction.isDisplayed(mainPage.kiwiUnit);
        commonFunction.isDisplayed(mainPage.kiwiCategorary);
        commonFunction.isDisplayed(mainPage.barcodeImg);
    }
    @org.testng.annotations.Test
    public void testcase8() throws InterruptedException {
        SalePage salePage = new SalePage();
        SaleFunction saleFunction = new SaleFunction(driver);
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com", "12345678");
        Thread.sleep(5000);
        saleFunction.sale();
        saleFunction.addSale();
    }

    @org.testng.annotations.Test
    public void testcase9() throws InterruptedException {
        PurchaseFuntion purchaseFuntion = new PurchaseFuntion(driver);
        PurchasePage purchasePage = new PurchasePage();
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com", "12345678");
        Thread.sleep(5000);
        purchaseFuntion.purchase();
    }

    @org.testng.annotations.Test
    public void testcase10() throws InterruptedException {
        PurchaseFuntion purchaseFuntion = new PurchaseFuntion(driver);
        PurchasePage purchasePage = new PurchasePage();
        CommonFunction commonFunction = new CommonFunction(driver);
        LoginFunction loginFunction = new LoginFunction(driver);
        loginFunction.login("admin@tecdiary.com", "12345678");
        Thread.sleep(5000);
        purchaseFuntion.purchase();
        purchaseFuntion.addPurchase();
    }
}
