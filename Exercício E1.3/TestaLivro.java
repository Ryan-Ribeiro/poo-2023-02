
public class TestaLivro {
	public static void main(String[] args) {
		Livro best1 = new Livro();
		best1.setTitulo("Iron Flame (The Empyrean, 2)");
		best1.setAutor("Rebecca Yarros");
		best1.setNomeEditora("Entangled: Red Tower Books");
		best1.setAnoPublicacao(2023);
		
		Livro best2 = new Livro();
		best2.setTitulo("Going Infinite: The Rise and Fall of a New Tycoon");
		best2.setAutor("Michael Lewis");
		best2.setNomeEditora("W. W. Norton & Company");
		best2.setAnoPublicacao(2023);
		
		Livro best3 = new Livro();
		best3.setTitulo("8 Little Planets: A Solar System Book for Kids with Unique Planet Cutouts");
		best3.setAutor("Chris Ferrie");
		best3.setNomeEditora("Sourcebooks Explore");
		best3.setAnoPublicacao(2018);
		
		System.out.println(best1.toString() + "\n");
		System.out.println(best2.toString() + "\n");
		System.out.println(best3.toString() + "\n");
	}
}
