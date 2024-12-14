package tech.sujith.features.java08;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn_Demo {
	public static void main(String[] args) {
		// Create script engine manager
        ScriptEngineManager manager = new ScriptEngineManager();
        
        // Get Nashorn JavaScript engine
        ScriptEngine engine = manager.getEngineByName("nashorn");
        
        try {
            // Execute JavaScript code
            engine.eval("var message = 'Hello, Nashorn!';");
            engine.eval("print(message);"); // Print message to console
        } catch (ScriptException e) {
            System.out.println("An error occurred while executing JavaScript code: " + e.getMessage());
        }
	}
}
