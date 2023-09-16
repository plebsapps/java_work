package ch.plebsapps.lambda;


//Lernziel Parket java.util.function

import java.util.function.IntBinaryOperator;

public class JavaFunctionalOptional {

    public static void main(String[] args) {


    }
}

//TODO Lernen FunctionalInterface Video 98


// Diesen könnte man durch einen Standard Interface IntBinaryOperator ersetzen zu finden in
// java.util.function.IntBinaryOperator;
@FunctionalInterface
interface BinaryOperation {
    int operation(int val1, int val2);
}

