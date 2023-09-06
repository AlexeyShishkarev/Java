import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

    }

    public static List<String[]> readToList(File file){
        List<String[]> result  = new ArrayList<>();
        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){


            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static boolean isNum(String text){
        try {
            int num = Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

}