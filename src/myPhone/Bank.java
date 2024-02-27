package myPhone;

import java.util.Scanner;

public class Bank {

    /**
     * myPhone.Account деген класс тузунуз ,анын сөзсүз double
     * balance деген полясы болот жана сиз  каалагандай
     * поле кошсонуз болот
     * checkBalance -  балансты текшеруу,
     * deposit() - баланска акча кошот ,
     * withdrawal() - баланстан акча алат
     * transaction() - бир account тан экинчи account ка акча
     * которуу методору болсун.
     * main методдон  2-3 account тузуп ар кандай
     * операцияларды жасаныз.
     **/
    private double balance;


    public Bank(double initialBalance) {
        balance = initialBalance;
    }


    public double checkBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void getMenu() {
        System.out.print("парольду жаз: ");
        int x = new Scanner(System.in).nextInt();

        if (x == 12345) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("функция тамда:\n");
                System.out.println("1.баласты текшеру");
                System.out.println("2.акча чыгару ");
                System.out.println("3. акча салу");
                System.out.println("4. Меню");
                System.out.println("5. чыгу");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("баланс: " + checkBalance());
                        break;
                    case 2:
                        System.out.print("акча чыгару: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdraw(withdrawAmount)) {
                            System.out.println("чыгарылган " + withdrawAmount + " акча");
                        } else {
                            System.out.println("акча жетишсиз");
                        }
                        break;
                    case 3:
                        System.out.print("акча салу: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        System.out.print("салынган " + depositAmount + " акча\n");
                        break;
                    case 4:
                        Phone.methodMenu();
                        break;
                    case 5:
                        System.exit(0);
                        return;
                    default:
                        System.out.println("тура териниз");
                }
            }
        }
    }
}




