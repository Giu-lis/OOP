package encapsulamento;

public class ObjetoItemTema {
    public static void main (String[] args) {

        ItemTema tema = new ItemTema();

        tema.setNome("Batman");
        tema.setId(3315);
        tema.setDescricao("toalha de fundo, bonecos de madeira e plástico do batman e robin e miniaturas do batman");

        System.out.println("O tema é " +tema.getNome());
        System.out.println("O id é " +tema.getId());
        System.out.println("Os itens que contém são " +tema.getDescricao());

    }
}
