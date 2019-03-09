package org.example.JavaScriptEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSFromFile {

	public static void main(String[] args) {

		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");

		try {

			File f = new File("scripts/readurl.js");
			Reader reader = new FileReader(f);

			String result = (String) engine.eval(reader);
			System.out.println(result);
		} catch (ScriptException | FileNotFoundException e) {
			System.out.println("There was a Javascript error");
			e.printStackTrace();
		}
	}

}
