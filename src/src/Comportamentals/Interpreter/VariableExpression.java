package Comportamentals.Interpreter;

// TerminalExpression for variables
public class VariableExpression implements Expression {
    private String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(variableName);
    }

    public String getVariableName() {
        return variableName;
    }
} 