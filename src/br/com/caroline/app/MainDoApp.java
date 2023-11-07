package br.com.caroline.app;


import br.com.caroline.composicao.Endereco;
import br.com.caroline.pessoas.Cliente;
import br.com.caroline.pessoas.Funcionario;
import br.com.caroline.pessoas.Pessoa;

public class MainDoApp {

	public static void main(String[] args) {
		// criando um endereço
		Endereco endereco1 = new Endereco();
		endereco1.cadastrarEnd("Rua Antônio da Rocha", "111", "11111111", "João Pessoa", "Paraíba", "Brasil");

		// criando um funcionário
		Funcionario funcionario1 = new Funcionario();
		funcionario1.cadastrarFuncionario(01, "Bibliotecário", 3000.0,"01/07/2022","Marcos","16/08/1980", endereco1, "128974411" );
		System.out.println("Nome do Funcionário: " + funcionario1.getNome());
		System.out.println("Data Admissão do Funcionário: " + funcionario1.getDataAdmissao());
		System.out.println("CEP do Funcionário: " + funcionario1.getEndereco().getCep());


		// criando um cliente
		Cliente cliente1 = new Cliente();
		cliente1.cadastrarCliente("02", "Engenheira", "Joana", "17/03/1997", endereco1, "77845653212"  );
		System.out.println("Nome do Cliente: " + cliente1.getNome());
		System.out.println("Profissão do Cliente: " + cliente1.getProfissao());
		System.out.println("CEP do Cliente: " + cliente1.getEndereco().getCep());
	}

}
