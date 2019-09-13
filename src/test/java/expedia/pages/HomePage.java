package expedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(id="flight-origin-hp-flight")
  @CacheLookup
  public WebElement inputFlyingFrom;

  @FindBy(id="flight-destination-hp-flight")
  @CacheLookup
  public WebElement inputFlyingTo;

  @FindBy(id="flight-departing-hp-flight")
  @CacheLookup
  public WebElement inputDeparting;

  @FindBy(id="flight-returning-hp-flight")
  @CacheLookup
  public WebElement inputReturning;

  @FindBy(id="traveler-selector-hp-flight")
  @CacheLookup
  public WebElement inputTravelers;


  @FindBy(id = "tab-flight-tab-hp")
  public WebElement buttonFlights;




/*
  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement inputFlyingTo;

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement inputDeparting;

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement inputReturning;

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement inputTravelers;

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement buttonSearch;

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement buttonFlights;*/

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
}
