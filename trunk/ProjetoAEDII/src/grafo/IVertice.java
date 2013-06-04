package grafo;

import java.util.Iterator;
import java.util.LinkedList;

public interface IVertice {

	public LinkedList<IVertice> getVizinhos();
	public Iterator<IVertice> getVizinhosIterador();
	public String getName();
	public String getId();
	public  int getRelevancia();
	public void incrementaRelevancia();
	public void resetRelevancia();
	
}
