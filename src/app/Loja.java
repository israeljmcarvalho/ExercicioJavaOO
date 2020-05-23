package app;
import javax.swing.JOptionPane;

public class Loja {

	
	public static void main(String[] args) {
		int numCompra = 0;
		double somatotalCompra = 0.0;
		int compraMais = 0;
		CD[] listaCompras = new CD[100];

		do {
			if (numCompra > 99){
				System.out.println("Carrinho cheio, finalize antes de continuar comprando");
				System.out.println("\n Valor total da compra R$" + somatotalCompra + " reais.");
				return;
			}

			String cDNome = JOptionPane.showInputDialog("Digite o nome do CD:");
			String cDPreco = JOptionPane.showInputDialog("Digite o Preço:").replace(",", ".");
			String cDArtista = JOptionPane.showInputDialog("Digite o Artista:");
			String quantidadeComprado = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
			
			listaCompras[numCompra] = new CD(cDNome, Double.parseDouble(cDPreco), cDArtista);
			
			double valCompra = listaCompras[numCompra].calculaVendaCD(Double.parseDouble(quantidadeComprado));
			somatotalCompra = somatotalCompra + valCompra;
	
			System.out.println(listaCompras[numCompra].imprimirDados());
			System.out.println("Quantidade compradas desse CD: " + Integer.parseInt(quantidadeComprado));
			System.out.println("Total parcial R$" + valCompra + "reais.\n--------------");

			numCompra = numCompra + 1;

			compraMais = JOptionPane.showConfirmDialog(
			null,
            "Deseja comprar mais um CD?",
            "Pergunta",
            JOptionPane.YES_NO_OPTION);
			} while (compraMais == 0);

			System.out.println("\n Valor total da compra R$" + somatotalCompra + " reais.");
	}
}