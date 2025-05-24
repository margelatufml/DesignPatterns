package Comportamentals.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> variableValues = new HashMap<>();

    public void assign(String variableName, int value) {
        variableValues.put(variableName, value);
    }

    public int getValue(String variableName) {
        if (variableValues.containsKey(variableName)) {
            return variableValues.get(variableName);
        } else {
            throw new IllegalArgumentException("Variable not found: " + variableName);
        }
    }
} 