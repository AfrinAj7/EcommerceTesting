package tests;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FunctionalTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void trial() {
 driver.get("https://automationteststore.com/");
 driver.manage().window().setSize(new Dimension(1074, 824));
 driver.findElement(By.id("filter_keyword")).click();
 driver.findElement(By.id("filter_keyword")).sendKeys("men");
 driver.findElement(By.id("filter_keyword")).sendKeys(Keys.ENTER);
 driver.findElement(By.cssSelector(".col-md-3:nth-child(3) img")).click();
 driver.findElement(By.linkText("Add to Cart")).click();
 driver.findElement(By.cssSelector("#cart_checkout1 > .fa")).click();
 driver.findElement(By.id("checkout_btn")).click();
 driver.findElement(By.cssSelector(".btn:nth-child(7)")).click();
 driver.findElement(By.cssSelector(".fa-check")).click();
 driver.findElement(By.id("AccountFrm_firstname")).click();
 driver.findElement(By.id("AccountFrm_firstname")).sendKeys("Afrin");
 driver.findElement(By.id("AccountFrm_lastname")).click();
 driver.findElement(By.id("AccountFrm_lastname")).sendKeys("Jamal");
 driver.findElement(By.id("AccountFrm_email")).click();
 driver.findElement(By.id("AccountFrm_email")).sendKeys("Afrin.jamal2001@gmail.com");
 driver.findElement(By.id("AccountFrm_telephone")).click();
 driver.findElement(By.id("AccountFrm_telephone")).sendKeys("9508844062");
 driver.findElement(By.id("AccountFrm_fax")).click();
 driver.findElement(By.id("AccountFrm_fax")).sendKeys("7379822312");
 driver.findElement(By.id("AccountFrm_company")).click();
 driver.findElement(By.id("AccountFrm_company")).sendKeys("Lovely Professional University");
 driver.findElement(By.id("AccountFrm_address_1")).click();
 driver.findElement(By.id("AccountFrm_address_1")).sendKeys("Qtn739");
 driver.findElement(By.id("AccountFrm_address_2")).click();
 driver.findElement(By.id("AccountFrm_address_2")).sendKeys("sec9d");
 driver.findElement(By.id("AccountFrm_city")).click();
 driver.findElement(By.id("AccountFrm_city")).sendKeys("bokaro");
 driver.findElement(By.id("AccountFrm_country_id")).click();
 {
   WebElement dropdown = driver.findElement(By.id("AccountFrm_country_id"));
   dropdown.findElement(By.xpath("//option[. = 'India']")).click();
 }
 driver.findElement(By.id("AccountFrm_postcode")).click();
 driver.findElement(By.id("AccountFrm_postcode")).sendKeys("7000135");
 driver.findElement(By.id("AccountFrm_zone_id")).click();
 {
   WebElement dropdown = driver.findElement(By.id("AccountFrm_zone_id"));
   dropdown.findElement(By.xpath("//option[. = 'West Bengal']")).click();
 }
 driver.findElement(By.id("AccountFrm_loginname")).click();
 driver.findElement(By.id("AccountFrm_loginname")).sendKeys("afrinj");
 driver.findElement(By.id("AccountFrm_password")).click();
 driver.findElement(By.id("AccountFrm_password")).sendKeys("12345");
 driver.findElement(By.id("AccountFrm_confirm")).click();
 driver.findElement(By.id("AccountFrm_confirm")).sendKeys("12345");
 driver.findElement(By.id("AccountFrm_newsletter0")).click();
 driver.findElement(By.id("AccountFrm_agree")).click();
 driver.findElement(By.cssSelector(".lock-on-click")).click();
 driver.findElement(By.id("AccountFrm_email")).click();
 driver.findElement(By.id("AccountFrm_email")).sendKeys("Afrin.jamal2002@gmail.com");
 driver.findElement(By.cssSelector(".lock-on-click")).click();
 driver.findElement(By.id("AccountFrm_password")).click();
 driver.findElement(By.id("AccountFrm_password")).sendKeys("12345678");
 driver.findElement(By.id("AccountFrm_confirm")).click();
 driver.findElement(By.id("AccountFrm_confirm")).sendKeys("12345678");
 driver.findElement(By.cssSelector(".lock-on-click")).click();
 driver.findElement(By.id("checkout_btn")).click();
 driver.findElement(By.cssSelector(".logo > img")).click();
 driver.findElement(By.cssSelector(".menu_text:nth-child(1)")).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".nav-dash > li:nth-child(5) > a"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 js.executeScript("window.scrollTo(0,220.8000030517578)");
 driver.findElement(By.linkText("Logoff")).click();
 driver.findElement(By.linkText("Continue")).click();
 driver.findElement(By.linkText("Login or register")).click();
 driver.findElement(By.id("loginFrm_loginname")).sendKeys("afrinj");
 driver.findElement(By.id("loginFrm_password")).sendKeys("12345678");
 driver.findElement(By.id("loginFrm_loginname")).click();
 driver.findElement(By.id("loginFrm_password")).click();
 driver.findElement(By.cssSelector(".btn:nth-child(7)")).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".nav-dash > li:nth-child(7) > a"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 {
   WebElement element = driver.findElement(By.linkText("$0.00"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 js.executeScript("window.scrollTo(0,0)");
 driver.findElement(By.linkText("Order history")).click();
 driver.findElement(By.id("button_edit")).click();
 driver.findElement(By.cssSelector(".logo > img")).click();
}
}
