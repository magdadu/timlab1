package wat.edu.pl.ParameterSingleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Magda on 25.05.2017.
 */
public class ParameterSingleton {
    private static final String FILE = "Parameters.properties";
    private static ParameterSingleton INSTANCE;
    private HashMap<String, Boolean> Parameters = new HashMap<>();
    private Properties properties;
    public ParameterSingleton() {
        properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream(FILE));
            for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
                Parameters.put((String) entry.getKey(), (Boolean) entry.getValue());
            }
        } catch (Exception e) {
        }
    }

    public static synchronized ParameterSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ParameterSingleton();
        }
        return INSTANCE;
    }
    public static Boolean getParameter(String key) {
        ParameterSingleton ls = getInstance();
        Boolean parameter=true;
        if (ls.Parameters.containsKey(key))
            parameter = ls.Parameters.get(key);
        return parameter;
    }
    public static void setParameter(String key,Boolean value) {
        ParameterSingleton ls = getInstance();
        ls.Parameters.put(key,value);
        ls.properties.put(key,value);
    }


    public static void store(){
        ParameterSingleton ls = getInstance();
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
