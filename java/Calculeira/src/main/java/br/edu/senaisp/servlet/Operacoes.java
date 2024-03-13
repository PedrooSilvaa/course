package br.edu.senaisp.servlet;

import java.io.IOException;

import br.edu.senaisp.util.Eoperacao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/calc")

public class Operacoes extends HttpServlet {
	
	@Override	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String operacao = req.getParameter("p1");
		int n1 = Integer.parseInt(req.getParameter("p2"));
		int n2 = Integer.parseInt(req.getParameter("p3"));
		
		
		int resultado; 
		
		if(operacao.equalsIgnoreCase(Eoperacao.SOMA.toString())) {
			resultado = n1 + n2;
			resp.getWriter().append("<html><h1>"+n1+" + "+n2+" = "+resultado+"</h1></html>");
		}	
		else if(operacao.equalsIgnoreCase(Eoperacao.SUBTRACAO.toString())) {
			resultado = n1 - n2;
			resp.getWriter().append("<html><h1>"+n1+" - "+n2+" = "+resultado+"</h1></html>");
		}else if(operacao.equalsIgnoreCase(Eoperacao.MULTIPLICACAO.toString())) {
			resultado = n1 * n2;
			resp.getWriter().append("<html><h1>"+n1+" X "+n2+" = "+resultado+"</h1></html>");
		}else if(operacao.equalsIgnoreCase(Eoperacao.DIVISAO.toString())) {
			resultado = n1 / n2;
			resp.getWriter().append("<html><h1>"+n1+" / "+n2+" = "+resultado+"</h1></html>");
		}
//		PrintWriter xaxa = resp.getWriter();
//		xaxa.println("<html>");
//		xaxa.println("<head>");
//		xaxa.println("<body>");
//		xaxa.println("<h1> Ola Mundo! </h1	>");
//		xaxa.println("</body>");
//		xaxa.println("</head>");
//		xaxa.println("</html>");
	}
	
}
