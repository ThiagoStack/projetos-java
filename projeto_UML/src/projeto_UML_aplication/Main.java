package projeto_UML_aplication;

import projeto_UML_entities.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		
		 // Testando as funcionalidades
		
       iphone.atender();
       iphone.ligar("123456789");
       iphone.correioDeVoz();
       
       iphone.tocar();
       iphone.pausar();
       iphone.selecionarMusica("musica2");
       
       
       iphone.exibirPagina("www.dio.me");
       iphone.adicionarNovaAba();
       iphone.atualizarPagina();

      
			
			

	
}
}