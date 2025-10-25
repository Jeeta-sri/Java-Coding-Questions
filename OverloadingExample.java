class Calculator {
    // Method overloading: same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 3));        // calls int add(int,int)
        System.out.println(calc.add(2.5, 3.7));    // calls double add(double,double)
        System.out.println(calc.add(1, 2, 3));     // calls int add(int,int,int)
    }
}

//Explanation

//All methods are named add(), but differ in parameter type or number.

//The compiler decides which method to call at compile time, hence compile-time polymorphism
    

