package br.com.gulliver_traveller.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;

import br.com.gulliver_traveller.beans.Endereco;
import br.com.gulliver_traveller.beans.Usuario;

public class UsuarioDAO implements DAO<Usuario>{
	private DataSource dataSource;

	public UsuarioDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return this.dataSource;
	}

	@Override
	public String create(Usuario object) {
		try {
			String SQL = "insert into Usuario " +
					"(nome, sobrenome, email, senha, telefone, tipo_documento, documento, data_emissao_documento, sexo, "
					+ "data_nascimento, profissao, endereco_id) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?,2)";

			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);

			stm.setString(1, object.getNome());
			stm.setString(2, object.getSobrenome());
			stm.setString(3, object.getEmail());
			stm.setString(4, object.getSenha());
			stm.setString(5, object.getTelefone());
			stm.setString(6, object.getTipo_documento());
			stm.setString(7, object.getDocumento());
			stm.setDate(8, (Date) object.getData_emissao_documento());
			stm.setString(9, object.getSexo());
			stm.setDate(10, (Date) object.getData_nascimento());
			stm.setString(11, object.getProfissao());

			int resultado = stm.executeUpdate();

			if(resultado != 0) {
				return "Usuario cadastrado com sucesso";
			}
			else {
				System.out.println("Erro ao inserir usuario");
				throw new RuntimeException("Erro ao inserir usuario");
			}
		}
		catch(Exception ex) {
			System.out.println("Erro no método usuarioDao.create " + ex.getMessage());
		}
		return null;
	}

	@Override
	public Usuario read(Usuario object) {
		try {
			String SQL = "SELECT u.*, e.ID as ENDERECO_ID, e.CIDADE as ENDERECO_CIDADE, e.ESTADO as ENDERECO_ESTADO,"
					+ " e.CEP as ENDERECO_CEP, e.RUA as ENDERECO_RUA,"
					+ " e.NUMERO as ENDERECO_NUMERO, e.COMPLEMENTO as ENDERECO_COMPLEMENTO,"
					+ " e.REFERENCIA as ENDERECO_REFERENCIA, e.BAIRRO as ENDERECO_BAIRRO"
					+ " FROM USUARIO u"
					+ " JOIN ENDERECO e ON e.ID = u.ENDERECO_ID"
					+ " WHERE email=? AND senha=?";

			PreparedStatement stm = dataSource.getConnection().prepareStatement(SQL);

			stm.setString(1, object.getEmail());
			stm.setString(2, object.getSenha());

			ResultSet rs = stm.executeQuery();

			if(rs.next()) {
				Usuario resultado = new Usuario();
				resultado.setNome(rs.getString("NOME"));
				resultado.setSobrenome(rs.getString("SOBRENOME"));
				resultado.setEmail(rs.getString("EMAIL"));
				resultado.setSenha(rs.getString("SENHA"));
				resultado.setTelefone(rs.getString("TELEFONE"));
				resultado.setTipo_documento(rs.getString("TIPO_DOCUMENTO"));
				resultado.setDocumento(rs.getString("DOCUMENTO"));
				resultado.setData_emissao_documento(rs.getDate("DATA_EMISSAO_DOCUMENTO"));
				resultado.setSexo(rs.getString("SEXO"));
				resultado.setData_nascimento(rs.getDate("DATA_NASCIMENTO"));
				resultado.setProfissao(rs.getString("PROFISSAO"));

				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("ENDERECO_ID"));
				endereco.setCidade(rs.getString("ENDERECO_CIDADE"));
				endereco.setEstado((rs.getString("ENDERECO_ESTADO")));
				endereco.setCep((rs.getString("ENDERECO_CEP")));
				endereco.setRua((rs.getString("ENDERECO_RUA")));
				endereco.setNumero((rs.getInt("ENDERECO_NUMERO")));
				endereco.setComplemento((rs.getString("ENDERECO_COMPLEMENTO")));
				endereco.setReferencia((rs.getString("ENDERECO_REFERENCIA")));
				endereco.setBairro((rs.getString("ENDERECO_BAIRRO")));
				
				resultado.setEndereco(endereco);

				return resultado;
			}
			else {
				return null;
			}
		}
		catch(Exception ex) {
			System.out.println("Erro no método usuarioDao.read " + ex.getMessage());
		}
		return null;
	}

	@Override
	public void update(Usuario object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Usuario object) {
		// TODO Auto-generated method stub

	}
}
