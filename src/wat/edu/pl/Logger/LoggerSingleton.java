package wat.edu.pl.Logger;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by Magda on 24.05.2017.
 */
public class LoggerSingleton {
    private static LoggerSingleton ourInstance = new LoggerSingleton();
    private static Logger logger=Logger.getLogger("wat.edu.pl");
    public static LoggerSingleton getInstance() {
        return ourInstance;
    }
public static  Logger getLogger(){
        return logger;
}
public static void  writeToFile(String str){
    FileHandler fh;

    try {

        // This block configure the logger with handler and formatter
        fh = new FileHandler("MyLogFile.log");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
      //  fh.setFormatter(formatter);

        // the following statement is used to log any messages
        logger.info(str);
        //logger.log(Level.INFO,str);

    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
public static String getHistory(){
    String strLine="";
    StringBuilder sb= new StringBuilder();
    FileInputStream fstream;
    try{
       fstream = new FileInputStream("MyLogFile.log");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));


   /* read log line by line */
        while ((strLine = br.readLine()) != null)   {
     /* parse strLine to obtain what you want */
           // System.out.println (strLine);
            sb.append(strLine);
            sb.append("</br>");
        }
        fstream.close();
    } catch (Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    return sb.toString();
}
    private LoggerSingleton() {
    }
}
