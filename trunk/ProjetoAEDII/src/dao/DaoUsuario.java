package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import model.IUsuario;

public class DaoUsuario implements IDaoUsuario {
	
	private final String caminhoArquivo = System.getProperty("user.dir") + System.getProperty("file.separator");
	private BufferedWriter arquivoId;
	private BufferedWriter arquivoNome;
	
	/*metodo que recebe o usuario para o qual os arquivos serao criados;*/
        @Override
	public void criarUsuario(IUsuario usuario) throws IOException {
		
        // cria uma lista com todos os amigos do usuário
        List<IUsuario> amigos = usuario.getAmigos();
		
        //cria o arquivo que conterá o id do usuário, e os ids de seus amigos
		arquivoId = new BufferedWriter(new FileWriter(
					caminhoArquivo + "ids_" + usuario.getUsername() + ".txt"));
		
		//cria o arquivo que conterá o nome do usuário, e os nomes de seus amigos
		arquivoNome = new BufferedWriter(new FileWriter(
				caminhoArquivo + "nomes_" + usuario.getUsername() + ".txt"));
		
		//escreve na primeira linha, o id do usuário
		arquivoId.write(usuario.getID() + "\n");
		
		//escreve na segunda linha, o nome do usuário
		arquivoNome.write(usuario.getUsername() + "\n");
		
		//escreve nas linhas seguinda, de cada arquivo, os ids e nomes do amigos 
		// do usuário
		for (int i=0; i<amigos.size(); i++) {
			arquivoId.write(amigos.get(i).getID() + "\n");
			arquivoNome.write(amigos.get(i).getNome() + "\n");
		}	

		//fecha os arquivos
		arquivoId.close();
		arquivoNome.close();
	}
	     
      }