package myPhone;

import java.util.Scanner;

public class Calculator  {
    private int a;
    private int b;
    Calculator(){}

    public Calculator( int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "myPhone.Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public  static void getCol(int a, int b) {
Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("write number: ");
            a = sc.nextInt();
            System.out.print("write number: ");
            b = sc.nextInt();
            System.out.println("1.Кошу\n" +
                    "2.Кемиту\n" +
                    "3.Болу\n" +
                    "4.Кобойту\n" +
                    "0.чыгу\n"+
                    "5.Menu");
            System.out.println("функция тамданыз");
            int x = new Scanner(System.in).nextInt();
            switch (x) {
                case 1:
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case 2:
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;
                case 3:
                    System.out.println(a + "/" + b + "=" + (a / b));
                    break;
                case 4:
                    System.out.println(a + "*" + b + "=" + (a * b));
                    break;
                case 5:
                    Phone.methodMenu();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("мындай функция жок");


            }
        }
    }
}


//1.Кошу
//2.Кемиту
//3.Болу
//4.Кобойту
//0.чыгу

