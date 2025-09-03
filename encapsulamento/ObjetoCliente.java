package encapsulamento;

public class ObjetoCliente {
    public static void main (String[] args) {

        Cliente cliente = new Cliente(01, "Renata", "(15) 99123-6171", "416.934.233-51", "41.342.778-5");

        System.out.println("ID: " +cliente.getId());
        System.out.println("Nome: " +cliente.getNome());
        System.out.println("Telefone: " +cliente.getTelefone());
        System.out.println("CPF: " +cliente.getCpf());
        System.out.println("RG: " +cliente.getRg());
    }
}
