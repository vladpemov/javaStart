package sk.com.ymca.javastart.lecture1.classwork;

public class Test {
    public static void main(String[] args) {
        short a = 10;
        int b = 10;
        System.out.println(++a);//Pre-increment//
        System.out.println(b++);
        System.out.println(b);

        byte c = 2;
        long d = 3;
        System.out.println(--c);//Pre-dercement//
        System.out.println(d--);
        System.out.println(d );

        short i = 9;

        i += 1;

        i += (short) (i + 1);

        System.out.println(i);


        


    }
}
