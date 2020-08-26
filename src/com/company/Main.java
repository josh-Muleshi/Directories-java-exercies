package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/test.txt");
        File Directory = new File("src/Dossier");

        if(!Directory.isDirectory()){
            Directory.mkdir();
        }

        if (!file.exists()){
            try {
                file.createNewFile();
                PrintWriter p = new PrintWriter(file);
                p.println("1234567890");
                p.flush();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }else {
            file.renameTo(new File(Directory, "test.txt"));
        }
    }
}
