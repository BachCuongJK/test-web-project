package function;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import page.SalePage;

public class SaleFunction extends BasePage {
    CommonFunction commonFunction = new CommonFunction(driver);
    SalePage salePage = new SalePage();
    public SaleFunction(WebDriver driver) {
        super(driver);
    }
    public void sale(){
        commonFunction.click(salePage.sale);
        commonFunction.click(salePage.addSale);
    }
    public void addSale(){
        commonFunction.click(salePage.selectedCustomer);
        commonFunction.sendkeys(salePage.addItems,"GRAPEFRUIT (FFR01)");


    }
}
