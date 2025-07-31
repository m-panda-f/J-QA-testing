import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Step 1: Open browser and go to login page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev-dash.janitri.in/')
WebUI.delay(2)

// Step 2: Check for Janitri logo
if (WebUI.verifyElementPresent(findTestObject('Janitri_Logo'), 3)) {
    println "✅ Janitri logo is visible on the login page"
} else {
    println "❌ Janitri logo is missing"
}

// Step 3: Close browser
WebUI.closeBrowser()
