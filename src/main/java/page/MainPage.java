package page;

import org.openqa.selenium.By;

public class MainPage {
    public By productMenu= By.xpath("//li[@class='mm_products']//a[@class='dropmenu']");
    public By listProduct = By.xpath("//span[normalize-space()='List Products']");
    public By image = By.xpath("//th[@aria-label=\"Image\"]");
    public By code = By.xpath("//th[@aria-label=\"Code: activate to sort column ascending\"]");
    public By name = By.xpath("//th[@aria-label=\"Name: activate to sort column ascending\"]");
    public By brand = By.xpath("//th[@aria-label=\"Brand: activate to sort column ascending\"]");
    public By category = By.xpath("//th[@aria-label=\"Category: activate to sort column ascending\"]");
    public By cost = By.xpath("//th[@aria-label=\"Cost: activate to sort column ascending\"]");
    public By price = By.xpath("//th[@aria-label=\"Price: activate to sort column ascending\"]");
    public By quantity = By.xpath("//th[@aria-label=\"Quantity: activate to sort column ascending\"]");
    public By unit = By.xpath("//th[@aria-label=\"Unit: activate to sort column ascending\"]");
    public By alertQuantity = By.xpath("//th[@aria-label='Alert Quantity: activate to sort column ascending']");
    public By actions = By.xpath("//th[@aria-label='Actions']");
    public By lemon = By.xpath("//td[normalize-space()='FFR03']");
    public By lemonType =By.xpath("//td[contains(text(),'Standard')]");
    public By lemonImg = By.xpath("//img[@id=\"pr-image\"]");
    public By lemonCode = By.xpath("//td[contains(text(),'FFR03')]");//td[contains(text(),'Standard')]

    public By lemonUnit = By.xpath("//td[contains(text(),'Piece (pc)')]");
    public By categoryLemon = By.xpath("//td[contains(text(),'Fruits')]");
    public By lemonCost = By.xpath("//td[contains(text(),'1.95')]");
    public By lemonPrice = By.xpath("//td[contains(text(),'3.00')]");
    public By lemonTaxRate = By.xpath("//td[contains(text(),'GST @0%')]");
    public By lemonTaxMethod = By.xpath("//td[contains(text(),'Inclusive')]");
    public By lemonAlertQuantity = By.xpath("//td[contains(text(),'5.00')]");
    public By searchBox = By.xpath("//input[@aria-controls='PRData']");
    public By mouseBox = By.xpath("//div[@class='icheckbox_square-blue hover']//ins[@class='iCheck-helper']");
    public By actionButton = By.xpath("//button[normalize-space()='Actions']");
    public By editProduct = By.xpath("//a[normalize-space()='Edit Product']");
    public By productTypeMenu =By.xpath("//div[@id='select2-drop-mask']");
    public By productCodeBox = By.xpath("//input[@id='code']");
    public By taxMethodBox = By.xpath("//div[@id='select2-drop-mask']");
    public By combo = By.xpath("//tbody/tr/td[@class='content-con']/div[@id='content']/div[@class='row']/div[@class='col-lg-12']/div[@class='box']/div[@class='box-content']/div[@class='row']/div[@class='col-lg-12']/form/div[@class='col-md-5']/div[2]");
    public By printBarcode = By.xpath("//span[normalize-space()='Print Barcode/Label']");
    public By addProduct =By.xpath("//label[@for=\"add_item\"]");
    public By style = By.xpath("//label[@for=\"style\"]");
    public By printLabel = By.xpath("//span[normalize-space()='Print:']");
    public By siteNameLabel = By.xpath("//label[@for='site_name']");
    public By productNameLabel = By.xpath("//label[@for='product_name']");
    public By priceLabel = By.xpath("//label[@for='price']");
    public By curenciesLabel = By.xpath("//label[@for='currencies']");
    public By unitLabel = By.xpath("//label[@for='unit']");
    public By categoyLabel = By.xpath("//label[@for='category']");
    public By variantsLabel = By.xpath("//label[@for='variants']");
    public By productImgLabel = By.xpath("//label[@for='product_image']");
    public By promotionalPrice = By.xpath("//label[@for='check_promo']");
    public By addProductBox = By.xpath("//input[@id='add_item']");
    public By styleSheet = By.xpath("//div[@id='select2-drop-mask']");
    public By curencyBox =By.xpath("//input[@name='currencies']");
    public By unitBox =By.xpath("//input[@name='unit']");
    public By categoryBox =By.xpath("//input[@name='category']");
    public By variantsBox =By.xpath("//input[@name='variants']");
    public By productImgBox =By.xpath("//input[@name='product_image']");
    public By promotionalPriceBox = By.xpath("//div[@class='icheckbox_square-blue hover']//ins[@class='iCheck-helper']");
    public By updateBtn = By.xpath("//input[@name='print']");
    public By kiwiImg = By.xpath("//span[@class='product_image']//img");
    public By stockManagerAdvance =By.xpath("//span[@class='barcode_site']");
    public By kiwi = By.xpath("//span[@class='barcode_name']");
    public By kiwiPice = By.xpath("//span[@class='barcode_price']");
    public By kiwiUnit = By.xpath("//span[@class='barcode_unit']");
    public By kiwiCategorary = By.xpath("//span[@class=\"barcode_category\"]");
    public By barcodeImg =By.xpath("//img[@alt='FFR02']");





}
