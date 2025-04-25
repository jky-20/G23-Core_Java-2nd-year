package Lec_55_April_25_FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        
        File file = new File("Lec_55_April_25_FileHandling\\test.txt");
        try{
            // creating a file
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File already exists");
            }

            // writing in a file
            FileWriter writer = new FileWriter(file, true);
            writer.write("Good Morning !!");
            writer.write("\nEe saal cup namde");
            writer.close();

            // Read a file
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String str = reader.nextLine();
                System.out.println(str);
            }
            reader.close();

            // delete a file
            if(file.delete()){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("File can't be deleted");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
