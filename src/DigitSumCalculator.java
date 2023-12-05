public class DigitSumCalculator {
    // Завдання 3: Обчислення суми цифр числа за допомогою рекурсії
    public int execute(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + execute(number / 10);
    }
}
