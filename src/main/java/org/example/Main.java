package org.example;
import testforstack.FixedCapacityStack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<>(10);
        for (int i = 0; i < 8; i++) {
            stack.push(i);
        }
        stack.push(8);
        System.out.println("\nStack size: " + stack.size());
        int sizeOfStack = stack.size();
        for (int i = 0; i < sizeOfStack; i++) System.out.println(stack.pop());
    }
}