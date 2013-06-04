package dao;

public class DaoArquivo extends DaoFactory{
	private static DaoArquivo instance = null;
	
	private DaoArquivo(){}
	
	@Override
	public IDaoUsuario criarDaoUsuario(){
		//cria um dao usuário
		return new DaoUsuario();
		
	}
	
	//cria um dao arquivo
	public static DaoArquivo getInstance() {
		if (instance == null) {
                    instance = new DaoArquivo();
            }
		
		return instance;
	}

}
