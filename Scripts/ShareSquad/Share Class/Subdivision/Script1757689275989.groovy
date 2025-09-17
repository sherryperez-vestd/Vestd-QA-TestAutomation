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

// Login
CustomKeywords.'UIKeywords.loginToApp'(GlobalVariable.username_staff, GlobalVariable.password)

WebUI.navigateToUrl(shareClassPageURL)

// Verify static elements
['a_Start subdivision', 'btn_Consider nominal values', 'btn_Staff actions', 'canvas_share class chart','th_Status', 'th_Name', 'th_Total shares', 'th_Voting rights' , 'th_Growth shares' , 'th_Nominal value', 'span_Live','th_Total'].each({ 
        CustomKeywords.'UIKeywords.verifyElementPresentVisible'("Object Repository/ShareSquad/shareClass/$it")
    })

CustomKeywords.'UIKeywords.clickElement'('Object Repository/ShareSquad/shareClass/a_Start subdivision')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/ShareSquad/shareClass/btn_SaveAndexit')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/ShareSquad/shareClass/a_Continue subdivision')

WebUI.verifyTextPresent('Pick up where you left off. Or if you\'ve changed your mind,', false)

CustomKeywords.'UIKeywords.clickElement'('Object Repository/ShareSquad/shareClass/a_cancel the subdivision')

CustomKeywords.'UIKeywords.clickElement'('Object Repository/ShareSquad/shareClass/btn_Yes, cancel subdivision')

CustomKeywords.'UIKeywords.verifyElementPresentVisible'('Object Repository/ShareSquad/shareClass/a_Start subdivision')

WebUI.closeBrowser()

