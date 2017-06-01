package wat.edu.pl.ParameterSingleton;

/**
 * Created by Magda on 25.05.2017.
 */
import wat.edu.pl.LabelSingleton.LabelSingleton;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class MaleLiteryTag extends BodyTagSupport {
   private String key;

    public void setKey(String key) {
        this.key = key;
    }

    public int doAfterBody() throws JspException {
        try {
            BodyContent bc = getBodyContent();
            String body = bc.getString();
            JspWriter out = bc.getEnclosingWriter();
            if (body != null && !ParameterSingleton.getParameter(key) ) {
                out.print(body.toLowerCase());
                //zmienienione=!zmienienione;
            }
            else if(body != null && ParameterSingleton.getParameter(key)){
                out.print(body.toUpperCase());
                //zmienienione=!zmienienione;
            }
        } catch(IOException e) {
            throw new JspException("Wystapil wyjatek IOException");
        }
        return SKIP_BODY;
    }
}