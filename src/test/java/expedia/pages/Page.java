package expedia.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  public WebDriver driver;
public String url;
  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

  public boolean waitUntilDisplayed(WebElement element, int delay) {
    try{
      while (!element.isDisplayed() || (delay-->0)){
        Thread.sleep(100);
      }
      return true;
    }
    catch(Exception e){
      return false;
    }
  }
 public boolean openPage(){
    try{
      this.driver.get(this.url);
    return true;}
    catch (Exception e){
      return false;
    }
 }

  public boolean fillOutInput(WebElement element, int delay, String text){
    try {
      this.waitUntilDisplayed(element, delay);
      element.sendKeys(text);
      return true;
    }
    catch(NoSuchElementException e){
      return false;
    }
  }

}
