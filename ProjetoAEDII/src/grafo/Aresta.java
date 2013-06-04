package grafo;

public class Aresta implements IAresta {
	
    private IVertice origem;
    private IVertice destino;

    public Aresta( IVertice origem, IVertice destino ){
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public IVertice getDestino() {
        return destino;
    }

    @Override
    public void setDestino(IVertice destino) {
        this.destino = destino;
    }

    @Override
    public IVertice getOrigem() {
        return origem;
    }

    @Override
    public void setOrigem(IVertice origem) {
        this.origem = origem;
    }
}
