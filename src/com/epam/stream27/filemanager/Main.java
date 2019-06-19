package com.epam.stream27.filemanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:\n1 - copy;\n2 - move;\n3 - delete;");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                Copy.methodForCopy();
                break;
            case 2:
                Move.methodForMove();
                break;
            case 3:
                Delete.methodForDelete();
                break;
        }
    }
}
