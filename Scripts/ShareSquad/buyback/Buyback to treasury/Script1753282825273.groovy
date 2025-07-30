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

WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-staff'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/share-buyback/create')

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/input_confirm-company-has-sufficient-profits'))

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/button_Continue'))

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/input_Buyback-to-treasury'))

WebUI.click(findTestObject('ShareSquad/buyback/buyback-create/button_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/select_Please select a share class'), 
    '172183', true)

WebUI.click(findTestObject('ShareSquad/buyback/buyback-create/button_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/select_Please select Shareholder'), 
    '692094', true)

WebUI.click(findTestObject('ShareSquad/buyback/buyback-create/button_Continue'))

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/input_Number of shares_num_shares'), '10')

WebUI.setText(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/input_Total_total_price_paid'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/ShareSquad/buyback/buyback-create/select_InvestmentRound'), 
    '128377', true)

WebUI.click(findTestObject('ShareSquad/buyback/buyback-create/button_Continue'))

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/button_Start buyback'))

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/button_Yes, continue'))

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(10)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('ShareSquad/buyback/buyback-details/a_Confirm transaction date'), 0)

WebUI.scrollToElement(findTestObject('ShareSquad/buyback/buyback-details/a_Confirm transaction date'), 0)

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/a_Confirm transaction date'))

WebUI.waitForElementPresent(findTestObject('ShareSquad/buyback/buyback-confirm transaction/confirm-trasction-date-submit-btn'), 
    0)

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-confirm transaction/confirm-trasction-date-submit-btn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/div_Buyback completed'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/div_Buyback completed'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/div_Buyback completed'), 'Buyback completed')

WebUI.verifyElementPresent(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/span_Complete'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/span_Complete'), 'Complete')

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/button_Reverse'))

WebUI.click(findTestObject('Object Repository/ShareSquad/buyback/buyback-details/button_Yes, reverse buyback'))

WebUI.closeBrowser()

