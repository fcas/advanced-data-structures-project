package gui;

import api.Cliente;
import dao.DaoFactory;
import dao.IDaoUsuario;
import grafo.IVertice;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import model.IUsuario;
import model.UsuarioApi;
import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;

public class Facade {
	
	private IUsuario usuario;
	private DaoFactory factory = DaoFactory.createDaoFactory(0);
	private IDaoUsuario daoUsuario = factory.criarDaoUsuario();
	
	public Facade () {
	
        }
	
	public void setUsuario(String usuario) {
		this.usuario = new UsuarioApi(usuario);
	}
	
	public IUsuario getUsuario() {
		return usuario;
	}
	
	public void setToken(String token) {
		Cliente.setToken(token);
	}
	
	/**
     *
     * @param nome
     * @return
     */
    public List<IVertice> sugerirAmigos (String nome) {
		try {
			usuario.resetRelevancia();
			return usuario.sugerirAmigos(nome);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} catch (VerticeJaExisteException e) {
		} catch (ParDeVerticesNaoExistenteException e) {
		}
		
		return null;
	}
	
	public void criarUsuario() {
		try {
			daoUsuario.criarUsuario(usuario);
		} catch (IOException e) {
		}
	}
	
	
}
