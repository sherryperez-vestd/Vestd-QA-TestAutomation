import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('user-login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.waitForElementPresent(findTestObject('Object Repository/my-equity-page/summary-bar/summary-bar-section'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/summary-bar-section'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/my-equity-page/summary-bar/summary-bar-section'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/summary-bar-section'))

WebUI.waitForElementPresent(findTestObject('Object Repository/my-equity-page/summary-bar/tile_my-shares'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_my-shares'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_my-shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_my-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_my-options'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_current-value'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_current-value'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_current-profit'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_current-profit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_projected-value'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tile_projected-value'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_my-shares'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_my-shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_My-shares'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_My-shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_My-shares'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_My-shares'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_My-shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_my-shares'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_my-shares'), 'This total includes all shares issued to you, both conditional and unconditional. Note: Exercised options are counted as unconditional shares.')

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_My shares_mr-2'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_My shares_mr-2'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_My-shares'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_My-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_My-options'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_my-options'), 0)

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_my-options'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_my-options'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_my-options'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_my-options'), 'This shows the total number of options you’re eligible to receive (depending on the terms of your option agreements)')

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_my-options'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_current-value'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_current-value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_Current-value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Current-value'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Current-value'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltop-txt_Current-value'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltop-txt_Current-value'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/summary-bar/tooltop-txt_Current-value'), 'The current value reflects your total options and shares, based on the company’s most recent valuation')

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Current-value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_Current-profit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_Current-profit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Current-profit'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Current-profit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_Current-profit'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_Current-profit'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_Current-profit'), 'Current profit represents the total profit you could make from selling your shares and exercised options today, including the cost to purchase.')

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Current-profit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/img_projected-value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_Projected-value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Projected-value'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Projected-value'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_Projected-value'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_Projected-value'))

WebUI.verifyElementText(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-txt_Projected-value'), 'Here\'s a sneak peek at what your overall equity allocation could be worth! The value you see is based on the figure you enter in the \'future value of the company\' bar below. Go ahead and explore the potential!')

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/tooltip-icon_Projected-value'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'))

WebUI.waitForElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_My-shares-breakdown'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/label_My-shares-breakdown'))

WebUI.click(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/my-equity-page/summary-bar/chevron_summary-bar'))

