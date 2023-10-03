
public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String nomeEditora;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	
	@Override
	public String toString() {
		return "Livro: " + getTitulo() + "\nAutor: " + getAutor() +
		   "\nEditora: " + getNomeEditora() + "\nData: " + getAnoPublicacao();
	}
}
