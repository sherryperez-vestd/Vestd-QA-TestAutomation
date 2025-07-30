package com
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys
import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class utilities {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}



	@Keyword
	def verifyLabelTextVisible(String expectedText) {
		WebDriver driver = DriverFactory.getWebDriver()

		List<WebElement> labels = driver.findElements(By.tagName("label"))
		boolean found = false

		for (WebElement label : labels) {
			String text = label.getText().trim()
			if (text.equals(expectedText)) {
				found = true
				break
			}
		}

		if (found) {
			WebUI.comment("✅ Label found: '" + expectedText + "'")
		} else {
			WebUI.comment("❌ Label not found: '" + expectedText + "'")
			assert false : "Expected label text not found: " + expectedText
		}
	}
	@Keyword
	def verifyTitlePresent(String expectedText) {
		WebDriver driver = DriverFactory.getWebDriver()

		// Try to locate the element by exact visible text (trimmed)
		boolean isPresent = driver.findElements(By.xpath("//*[normalize-space(text())='" + expectedText + "']")).size() > 0

		if (isPresent) {
			WebUI.comment("✅ Verified: '" + expectedText + "' is present on the page.")
		} else {
			WebUI.comment("❌ Missing: '" + expectedText + "' not found on the page!")
			assert false : "Text not found: " + expectedText
		}
	}


	@Keyword
	def selectFromCustomDropdown(TestObject inputField, String valueToSelect) {
		WebUI.click(inputField)
		WebUI.setText(inputField, valueToSelect)
		WebUI.delay(1)
		WebUI.sendKeys(inputField, Keys.chord(Keys.ENTER))
	}

	@Keyword
	def enterTextInInputField(TestObject inputField, String textToEnter) {
		WebUI.waitForElementVisible(inputField, 10)
		WebUI.clearText(inputField)
		WebUI.setText(inputField, textToEnter)
	}
}


