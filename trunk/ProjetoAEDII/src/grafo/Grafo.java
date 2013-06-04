package grafo;

import java.util.List;
import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;
import visitor.Visitor;

public interface Grafo {

	boolean ehDirecionado();

	void adicionarVertice(IVertice vertice) throws VerticeJaExisteException;

	void adicionarAresta(IAresta aresta) throws ParDeVerticesNaoExistenteException;

	void buscaEmProfundidade(Visitor visitor, int inicio, List<IVertice> listaResultado);

	void buscaEmLargura(Visitor visitor, int inicio, List<IVertice> listaResultado);

	public IVertice buscarVertice(String id);

	public int buscarPosicaoVertice(String id);

	public boolean existeVertice(String id);
	
	public List<IVertice> buscarVerticesNome(String id);
	
	public IVertice buscaVerticeNome (String nome);

}