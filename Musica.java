public class Musica {
   private String titulo;
   private int duracao;
   private Pessoa compositor;

   public Musica(String titulo, int duracao){
      this.titulo = titulo;
      this.duracao = duracao;
      this.compositor = new Pessoa();
   }

   public String getTitulo(){
      return this.titulo;
   }

   public int getDuracao(){
      return this.duracao;
   }

   public void tocar_musica(){
      System.out.println("Tocando a música " + this.titulo + " do compositor " + this.compositor);
   }
}
