package wat.edu.pl.LabelSingleton;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Magda on 24.05.2017.
 */
public class LocalizedTag extends SimpleTagSupport{

    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write(LabelSingleton.getLabel(key));
    }
}