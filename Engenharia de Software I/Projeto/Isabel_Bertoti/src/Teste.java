import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
	
	Interface Interface = new Interface();
				
	assertEquals(Interface.getClientes().size(), 0);
				
	Interface.cadastrarCliente(new Cliente("Isabel Rios","JJJ333JJJ444", new Roupas("P", "Preto", "Prada")));
	Interface.cadastrarCliente(new Cliente("Elizabeth Souza", "GGG666JJJ777", new Roupas("G", "Rosa", "Nike")));
			
	assertEquals(Interface.getClientes().size(), 2);
				
	Cliente clienteEncontrado = Interface.buscarClientePorCodigoDeProtocolo("GGG666JJJ777");
				
	assertEquals(clienteEncontrado.getRoup().getCor(), "Rosa");
				
	List<Cliente> clientesEncontrados = Interface.buscarClientePorRoupas(new Roupas("P", "Preto", "Prada"));
			
	assertEquals(clientesEncontrados.get(0).getRoup().getMarca(), "Prada");
	
 }

}



