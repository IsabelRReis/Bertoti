import java.util.List;
import java.util.LinkedList;

public class Interface {
	
	private List<Cliente> clientes = new LinkedList<Cliente>();
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> buscarClientePorRoupas(Roupas roup){
		List<Cliente> clientesEncontrados = new LinkedList<Cliente>();
		for(Cliente cliente: clientes) {
			if(cliente.getRoup().comparar(roup)) clientesEncontrados.add(cliente);
		}
		return clientesEncontrados;
	}
	
	public Cliente buscarClientePorCodigoDeProtocolo(String codigoDeProtocolo) {
		for (Cliente cliente: clientes) {
			if(cliente.getCodigoDeProtocolo().equals(codigoDeProtocolo)) {
				return cliente;
			}
		}
		return null;
	}
	
	public List<Cliente> getClientes(){
		return this.clientes;
	}
}
