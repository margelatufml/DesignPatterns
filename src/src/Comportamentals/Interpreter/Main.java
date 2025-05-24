package Comportamentals.Interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Assign values to variables
        context.assign("x", 10);
        context.assign("y", 5);
        context.assign("z", 2);

        // Expression 1: x + y  (10 + 5)
        Expression xVar = new VariableExpression("x");
        Expression yVar = new VariableExpression("y");
        Expression expr1 = new AddExpression(xVar, yVar);
        System.out.println("x = 10, y = 5");
        System.out.println("x + y = " + expr1.interpret(context)); // Output: x + y = 15

        // Expression 2: (x + y) + 7  ((10 + 5) + 7)
        Expression seven = new NumberExpression(7);
        Expression expr2 = new AddExpression(expr1, seven);
        System.out.println("(x + y) + 7 = " + expr2.interpret(context)); // Output: (x + y) + 7 = 22

        // Expression 3: z + (x + 3)  (2 + (10 + 3))
        Expression zVar = new VariableExpression("z");
        Expression three = new NumberExpression(3);
        Expression xPlusThree = new AddExpression(xVar, three);
        Expression expr3 = new AddExpression(zVar, xPlusThree);
        System.out.println("z = 2, x = 10");
        System.out.println("z + (x + 3) = " + expr3.interpret(context)); // Output: z + (x + 3) = 15

        // Example of using an unassigned variable (will throw an exception)
        System.out.println("\nAttempting to use unassigned variable 'a':");
        Expression aVar = new VariableExpression("a");
        Expression expr4 = new AddExpression(aVar, new NumberExpression(1));
        try {
            System.out.println("a + 1 = " + expr4.interpret(context));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 