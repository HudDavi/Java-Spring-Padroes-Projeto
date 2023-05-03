package padroes.projeto.app.service.cliente;

import padroes.projeto.app.model.cliente.ClienteModelGet;

public interface ClienteService{

	Iterable<ClienteModelGet> buscarTodos();

	ClienteModelGet buscarPorId(Long id);

	void inserir(ClienteModelGet cliente);

	void atualizar(Long id, ClienteModelGet cliente);

	void deletar(Long id);

}