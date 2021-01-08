package WebTest;

import org.openqa.selenium.By;

public class Shop extends Util{
    public void userClickOnAllAddToCartButton(){
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[1]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[2]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[3]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[4]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[5]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[6]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[7]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[8]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[9]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[10]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[11]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[12]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[13]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[14]//div[1]//form")).click();
        driver.findElement(By.xpath("//div[@class=\"product-list product-list--collection \"]//div[15]//div[1]//form")).click();







    }
}
