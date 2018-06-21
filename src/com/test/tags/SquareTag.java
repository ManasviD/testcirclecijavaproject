/**
 * 
 */
package com.test.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author mdiksh
 *
 */
public class SquareTag extends SimpleTagSupport {
	
	private Integer number;
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public void doTag() throws IOException,JspException
	{
		getJspContext().getOut().print((number.intValue() * number.intValue()));
	}

}
