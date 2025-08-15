package one.digitalinovation.lab_padroes_projeto_spring.services;

import org.springframework.stereotype.Service;

import one.digitalinovation.lab_padroes_projeto_spring.model.Cliente;
@Service
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
