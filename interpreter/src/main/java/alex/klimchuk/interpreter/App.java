package alex.klimchuk.interpreter;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        Expression john = new TerminalExpression("John");
        Expression married = new TerminalExpression("married");
        Expression marriedToJohn = new AndExpression(john, married);
        Expression anyOfThemMarried = new AndExpression(john, married);

        System.out.println("John is married? " + marriedToJohn.interpret("John is married"));
        System.out.println("Jane is married? " + marriedToJohn.interpret("Jane is married"));
        System.out.println("Any of them is married? " + anyOfThemMarried.interpret("Jane or John is married"));
    }
}
