package function;

import core.BasePage;
import core.BaseTest;
import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class LoginFunction extends BasePage {
    LoginPage loginPage = new LoginPage();
    CommonFunction commonFunction = new CommonFunction(driver);
    public LoginFunction(WebDriver driver) {
        super(driver);
    }
    public void login (String userName,String passWord){
        commonFunction.sendkeys(loginPage.userName,userName);
        commonFunction.sendkeys(loginPage.passWord,passWord);
        commonFunction.click(loginPage.loginBtn);
    }

    public void isLoginBtnDisplayed(){
        commonFunction.isDisplayed(loginPage.loginBtn);
    }
    public void isRemembermeDisplayed(){
        commonFunction.isDisplayed(loginPage.rememberMe);
    }
    public void isPassWordDisplayed(){
        commonFunction.isDisplayed(loginPage.passWord);
    }
    public void isUserNameDisplayed(){
        commonFunction.isDisplayed(loginPage.userName);
    }

    public void isSucessfullAlertDisplayed(){
        commonFunction.isDisplayed(loginPage.sucessfull);
    }

    public void isOverChartDisplayed(){
        commonFunction.isDisplayed(loginPage.overChart);
    }
    public void isQuickLinkDisplayed(){
        commonFunction.isDisplayed(loginPage.quickLinks);
    }
    public void isLastFiveDisplayed(){
        commonFunction.isDisplayed(loginPage.lastFive);
    }
    public void isBestSaleDisplayed(){
        commonFunction.isDisplayed(loginPage.bestSales);
    }
}
