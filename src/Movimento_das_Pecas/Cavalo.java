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
public class Cavalo extends Tabuleiro{
    
    String[] PossibilidadeDeMover = new String[8];
    
    public void clickDoCavalo(JLabel peca, String quemSouEU, int[] posicaoDasPecasY, int[] posicaoDasPecasX,
            JLabel opcao, JLabel opcao1, JLabel opcao2, JLabel opcao3, JLabel opcao4, JLabel opcao5, JLabel opcao6, 
            JLabel opcao7){
            
            for(int i = 0; i<8; i++){
                PossibilidadeDeMover[i] = "Não posso mover";
            }
            
            verificarOpcoes(quemSouEU, peca, posicaoDasPecasY, posicaoDasPecasX);
            
            //Direita para cima
            if(PossibilidadeDeMover[0].equals("Posso mover") && peca.getX()+75 <= 555){
            
            opcao.setLocation(peca.getX()+75, peca.getY()-150);
            opcao.setVisible(true);
            
            }
            
            if(PossibilidadeDeMover[1].equals("Posso mover") && peca.getX()+150 <= 555){
            
            opcao1.setLocation(peca.getX()+150, peca.getY()-75);
            opcao1.setVisible(true);
            
            }
            
            //Esquerda para cima
            if(PossibilidadeDeMover[2].equals("Posso mover") && peca.getX()-75 >= 30){
            
            opcao2.setLocation(peca.getX()-75, peca.getY()-150);
            opcao2.setVisible(true);
            
            }
            
            if(PossibilidadeDeMover[3].equals("Posso mover") && peca.getX()-150 >= 30){
            
            opcao3.setLocation(peca.getX()-150, peca.getY()-75);
            opcao3.setVisible(true);
            
            }
            
            //Direita para baixo
            if(PossibilidadeDeMover[4].equals("Posso mover") && peca.getX()+75 <= 555){
            
            opcao4.setLocation(peca.getX()+75, peca.getY()+150);
            opcao4.setVisible(true);
            
            }
            
            if(PossibilidadeDeMover[5].equals("Posso mover") && peca.getX()+150 <= 555){
            
            opcao5.setLocation(peca.getX()+150, peca.getY()+75);
            opcao5.setVisible(true);
            
            }
            
            //Esquerda para baixo
            if(PossibilidadeDeMover[6].equals("Posso mover") && peca.getX()-75 >= 30){
            
            opcao6.setLocation(peca.getX()-75, peca.getY()+150);
            opcao6.setVisible(true);
            
            }
            
            if(PossibilidadeDeMover[7].equals("Posso mover") && peca.getX()-150 >= 30){
            
            opcao7.setLocation(peca.getX()-150, peca.getY()+75);
            opcao7.setVisible(true);
            
            }
    }
    
    public void verificarOpcoes(String quemSouEU, JLabel peca, int[] posicaoDasPecasY, int[] posicaoDasPecasX) {
        
        removerEDeixarFalso();
     
        //Direita para cima
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == peca.getX() && posicaoDasPecasY[i]+150 == peca.getY()){
                    PossibilidadeDeMover[0] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[0] = "Posso mover";
                }
                
            }
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i]+75 == peca.getY()){
                    PossibilidadeDeMover[1] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[1] = "Posso mover";
                }
                
            }
        
        //Esquerda para cima    
        
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == peca.getX() && posicaoDasPecasY[i]+150 == peca.getY()){
                    PossibilidadeDeMover[2] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[2] = "Posso mover";
                }
                
            }
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i]+75 == peca.getY()){
                    PossibilidadeDeMover[3] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[3] = "Posso mover";
                }
                
            }
            
            //Direita para baixo
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == peca.getX() && posicaoDasPecasY[i]-150 == peca.getY()){
                    PossibilidadeDeMover[4] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[4] = "Posso mover";
                }
                
            }
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-150 == peca.getX() && posicaoDasPecasY[i]-75 == peca.getY()){
                    PossibilidadeDeMover[5] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[5] = "Posso mover";
                }
                
            }
        
            //Esquerda para baixo
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == peca.getX() && posicaoDasPecasY[i]-150 == peca.getY()){
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[6] = "Posso mover";
                }
                
            }
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+150 == peca.getX() && posicaoDasPecasY[i]-75 == peca.getY()){
                    PossibilidadeDeMover[7] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[7] = "Posso mover";
                }
                
            }
    }
    
}
