/**
 * 
 */
package com.test.tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author mdiksh
 *
 */
public class BoldTag extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException 
	{
		StringWriter sw = new StringWriter();
		JspWriter Jspwriter = getJspContext().getOut();
		getJspBody().invoke(sw);
		StringBuilder sb =new StringBuilder();
		sb.append("<b>");
		sb.append(sw.toString());
		sb.append("</b>");
		Jspwriter.print(sb.toString());
	}

}
