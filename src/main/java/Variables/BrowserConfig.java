package Variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BrowserConfig {

   public static Properties property;
    private static String  configpath="src/Config/BrowserConfig.properties";

    public static void init() throws IOException {
        property=new Properties();
        try {
            System.out.println("in try");
            InputStream instm = new FileInputStream(configpath);
            property.load(instm);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("IO exeption");
            e.printStackTrace();
        }
    }
}
