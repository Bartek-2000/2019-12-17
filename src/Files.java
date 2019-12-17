import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    private static Scanner x;

    public static void openFile(){
        try{
            x = new Scanner(new File("C:\\Users\\Młody Programista\\IdeaProjects\\2019-12-17\\src\\file.txt"));
        }catch (IOException e ){
            System.out.println("File error");
            e.printStackTrace();
        }
    }
    public static void read(){
        while(x.hasNext()){
            String id = x.next();
            String name = x.next();
            String surename = x.next();
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Surename: " + surename);

        }
    }
    public static void close(){x.close();}


    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter(new File("C:\\Users\\Młody Programista\\IdeaProjects\\2019-12-17\\src\\file.txt"),true);
        fileWriter.write(" Jan Papież ");
        fileWriter.close();




        openFile();
        read();
        close();


    }
}
