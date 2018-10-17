package task1;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Kor on 17.10.2018.
 */
public class ExceptionCatching {

    public static void catchMe() throws FileNotFoundException, URISyntaxException {
        if (true) throw new NullPointerException();
        if (true) throw new ArithmeticException();
        if (true) throw new FileNotFoundException();
        if (true) throw new URISyntaxException("1","2");
    }

}