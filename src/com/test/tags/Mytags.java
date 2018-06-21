/**
 * 
 */
package com.test.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author mdiksh
 *
 */
public class Mytags extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter jspWriter=this.getJspContext().getOut();
		jspWriter.println("MyStaticTag");
	}
}
