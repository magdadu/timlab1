package wat.edu.pl.LabelSingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Magda on 24.05.2017.
 */
public class LabelSingleton {
    private static final String FILE = "labels.properties";
    private static LabelSingleton INSTANCE;
    private HashMap<String, String> labels = new HashMap<>();
    private Properties properties;
    public LabelSingleton() {
        properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(FILE));
            for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
                labels.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e) {
        }
    }

    public static synchronized LabelSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LabelSingleton();
        }
        return INSTANCE;
    }
    public static String getLabel(String key) {
        LabelSingleton ls = getInstance();
        String label = key;
        if (ls.labels.containsKey(key))
            label = ls.labels.get(key);
        return label;
    }
    public static void setLabel(String key,String value) {
        LabelSingleton ls = getInstance();
        ls.labels.put(key,value);
        ls.properties.put(key,value);
    }


    public static void store(){
        LabelSingleton ls = getInstance();
        try {
            PrintWriter writer =
                    new PrintWriter(
                            new File(ls.getClass().getResource(FILE).getPath()));
            ls.properties.store(writer,null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}