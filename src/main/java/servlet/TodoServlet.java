package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pages.Index;
import pages.PageBase;

/**
 * Servlet implementation class TodoServlet
 */
@WebServlet("/index")
public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private final String URI_PREFIX = "/todo/";

	Map<String, PageBase> map = new HashMap<String, PageBase>(){
		{
			put(URI_PREFIX + "index", new Index());
		}
	};

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		PageBase page = this.map.get(uri);
		page.execute(request, response);
	}

}
