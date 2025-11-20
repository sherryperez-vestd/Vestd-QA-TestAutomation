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

CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

WebUI.navigateToUrl(GlobalVariable.url_IN)

'Verify ESOP is present'
CustomKeywords.'UIKeywords.clickElement'('CoCo/navigation/side-nav/a_ShareSchemes')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('CoCo/navigation/side-nav/ShareSchemes/Page_ESOP/a_ESOP', 'ESOP')

CustomKeywords.'UIKeywords.clickElement'('CoCo/navigation/side-nav/ShareSchemes/Page_ESOP/a_ESOP')

CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('CoCo/navigation/side-nav/ShareSchemes/Page_ESOP/h1_ESOP', 'ESOP')

'Verify other schemes are present'
WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/EMI/a_EMI'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/UO/a_UO'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/GS/a_growthShares'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/CSOP/a_CSOP'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/RSA/a_RSAs'), 0)

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Phantom/a_Phantom'), 0)

'Verify Record off platform ST CTA is present'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/stock-transfer')
CustomKeywords.'UIKeywords.verifyElementPresentVisibleText'('ShareSquad/stockTransfer/Page_Stock transfers index/a_recordOff-platformST', 
    'Record a previous off-platform stock transfer')

'Verify Create new ST / Bulk ST CTAs are not present'
WebUI.verifyElementNotPresent(findTestObject('ShareSquad/stockTransfer/Page_Stock transfers index/a_Create a new transfer'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('ShareSquad/stockTransfer/Page_Stock transfers index/a_bulkST'), 0)

'Verify Growth shares table heading is not present'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/share-class')
WebUI.verifyElementNotPresent(findTestObject('ShareSquad/shareClass/th_Growth shares'), 0)

'Verify Growth shares / Deferred not present'
WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/share-class/create')
WebUI.verifyTextNotPresent('Growth Shares', false)
WebUI.verifyTextNotPresent('Deferred', false)

