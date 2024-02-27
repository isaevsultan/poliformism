package myPhone;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Note {

    private static String[] notes = new String[100];
     private static int notesCount = 0;

    public String[] getNotes() {
        return notes;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    public int getNotesCount() {
        return notesCount;
    }

    public void setNotesCount(int notesCount) {
        this.notesCount = notesCount;
    }

    public static void addNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("соз калтырыныз");
        String note = scanner.nextLine();
        notes[notesCount++] = note;
        System.out.println("соз кошулду");
    }

    public static void manisiNotes() {
        System.out.println("создордун списогу");
        for (int i = 0; i < notesCount; i++) {
            System.out.println((i + 1) + ". " + notes[i]);
        }
    }

    public static void deleteNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("кайсыл созду удалть кыласыз:");
        int indexToDelete = scanner.nextInt();
        if (indexToDelete > 0 && indexToDelete <= notesCount) {
            for (int i = indexToDelete - 1; i < notesCount - 1; i++) {
                notes[i] = notes[i + 1];
            }
            notesCount--;
            System.out.println("удалить болду .");
        } else {
            System.out.println("тура эмес берилген номер.");
        }
    }

    public void getNote() {
        while (true) {
            System.out.println("1.кошу\n" +
                    "2.создорду чыгару\n" +
                    "3.удалить кылу\n" +
                    "4.чыгу");
            int number = new Scanner(System.in).nextInt();
                switch (number) {
                    case 1:
                        addNote();
                      break;
                    case 2:
                        manisiNotes();
                        break;
                    case 3:
                        deleteNote();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    case 5:
                        Phone.methodMenu();
                    default:
                        System.out.println("тура функция калтырыныз");


//1.кошу
//2.создорду чыгару
//3.удалить кылу
//4.чыгу
//

                }
            }
        }
    }
