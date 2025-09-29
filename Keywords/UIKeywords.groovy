import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository

import internal.GlobalVariable

public class UIKeywords {

	@Keyword
	def loginToApp(String username , String password) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.url)
		WebUI.verifyElementPresent(findTestObject('CoCo/login/input_email'), 0)
		WebUI.setText(findTestObject('Object Repository/CoCo/login/input_email'), username)
		WebUI.verifyElementPresent(findTestObject('CoCo/login/input_password'), 0)
		WebUI.setText(findTestObject('Object Repository/CoCo/login/input_password'), password)
		WebUI.click(findTestObject('Object Repository/CoCo/login/btn_Login'))
	}

	// === Assertions ===

	@Keyword
	def verifyElementPresentVisibleText(String objectPath, String objectText) {
		WebUI.scrollToElement(findTestObject(objectPath), 0)
		WebUI.verifyElementVisible(findTestObject(objectPath), FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject(objectPath), 0)
		WebUI.verifyElementText(findTestObject(objectPath), objectText)
	}

	@Keyword
	def verifyElementPresentVisible(String objectPath) {
		WebUI.scrollToElement(findTestObject(objectPath), 0)
		WebUI.verifyElementVisible(findTestObject(objectPath), FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject(objectPath), 0)
	}

	@Keyword
	def verifyElementContainsPartialText(String objectPath, String partialText) {
		WebUI.scrollToElement(findTestObject(objectPath), 0)
		def fullText = WebUI.getText(objectPath)
		assert fullText.contains(partialText)
	}

	@Keyword
	def clickElement(String objectPath) {
		WebUI.scrollToElement(findTestObject(objectPath), 0)
		WebUI.waitForElementVisible(findTestObject(objectPath), 0)
		WebUI.click(findTestObject(objectPath))
	}

	@Keyword
	def verifyElementTextNotEmpty(String objectPath) {
		String text = WebUI.getText(findTestObject(objectPath))
		WebUI.verifyNotEqual(text.trim(), '', FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def verifyURL(String objectPath, String expectedURL) {
		WebUI.click(findTestObject(objectPath))
		String url = WebUI.getUrl()
		WebUI.verifyEqual(url, expectedURL)
	}

	@Keyword
	def verifyTopNavItemsFromData(String dataFileName, String userName) {
		def data = findTestData(dataFileName)
		int rowCount = data.getRowNumbers()

		for (int i = 1; i <= rowCount; i++) {
			def objPath = data.getValue("Object", i)
			def text = data.getValue("Text", i)
			def url = data.getValue("URL", i)
			def staffOnly = data.getValue("StaffOnly", i)

			// Skip staff-only items if not staff
			if (staffOnly?.toBoolean() && !userName.equalsIgnoreCase("sherry.perez@vestd.com")) {
				continue
			}

			if (text) {
				verifyElementPresentVisibleText(objPath, text)
			} else {
				verifyElementPresentVisible(objPath)
			}

			if (url) {
				verifyURL(objPath, url)
				WebUI.back()
			}
		}
	}


	@Keyword
	def verifySideNavItems(TestData testData) {
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			def objPath = testData.getValue('sideNavObject', row)  // <-- changed here
			def expectedText = testData.getValue('text', row)

			if (objPath) {
				WebUI.waitForElementPresent(findTestObject(objPath), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(
						ObjectRepository.findTestObject(objPath),
						10,
						FailureHandling.CONTINUE_ON_FAILURE
						)

				if (expectedText) {
					WebUI.verifyElementText(
							ObjectRepository.findTestObject(objPath),
							expectedText,
							FailureHandling.CONTINUE_ON_FAILURE
							)
				}
			} else {
				WebUI.comment("⚠️ Skipped row $row with no 'sideNavObject' defined")
			}
		}
	}
}