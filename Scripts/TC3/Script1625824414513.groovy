import com.kazurayam.ks.globalvariable.ExecutionProfilesLoader
import com.kazurayam.ks.globalvariable.ExpandoGlobalVariable as EGV
import com.kms.katalon.core.configuration.RunConfiguration

String appliedProfile = RunConfiguration.getExecutionProfile()
println "Execution Profile applied                       : " + appliedProfile

println "GlobalVariable.URL is present before loading?   : " + EGV.isGlobalVariablePresent("URL")
println "GlobalVariable.URL value before loading         : " + EGV.getGlobalVariableValue("URL")

CustomKeywords."com.kazurayam.ks.globalvariable.ExecutionProfilesLoader.loadProfile"("ProductEnv")
println "GlobalVariable.URL is present after loading Product?    : " + EGV.isGlobalVariablePresent("URL")
println "GlobalVariable.URL value after loading Product          : " + EGV.getGlobalVariableValue("URL")

new ExecutionProfilesLoader().loadProfiles("ProductEnv", "DevelopEnv")
println "GlobalVariable.URL is present after loading Develop?    : " + EGV.isGlobalVariablePresent("URL")
println "GlobalVariable.URL value after loading Develop          : " + EGV.getGlobalVariableValue("URL")

println "GlobalVariable.PARAM_PRODUCT is present?        : " + EGV.isGlobalVariablePresent("PARAM_PRODUCT")
println "GlobalVariable.PARAM_PRODUCT                    : " + EGV.getGlobalVariableValue("PARAM_PRODUCT")
println "GlobalVariable.PARAM_DEVELOP is present?        : " + EGV.isGlobalVariablePresent("PARAM_DEVELOP")
println "GlobalVariable.PARAM_DEVELOP                    : " + EGV.getGlobalVariableValue("PARAM_DEVELOP")

new ExecutionProfilesLoader().clear()
println "GlobalVariable.URL is present after clear?      : " + EGV.isGlobalVariablePresent("URL")
println "GlobalVariable.URL value after clear            : " + EGV.getGlobalVariableValue("URL")
