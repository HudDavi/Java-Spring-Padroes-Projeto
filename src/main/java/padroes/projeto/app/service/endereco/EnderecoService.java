package padroes.projeto.app.service.endereco;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import padroes.projeto.app.model.endereco.EnderecoModelGet;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface EnderecoService{
	@GetMapping("/{cep}/json/")
	EnderecoModelGet consultarCep(@PathVariable String cep);
}