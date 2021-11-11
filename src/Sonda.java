
public class Sonda {
	//Atributos
	int coordenada_x;
	int coordenada_y;
	int xInicial;
    int yInicial;
	char direcao;
	char movimentacoes;
	int xacumulador = 0;
	int yacumulador = 0;
	
	//métodos Get para "pegar" os atributos da classe caso haja necessidade
	//métodos Set para alterar os atributos da classe caso haja necessidade
	
	public int getCoordenada_x() {
		return coordenada_x;
	}
	public void setcoordenada_x(int coordenada_x) {
		this.coordenada_x = coordenada_x;
	}
	public int getCoordenada_y() {
		return coordenada_y;
	}
	public void setcoordenada_y(int coordenada_y) {
		this.coordenada_y = coordenada_y;
	}
	public int getxInicial() {	
		return xInicial;
	}
	public void setxInicial(int xInicial) {
		this.xInicial = xInicial;
	}
	public int getyInicial() {
		return yInicial;
	}
	public void setyInicial(int yInicial) {
		this.yInicial = yInicial;
	}
	public char getdirecao() {
		return direcao;
	}
	public void setDirecao(char direcao) {
		this.direcao = direcao;
	}
	
	//método onde vai ocorrer a movimentação da Sonda
	public void mover(String movimentacoes) {
		char ch;

		   //Conversão do array de movimetação para char
		   for (int i=0; i<movimentacoes.length(); i++) {
			   ch = movimentacoes.charAt(i);
			   
			   //condição para as movimentações dentro do campo
			   if(ch == 'L'){
                   if(direcao == 'N')
                       direcao = 'W';
                   else if (direcao == 'W')
                       direcao = 'S';
                   else if(direcao == 'S')
                       direcao = 'E';
                   else //if(direcao == 'E')
                       direcao = 'N';
               } else if(ch == 'R'){
                   if(direcao == 'N')
                       direcao = 'E';
                   else if(direcao == 'E')
                       direcao = 'S';
                   else if(direcao == 'S')
                       direcao = 'W';
                   else //if(direcao == 'W')
                       direcao = 'N';
               } else if(ch == 'M'){
                   if(direcao == 'N' && yInicial+1 <= coordenada_y) {
                	   yacumulador = 	yInicial += 1;
                   }
                   else if(direcao == 'W' && xInicial-1 <= coordenada_x) {
                	   xacumulador =  xInicial -= 1;
                    
                   }
                   else if(direcao == 'S' && yInicial-1 <= coordenada_y) {
                	   yacumulador = yInicial -= 1;
                    
                   }
                   else if(direcao == 'E' && xInicial+1 <= coordenada_x)
                	   xacumulador = xInicial += 1;
               }
		   }	
	}
}
	
    
    
    
    
    
    
    
    
	


  