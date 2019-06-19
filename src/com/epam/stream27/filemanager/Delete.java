package com.epam.stream27.filemanager;

import java.io.File;
import java.util.Scanner;

class Delete {

    public static void methodForDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConstantVariables.enterFileName);
        File file = new File(scanner.next());
        file.delete();
        scanner.close();
        System.out.println("File deleted");
    }
}
