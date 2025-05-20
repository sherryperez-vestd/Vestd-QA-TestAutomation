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

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50915/home')

//WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_My equity'), 0)
//WebUI.verifyElementText(findTestObject('navigation/side-nav/a_My equity'), 'My equity')
WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Home'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Home'), 'Home')

WebUI.click(findTestObject('navigation/side-nav/a_Home'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Page_Home/h1_company-name'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Page_Home/h1_company-name'), 'Indian Co')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Share schemes'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Share schemes'), 'Share schemes')

WebUI.click(findTestObject('navigation/side-nav/a_Share schemes'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/li_Schemes'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/li_Schemes'), 'SCHEMES')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_ESOP/a_ESOP'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_ESOP/a_ESOP'), 'ESOP')

WebUI.click(findTestObject('navigation/side-nav/Share schemes/Page_ESOP/a_ESOP'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_ESOP/h1_ESOP'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_ESOP/h1_ESOP'), 'ESOP')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_All-options-agreements/a_All option agreements'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_All-options-agreements/a_All option agreements'), 
    'All option agreements')

WebUI.click(findTestObject('navigation/side-nav/Share schemes/Page_All-options-agreements/a_All option agreements'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_All-options-agreements/h1_All option agreements'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_All-options-agreements/h1_All option agreements'), 
    'All option agreements')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/li_Compliance'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/li_Compliance'), 'COMPLIANCE')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_Valuations/a_Valuations'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_Valuations/a_Valuations'), 'Valuations')

WebUI.click(findTestObject('navigation/side-nav/Share schemes/Page_Valuations/a_Valuations'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_Valuations/h1_Valuations'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_Valuations/h1_Valuations'), 'Valuations')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_Share-pools/a_Share pools'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_Share-pools/a_Share pools'), 'Share pools')

WebUI.click(findTestObject('navigation/side-nav/Share schemes/Page_Share-pools/a_Share pools'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_Buyback options/h1_Buyback-options'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Share schemes/Page_Buyback options/h1_Buyback-options'), 'Buyback options')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Share schemes/Page_Buyback options/h1_Buyback-options'), 
    0)

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Investment'), 'Investment')

WebUI.click(findTestObject('navigation/side-nav/a_Investment'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/li_investment rounds'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/li_investment rounds'), 'INVESTMENT ROUNDS')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_Investment-hub/a_Investment hub'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_Investment-hub/a_Investment hub'), 'Investment hub')

WebUI.click(findTestObject('navigation/side-nav/Investment/Page_Investment-hub/a_Investment hub'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_Investment-hub/h1_Investment - InVestd Raise'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_Investment-hub/h1_Investment - InVestd Raise'), 
    'Investment - InVestd Raise')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_Guided-Flow/a_Guided flow'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_Guided-Flow/a_Guided flow'), 'Guided flow')

WebUI.click(findTestObject('navigation/side-nav/Investment/Page_Guided-Flow/a_Guided flow'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/li_Related tools'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/li_Related tools'), 'RELATED TOOLS')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_All-share-issues/a_All share issues'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_All-share-issues/a_All share issues'), 'All share issues')

WebUI.click(findTestObject('navigation/side-nav/Investment/Page_All-share-issues/a_All share issues'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_All-share-issues/h1_Share movement history'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_All-share-issues/h1_Share movement history'), 
    'Share movement history')

WebUI.click(findTestObject('navigation/side-nav/a_Investment'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_SEIS-EIS/a_SEIS  EIS'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_SEIS-EIS/a_SEIS  EIS'), 'SEIS & EIS')

WebUI.click(findTestObject('navigation/side-nav/Investment/Page_SEIS-EIS/a_SEIS  EIS'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_SEIS-EIS/h1_SEISEIS'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_SEIS-EIS/h1_SEISEIS'), 'SEIS/EIS')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_Share authorisations/a_Share authorisations'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_Share authorisations/a_Share authorisations'), 
    'Share authorisations')

not_run: WebUI.click(findTestObject('navigation/side-nav/Investment/Page_Share authorisations/a_Share authorisations'))

not_run: WebUI.verifyElementPresent(findTestObject('navigation/side-nav/Investment/Page_Share authorisations/h1_Authorisations'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('navigation/side-nav/Investment/Page_Share authorisations/h1_Authorisations'), 
    'Authorisations')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Share capital'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Share capital'), 'Share capital')

WebUI.click(findTestObject('navigation/side-nav/a_Share capital'))

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Secretarial  admin'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Secretarial  admin'), 'Secretarial & admin')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_People  communication'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_People  communication'), 'People & communication')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Company - staff'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Company - staff'), 'Company - staff')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Help Centre'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Help Centre'), 'Help Centre')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_Company settings'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_Company settings'), 'Company settings')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/a_App - staff'), 0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/a_App - staff'), 'App - staff')

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/img'), 0)

WebUI.verifyElementPresent(findTestObject('navigation/side-nav/p_Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992)'), 
    0)

WebUI.verifyElementText(findTestObject('navigation/side-nav/p_Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992)'), 
    'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()

