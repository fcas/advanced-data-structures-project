package visitor;

import grafo.Vertice;

public class VisitorRelevancia implements Visitor{

	@Override
	public void visit(Vertice vertice) {
		for (int i = 0; i < vertice.getVizinhos().size(); i++) {
			vertice.getVizinhos().get(i).incrementaRelevancia();
		}	
	}
}
