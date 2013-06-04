package dao;

public abstract class DaoFactory {

	public static final int Arquivo = 0;
	
	public abstract IDaoUsuario criarDaoUsuario();
	
	//cria uma fábrica
	public static DaoFactory createDaoFactory(int factoryType) {
		
		switch (factoryType) {
			case Arquivo: //cria um Dao de arquivo
				return DaoArquivo.getInstance();
		}
		
		return null;
	}

}
