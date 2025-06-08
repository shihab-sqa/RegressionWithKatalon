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

import internal.GlobalVariable

public class UserLogin {

	@Keyword
	def loginWithEmailAndPassword(String email,String password) {


		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure Hotels  Vacation Rentals at _68e8f5/svg_USD  ENG_text-iconWhiteLight'))

		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure Hotels  Vacation Rentals at _68e8f5/span_LOGINSIGN UP'))

		WebUI.setText(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/input_Enter your Email IDMobile Number_emai_a52cda'),
				email)

		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/span_Sign In'))

		WebUI.setEncryptedText(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/input_Password_ant-input py-2 leading-22px _de26d2'),
				password)

		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/span_Sign In'))
	}



	@Keyword
	def loginWithUnregisteredEmail(String email) {


		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure Hotels  Vacation Rentals at _68e8f5/svg_USD  ENG_text-iconWhiteLight'))

		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure Hotels  Vacation Rentals at _68e8f5/span_LOGINSIGN UP'))

		WebUI.setText(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/input_Enter your Email IDMobile Number_emai_a52cda'),
				email)
		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/span_Sign In'))
	}


	@Keyword
	def loginWithInvalidEmail(String email) {


		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure Hotels  Vacation Rentals at _68e8f5/svg_USD  ENG_text-iconWhiteLight'))

		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure Hotels  Vacation Rentals at _68e8f5/span_LOGINSIGN UP'))

		WebUI.setText(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/input_Enter your Email IDMobile Number_emai_a52cda'),
				email)
		WebUI.click(findTestObject('Object Repository/TC001_UserLoginWithCorrectPassword/Page_Adventure/span_Sign In'))
	}
}
