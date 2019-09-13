package expedia;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import expedia.pages.HomePage;

public class MainTest extends TestNgTestBase {

  private HomePage homepage;

  @DataProvider(name = "roundTrip")
  public Object[][] createData() {
    return new Object[][] {
        { "Heathrow", "Dublin", "12/01/2019","12/07/2019",2}

    };
  }


  @BeforeMethod
  public void initPageObjects() {

    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test(dataProvider = "roundTrip")
  public void checkPrice(String from, String to, String dataDepart, String dataReturn, int adults) {
System.out.println(from+to+dataDepart+dataReturn+adults);

    driver.get(baseUrl);
    homepage.buttonFlights.click();
    homepage.inputFlyingFrom.sendKeys("Heathrow");
    homepage.inputFlyingFrom.sendKeys("Dublin");
    //driver.sendKeys("Heathrow");
    //Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
