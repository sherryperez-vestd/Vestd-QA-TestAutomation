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

WebUI.callTestCase(findTestCase('Platform/usersLogin/UK/user-login-editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://demo.app.vestd.com/company/50934/home')

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_MyEquity'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Home'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Home'), 'Home')

WebUI.click(findTestObject('CoCo/navigation/side-nav/a_Home'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Home/h1_company-name'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Home/h1_company-name'), 'Reid Ltd')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_ShareSchemes'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_ShareSchemes'), 'Share schemes')

WebUI.click(findTestObject('CoCo/navigation/side-nav/a_ShareSchemes'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/li_Schemes'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/li_Schemes'), 'SCHEMES')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_ESU/a_ESU'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_ESU/a_ESU'), 'Existing scheme uploads')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_ESU/a_ESU'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_ESU/h1_ESU'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_ESU/h1_ESU'), 'Existing scheme uploads')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_EMI/a_EMI'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_EMI/a_EMI'), 'EMI')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_EMI/a_EMI'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_EMI/h1_EMI'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_EMI/h1_EMI'), 'EMI')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_UO/a_UO'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_UO/a_UO'), 
    'Unapproved options')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_UO/a_UO'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_UO/h1_UO'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_UO/h1_UO'), 
    'Unapproved options')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_CSOP/a_CSOP'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_CSOP/a_CSOP'), 'CSOP')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_CSOP/a_CSOP'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_CSOP/h1_CSOP'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_CSOP/h1_CSOP'), 'CSOP')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Phantom/a_Phantom'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Phantom/a_Phantom'), 'Phantom shares')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Phantom/a_Phantom'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Phantom/h1_Phantom'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Phantom/h1_Phantom'), 'Phantom')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_All-options-agreements/a_allOptionAgreements'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_All-options-agreements/a_allOptionAgreements'), 
    'All option agreements')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_All-options-agreements/a_allOptionAgreements'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_All-options-agreements/h1_allOptionAgreements'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_All-options-agreements/h1_allOptionAgreements'), 
    'All option agreements')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_GS/a_growthShares'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_GS/a_growthShares'), 'Growth shares')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_GS/a_growthShares'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_GS/h1_growthShares'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_GS/h1_growthShares'), 'Growth shares')

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_RSA/a_RSAs'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Agile partnerships/a_Agile Partnership'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Agile partnerships/a_Agile Partnership'), 
    'Agile Partnership')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Agile partnerships/a_Agile Partnership'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Agile partnerships/h1_Agile Partnerships'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Agile partnerships/h1_Agile Partnerships'), 
    'Agile Partnerships')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/li_Compliance'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/li_Compliance'), 'COMPLIANCE')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Valuations/a_Valuations'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Valuations/a_Valuations'), 'Valuations')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Valuations/a_Valuations'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Valuations/h1_Valuations'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Valuations/h1_Valuations'), 'Valuations')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Share-pools/a_Share pools'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Share-pools/a_Share pools'), 'Share pools')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Share-pools/a_Share pools'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Share-pools/h1_Authorisations'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Share-pools/h1_Authorisations'), 'Authorisations')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Annual HMRC notifications/a_Annual notifications'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Annual HMRC notifications/a_Annual notifications'), 
    'Annual notifications')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Annual HMRC notifications/a_Annual notifications'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Annual HMRC notifications/h1_Annual notifications'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Annual HMRC notifications/h1_Annual notifications'), 
    'Annual notifications')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Initial-Notification/a_Initial notifications'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Initial-Notification/a_Initial notifications'), 
    'Initial notifications')

WebUI.click(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Initial-Notification/a_Initial notifications'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Initial-Notification/h1_EMI initial notifications to HMRC'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/ShareSchemes/Page_Initial-Notification/h1_EMI initial notifications to HMRC'), 
    'EMI initial notifications to HMRC')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Investment'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Investment'), 'Investment')

WebUI.click(findTestObject('CoCo/navigation/side-nav/a_Investment'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/li_investment rounds'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/li_investment rounds'), 'INVESTMENT ROUNDS')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_Investment-hub/a_Investment hub'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_Investment-hub/a_Investment hub'), 'Investment hub')

WebUI.click(findTestObject('CoCo/navigation/side-nav/Investment/Page_Investment-hub/a_Investment hub'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_Investment-hub/h1_InvestmentI_InVestdRaise'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_Investment-hub/h1_InvestmentI_InVestdRaise'), 
    'Investment - InVestd Raise')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_Guided-Flow/a_Guided flow'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_Guided-Flow/a_Guided flow'), 'Guided flow')

WebUI.click(findTestObject('CoCo/navigation/side-nav/Investment/Page_Guided-Flow/a_Guided flow'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_Guided-Flow/h1_Investment via InVestd - Invested Raise'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_Guided-Flow/h1_Investment via InVestd - Invested Raise'), 
    'Investment via InVestd Raise')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/li_Related tools'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/li_Related tools'), 'RELATED TOOLS')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_All-share-issues/a_All share issues'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_All-share-issues/a_All share issues'), 'All share issues')

WebUI.click(findTestObject('CoCo/navigation/side-nav/Investment/Page_All-share-issues/a_All share issues'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_All-share-issues/h1_Share movement history'), 
    0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_All-share-issues/h1_Share movement history'), 
    'Share movement history')

WebUI.click(findTestObject('CoCo/navigation/side-nav/a_Investment'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_SEIS-EIS/a_SEIS  EIS'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_SEIS-EIS/a_SEIS  EIS'), 'SEIS & EIS')

WebUI.click(findTestObject('CoCo/navigation/side-nav/Investment/Page_SEIS-EIS/a_SEIS  EIS'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_SEIS-EIS/h1_SEISEIS'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_SEIS-EIS/h1_SEISEIS'), 'SEIS/EIS')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_Share authorisations/a_Share authorisations'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_Share authorisations/a_Share authorisations'), 
    'Share authorisations')

not_run: WebUI.click(findTestObject('CoCo/navigation/side-nav/Investment/Page_Share authorisations/a_Share authorisations'))

not_run: WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/Investment/Page_Share authorisations/h1_Authorisations'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/Investment/Page_Share authorisations/h1_Authorisations'), 
    'Authorisations')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_ShareCapital'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_ShareCapital'), 'Share capital')

WebUI.click(findTestObject('CoCo/navigation/side-nav/a_ShareCapital'))

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_Compliance'), 'Secretarial & admin')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_PeopleCommunication'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_PeopleCommunication'), 'People & communication')

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_Company-staff'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_HelpCentre'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_HelpCentre'), 'Help centre')

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/side-nav/a_companySettings'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/side-nav/a_companySettings'), 'Company settings')

WebUI.verifyElementNotPresent(findTestObject('CoCo/navigation/side-nav/a_App-staff'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/img-ISO'), 0)

WebUI.verifyElementPresent(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'), 0)

WebUI.verifyElementText(findTestObject('CoCo/navigation/p_Vestd_Ltd_authorised_and_regulated_by'), 'Vestd Ltd is authorised and regulated by the Financial Conduct Authority (685992).')

WebUI.closeBrowser()

