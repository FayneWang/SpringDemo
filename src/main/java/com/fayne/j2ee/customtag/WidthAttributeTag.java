package com.fayne.j2ee.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

public class WidthAttributeTag extends SimpleTagSupport {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void doTag() throws JspException, IOException {

        Writer out = getJspContext().getOut();
        out.write("<h1>" +firstName + "·" + lastName + "</h1>");
        out.write("<table border='1' bgcolor='#9999cc' width='400'>");
        for (int i=0,j; i<5; ++i){
            out.write("<tr>");
            for (j=0;j<5;++j){

                out.write("<td>");
                out.write(String.valueOf(i*10+j));
                out.write("</td>");

            }
            out.write("</tr>");
        }
    }
}
