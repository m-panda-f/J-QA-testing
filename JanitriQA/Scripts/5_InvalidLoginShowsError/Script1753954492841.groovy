import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

// Step 1: Open browser
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')
WebUI.delay(2)

// Step 2: Enter invalid credentials
WebUI.setText(findTestObject('Email_Input'), 'wronguser@example.com')
WebUI.setText(findTestObject('Password_Input'), 'wrongpassword')
WebUI.delay(1)

// Step 3: Click login
WebUI.click(findTestObject('Login_Button'))
WebUI.delay(2)

// Step 4: Capture invalid login error
TestObject errorObj = findTestObject('Error_Message_InvalidLogin')
String errorText = ''

if (WebUI.verifyElementPresent(errorObj, 3, FailureHandling.OPTIONAL)) {
    errorText = WebUI.getText(errorObj)
    println "❌ Invalid login — error message displayed: ${errorText}"
} else {
    println "⚠️ Login failed but no error message was displayed."
}

// Step 5: Close browser
WebUI.closeBrowser()
