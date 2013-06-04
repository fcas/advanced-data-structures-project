/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import grafo.GerarGrafo;
import grafo.IVertice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;
import visitor.Visitor;
import visitor.VisitorRelevancia;
import api.Cliente;

import com.restfb.Connection;
import com.restfb.types.User;

/**
 *
 * @author felipe
 */
public class UsuarioApi implements IUsuario {

    private User user;
    private String aniversario;
    private String ID;
    private String email;
    private String nome;
    private String bio;
    private String sobre;
    private String cidade;
    private String status;
    private String username;
    @SuppressWarnings("unused")
	private final String caminhoArquivo = System.getProperty("user.dir") + System.getProperty("file.separator");

    public UsuarioApi(String username) {
        user = Cliente.getInstance().fetchObject(username, User.class);

        this.setNome(user.getName());
        this.setID(user.getId());
        this.setCidade(user.getLocale());
        this.setUsername(user.getUsername());
        this.setAniversario(user.getBirthday());

    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public void setBio() {
        this.bio = user.getBio();
    }

    public void setCidade(String cidade) {
        this.cidade = user.getHometownName();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getAniversario() {
        return aniversario;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getBio() {
        return bio;
    }

    @Override
    public String getSobre() {
        return sobre;
    }

    @Override
    public String getCidadeNatal() {
        return cidade;
    }

    @Override
    public String getStatusRelacionamento() {
        return status;
    }

    @Override //retorna a lista de amigos de um usuário
    public List<IUsuario> getAmigos() {

        User user;

        //cria uma conexão para visualizar os amigos de um usuário
        Connection<User> amigosConexao = Cliente.getInstance().fetchConnection(
                username + "/friends", User.class);

        //guarda as informações dos amigos do usuário
        List<User> amigosData = amigosConexao.getData();

        //criar uma lista de amigos
        List<IUsuario> amigos = new ArrayList<IUsuario>();

        for (int i = 0; i < amigosData.size(); i++) {
            user = Cliente.getInstance().fetchObject(amigosData.get(i).getId(), User.class);
            String username = user.getUsername();
            System.out.println("Amigo:" + username + "adicionado na lista de amigos...");

            if (username != null) {
                IUsuario usuario = new UsuarioApi(username);
                amigos.add(usuario);
            }
        }

        return amigos;
    }

	@Override
	public List<IVertice> sugerirAmigos(String nome)
			throws FileNotFoundException, IOException,
			VerticeJaExisteException, ParDeVerticesNaoExistenteException {
		
		IVertice vertice = null;
		List<IVertice> listaResultado = new ArrayList<IVertice>();
		Visitor visitor = new VisitorRelevancia();
		List<IVertice> sugeridos = new ArrayList<IVertice>();
		
		for (int i = 0; i < GerarGrafo.getInstance().getListVertice().size(); i++) {
            if (nome.equals(GerarGrafo.getInstance().getListVertice().get(i).getName())) {
                vertice = GerarGrafo.getInstance().getListVertice().get(i);
            }
        }
		
		GerarGrafo.getInstance().buscaEmLargura(visitor, 
				GerarGrafo.getInstance().buscarPosicaoVertice(vertice.getId()), 
				listaResultado);
		
		for (int i = 0; i < listaResultado.size(); i++) {
			if (listaResultado.get(i).getRelevancia() > 2 && (listaResultado.get(i) != vertice)){
				sugeridos.add(listaResultado.get(i));
			}
		}
		
		for (int j = 0; j < vertice.getVizinhos().size(); j++) {
			//remove os amigos com os quais já se têm amizade
            if (sugeridos.contains(vertice.getVizinhos().get(j))) {
                sugeridos.remove(vertice.getVizinhos().get(j));
            }
        }
	
		return sugeridos;
	}
	
	public void resetRelevancia() throws FileNotFoundException, IOException,
			VerticeJaExisteException, ParDeVerticesNaoExistenteException {
		
		for (int i = 0; i < GerarGrafo.getInstance().getListVertice().size(); i++) {

			GerarGrafo.getInstance().getListVertice().get(i).resetRelevancia();
		}
	}
	
}