package visitor;

import grafo.Vertice;

public class VisitorRelevancia implements Visitor{

	@Override
	public void visit(Vertice vertice) {
		for (int i = 0; i < vertice.getVizinhos().size(); i++) {
		//	if (!vertice.isVisitado()) {
				vertice.getVizinhos().get(i).incrementaRelevancia();
			//}
		} //vertice.setVisitado(true);	
	}
}
