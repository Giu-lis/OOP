import java.util.Scanner;
public class ObjetoAnimal {
    public static void main (String[] args ) {
        Scanner ler = new Scanner(System.in);
        Animal an1 = new Animal();
        Animal an2 = new Animal();


        System.out.println("Qual o nome do animal: ");
        String nome = ler.nextLine();
        System.out.println("Insira a espécie: ");
        String especie = ler.nextLine();
        System.out.println("Insira a idade: ");
        int idade = ler.nextInt();
        ler.nextLine();
        System.out.println("Insira o peso: ");
        double peso = ler.nextDouble();


        ler.nextLine();


        System.out.println("Qual o nome do animal: ");
        String nome1 = ler.nextLine();
        System.out.println("Insira a espécie: ");
        String especie1 = ler.nextLine();
        System.out.println("Insira a idade: ");
        int idadee = ler.nextInt();
        System.out.println("Insira o peso: ");
        double peso1 = ler.nextDouble();


        an1.setNome(nome);
        an1.setEspecie(especie);
        an1.setIdade(idade);
        an1.setPeso(peso);


        an2.setNome(nome1);
        an2.setEspecie(especie1);
        an2.setIdade(idadee);
        an2.setPeso(peso1);


        System.out.println("---ANIMAL 1---");
        System.out.println(an1.getNome());
        System.out.println(an1.getEspecie());
        System.out.println(an1.getIdade());
        System.out.println(an1.getPeso());


        System.out.println("---ANIMAL 2---");
        System.out.println(an2.getNome());
        System.out.println(an2.getEspecie());
        System.out.println(an2.getIdade());
        System.out.println(an2.getPeso());


    }
}
