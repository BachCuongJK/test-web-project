package function;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.PurchasePage;

import java.util.ArrayList;
import java.util.List;

public class PurchaseFuntion extends BasePage {
    CommonFunction commonFunction = new CommonFunction(driver);
    PurchasePage purchasePage = new PurchasePage();
    public PurchaseFuntion(WebDriver driver) {
        super(driver);
    }
    public void purchase(){
        commonFunction.click(purchasePage.purChase);
        commonFunction.click(purchasePage.listPurChase);
    }

    public void addPurchase(){
        commonFunction.click(purchasePage.addPurchase);
    }

}
