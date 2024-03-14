public class Musica {
   private String nome_musica;
   private String artista;
   private int duracao;

   public Musica(String nome_musica, String artista, int duracao){
      this.nome_musica = nome_musica;
      this.artista = artista;
      this.duracao = duracao;
   }

   public void mostrarMusica(){
      System.out.println("Musica: "+this.nome_musica);
      System.out.println("Artista: "+this.artista);
      System.out.println("Duração: "+this.duracao);
   }
}
