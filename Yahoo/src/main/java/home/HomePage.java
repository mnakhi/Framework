package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    public void searchUsingSearch(String name){
        this.driver.findElement(By.name("p")).sendKeys(name);
        this.driver.findElement(By.cssSelector("button[id='header-desktop-search-button']")).click();
    }
    public void clickingByOption(String name){
        this.driver.findElement(By.linkText(name)).click();
    }
    public void clickingToMail() throws Exception {
        this.driver.findElement(By.xpath("//span[text()='Mail']")).click();
    }
    public void clickingOnSignIn(){
        this.driver.findElement(By.xpath("//*[@id=\"header-signin-link\"]/span")).click();
    }
    public void signingInYahooMail(String name,String password) throws Exception {
        this.driver.findElement(By.xpath("//*[@id=\"header-signin-link\"]/span")).click();
        this.driver.findElement(By.id("login-username")).sendKeys(name);
        this.driver.findElement(By.id("login-signin")).click();
        Thread.sleep(5000);
        this.driver.findElement(By.id("login-passwd")).sendKeys(password);// what is that extra '? w
        this.driver.findElement(By.id("login-signin")).click();
    }

}
