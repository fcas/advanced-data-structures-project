package grafo;

import java.util.Iterator;
import java.util.LinkedList;
import visitor.Visitable;
import visitor.Visitor;

public class Vertice implements IVertice, Visitable {

    private LinkedList<IVertice> listVertice = new LinkedList<IVertice>();
    private String name;
    private String id;
    private int relevancia;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vertice(String name, String id) {
        this.name = name;
        this.id = id;
        this.relevancia = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Retorna uma lista de vertices com os vizinhos*
     */
    @Override
    public LinkedList<IVertice> getVizinhos() {
        return listVertice;
    }

    /**
     * Chama metodo visit do visitor passado por parametro se passando como parametro*
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Iterator<IVertice> getVizinhosIterador() {
        return null;
    }

	public int getRelevancia() {
		return relevancia;
	}

	public void incrementaRelevancia() {
		this.relevancia++;
	}
	
	public void resetRelevancia(){
		this.relevancia = 0;
	}
	
}