package WebTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.experimental.categories.Categories;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    ContactUs contactUs = new ContactUs();
    Shop shop = new Shop();
    AboutUs aboutUs = new AboutUs();
    Shipping shipping = new Shipping();

    @Given("user opens browser")
    public void userOpensBrowser() {
    }

    @When("user enters URL")
    public void userEntersURL() {
    }

    @Then("user opens browser successfully")
    public void userOpensBrowserSuccessfully() {
        homePage.userClickOnReturnUsButton();
        homePage.userClickOnShopButton();

    }

    @Given("user is on homepage")
    public void userIsOnHomepage() {
    }

    @When("user click on contact us button")
    public void userClickOnContactUsButton() {
      contactUs.userClickOnContactUsButton();
    }

    @Then("user opens contact us page successfully")
    public void userOpensContactUsPageSuccessfully() {
      contactUs.userEnterAllDetails();

    }



  @Then("user open return page successfully")
  public void userOpenReturnPageSuccessfully() {
  }


        @When("user is click on shop button")
        public void userIsClickOnShopButton() {
        homePage.userClickOnShopButton();
        }

        @Then("user open shop page successfully")
        public void userOpenShopPageSuccessfully() {
        shop.userClickOnAllAddToCartButton();

        }


    @When("user click on {string} link")
    public void userClickOnLink(String category) {
        homePage.userClickOnCategoryLink(category);
    }



    @Then("user should be able to navigate{string} successfully")
    public void userShouldBeAbleToNavigateSuccessfully(String link) {
        homePage.userShouldBeAbleToNavigateToSuccessfully(link);
    }

    @When("user click About Us button")
    public void userClickAboutUsButton() {
        homePage.userClickOnAboutUsButton();
    }

    @Then("user opens About Us Page Successfully")
    public void userOpensAboutUsPageSuccessfully() {
        aboutUs.verifyUserOnAboutUsPage();
        aboutUs.verifyAboutUsText();
    }

    @When("user is click on shipping button")
    public void userIsClickOnShippingButton() {
        homePage.userClickOnShippingButton();
    }

    @Then("user open shipping page successfully")
    public void userOpenShippingPageSuccessfully() {
        shipping.verifyUserOnShippingPage();
        shipping.verifyShippingText();
    }

    @When("user is click on return button")
    public void userIsClickOnReturnButton() {
    }
}
