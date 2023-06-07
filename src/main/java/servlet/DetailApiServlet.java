package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pages.Detail;

/**
 * Servlet implementation class DetailApiServlet
 */
@WebServlet("/api/v1/detail")
public class DetailApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Detail detail = new Detail();


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		detail.execute(request, response);
	}

}
