package grafo;

import java.util.ArrayList;
import java.util.List;
import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;
import visitor.Visitor;

public class GrafoListaAdjacencia extends GrafoAbstrato {

	public GrafoListaAdjacencia() {
	}

	/**
	 * Retorna um vertice da lista buscando pela String "id". Retorna null caso
	 * o vertice nao seja encontrado
	 **/
	@Override
	public IVertice buscarVertice(String id) {
		IVertice retorno = null;
		for (int i = 0; i < super.listaVertice.size(); i++) {
			if (id.equals(super.listaVertice.get(i).getId())) {
				retorno = super.listaVertice.get(i);
			}
		}
		return retorno;
	}
	 
	@Override
	public IVertice buscaVerticeNome (String nome) {
		IVertice retorno = null;
		for (int i = 0; i < super.listaVertice.size(); i++) {
			if (nome.equalsIgnoreCase(super.listaVertice.get(i).getName())) {
				retorno = super.listaVertice.get(i);
			}
		}
		return retorno;
	}

    @Override
	public List<IVertice> buscarVerticesNome(String nome) {
		List<IVertice> listaVertices = new ArrayList<IVertice>();
		for (int i = 0; i < super.listaVertice.size(); i++) {
			if ((super.listaVertice.get(i).getName()).contains(nome) || super.listaVertice.get(i).getName().equalsIgnoreCase(nome)) {
				listaVertices.add(super.listaVertice.get(i));
			}
		}
		return listaVertices;
	}

	/**
	 * Retorna um inteiro correspondente a posicao do vertice na lista de
	 * vertices buscando pelo id. Retorna -1 caso o vertice nao exista
	 **/
	@Override
	public int buscarPosicaoVertice(String id) {
		int retorno = -1;
		for (int i = 0; i < super.listaVertice.size(); i++) {
			if (id.equals(super.listaVertice.get(i).getId())) {
				retorno = i;
			}
		}
		return retorno;
	}

	/**
	 * Retorna true caso exista uma aresta com o id passado por parametro ou
	 * false caso contrario.
	 **/
	@Override
	public boolean existeVertice(String id) {
		return (buscarVertice(id) != null);
	}

	/** Retorna true se o grafo for direcionado e false caso contrario **/
	@Override
	public boolean ehDirecionado() {
		return false;
	}

	/**
	 * Adiciona uma aresta entre dois vertices existentes. Lanca excecao caso um
	 * vertice seja invalido
	 **/
	@Override
	public void adicionarAresta(IAresta edge) throws ParDeVerticesNaoExistenteException {
		IVertice vertexOrigem = buscarVertice(((edge.getOrigem().getId())));
		IVertice vertexDestino = buscarVertice(edge.getDestino().getId());
		if (buscarPosicaoVertice(edge.getOrigem().getId()) != -1
				&& buscarPosicaoVertice(edge.getOrigem().getId()) != -1) {
			vertexOrigem.getVizinhos().add(vertexDestino);
			vertexDestino.getVizinhos().add(vertexOrigem);
		} else {
			throw new ParDeVerticesNaoExistenteException();
		}
	}

	/**
	 * Percorre o grafo em profundidade, chamando o visitor passado por
	 * parametro
	 **/
	@Override
	public void buscaEmProfundidade(Visitor visitor, int startVertex,
			List<IVertice> list) {
		super.buscaEmProfundidade(visitor, startVertex, list);
	}

	/** Percorre o grafo em largura, chamando o visitor passado por parametro **/
	@Override
	public void buscaEmLargura(Visitor visitor, int start,
			List<IVertice> list) {
		super.buscaEmLargura(visitor, start, list);
	}

	/** Cria um vertice. Caso esse vertice ja exista, lanca excecao **/
	@Override
	public void adicionarVertice(IVertice v) throws VerticeJaExisteException {
		if (!existeVertice(v.getId())) {
			super.listaVertice.add(v);
		} else {
			throw new VerticeJaExisteException();
		}
	}

}