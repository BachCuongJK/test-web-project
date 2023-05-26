package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PurchasePage {
    public By purChase = By.xpath("//li[@class='mm_purchases']//a[@class='dropmenu']");
    public By listPurChase = By.xpath("//li[@id='purchases_index']//a[@class='submenu']");
    public By addPurchase = By.xpath("//span[normalize-space()='Add Purchase']");
//    List<WebElement> cols = driver.findElements(By.xpath("//td[@class=\" sorting_1\"]"));
//                for (WebElement col:cols) {
//        System.out.println(col.getText()+"\t");
//    }
}
