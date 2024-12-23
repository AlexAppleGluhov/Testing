package Lesson_15;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MtsHomePage {
    public WebDriver driver;

    public MtsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Определение локатора для заголовка формы быстрой оплаты

    @FindBy(css = "section.pay h2")
    private WebElement paySectionTitle;

    //Определение локатора для кнопки отмены сохранения куков

    @FindBy(css = "div.cookie.show button.cookie__cancel")
    private WebElement cookieCancelBtn;

    //Определение локатора для ссылки "Подробнее о сервисе"

    @FindBy(xpath = "//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]")
    private WebElement link;

    //Определение локатора для поля телефон

    @FindBy(css = "#connection-phone")
    private WebElement phoneField;

    //Определение локатора для поля сумма пополнения

    @FindBy(css = "#connection-sum")
    private WebElement sumField;

    //Определение локатора для кнопки пополнить

    @FindBy(css = "section.pay button[type='submit']")
    private WebElement payBtn;

    //Определение локатора для окна ввода реквизитов пополнения

    @FindBy(css = "iframe.bepaid-iframe")
    private WebElement payFrame;

    //Определение локаторов для картинок в форме пополнения

    @FindBy(xpath = "//section[@class='pay']//img")
    private List<WebElement> payImgages;

    public String getPaySectionTitle() {
        return paySectionTitle.getText().replaceAll("\n|\r\n", " ");
    }

    public void clickCookieCancelBtn() {
        cookieCancelBtn.click();
    }

    public String getLinkUrl() throws NoSuchElementException {
        return link.getAttribute("href");
    }

    public int getRespCode(String urlLink) throws MalformedURLException, IOException {
        URL url = new URL(urlLink);
        HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        return httpURLConnect.getResponseCode();
    }

    public void setPhoneField(String phoneNumber) throws NoSuchElementException {
        phoneField.sendKeys(phoneNumber);
    }

    public void setSumField(String sum) throws NoSuchElementException {
        sumField.sendKeys(sum);
    }

    public void clickPayBtn() throws NoSuchElementException {
        payBtn.click();
    }

    public String getFrameLink() throws NoSuchElementException {
        return payFrame.getAttribute("src");
    }

    public boolean isDisplayedImg(String scr) {
        for (WebElement payImage : payImgages) {
            if (payImage.getAttribute("src").contains(scr)) {
                return payImage.isDisplayed();
            }
        }
        return false;
    }
}
