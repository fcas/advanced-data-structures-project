package grafo;

public interface IAresta {
    
	public IVertice getDestino();
	public void setDestino(IVertice destino);
	public IVertice getOrigem();
	public void setOrigem(IVertice origem);
}
