package page;

import org.openqa.selenium.By;

public class SalePage {
    public By sale= By.xpath("//li[contains(@class,'mm_sales')]//a[@class='dropmenu']");
    public By addSale =By.xpath("//span[normalize-space()='Add Sale']");
    public By selectedCustomer = By.xpath("//div[@class=\"select2-container form-control input-tip\"]//label[contains(text(),\"Customer\")]");
    public By inputCustomer =By.xpath("//input[@id='s2id_autogen12_search']");
    public By addItems=By.xpath("//input[@id='add_item']");
    public By saleStatus =By.id("select2-chosen-5");
    public By submitBtn =By.xpath("//input[@type=\"submit\"]");

}
