

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/CadastroServlet")
public class CadastroServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().println("Hello friend!");
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String cep = request.getParameter("cep");
		String address = request.getParameter("address");
		String delivery = request.getParameter("delivery");
		String description = request.getParameter("description");
		String date = request.getParameter("date");
		PrintWriter writer = response.getWriter();
		//writer.println("Dados enviados");
		//writer.println("Nome: " + name);
		
		
		// Call JSP
		RequestDispatcher call = request.getRequestDispatcher("/response.jsp");
		request.setAttribute("name", name);
		request.setAttribute("cep", cep);
		request.setAttribute("address", address);
		request.setAttribute("delivery", delivery);
		request.setAttribute("description", description);
		request.setAttribute("date", date);
		call.forward(request, response);
		
	}

}
