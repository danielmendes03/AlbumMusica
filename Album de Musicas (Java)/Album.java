import java.util.ArrayList;

public class Album {
   private String genero;
   private int ano;
   private String nome;
   private Pessoa artista;
   private ArrayList <Musica> musicas = new ArrayList<Musica>();

   public Album(String genero, int ano, String nome, Pessoa artista){
      this.genero = genero;
      this.ano = ano;
      this.nome = nome;
      this.artista = artista;
   }

   public void adicionar_musica(Musica musica){
      this.musicas.add(musica);
   }

   public void mostrar_musicas(){
      System.out.println("\n~~~~~~~~~~ ALBUM ~~~~~~~~~~");
      System.out.println("Genero: "+this.genero);
      System.out.println("Ano: "+this.ano);
      System.out.println("Nome do Album: "+this.nome);
      System.out.println("Nome do artista: "+this.artista.getNome());
      System.out.println("Idade do artista: "+this.artista.getIdade());

      for (Musica musica : musicas){
         System.out.println("\n~~~~~~~~~~ MUSICA ~~~~~~~~~~");
         System.out.println("Título: "+musica.getTitulo());
         System.out.println("Duração: "+musica.getDuracao());
      }
      System.out.println();
   }
}
