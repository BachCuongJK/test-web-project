package function;

import core.BasePage;
import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;

public class CommonFunction extends BasePage {
    public CommonFunction(WebDriver driver) {
        super(driver);
    }

    public void sendkeys(By by , String value){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.clear();
        element.sendKeys(value);
    }


    public void click(By by ){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.click();
    }
    public void click2(By by ){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.click();
    }

    public void selectByIndex(By by , int index){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void selectByValue(By by , String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public void selectByText(By by , String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void switchWindownByIndex(int index){
        ArrayList<String> window = new ArrayList<>();
        driver.switchTo().window(window.get(index));
    }

    public void switchWindowByTitle(String title){
        for(String windownID:driver.getWindowHandles()){
            String getTitle = driver.switchTo().window(windownID).getTitle();
            if(getTitle.equals(title)){
                driver.switchTo().window(windownID);
                break;
            }
        }
    }

    public void verifyTitle(String title){
        Assert.assertEquals(driver.getTitle(),title);
    }
    public void isDisplayed(By by){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.isDisplayed();
    }
    public void clickCheckBox(By by){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        Actions actions = new Actions(driver);
        actions.click(element);
        actions.moveToElement(element);
        actions.perform();
    }
}
