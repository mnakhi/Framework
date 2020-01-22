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
    public void testUserCanGoToMail() throws Exception {
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.clickingToMail();
    }
    @Test
    public void testUserCanSignIn() throws Exception {
        driver.get("https://www.yahoo.com");
        HomePage hp = new HomePage();
        hp.clickingOnSignIn();
    }
}
