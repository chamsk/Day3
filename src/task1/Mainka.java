package task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Kor on 17.10.2018.
 */
public class Mainka {
    public static void main(String[] args) throws URISyntaxException {
       try {
           ExceptionCatching.catchMe();
       }
       catch (NullPointerException e){
           e.printStackTrace();
       }
       catch (FileNotFoundException e){
           e.getMessage();
       }
       finally {
           System.out.println("some");
       }
    }
}
