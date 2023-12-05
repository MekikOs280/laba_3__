public class Main {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        int N = 5;  // Задайте значення N

        // Виклик методів обчислення факторіалу за допомогою циклу та рекурсії
        int factorialResultCycle = factorialCalculator.cycleExecute(N);
        int factorialResultRecursion = factorialCalculator.recursionExecute(N);

        // Перевірка рівності результатів обчислення факторіалу
        assert factorialResultCycle == factorialResultRecursion : "Different values";

        // Вивід результатів обчислення факторіалу
        System.out.println("Factorial of " + N + ": " + factorialResultCycle);

        // Виклик методів обчислення числа Фібоначчі за допомогою циклу та рекурсії
        int fibonacciResultCycle = fibonacciCalculator.cycleExecute(N);
        int fibonacciResultRecursion = fibonacciCalculator.recursionExecute(N);

        // Перевірка рівності результатів обчислення числа Фібоначчі
        assert fibonacciResultCycle == fibonacciResultRecursion : "Different values";

        // Вивід результатів обчислення числа Фібоначчі
        System.out.println("Fibonacci number at position " + N + ": " + fibonacciResultCycle);

        // Завдання 3 та 4: Обчислення суми цифр числа та рекурсивного додавання
        DigitSumCalculator digitSumCalculator = new DigitSumCalculator();
        RecursiveAddition recursiveAddition = new RecursiveAddition();

        int number = 1234;  // Задайте число для обчислення суми цифр та рекурсивного додавання

        // Виклик методів для обчислення суми цифр та рекурсивного додавання
        int digitSumResult = digitSumCalculator.execute(number);
        int recursiveAdditionResult = recursiveAddition.execute(3, 4);

        // Вивід результатів обчислення суми цифр та рекурсивного додавання
        System.out.println("Sum of digits in " + number + ": " + digitSumResult);
        System.out.println("Recursive addition of 3 and 4: " + recursiveAdditionResult);
    }
}