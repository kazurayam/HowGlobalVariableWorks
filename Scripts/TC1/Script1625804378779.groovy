import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

if (GlobalVariable.URL == null) {
	KeywordUtil.markFailedAndStop("GlobalVariable.URL is null")
	
} else if (GlobalVariable.URL == "") {
	KeywordUtil.markFailedAndStop("GlobalVariable.URL is \"\"")
}

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.closeBrowser()

