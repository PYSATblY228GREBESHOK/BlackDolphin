package org.example;
import java.util.Scanner;

public class BlackDolphin {
    static String[] prisoners = new String[100];
    static int prisonerCount = 0;

    public static void main(String[] args) {

    }

    static void workInPrison(Scanner scanner) {
        System.out.println("Вы работаете в тюрьме.");
    }

    static void assaultPrisoner(Scanner scanner) {
        System.out.println("Кого вы хотите избить?");
        displayPrisoners();
        System.out.print("Введите номер заключенного: ");
        int target = scanner.nextInt();
    }

    static void visitLibrary() {
        System.out.println("Вы отправились в библиотеку для занятий.");
    }

    static void admitPrisoner(Scanner scanner) {
        System.out.print("Введите имя нового заключенного: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("За что сел в тюрьму " + name + ": ");
        String crime = scanner.nextLine();
        prisoners[prisonerCount++] = name + " (" + crime + ")";
        System.out.println(name + " был заключен в тюрьму под номером " + prisonerCount);
    }



    static void displayPrisoners() {
        System.out.println("Список заключенных:");
    }

    static void drugSearch() {
        System.out.println("Проводится обыск в поисках наркотиков");
    }

    static void organizePrisonRiot() {
        System.out.println("Организуется восстание в тюрьме");
    }
}
