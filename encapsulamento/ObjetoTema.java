package encapsulamento;

public class ObjetoTema {
    public static void main(String[] args) {

        Tema tema1 = new Tema();

        tema1.setNome("Batman");
        tema1.setId(3315);
        tema1.setValorAluguel(950);
        tema1.setCorToalha("Preta");

        System.out.println("O tema é " +tema1.getNome());
        System.out.println("O id é " +tema1.getId());
        System.out.println("O valor do aluguel é R$" +tema1.getValorAluguel());
        System.out.println("E a cor ta toalha é " +tema1.getCorToalha());
    }
}
