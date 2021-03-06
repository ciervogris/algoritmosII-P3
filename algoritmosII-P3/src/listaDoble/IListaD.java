package listaDoble;

public interface IListaD {
	
	void insertarInicio(String valor);
	
	boolean esVacia();
	
	void imprimir();
	
	boolean existe(String valor);
	
	void borrarInicio();
	
	void vaciarLista();

	NodoLD buscarElemento(String valor);

	void borrar(String valor);
}
