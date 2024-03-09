package br.edu.senaisp.servelet;

import java.io.IOException;

import br.edu.senaisp.dao.SaborDAO;
import br.edu.senaisp.model.Sabor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/banco")

public class Banco extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("p1");
		String descricao = req.getParameter("p2");
		float preco = Float.parseFloat(req.getParameter("p3"));
		
		Sabor s = new Sabor();
		s.setNome(nome);
		s.setDescricao(descricao);
		s.setPreco(preco);
		
		SaborDAO dao = new SaborDAO();
		dao.novo(s);
		
		if(nome.equalsIgnoreCase("") || descricao.equalsIgnoreCase("") || preco == 0.0f) {
			resp.sendRedirect("/Av1_Web/cadastro.html");
		}else {
			resp.sendRedirect("/Av1_Web/inicial.html");
			System.out.println("Nome: " + nome + "\nDescrição: " + descricao + "\nPreço: R$" + preco);
		}
	}	
}