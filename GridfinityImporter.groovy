// code here

// https://github.com/kennetek/gridfinity-rebuilt-openscad.git
// gridfinity-rebuilt-bins.scad

import com.neuronrobotics.bowlerstudio.scripting.ScriptingEngine

HashMap<String,Double> params=new HashMap<String, Double>();


return ScriptingEngine.gitScriptRun(
	"https://github.com/kennetek/gridfinity-rebuilt-openscad.git",
	"gridfinity-rebuilt-bins.scad")