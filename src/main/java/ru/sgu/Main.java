package src.main.java.ru.sgu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите номер задания (1, 2): ");
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        switch (in){
            case 1:
                First example = new First();
                First.print(example.createList());
                break;
            default:
                System.out.print("Введён некорректный номер");
        }
    }
}