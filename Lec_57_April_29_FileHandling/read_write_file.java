package Lec_57_April_29_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class read_write_file {
    public static void main(String[] args) {
        
        File file = new File("Lec_57_April_29_FileHandling\\example.txt");

        try {
            file.createNewFile();

            // read and write char by char (char stream)
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file);

            // Buffer reader / writer
            BufferedReader bfr = new BufferedReader(fr);
            BufferedWriter bfw = new BufferedWriter(fw);
            Scanner sc = new Scanner(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
