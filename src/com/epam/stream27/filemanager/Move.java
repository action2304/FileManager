package com.epam.stream27.filemanager;

import java.io.File;
import java.util.Scanner;

class Move {

    public static void methodForMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConstantVariables.enterFileName);
        File file = new File(scanner.nextLine());
        System.out.println(ConstantVariables.enterFilePath);
        File newFile = new File(scanner.nextLine());
        file.renameTo(newFile);
        scanner.close();
        System.out.println("File moved");
    }
}
