package expedia.pages;

import org.openqa.selenium.WebDriver;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  public WebDriver driver;

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

}
