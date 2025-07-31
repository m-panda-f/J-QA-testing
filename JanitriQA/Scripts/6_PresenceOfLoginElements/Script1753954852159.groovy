import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Step 1: Open browser and go to login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')
WebUI.delay(2)

// Step 2: Verify presence of Email field
if (WebUI.verifyElementPresent(findTestObject('Email_Input'), 2)) {
    println "✅ Email input field is present"
} else {
    println "❌ Email input field is missing"
}

// Step 3: Verify presence of Password field
if (WebUI.verifyElementPresent(findTestObject('Password_Input'), 2)) {
    println "✅ Password input field is present"
} else {
    println "❌ Password input field is missing"
}

// Step 4: Verify presence of Login button
if (WebUI.verifyElementPresent(findTestObject('Login_Button'), 2)) {
    println "✅ Login button is present"
} else {
    println "❌ Login button is missing"
}

// Step 5: Verify presence of Eye icon
if (WebUI.verifyElementPresent(findTestObject('Eye_Icon'), 2)) {
    println "✅ Eye icon is present"
} else {
    println "❌ Eye icon is missing"
}

// Step 6: Close browser
WebUI.closeBrowser()
