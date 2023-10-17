package br.com.gulliver_traveller.controllers;

import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gulliver_traveller.beans.Endereco;
import br.com.gulliver_traveller.beans.Usuario;
import br.com.gulliver_traveller.dao.DataSource;
import br.com.gulliver_traveller.dao.UsuarioDAO;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		String pagina = "";
		try {
			
			DataSource dataSource = new DataSource();
			
			UsuarioDAO usuarioDAO = new UsuarioDAO(dataSource);
			
			Usuario usuarioCadastro = new Usuario();
			usuarioCadastro.setNome(request.getParameter("nome"));
			usuarioCadastro.setSobrenome(request.getParameter("sobrenome"));
			usuarioCadastro.setEmail(request.getParameter("email"));
			usuarioCadastro.setTelefone(request.getParameter("telefone"));
			usuarioCadastro.setSenha(request.getParameter("senha"));
			usuarioCadastro.setTipo_documento(request.getParameter("tipo_documento"));
			usuarioCadastro.setDocumento(request.getParameter("numero_documento"));
			
			String data_emissao_documento_str = request.getParameter("data_emissao_documento");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date data_emissao_documento_util = sdf.parse(data_emissao_documento_str);
			Date data_emissao_documento = new Date(data_emissao_documento_util.getTime());
			usuarioCadastro.setData_emissao_documento(data_emissao_documento);
			
			usuarioCadastro.setSexo(request.getParameter("sexo"));
			
			String data_nascimento_str = request.getParameter("data_nascimento");
			java.util.Date data_nascimento_util = sdf.parse(data_nascimento_str);
			Date data_nascimento = new Date(data_nascimento_util.getTime());
			usuarioCadastro.setData_nascimento(data_nascimento);
			
			usuarioCadastro.setProfissao(request.getParameter("profissao"));
			
			Endereco enderecoCadastro = new Endereco();
			
			enderecoCadastro.setCidade(request.getParameter("cidade"));
			enderecoCadastro.setEstado(request.getParameter("estado"));
			enderecoCadastro.setCep(request.getParameter("cep"));
			enderecoCadastro.setRua(request.getParameter("rua"));
			
			String numero_str = request.getParameter("numero");
			int numero = Integer.valueOf(numero_str);
			enderecoCadastro.setNumero(numero);
			
			enderecoCadastro.setComplemento(request.getParameter("complemento"));
			enderecoCadastro.setReferencia(request.getParameter("referencia"));
			enderecoCadastro.setBairro(request.getParameter("bairro"));
			
			usuarioCadastro.setEndereco(enderecoCadastro);
			
			String result = usuarioDAO.create(usuarioCadastro);
			
			if(result == "Usuario cadastrado com sucesso") {
				pagina = "/login.jsp";
			}
			else {
				request.setAttribute("ErroMSG", "Usuario não cadastrado");
				pagina = "/erro.jsp";
			}
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
			dispatcher.forward(request, response);
		}
		catch(Exception e) {
			System.out.println("ERRO AO CADASTRO: " + e.getMessage());
		}
	}
}
