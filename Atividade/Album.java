import java.util.ArrayList;

public class Album{
   private String nome_album;
   private int ano_lancamento;
   private ArrayList<Musica> musicas = new ArrayList<Musica>();

   public Album(String nome_album, int ano_lancamento, Musica musica){
      this.nome_album = nome_album;
      this.ano_lancamento = ano_lancamento;
      this.musicas.add(musica);
   }
}