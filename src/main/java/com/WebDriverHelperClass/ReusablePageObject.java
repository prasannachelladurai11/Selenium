package com.WebDriverHelperClass;

import com.Base.InitiateDrivers;
import com.Configuration.BrowserConfigurationFile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;


public class ReusablePageObject extends InitiateDrivers {

	protected static WebElement elementTobe = null;
	protected static boolean isElementPresent;
	protected static List<WebElement> numberOfelementsTobe;
	public static Properties obj;
	public static FileInputStream objfile;
	public static boolean success;
	public static int count,Max_tries;
	public static String textTobe;

	protected static WebElement elementTobeClickable(By locator) {
		elementTobe = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		return elementTobe;
	}

	protected static WebElement presenceOfelement(By locator) {
		elementTobe = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(locator));
		return elementTobe;
	}
	protected static boolean titleTobePresent(String TitilOfthePage){
		isElementPresent=wait.until(ExpectedConditions.titleContains(TitilOfthePage));
		return isElementPresent;
	}
	protected static boolean textTobePresentinElement(By locator, String text) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
		return isElementPresent;
	}

	protected static WebElement visibilityOfelement(By locator) {
		elementTobe = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
		return elementTobe;
	}

	protected static boolean urlTobePresent(String url) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.urlToBe(url));
		return isElementPresent;
	}

	protected static List<WebElement> presenceOfallElements(By locator) {
		numberOfelementsTobe = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return numberOfelementsTobe;
	}

	protected static boolean texttobeInLocator(By locator, String text) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.textToBe(locator, text));
		return isElementPresent;
	}

	protected boolean titleContains(String text) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.titleContains(text));
		return isElementPresent;
	}

	protected static boolean urlContainstext(String text) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.urlContains(text));
		return isElementPresent;
	}

	protected static boolean inVisibilityofElement(By locator) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.invisibilityOfElementLocated(locator));
		return isElementPresent;
	}

	protected static List<WebElement> visibilityOfallElements(By locator) {
		numberOfelementsTobe = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return numberOfelementsTobe;
	}

	protected static boolean elementContainstext(By locator, String text) {
		isElementPresent = wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
		return isElementPresent;
	}
	protected static void checkPageIsReady() {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		if (js.executeScript("return document.readyState").toString().equals("complete")) {
			System.out.println("Page Is loaded.");
			return;
		}
		for (int i = 0; i < 25; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			if (js.executeScript("return document.readyState").toString().equals("complete")) {
				break;
			}
		}
	}
}




