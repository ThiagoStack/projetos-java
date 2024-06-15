package projeto_UML_entities;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	// Metodos da Classe que implementa ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Tocando");

	}

	@Override
	public void pausar() {
		System.out.println("Pausado");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Musica \n");

	}

	// Metodos da Classe que implementa AparelhoTelefonico
	public void ligar(String numero) {
		System.out.println("Ligando");
	}

	@Override
	public void atender() {
		System.out.println("Atendido");

	}

	@Override
	public void correioDeVoz() {
		System.out.println("Enviando Audio\n");

	}

	// Metodos da Classe que implementa NavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Pagina");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando");

	}

}