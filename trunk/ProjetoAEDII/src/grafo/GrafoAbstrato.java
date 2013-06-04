package grafo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import visitor.Visitor;

public abstract class GrafoAbstrato implements Grafo {

	protected List<IVertice> listaVertice;

	public GrafoAbstrato() {
		listaVertice = new ArrayList<IVertice>();
	}

	/** Cria um boolean[] auxiliar e chama o metodo concreto de percorrimento **/
        @Override
	public void buscaEmProfundidade(Visitor visitor, int inicio,
			List<IVertice> listaResultado) {
        	
    	boolean[] visitado = new boolean[listaVertice.size()];
		for (int i = 0; i < listaVertice.size(); ++i) {
			visitado[i] = false;
		} 
		buscaEmProfundidade(visitor, listaVertice.get(inicio), visitado, listaResultado);
	}
	
	public List<IVertice> getListVertice() {
		return this.listaVertice;
	}

	/**
	 * Percorre o grafo em profundidade chamando o metodo accept de todos os
	 * vertices e adiciona numa lista ligada todos os vertices que percorre
	 **/
	private void buscaEmProfundidade(Visitor visitor, IVertice vertice,
			boolean[] visitado, List<IVertice> listaResultado) {
		
		((Vertice) vertice).accept(visitor);
		visitado[buscarPosicaoVertice(vertice.getId())] = true;
		listaResultado.add(vertice);
		
		LinkedList<IVertice> iter = vertice.getVizinhos();
		IVertice to; 
		for (int i = 0; i < iter.size(); i++) {
			to = iter.get(i);
			if(!visitado[buscarPosicaoVertice(to.getId())]) {
                           buscaEmProfundidade(visitor, to, visitado, listaResultado);
                    }
			
		}
	
	}

	/**
	 * Percorre o grafo em largura chamando o metodo accept de todos os vertices
	 * e adiciona numa lista ligada todos os vertices que percorre
	 **/
        @Override
	public void buscaEmLargura(Visitor visitor, int inicio,
			List<IVertice> listaResultado) {
		//inicia variaveis de auxilio
		boolean enfileirado[] = new boolean[listaVertice.size()];
		IVertice v = listaVertice.get(inicio);
		Queue<IVertice> fila = new LinkedList<IVertice>();

		//enfileira primeiro elemento
		enfileirado[buscarPosicaoVertice(v.getId())] = true;
		fila.add(v);

		//enquanto fila nao vazia, prossegue
		while (!fila.isEmpty()) {
			IVertice vertice = fila.remove();//remove o primeiro da fila
			((Vertice) vertice).accept(visitor);//visita
			listaResultado.add(vertice);//lista auxiliar

			//pega os proximos e cria um auxiliar
			LinkedList<IVertice> sucessores = vertice.getVizinhos();
		
			// Enfileira os sucessores
			for (int i = 0; i < sucessores.size(); i++) {
				IVertice next = sucessores.get(i);
				if(!enfileirado[buscarPosicaoVertice(next.getId())]){
					enfileirado[buscarPosicaoVertice(next.getId())] = true;
					fila.add(next);
				}
				
			}
		}
	}

}