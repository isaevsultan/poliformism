package myPhone;
import java.util.Scanner;
public class Phone {
   public  static void methodMenu() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("1.Калькулотор\n" + "2.Мбанк\n" + "3.Заметки\n4.чыгу");
            int num = new Scanner(System.in).nextInt();
            if (num == 1) {
                System.out.println("Calcuator");
             Calculator calculator = new Calculator();
                Calculator.getCol(calculator.getA(), calculator.getB());
            } else if (num == 2) {
                Bank bank = new Bank(0.0);
                bank.getMenu();
            } else if (num == 3) {
                Note note = new Note();
                note.getNote();
            } else if (num == 4) {
                System.exit(0);
            }

        }
    }
}


