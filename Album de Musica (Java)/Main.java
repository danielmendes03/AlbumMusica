import java.util.Scanner;

class Main {
   public static void main(String[] args){

      Scanner input = new Scanner(System.in);

      System.out.print("Nome do artista: ");
      String nome = input.nextLine();
      System.out.print("Idade do artista: ");
      int idade = input.nextInt();

      Pessoa pessoa = new Pessoa(nome, idade);
      Album album = new Album("Rap", 1994, "Podium", pessoa);
      Musica musica1 = new Musica("Celebrando a Vida", 260);
      Musica musica2 = new Musica("Keep Going", 520);
      
      album.adicionar_musica(musica1);
      album.adicionar_musica(musica2);

      album.mostrar_musicas();
   }   
}
