package page;

import org.openqa.selenium.By;

public class LoginPage {
    public By userName = By.xpath("//input[@type='text']");
    public By passWord = By.xpath("//input[@type='password']");
    public By loginBtn = By.xpath("//button[@type=\"submit\"]");
    public By rememberMe = By.xpath("//label[@for=\"remember\"]");
    //login sucessfull
    public By sucessfull = By.xpath("//div[@class=\"alert alert-success\"]");
    public By overChart = By.xpath("//h2[contains(text(),\"Overview Chart\")]");
    public By quickLinks =By.xpath("//h2[contains(text(),\"Quick Links\")]");
    public By lastFive = By.xpath("//h2[contains(text(),\" Latest Five\")]");
    public By bestSales = By.xpath("//h2[contains(text(),\"Best Sellers (May-2023) \")]");
}
