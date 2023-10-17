package br.com.gulliver_traveller.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gulliver_traveller.beans.Usuario;
import br.com.gulliver_traveller.dao.DataSource;
import br.com.gulliver_traveller.dao.UsuarioDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String pagina = "";
		try {
			
DataSource dataSource = new DataSource();
			
			UsuarioDAO usuarioDAO = new UsuarioDAO(dataSource);
			
			Usuario usuarioLogin = new Usuario();
			usuarioLogin.setEmail(request.getParameter("email")); 
			usuarioLogin.setSenha(request.getParameter("senha"));
			
			Usuario usuarioBD = usuarioDAO.read(usuarioLogin);
			
			if(usuarioBD == null) {
				request.setAttribute("ErroMSG", "Usuario não encontrado");
				pagina = "/erro.jsp";
			}
			else {
				request.getSession().setAttribute("Usuario", usuarioBD);
				pagina = "/dados_usuario.jsp";
			}
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
			dispatcher.forward(request, response);
		}
		catch(Exception e) {
			System.out.println("ERRO AO LOGIN: " + e.getMessage());
		}
	}
}
