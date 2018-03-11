import java.io.*;
import java.util.Scanner;

public class create_file {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            System.out.print("path:");
             String pat=scanner.nextLine();
             System.out.print("name:");
             String name=scanner.nextLine();
        try {
                String content = a;
                String path = pat+name;
                File file = new File(path);
                    file.createNewFile();

                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content);
                bw.close();
            } catch (Exception e)

            {
                System.out.println(e);
            }
        }
    }
