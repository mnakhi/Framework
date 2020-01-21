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
//    public void s(String s){
//        this.driver.findElement(By.cssSelector())
//    }
}
