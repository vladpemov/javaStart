package sk.com.ymca.javastart.lecture1.homework.task2;

public class Circle {
    /*
    Теорія.
- Почитати про константи в  Java.

Практика.
Створіть клас Circle.
Створіть константу під назвою PI (число π «пі»), створіть змінну радіус з назвою – r. Використовуючи
формулу πR2, обчисліть площу кола та виведіть результат на екран\
*/
    public static void main(String[] args) {

        final double PI = Math.PI;
        int r = 25;

        System.out.println(PI * r * 2); // the formula is wrong
    }
}
