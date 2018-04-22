/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimento_das_Pecas;
import Interfaces.Tabuleiro;
import javax.swing.JLabel;
/**
 *
 * @author PabloCass
 */
public class Rei extends Tabuleiro{
    
    String[] PossibilidadeDeMover = new String[10];
    
    public void clickDoRei(JLabel peca, String quemSouEU, int[] posicaoDasPecasY, int[] posicaoDasPecasX,
            JLabel opcao, JLabel opcao1, JLabel opcao2, JLabel opcao3, JLabel opcao4, JLabel opcao5, JLabel opcao6,
            JLabel opcao7, JLabel opcao57, JLabel opcao58, String reiMexeu, String torreBranca1Mexeu, String torreBranca2Mexeu,
            String torreNegra1Mexeu, String torreNegra2Mexeu){
            
            for(int i = 0; i<10; i++){
                PossibilidadeDeMover[i] = "Não posso mover";
            }
            
            verificarOpcoes(quemSouEU, peca, posicaoDasPecasY, posicaoDasPecasX, 
                    reiMexeu, torreBranca1Mexeu, torreBranca2Mexeu,
            torreNegra1Mexeu, torreNegra2Mexeu);
            
            //aparecer opção para cima
            if(PossibilidadeDeMover[0].equals("Posso mover") && peca.getY()-75 >= 25){
            
            opcao.setLocation(peca.getX(), peca.getY()-75);
            opcao.setVisible(true);
            }
            
            //aparecer opção para baixo
            if(PossibilidadeDeMover[1].equals("Posso mover") && peca.getY()+75 <= 550){
            
            opcao1.setLocation(peca.getX(), peca.getY()+75);
            opcao1.setVisible(true);
            }
            
            //aparecer opção para direita
            if(PossibilidadeDeMover[2].equals("Posso mover") && peca.getX()+75 <= 555){
            
            opcao2.setLocation(peca.getX()+75, peca.getY());
            opcao2.setVisible(true);
            }
            //opção de roque pequeno e grande
            if(quemSouEU.equals("Rei Branco") || quemSouEU.equals("Rei Negro")){
                if(PossibilidadeDeMover[8].equals("Posso mover") && reiMexeu.equals("Não") && torreBranca1Mexeu.equals("Não")){
            
                    opcao57.setLocation(peca.getX()+150, peca.getY());
                    opcao57.setVisible(true);
                }
                if(PossibilidadeDeMover[9].equals("Posso mover") && reiMexeu.equals("Não") && torreBranca2Mexeu.equals("Não")){
            
                    opcao58.setLocation(peca.getX()-150, peca.getY());
                    opcao58.setVisible(true);
                }
            }
            //aparecer opção para esquerda
            if(PossibilidadeDeMover[3].equals("Posso mover") && peca.getX()-75 >= 30){
            
            opcao3.setLocation(peca.getX()-75, peca.getY());
            opcao3.setVisible(true);
            }
            
            //Diagonal Direita-cima
            if(PossibilidadeDeMover[4].equals("Posso mover") && peca.getX()+75 <= 555 && peca.getY()-75 >=25){
            
            opcao4.setLocation(peca.getX()+75, peca.getY()-75);
            opcao4.setVisible(true);
            }
            
            //Diagonal Esquerda-Cima
            if(PossibilidadeDeMover[5].equals("Posso mover") && peca.getX()-75 >= 30 && peca.getY()-75 >=25){
            
            opcao5.setLocation(peca.getX()-75, peca.getY()-75);
            opcao5.setVisible(true);
            }
            
            //Diagonal Direita-Baixo
            if(PossibilidadeDeMover[6].equals("Posso mover") && peca.getX()+75 <= 555 && peca.getY()+75 <=550){
            opcao6.setLocation(peca.getX()+75, peca.getY()+75);
            opcao6.setVisible(true);
            }
            
            //Diagonal Esquerda-Baixo
            if(PossibilidadeDeMover[7].equals("Posso mover") && peca.getX()-75 >= 30 && peca.getY()+75 <=550){
            
            opcao7.setLocation(peca.getX()-75, peca.getY()+75);
            opcao7.setVisible(true);
            }
            
    }
    
