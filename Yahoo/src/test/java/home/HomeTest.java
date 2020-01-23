package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanUseSearchBar(){
        driver.get("https://www.yahoo.com/");
        HomePage hp = new HomePage();
        hp.searchUsingSearch("book");
    }
    @Test
    public void testUserCanClickOnNavigationBar(){
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.clickingByOption("News");
    }
    @Test
    public void testUserCanGoToMailUsingMailOption() throws Exception {
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.clickingToMail();
    }
    @Test
    public void testUserCanGoToSignInPageUsingSignInButton() throws Exception {
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.clickingOnSignIn();
    }
    @Test
    public void testUserCanSignInToMail() throws Exception {
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.signingInYahooMail("john11doe200@yahoo.com","Xyz456789");
        Thread.sleep(10000);
    }
    @Test
    public void testUserCanCheckOnWeatherForecast(){
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.checkingWeatherForecast();
    }
}
