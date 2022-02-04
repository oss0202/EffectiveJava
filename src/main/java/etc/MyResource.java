package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception{
        System.out.println("Closed MyResource");
    }

    public static void main(String[] args) {
        Scanner scanner1 = null;
        try {
            scanner1 = new Scanner(new File("test.txt"));
            while (scanner1.hasNext()) {
                System.out.println(scanner1.nextLine());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            if (scanner1 != null) {
                scanner1.close();
            }
        }



        try (Scanner scanner2 = new Scanner(new File("test.txt"))){
            while (scanner2.hasNext())
                System.out.println(scanner2.nextLine());
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }
}
