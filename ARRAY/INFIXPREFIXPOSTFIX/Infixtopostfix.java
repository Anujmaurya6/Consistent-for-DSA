package ARRAY.INFIXPREFIXPOSTFIX;

import java.util.*;
public class Infixtopostfix {
    //operator precedence ko check karne ka function
    
       static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        else if (op == '^') return 3;
        return -1;
    }

    static String infixToPostfix(String exp) {
        String result = "";                  // normal String use kiya
        Stack<Character> stack = new Stack<>();

        for (char c : exp.toCharArray()) {   // toCharArray() use kiya
            if (Character.isLetterOrDigit(c)) {
                result += c;                 // append directly
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String infix = "((A+B)*(C-D))";
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + infixToPostfix(infix));
    }
}


