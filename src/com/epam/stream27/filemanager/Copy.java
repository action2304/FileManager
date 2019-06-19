package com.epam.stream27.filemanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Copy {

    public static void methodForCopy() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(ConstantVariables.enterFileName);
            FileInputStream fileInputStream = new FileInputStream(scanner.next());
            System.out.println(ConstantVariables.enterFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(scanner.next());
            while (fileInputStream.available() > 0) {
                int inputData = fileInputStream.read();
                fileOutputStream.write(inputData);
            }
            fileInputStream.close();
            fileOutputStream.close();
            scanner.close();
            System.out.println("File copied");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
