/**
 * 
 */
package com.test.tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author mdiksh
 *
 */
public class MessageTag extends SimpleTagSupport {
	
	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException
	{
	JspWriter jspWriter = getJspContext().getOut();
	if (null!=message)
		{
		jspWriter.print(message+"!!!!");	
		}
	}

}
