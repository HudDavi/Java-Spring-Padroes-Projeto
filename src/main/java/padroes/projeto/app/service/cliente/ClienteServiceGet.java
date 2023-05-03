package padroes.projeto.app.service.cliente;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import padroes.projeto.app.model.cliente.ClienteModel;
import padroes.projeto.app.model.cliente.ClienteModelGet;
import padroes.projeto.app.model.endereco.EnderecoModel;
import padroes.projeto.app.model.endereco.EnderecoModelGet;
import padroes.projeto.app.service.cliente.ClienteServiceGet;
import padroes.projeto.app.service.endereco.EnderecoService;

@Service
public class ClienteServiceGet implements ClienteService{

	@Autowired
	private ClienteModel clienteModel;
	@Autowired
	private EnderecoModel enderecoModel;
	@Autowired
	private EnderecoService enderecoService;

	@Override
	public Iterable<ClienteModelGet> buscarTodos() {
		return clienteModel.findAll();
	}

	@Override
	public ClienteModelGet buscarPorId(Long id) {
		Optional<ClienteModelGet> cliente = clienteModel.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(ClienteModelGet cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, ClienteModelGet cliente) {
		Optional<ClienteModelGet> clienteBd = clienteModel.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteModel.deleteById(id);
	}

	private void salvarClienteComCep(ClienteModelGet cliente) {
		String cep = cliente.getEndereco().getCep();
		EnderecoModelGet endereco = enderecoModel.findById(cep).orElseGet(() -> {
			EnderecoModelGet novoEndereco = enderecoService.consultarCep(cep);
			enderecoModel.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteModel.save(cliente);
	}

}