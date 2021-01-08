package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Util{
    public void userClickOnReturnUsButton(){
        driver.findElement(By.xpath("//li[5]//a[@class=\"nav-bar__link link\"]")).click();
    }
    public void userClickOnShopButton(){
       driver.findElement(By.xpath("//li[3]//a[@class=\"nav-bar__link link\"]")) .click();
    }
     public void userClickOnAboutUsButton(){
        driver.findElement(By.linkText("About Us")).click();
     }

     public void userClickOnCategoryLink(String category){

        driver.findElements(By.linkText(category));
     }
     public void userShouldBeAbleToNavigateToSuccessfully(String link){

        driver.findElements(By.linkText(link));
     }
     public void userClickOnShippingButton(){
        driver.findElement(By.linkText("Shipping")).click();
     }

    }

