package com.epam.sixthtask;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\Kirill\\Desktop\\_projects\\SixthTask\\fileOne.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File was created.");
            } else {
                System.out.println("File exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Please, choose the option (enter option number from keyboard):");
        System.out.println("Copy file - 1");
        System.out.println("Move file - 2");
        System.out.println("Delete file - 3");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You chose copy file.");
                try (FileInputStream reader = new FileInputStream("fileOne.txt");
                     FileOutputStream writer = new FileOutputStream("fileTwo.txt")) {
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print(c);
                        writer.write(c);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
//                File fileTwo = new File("C:\\Users\\Kirill\\Desktop\\_projects\\SixthTask\\newFolder\\newFile.txt");
//                try (FileInputStream reader = new FileInputStream("fileOne.txt");
//                     FileOutputStream writer = new FileOutputStream("newFile.txt")) {
//                    int c;
//                    while ((c = reader.read()) != -1) {
//                        System.out.print(c);
//                        writer.write(c);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                break;
            case 3:
                System.out.println("You chose delete file.");
                file.delete();
                System.out.println("File was deleted");
                break;
        }


    }
}
