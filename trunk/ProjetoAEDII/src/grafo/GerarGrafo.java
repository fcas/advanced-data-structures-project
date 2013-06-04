package grafo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.IUsuario;
import model.UsuarioApi;

import dao.DaoUsuario;

import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;

public class GerarGrafo {

    private final String caminhoArquivo = System.getProperty("user.dir") + System.getProperty("file.separator");
    private List<String> usuarios = new ArrayList<String>();
    private List<String> arquivos = new ArrayList<String>();
    private static GrafoAbstrato graph = new GrafoListaAdjacencia();
    private BufferedReader in_ids;
    private BufferedReader in_nomes;

    /**
     * Inicializa a lista de usuarios e os diretorios para a criacao dos grafos
     *
     * @throws ParDeVerticesNaoExistenteException
     * @throws IOException
     * @throws FileNotFoundException *
     */
    public GerarGrafo() throws FileNotFoundException, IOException, ParDeVerticesNaoExistenteException {

        System.out.println("Construtor GerarGrafo!!!");
        
        //obtem informações de usuario
//        IUsuario usuario = new UsuarioApi("FelipeSah");
//        DaoUsuario daoUsuario = new DaoUsuario();
//        daoUsuario.criarUsuario(usuario);
//        
        usuarios.add("felipecordeiroalves");
        usuarios.add("larissabatistaleite");
        usuarios.add("showrodrigues");
        usuarios.add("vinicius.cordeiro.731");
        usuarios.add("vinicius.reis.353");
//        usuarios.add("FelipeSah");
        
        for (int i = 0; i < usuarios.size(); i++) {
            arquivos.add(caminhoArquivo + "ids_" + usuarios.get(i) + ".txt");
            arquivos.add(caminhoArquivo + "nomes_" + usuarios.get(i) + ".txt");
        }

        Povoar();

    }

    /**
     * Povoa o grafo *
     */
    private void Povoar() throws IOException,
            ParDeVerticesNaoExistenteException, FileNotFoundException {

        for (int i = 0; i < arquivos.size();) {
            System.out.println("Grafo sendo construido!!!!");
            in_ids = new BufferedReader(new FileReader(arquivos.get(i++)));
            in_nomes = new BufferedReader(new FileReader(arquivos.get(i++)));
            boolean primeiraLinha = true;
            String id = in_ids.readLine();
            IVertice user = null;

            while (in_ids.ready()) {
                if (primeiraLinha) {
                    Vertice vertex = new Vertice(
                            in_nomes.readLine(), id);
                    try {
                        graph.adicionarVertice(vertex);
                    } catch (VerticeJaExisteException e) {
                    }
                    user = graph.buscarVertice(id);
                    primeiraLinha = false;
                } else {
                    Vertice vertex = new Vertice(
                            in_nomes.readLine(),
                            in_ids.readLine());
                    try {
                        graph.adicionarVertice(vertex);
                    } catch (VerticeJaExisteException e) {
                    }

                    IAresta edge = new Aresta(user,
                            graph.buscarVertice(vertex.getId()));
                    graph.adicionarAresta(edge);

                }
            }
        }


    }

    /**
     * Retorna um grafo construido e povoado. *
     */
    public static GrafoAbstrato getInstance() throws FileNotFoundException, IOException, VerticeJaExisteException, ParDeVerticesNaoExistenteException {
		
        return graph;
    }
}
