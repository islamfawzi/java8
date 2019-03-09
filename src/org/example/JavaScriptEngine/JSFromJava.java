package org.example.JavaScriptEngine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSFromJava {

	public static void main(String[] args) {

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		
		String script = "var welcome = 'Hello'; "
				+ "welcome += ', Islam'; "
				+ "welcome;";
		
		
		try {
			String result = (String) engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was a Javascript error");
			e.printStackTrace();
		}
		
	}

}
