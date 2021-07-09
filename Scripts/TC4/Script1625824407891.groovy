import com.kazurayam.ks.globalvariable.ExecutionProfilesLoader
import com.kazurayam.ks.globalvariable.ExpandoGlobalVariable as EGV
import com.kms.katalon.core.configuration.RunConfiguration

String appliedProfile = RunConfiguration.getExecutionProfile()
println "Execution Profile applied                       : " + appliedProfile

println "GlobalVariable.ADDED is present before loading? : " + EGV.isGlobalVariablePresent("ADDED")
ExecutionProfilesLoader.loadEntries(["ADDED": "Hello, world!"])
println "GlobalVariable.ADDED is present after loading?  : " + EGV.isGlobalVariablePresent("ADDED")
println "GlobalVariable.ADDED value                      : " + EGV.getGlobalVariableValue("ADDED")

EGV.clear()
println "GlobalVariable.ADDED is present after clear?    : " + EGV.isGlobalVariablePresent("ADDED")
println "GlobalVariable.ADDED value after clear          : " + EGV.getGlobalVariableValue("ADDED")

