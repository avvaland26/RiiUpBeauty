package WebTest;

import org.openqa.selenium.By;

public class ContactUs extends Util{
    public void userClickOnContactUsButton(){
        driver.findElement(By.linkText("Contact Us")).click();
    }
    public void userEnterAllDetails(){
        driver.findElement(By.id("contact-form-name")).sendKeys("Anjali");
        driver.findElement(By.id("contact-form-email")).sendKeys("Anjali9+"+System.currentTimeMillis()+"@gmail.com");
        driver.findElement(By.id("contact-form-message")).sendKeys("I like your eye Lashes");
        driver.findElement(By.xpath("//button[@class=\"form__submit form__submit--centered button button--primary button--min-width\"] ")).click();
    }

}
