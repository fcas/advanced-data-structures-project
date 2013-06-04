/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import grafo.IVertice;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;

/**
 * 
 * @author felipe
 */
public interface IUsuario {

	public String getAniversario();

	public String getID();

	public String getEmail();

	public String getNome();

	public String getBio();

	public String getSobre();

	public String getCidadeNatal();

	public String getUsername();

	public String getStatusRelacionamento();

	public List<IVertice> sugerirAmigos(String nome)
			throws FileNotFoundException, IOException,
			VerticeJaExisteException, ParDeVerticesNaoExistenteException;

	public List<IUsuario> getAmigos();
	
	public void resetRelevancia() throws FileNotFoundException, IOException,
	VerticeJaExisteException, ParDeVerticesNaoExistenteException;

}