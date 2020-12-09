package Facade;

public class Cliente {

	public static void main(String[] args) {
		
		System.out.println("##### Configurando subsistemas #####");
		SistemaFacade fachada = new SistemaFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.renderizarImagem("imagem.png");
		fachada.reproduzirAudio("teste.mp3");
		fachada.lerInput();

	}

}
