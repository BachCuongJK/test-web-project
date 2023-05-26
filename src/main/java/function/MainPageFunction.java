package function;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import page.MainPage;

public class MainPageFunction extends BasePage {
    CommonFunction commonFunction = new CommonFunction(driver);
    MainPage mainPage = new MainPage();
    public MainPageFunction(WebDriver driver) {
        super(driver);
    }

   public void product(){
        commonFunction.click2(mainPage.productMenu);
        commonFunction.click2(mainPage.listProduct);
   }
   public void clickLemon(){
        commonFunction.click(mainPage.lemon);
   }
    public void isLemonTypeDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonType);
    }
    public void isLemonImgDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonImg);
    }
    public void isLemonNameDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonType);
    }
    public void isLemonCodeDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonType);
    }
    public void isLemonCategoryDisplayed(){
        commonFunction.isDisplayed(mainPage.categoryLemon);
    }
    public void isLemonUnitDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonUnit);
    }
    public void isLemonCostDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonCost);
    }
    public void isLemonPriceDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonPrice);
    }
    public void isTaxRateDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonTaxRate);
    }
    public void isLemonTaxMethodDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonTaxMethod);
    }
    public void isLemonAlertQuantityDisplayed(){
        commonFunction.isDisplayed(mainPage.lemonAlertQuantity);
    }
    public void editMouse() throws InterruptedException {
        commonFunction.sendkeys(mainPage.searchBox,"Mouse");
        Thread.sleep(1000);
        commonFunction.click(mainPage.actionButton);
        Thread.sleep(2000);
        commonFunction.click(mainPage.editProduct);
        commonFunction.sendkeys(mainPage.productCodeBox,"EAN8");
    }
    public void barcodeView(){
        commonFunction.click(mainPage.productMenu);
        commonFunction.click(mainPage.printBarcode);
    }
    public void addProduct(String value) throws InterruptedException {
        commonFunction.sendkeys(mainPage.addProductBox,value);
        commonFunction.clickCheckBox(mainPage.curencyBox);
        commonFunction.clickCheckBox(mainPage.unitBox);
        commonFunction.clickCheckBox(mainPage.categoryBox);
        commonFunction.clickCheckBox(mainPage.variantsBox);
        commonFunction.clickCheckBox(mainPage.productImgBox);
        commonFunction.click(mainPage.updateBtn);
        Thread.sleep(10000);
    }
}
