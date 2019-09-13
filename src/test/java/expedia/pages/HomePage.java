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
static public String url="https://www.expedia.com/";

  @FindBy(id="flight-origin-hp-flight")
  @CacheLookup
  public WebElement inputFlyingFrom;

  @FindBy(id="flight-destination-hp-flight")
  @CacheLookup
  public WebElement inputFlyingTo;

  @FindBy(id="flight-departing-hp-flight")
  @CacheLookup
  public WebElement inputDataDeparting;

  @FindBy(id="flight-returning-hp-flight")
  @CacheLookup
  public WebElement inputDataReturning;

  @FindBy(id="traveler-selector-hp-flight")
  @CacheLookup
  public WebElement inputTravelers;

  @FindBy(xpath = "//*[text()=\"Search\"]")
  @CacheLookup
  public WebElement buttonSearch;

  @FindBy(id = "tab-flight-tab-hp")
  public WebElement buttonFlights;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
    this.url=url;
  }

  public boolean fillOutFlyingFrom(String text){
    return super.fillOutInput(this.inputFlyingFrom,20,text);
  }

  public boolean fillOutFlyingTo(String text){
    return super.fillOutInput(this.inputFlyingTo,20,text);
  }

  public boolean fillOutDataDeparture(String text){
    return super.fillOutInput(this.inputDataDeparting,20,text);
  }

  public boolean fillOutDataReturning(String text){
    return super.fillOutInput(this.inputDataReturning,20,text);
  }
}
