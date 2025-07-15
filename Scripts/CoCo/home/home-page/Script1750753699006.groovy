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

//'Login and navigate to the dashboard page'
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_editor, GlobalVariable.password)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_emi'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_view-emi'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_view-emi'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_uo'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_view-uo'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_view-uo'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_gs'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_view-gs'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_view-gs'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_CSOP'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_view-csop'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_view-csop'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_Cap table'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_view-cap-table'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_view-cap-table'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_share-movement-history'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_share-movement-history'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_issue-shares'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_issue-shares'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_stock-transfer'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_stock-transfer'))

//WebUI.verifyElementPresent(findTestObject('CoCo/home/a_start-buyback'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_start-buyback'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_manage-share-class'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_manage-share-class'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_Secretarial-admin'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Shareholders'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Shareholders'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Resolutions'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Resolutions'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_signed share certificate'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_signed share certificate'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Directors'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Directors'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_PSC'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_PSC'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/card-title_More tools and features'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Partners and Benefits'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Partners and Benefits'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Customise certificates'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Customise certificates'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Scenario modelling'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Scenario modelling'))

WebUI.verifyElementPresent(findTestObject('CoCo/home/a_Refer a friend'), 0)

WebUI.verifyElementClickable(findTestObject('CoCo/home/a_Refer a friend'))

WebUI.closeBrowser()

