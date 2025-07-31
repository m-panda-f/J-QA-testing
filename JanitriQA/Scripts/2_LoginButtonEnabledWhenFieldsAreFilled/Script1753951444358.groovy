import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Step 1: Open browser and go to Janitri login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')

// Step 2: Enter email and password
WebUI.setText(findTestObject('Email_Input'), 'test@janitri.in')  // Replace with any dummy
WebUI.setText(findTestObject('Password_Input'), 'test123')

// Step 3: Verify Login button becomes clickable
boolean isClickable = WebUI.verifyElementClickable(findTestObject('Login_Button'))

// Step 4: Print result
if (isClickable) {
    println "✅ Login button is enabled when both fields are filled."
} else {
    println "❌ Login button is NOT enabled when fields are filled."
}

// Optional: Close browser
WebUI.closeBrowser()