    public void verificarOpcoes(String quemSouEU, JLabel peca, int[] posicaoDasPecasY, int[] posicaoDasPecasX, 
            String reiMexeu, String torreBranca1Mexeu, String torreBranca2Mexeu,
            String torreNegra1Mexeu, String torreNegra2Mexeu) {
        
        removerEDeixarFalso();
     
        //opção para cima
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i] == peca.getX() && posicaoDasPecasY[i]+75 == peca.getY()){
                    
                PossibilidadeDeMover[0] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[0] = "Posso mover";
                }
                
            }
            
            //opção para baixo
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i] == peca.getX() && posicaoDasPecasY[i]-75 == peca.getY()){
                    PossibilidadeDeMover[1] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[1] = "Posso mover";
                }
                
            }
            
            //opção para Direita
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == peca.getX() && posicaoDasPecasY[i] == peca.getY()){
                    PossibilidadeDeMover[2] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[2] = "Posso mover";
                }
                
            }
            
            //Opçao de roque pequeno
            if(PossibilidadeDeMover[2].equals("Posso mover")){
                
                for(int i = 0; i<32; i++){
                
                //Opção de roque grande
                    if(posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i] == peca.getY()){
                    
                        PossibilidadeDeMover[8] = "Não posso mover";
                        break;
                    
                    }else{
                        PossibilidadeDeMover[8] = "Posso mover";
                    }
                
                }
            }
            
            //opção para Esquerda
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == peca.getX() && posicaoDasPecasY[i] == peca.getY()){
                    PossibilidadeDeMover[3] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[3] = "Posso mover";
                }
                
            }
            
            if(PossibilidadeDeMover[3].equals("Posso mover")){
                
                for(int i = 0; i<32; i++){
                
                //Opção de roque grande
                    if(posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i] == peca.getY()){
                    
                        PossibilidadeDeMover[9] = "Não posso mover";
                        break;
                    
                    }else{
                        PossibilidadeDeMover[9] = "Posso mover";
                    }
                
                }
            }
            
            //Opção Diagonal-Direita-Cima
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == peca.getX() && posicaoDasPecasY[i]+75 == peca.getY()
                        || (i == 4 && posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i]+150 == peca.getY())
                        || (i == 20 && posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i]+150 == peca.getY())){
                    PossibilidadeDeMover[4] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[4] = "Posso mover";
                }
                
            }
            
            //Opção Diagonal-Esquerda-Cima
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == peca.getX() && posicaoDasPecasY[i]+75 == peca.getY()
                        || (i == 4 && posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i]+150 == peca.getY())
                        || (i == 20 && posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i]+150 == peca.getY())){
                    PossibilidadeDeMover[5] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[5] = "Posso mover";
                }
                
            }
            
            //Opção Diagonal-Direita-Baixo
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == peca.getX() && posicaoDasPecasY[i]-75 == peca.getY()
                        || (i == 4 && posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i]-150 == peca.getY())
                        || (i == 20 && posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i]-150 == peca.getY())){
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[6] = "Posso mover";
                }
                
            }
            
            //Opção Diagonal-Esquerda-Baixo
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == peca.getX() && posicaoDasPecasY[i]-75 == peca.getY()
                        || (i == 4 && posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i]-150 == peca.getY())
                        || (i == 20 && posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i]-150 == peca.getY())){
                    PossibilidadeDeMover[7] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[7] = "Posso mover";
                }
                
            }
            
            //OPOSIÇÃO DOS REIS - Não pode haver opção caso o rei esteja a oposição de outro rei
            
            //Lado direito parte de cima-DIAGONAL
            if((posicaoDasPecasX[4]-75 == peca.getX() && posicaoDasPecasY[4]+150 == peca.getY())
                    || (posicaoDasPecasX[20]-75 == peca.getX() && posicaoDasPecasY[20]+150 == peca.getY())){
                
                PossibilidadeDeMover[0] = "Não posso mover";
                PossibilidadeDeMover[4] = "Não posso mover";
            }
            if((posicaoDasPecasX[4]-150 == peca.getX() && posicaoDasPecasY[4]+75 == peca.getY())
                    || (posicaoDasPecasX[20]-150 == peca.getX() && posicaoDasPecasY[20]+75 == peca.getY())){
                
                PossibilidadeDeMover[4] = "Não posso mover";
                PossibilidadeDeMover[2] = "Não posso mover";
            }
            
            //Lado Esquerdo parte de cima-DIAGONAL
            if((posicaoDasPecasX[4]+75 == peca.getX() && posicaoDasPecasY[4]+150 == peca.getY())
                    || (posicaoDasPecasX[20]+75 == peca.getX() && posicaoDasPecasY[20]+150 == peca.getY())){
                
                PossibilidadeDeMover[0] = "Não posso mover";
                PossibilidadeDeMover[5] = "Não posso mover";
            }
            if((posicaoDasPecasX[4]+150 == peca.getX() && posicaoDasPecasY[4]+75 == peca.getY())
                    || (posicaoDasPecasX[20]+150 == peca.getX() && posicaoDasPecasY[20]+75 == peca.getY())){
                
                PossibilidadeDeMover[5] = "Não posso mover";
                PossibilidadeDeMover[3] = "Não posso mover";
            }
            
            //Lado direito parte de baixo-DIAGONAL
            if((posicaoDasPecasX[4]-75 == peca.getX() && posicaoDasPecasY[4]-150 == peca.getY())
                    || (posicaoDasPecasX[20]-75 == peca.getX() && posicaoDasPecasY[20]-150 == peca.getY())){
                
                PossibilidadeDeMover[6] = "Não posso mover";
                PossibilidadeDeMover[1] = "Não posso mover";
            }
            if((posicaoDasPecasX[4]-150 == peca.getX() && posicaoDasPecasY[4]-75 == peca.getY())
                    || (posicaoDasPecasX[20]-150 == peca.getX() && posicaoDasPecasY[20]-75 == peca.getY())){
                
                PossibilidadeDeMover[2] = "Não posso mover";
                PossibilidadeDeMover[6] = "Não posso mover";
            }
            
            //Lado Esquerdo parte de baixo-DIAGONAL
            if((posicaoDasPecasX[4]+75 == peca.getX() && posicaoDasPecasY[4]-150 == peca.getY())
                    || (posicaoDasPecasX[20]+75 == peca.getX() && posicaoDasPecasY[20]-150 == peca.getY())){
                
                PossibilidadeDeMover[1] = "Não posso mover";
                PossibilidadeDeMover[7] = "Não posso mover";
            }
            if((posicaoDasPecasX[4]+150 == peca.getX() && posicaoDasPecasY[4]-75 == peca.getY())
                    || (posicaoDasPecasX[20]+150 == peca.getX() && posicaoDasPecasY[20]-75 == peca.getY())){
                
                PossibilidadeDeMover[7] = "Não posso mover";
                PossibilidadeDeMover[3] = "Não posso mover";
            }
            
            //Para cima-Vertical
            if((posicaoDasPecasX[4] == peca.getX() && posicaoDasPecasY[4]+150 == peca.getY())
                        || (posicaoDasPecasX[20] == peca.getX() && posicaoDasPecasY[20]+150 == peca.getY())){
                
                PossibilidadeDeMover[0] = "Não posso mover";
                PossibilidadeDeMover[4] = "Não posso mover";
                PossibilidadeDeMover[5] = "Não posso mover";
                
            }
            //Para baixo-Vertical
            if((posicaoDasPecasX[4] == peca.getX() && posicaoDasPecasY[4]-150 == peca.getY())
                        || (posicaoDasPecasX[20] == peca.getX() && posicaoDasPecasY[20]-150 == peca.getY())){
                
                PossibilidadeDeMover[1] = "Não posso mover";
                PossibilidadeDeMover[6] = "Não posso mover";
                PossibilidadeDeMover[7] = "Não posso mover";
                
            }
            //Para Direita-Vertical
            if((posicaoDasPecasX[4]-150 == peca.getX() && posicaoDasPecasY[4] == peca.getY())
                        || (posicaoDasPecasX[20]-150 == peca.getX() && posicaoDasPecasY[20] == peca.getY())){
                
                PossibilidadeDeMover[4] = "Não posso mover";
                PossibilidadeDeMover[2] = "Não posso mover";
                PossibilidadeDeMover[6] = "Não posso mover";
                
            }
            //Para Esquerda-Vertical
            if((posicaoDasPecasX[4]+150 == peca.getX() && posicaoDasPecasY[4] == peca.getY())
                        || (posicaoDasPecasX[20]+150 == peca.getX() && posicaoDasPecasY[20] == peca.getY())){
                
                PossibilidadeDeMover[5] = "Não posso mover";
                PossibilidadeDeMover[3] = "Não posso mover";
                PossibilidadeDeMover[7] = "Não posso mover";
                
            }
    }
}
