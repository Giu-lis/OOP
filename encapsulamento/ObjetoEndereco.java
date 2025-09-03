package encapsulamento;

public class ObjetoEndereco {
    public static void main(String[] args) {

        Endereco endereco = new Endereco(01, "Rua Prof. Jurandir", 23, "não há", "Jardim das margaritas", "Sorocaba", "1277823", "São Paulo");

        System.out.println("O id é " +endereco.getId());
        System.out.println("Rua: " +endereco.getLogradouro());
        System.out.println("Número: " +endereco.getNumero());
        System.out.println("Complemento: " +endereco.getComplemento());
        System.out.println("Bairro: " +endereco.getBairro());
        System.out.println("Cidade: " +endereco.getCidade());
        System.out.println("Cep: " +endereco.getCep());
        System.out.println("Estado: " +endereco.getUf());
    }
}
