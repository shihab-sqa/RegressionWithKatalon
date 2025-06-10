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

public class HotelSearch {


	@Keyword
	def Search() {

		WebUI.click(findTestObject('HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/acceptCookie'))

		WebUI.setText(findTestObject('Object Repository/HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/input_Where do you wanna go'),
				Destination)

		WebUI.waitForElementPresent(findTestObject('HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/Search'),
				0)

		//WebUI.waitForElementClickable(findTestObject('HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/Search'),
		// 3)
		WebUI.click(findTestObject('Object Repository/HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/Search'))

		WebUI.click(findTestObject('Object Repository/HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/p_1 Night'))

		WebUI.click(findTestObject('Object Repository/HotelSearch/Page_Adventure Hotels  Vacation Rentals at _68e8f5/searchButton'))
	}
}
