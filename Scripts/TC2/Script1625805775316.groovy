import com.kazurayam.ks.globalvariable.ExecutionProfilesLoader
import com.kazurayam.ks.globalvariable.ExpandoGlobalVariable as EGV

import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

String appliedProfile = RunConfiguration.getExecutionProfile()
println "Execution Profile applied                       : " + appliedProfile

println "GlobalVariable.BASE_PARAM is present?           : " + EGV.isGlobalVariablePresent("BASE_PARAM")
println "GlobalVariable.BASE_PARAM value                 : " + EGV.getGlobalVariableValue("BASE_PARAM")

println "GlobalVariable.URL is present?                  : " + EGV.isGlobalVariablePresent("URL")
println "GlobalVariable.URL value                        : " + EGV.getGlobalVariableValue("URL")

println "GlobalVariable.PARAM_PRODUCT is present?        : " + EGV.isGlobalVariablePresent("PARAM_PRODUCT")
println "GlobalVariable.PARAM_PRODUCT value              : " + EGV.getGlobalVariableValue("PARAM_PRODUCT")

println "GlobalVariable.PARAM_DEVELOP is present?        : " + EGV.isGlobalVariablePresent("PARAM_DEVELOP")
println "GlobalVariable.PARAM_DEVELOP value              : " + EGV.getGlobalVariableValue("PARAM_DEVELOP")

