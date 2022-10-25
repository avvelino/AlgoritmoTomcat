package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Controller
 */

@WebServlet(urlPatterns = {"/Js","/Java","/Cont"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/Js")) {
			apJs(request, response);
		} else if(action.equals("/Java")) {
			apJv(request,response);
		}

	}

	protected void apJs(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("appJS.html");
	}
	
	protected void apJv(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("appJAVA.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
