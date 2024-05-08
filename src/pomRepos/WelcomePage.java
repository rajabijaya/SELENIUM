package pomRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	// constructor
	public WelcomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartLink;

	@FindBy(linkText = "//span[text()='Wishlist']")
	private WebElement wishlistLink;

	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;

	@FindBy(partialLinkText = "Computers")
	private WebElement computerssLink;

	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicsLink;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelandshoesLink;

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadsLink;

	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCardsLink;

	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopsLink;

	@FindBy(partialLinkText = "Notebooks")
	private WebElement notebooksLink;

	@FindBy(partialLinkText = "Accessories")
	private WebElement accessoriesLink;

	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraphotoLink;

	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellphonesLink;

	@FindBy(id = "small-searchterms")
	private WebElement searchinputLink;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchLink;

	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement welcomelogoLink;

	@FindBy(xpath = "//strong[text()='Categories']")
	private WebElement categoriesLink;

	@FindBy(partialLinkText = "//strong[text()='Manufacturers']")
	private WebElement manufacturersLink;

	@FindBy(linkText = "Tricentis")
	private WebElement tricentisLink;

	@FindBy(xpath = "//strong[text()='Newsletter']")
	private WebElement newsletterLink;

	@FindBy(xpath = "//span[text()='Sign up for our newsletter:']")
	private WebElement signupnewsletterLink;

	@FindBy(id = "newsletter-subscribe-button")
	private WebElement newslettersuscribeLink;

	@FindBy(xpath = "//strong[text()='Community poll']")
	private WebElement communitypollLink;

	@FindBy(xpath = "//strong[text()='Do you like nopCommerce?']")
	private WebElement communitypolldropdownLink;

	@FindBy(id = "pollanswers-1")
	private WebElement pollanswers1Link;

	@FindBy(id = "pollanswers-2")
	private WebElement pollanswers2Link;

	@FindBy(id = "pollanswers-3")
	private WebElement pollanswers3Link;

	@FindBy(id = "pollanswers-4")
	private WebElement pollanswers4Link;

	@FindBy(id = "vote-poll-1")
	private WebElement votepoll1Link;

	@FindBy(xpath = "(//a[@class='nivo-imageLink'])[1]")
	private WebElement logoLink;

	@FindBy(xpath = "//div[@style='display: block;']")
	private WebElement tricentiesacademyLink;

	@FindBy(linkText = "Prev")
	private WebElement previousviewLink;

	@FindBy(linkText = "Next")
	private WebElement nextviewLink;

	@FindBy(id = "//strong[text()='Popular tags']")
	private WebElement populartagsLink;

	@FindBy(linkText = "apparel")
	private WebElement populartagappearlLink;

	@FindBy(linkText = "awesome")
	private WebElement populartagawesomeLink;

	@FindBy(linkText = "//h2[contains(text(),' Welcome to our store')]")
	private WebElement welcometostoreLink;

	@FindBy(xpath = "//p[contains(text(),'Welcome to the new Tricentis store!')]")
	private WebElement welcometonewstoreLink;

	@FindBy(xpath = "//p[contains(text(),'Feel free to shop around and explore everything.')]")
	private WebElement freetoshopandexplorwLink;

	@FindBy(xpath = "//strong[text()='Featured products']")
	private WebElement featuredproductsLink;

	@FindBy(xpath = "//img[@alt='Picture of $25 Virtual Gift Card']")
	private WebElement virtualgiftcardIcon;
	
	@FindBy(linkText = "$25 Virtual Gift Card")
	private WebElement virtualgiftCardIcon;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingcartLink() {
		return shoppingcartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputerssLink() {
		return computerssLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelandshoesLink() {
		return apparelandshoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getDesktopsLink() {
		return desktopsLink;
	}

	public WebElement getNotebooksLink() {
		return notebooksLink;
	}

	public WebElement getAccessoriesLink() {
		return accessoriesLink;
	}

	public WebElement getCameraphotoLink() {
		return cameraphotoLink;
	}

	public WebElement getCellphonesLink() {
		return cellphonesLink;
	}

	public WebElement getSearchinputLink() {
		return searchinputLink;
	}

	public WebElement getSearchLink() {
		return searchLink;
	}

	public WebElement getWelcomelogoLink() {
		return welcomelogoLink;
	}

	public WebElement getCategoriesLink() {
		return categoriesLink;
	}

	public WebElement getManufacturersLink() {
		return manufacturersLink;
	}

	public WebElement getTricentisLink() {
		return tricentisLink;
	}

	public WebElement getNewsletterLink() {
		return newsletterLink;
	}

	public WebElement getSignupnewsletterLink() {
		return signupnewsletterLink;
	}

	public WebElement getNewslettersuscribeLink() {
		return newslettersuscribeLink;
	}

	public WebElement getCommunitypollLink() {
		return communitypollLink;
	}

	public WebElement getCommunitypolldropdownLink() {
		return communitypolldropdownLink;
	}

	public WebElement getPollanswers1Link() {
		return pollanswers1Link;
	}

	public WebElement getPollanswers2Link() {
		return pollanswers2Link;
	}

	public WebElement getPollanswers3Link() {
		return pollanswers3Link;
	}

	public WebElement getPollanswers4Link() {
		return pollanswers4Link;
	}

	public WebElement getVotepoll1Link() {
		return votepoll1Link;
	}

	public WebElement getLogoLink() {
		return logoLink;
	}

	public WebElement getTricentiesacademyLink() {
		return tricentiesacademyLink;
	}

	public WebElement getPreviousviewLink() {
		return previousviewLink;
	}

	public WebElement getNextviewLink() {
		return nextviewLink;
	}

	public WebElement getPopulartagsLink() {
		return populartagsLink;
	}

	public WebElement getPopulartagappearlLink() {
		return populartagappearlLink;
	}

	public WebElement getPopulartagawesomeLink() {
		return populartagawesomeLink;
	}

	public WebElement getWelcometostoreLink() {
		return welcometostoreLink;
	}

	public WebElement getWelcometonewstoreLink() {
		return welcometonewstoreLink;
	}

	public WebElement getFreetoshopandexplorwLink() {
		return freetoshopandexplorwLink;
	}

	public WebElement getFeaturedproductsLink() {
		return featuredproductsLink;
	}

	public WebElement getVirtualgiftcardIcon() {
		return virtualgiftcardIcon;
	}

	public WebElement getVirtualgiftCardIcon() {
		return virtualgiftCardIcon;
	}

}
