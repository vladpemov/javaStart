package sk.com.ymca.javastart.lecture1.homework.task3;
/*
Створіть клас Volume.
Напишіть програму розрахунку об'єму - V та площі поверхні -S циліндра.
Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h
Площа поверхні циліндра обчислюється за формулою: S = 2πR2
 + 2πR2
 = 2πR(R+h)
Результати розрахунків виведіть на екран.
 */
public class Volume {
    public static void main(String[] args) {

     //!!! the formulas are wrong!!!

        final double PI = Math.PI;
        double r = 10.0;
        double h = 12.5;

        double V = (PI * r * 2 * h);

        double S = (2 * PI * r * (r * h));

        System.out.println(V);

        System.out.println(S);




    }
}
