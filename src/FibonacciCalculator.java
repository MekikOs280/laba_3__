public class FibonacciCalculator {
    // Завдання 2: Обчислення числа Фібоначчі за допомогою циклу
    public int cycleExecute(int N) {
        if (N <= 1) {
            return N;
        }
        int prev = 0, current = 1;
        for (int i = 2; i <= N; i++) {
            int temp = current;
            current += prev;
            prev = temp;
        }
        return current;
    }

    // Завдання 2: Обчислення числа Фібоначчі за допомогою рекурсії
    public int recursionExecute(int N) {
        if (N <= 1) {
            return N;
        }
        return recursionExecute(N - 1) + recursionExecute(N - 2);
    }
}
