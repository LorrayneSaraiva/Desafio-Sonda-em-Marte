import java.util.Scanner; //biblioteca para usar a classe Scanner

public class Main {
	
	
	public static void main(String[] args) {
		
		//instancia do objeto sonda para a classe Sonda
		Sonda sonda = new Sonda(); 
		
		//instancia do objeto input para a classe Scanner
		Scanner input = new Scanner(System.in);
		
		//declarando a vari�vel que ir� "encontrar" a posi��o 4 da String strPosicaoInicial
		int posicaoIniDirecao = 4;

		
		//Coordenadas
		System.out.println("Informe a dimens�o do planalto que a sonda ir� pousar - Exemplo: 5 5");
		//Entrada de dados da String de coordenada
		String strCampo = input.nextLine();
		
		//Convers�o das dimens�es do campo(String) para array
		String[] arrCampo = strCampo.split(" ");
		
		//Converte as dimens�es x e y do campo para Inteiros
		int coordenada_x = Integer.parseInt(arrCampo[0]);
		int coordenada_y = Integer.parseInt(arrCampo[1]);
		
		//Inst�ncia dos objetos relacionados a dimens�o para o m�todo set do objeto correspondente 
		sonda.setcoordenada_x(coordenada_x);
		sonda.setcoordenada_y(coordenada_y);
			
		//Posicao Inicial
		System.out.println("Informe as coordenadas da Sonda, sendo X, Y e N(norte),S(sul), E(East/Leste) ou W(Weste/Oeste) - Exemplo: 1 2 N");
		
		//La�o de repeti��o para corrigir a entrada de dados caso esteja incorreta
		boolean pontoscorretos = false;
		while (pontoscorretos != true) {
             //Entrada da String da Posi��o Inicial da Sonda
			 String strPosicaoInicial = input.nextLine();
			 //Convers�o da Posi��o Inicial da Sonda (String) para Array
			 String[] arrPosicaoInicial = strPosicaoInicial.split(" ");
			 
			 //Convers�o das posi��es iniciais para Inteiro
			 int xInicial = Integer.parseInt(arrPosicaoInicial[0]);
			 int yInicial = Integer.parseInt(arrPosicaoInicial[1]);
			 char direcao = strPosicaoInicial.charAt(posicaoIniDirecao);
			 
			 //Inst�ncia dos objetos relacionados a posi��o inicial para o m�todo set do objeto correspondente
			 sonda.setDirecao(direcao);
			 sonda.setxInicial(xInicial);
			 sonda.setyInicial(yInicial);
			 
			 //estruturas de sele��o para corrigir poss�veis erros na entrada de dados
			 if ((xInicial > coordenada_x) || (yInicial > coordenada_y) || (xInicial > coordenada_x && yInicial > coordenada_y ) ) {
				  System.out.println("A coordenadas est�o fora do limite do campo ou a dire��o est� incorreta! Digite novamente...");
				  pontoscorretos = false;
			    } 
			 
			 else if ((direcao != 'N') && (direcao != 'S') && (direcao != 'W') && (direcao != 'E')) {
			     System.out.println("A coordenadas est�o fora do limite do campo ou a dire��o est� incorreta! Digite novamente...");
			     pontoscorretos = false;
			     
			   }
			  else 
				  pontoscorretos = true;
		}
			
		//Instrucoes
		System.out.println("Fa�a os movimentos da Sonda - Exemplo: LMLMLMLMM");
		System.out.println("M - Mover");
		System.out.println("L - Left(esquerda");
		System.out.println("R - Right(direita)");
		
		//entrada da String de movimentos da Sonda
		String strInstrucoes = input.nextLine();
		
		sonda.mover(strInstrucoes);
		
		System.out.println("Coordenada atual da Sonda: " + sonda.xacumulador + "(X)" + sonda.yacumulador + "(Y)" + sonda.direcao);
		System.out.println();
		
		//Estrutura que tentei fazer antes da sa�da de dados, para que corrigisse os erros de entrada de dados mas que n�o consegui concluir
		
		//for (int i=0; i<strInstrucoes.length(); i++) {
			   //ch = strInstrucoes.charAt(i);
			   
	    //boolean movimentosCorretos = false;
		//while (movimentosCorretos != true)
				   
			   //if ((ch != 'R') && (ch != 'L') && (ch != 'M')) 
				   //System.out.println("Apenas as letras M (mover), L (Left) e R (Right) s�o permitidas! Digite novamente...");	   
			   //else 
				   //movimentosCorretos = true;
	    //}
		
		
	}
}
