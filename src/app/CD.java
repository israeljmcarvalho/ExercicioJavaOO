package app;

public class CD {
	private String artista;
	private String nome;
	private double preco;
	
	
	public CD(String nomeInformado, double precoInformado, String artistaInformado) {
		this.nome = nomeInformado; 
		this.preco = precoInformado; 
		this.artista = artistaInformado; 
	}
	
	public double calculaVendaCD(double quantidadeInformada) {
		double valVenda = (this.preco * quantidadeInformada); 
		return valVenda;
	}

	public String imprimirDados() {
		return "CD: " + this.nome + ".\nArtista " + this.artista + ".\nValor unitario: R$" + this.preco + " reais.";
	}

}