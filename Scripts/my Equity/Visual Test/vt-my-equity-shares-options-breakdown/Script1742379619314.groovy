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

'Check vesting schedule'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50135/dashboard?user_id=365431')

WebUI.click(findTestObject('my-equity-page/shares-options-breakdown/chevron_summary-bar'))

WebUI.takeElementScreenshotAsCheckpoint('My shares breakdown', findTestObject('my-equity-page/shares-options-breakdown/shares-breakdown/tile_my-shares-breakdown-section'))

WebUI.takeElementScreenshotAsCheckpoint('My options breakdown', findTestObject('my-equity-page/shares-options-breakdown/options-breakdown/tile_My-options-breakdown-section'))

WebUI.click(findTestObject('my-equity-page/shares-options-breakdown/button_View transaction'))

WebUI.takeFullPageScreenshotAsCheckpoint('Transaction History')

not_run: WebUI.click(findTestObject('my-equity-page/shares-options-breakdown/button_Close'))

WebUI.closeBrowser()

