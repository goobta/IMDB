import org.junit.Test;

import java.nio.file.FileSystems;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void testParse(){
        System.out.println(System.getProperty("user.dir"));


        IMBDParser i = new IMBDParser();
        i.parse();
        assertTrue(true);
    }
}