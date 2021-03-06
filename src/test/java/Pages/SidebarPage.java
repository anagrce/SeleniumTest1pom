package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SidebarPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement elements;

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getElements() {
        return driver.findElements(By.className("text"));
    }


    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //-------------------

    public void clickOnLoginButton() {
        for (int i = 0; i < getElements().size(); i++) {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Login")) {
                getElements().get(i).click();
            }
        }
    }

}
