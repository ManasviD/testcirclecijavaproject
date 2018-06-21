/**
 * 
 */
package com.test.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mdiksh
 *
 */
public class ServletwithSession extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9138751577298983406L;
	
	@Override 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getSession(); 
		 response.getWriter().print("Session is here...");
		 response.getWriter().flush();
		 response.getWriter().close();
		}


}
