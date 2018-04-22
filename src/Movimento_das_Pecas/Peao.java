package Movimento_das_Pecas;

import Interfaces.Tabuleiro;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PabloCass
 */
public class Peao extends Tabuleiro{
    
    
    //Variaveis para armazenar a possibilidade das jogas dos peões
    String PossoMoverPeaoBranco1 = "";
    String PossoMoverPeaoBranco2 = "";
    String PossoMoverPeaoNegro1 = "";
    String PossoMoverPeaoNegro2 = "";
    
    //Variaveis para armazenar a possibilidade de En Passant
    String EnPassant1 = "";
    String EnPassant2 = "";
    
    //Método acionado ao clicar no peão
    public void clickDoPeao(JLabel peca, JLabel opcao, String quemSouEU, JLabel opcao1, int[] posicaoDasPecasY, int[] posicaoDasPecasX,
            String enPassantDisponivel, JLabel pecaAserRemvovida, JLabel opcaoEnPassant_Esquerda, JLabel opcaoEnPassant_Direita){
        
        
        verificarOpcoes(quemSouEU, peca, posicaoDasPecasY, posicaoDasPecasX, enPassantDisponivel, pecaAserRemvovida, 
                opcaoEnPassant_Esquerda, opcaoEnPassant_Direita);
        
        
        if(PossoMoverPeaoBranco1.equals("Posso mover")){
           
            opcao.setLocation(peca.getX(), peca.getY()-75);
            opcao.setVisible(true);
           
        }
        if(PossoMoverPeaoBranco2.equals("Posso mover")){
            
            opcao1.setLocation(peca.getX(), peca.getY()-150);
            opcao1.setVisible(true);
        }
        if(PossoMoverPeaoNegro1.equals("Posso mover")){
           
            opcao.setLocation(peca.getX(), peca.getY()+75);
            opcao.setVisible(true);
        }
        if(PossoMoverPeaoNegro2.equals("Posso mover")){
            
            opcao1.setLocation(peca.getX(), peca.getY()+150);
            opcao1.setVisible(true);
        }
        
    }

    //Método que verifica a possibilidade de jogada do peão através das posições nos Arrays
    public void verificarOpcoes(String quemSouEU, JLabel peca, int[] posicaoDasPecasY, int[] posicaoDasPecasX, 
            String enPassantDisponivel, JLabel pecaAserRemovida, JLabel opcaoEnPassant_Esquerda, JLabel opcaoEnPassant_Direita) {
        
        removerEDeixarFalso();
        if(quemSouEU.equals("Peão Branco")){
            
            for(int i = 0; i<posicaoDasPecasY.length; i++){
                
                if(posicaoDasPecasY[i] == peca.getY()-75 
                        && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossoMoverPeaoBranco1 = "Não posso mover";
                    break;
                }else{
                    
                    PossoMoverPeaoBranco1 = "Posso mover";
          
                }
                
                if(peca.getY() == 475 && posicaoDasPecasY[i] == peca.getY()-150
                        && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossoMoverPeaoBranco2 = "Não posso mover";
                    break;
                }else if(peca.getY() == 475){
                    PossoMoverPeaoBranco2 = "Posso mover";
                }
              //JOptionPane.showMessageDialog(null, i+" "+posicaoDasPecasY[i]+" "+peca.getY());
            }
            
            //Verifica se é possível En Passant
            try{
                if(pecaAserRemovida.getX()+75 == peca.getX() && enPassantDisponivel.equals("Sim")
                        && pecaAserRemovida.getY() == peca.getY()){
                
                    opcaoEnPassant_Esquerda.setLocation(pecaAserRemovida.getX(), peca.getY()-75);
                    opcaoEnPassant_Esquerda.setVisible(true);
                    
                }
                
                if(pecaAserRemovida.getX()-75 == peca.getX() && enPassantDisponivel.equals("Sim")
                        && pecaAserRemovida.getY() == peca.getY()){
                
                    opcaoEnPassant_Direita.setLocation(pecaAserRemovida.getX(), peca.getY()-75);
                    opcaoEnPassant_Direita.setVisible(true);
                    
                }
            }catch(Exception e){
                
            }
            //JOptionPane.showMessageDialog(null, peca.getX()+" "+peca.getY());
            //JOptionPane.showMessageDialog(null, posicaoDasPecasX[24]+" "+posicaoDasPecasY[24]);
        }
        
        if(quemSouEU.equals("Peão Negro")){
            
            for(int i = 0; i<posicaoDasPecasY.length; i++){
                
                if(posicaoDasPecasY[i] == peca.getY()+75 
                        && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossoMoverPeaoNegro1 = "Não posso mover";
                    break;
                }else{
                    PossoMoverPeaoNegro1 = "Posso mover";
                }
                
                if(peca.getY() == 100 && posicaoDasPecasY[i] == peca.getY()+150
                        && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossoMoverPeaoNegro2 = "Não posso mover";
                    break;
                }else if(peca.getY() == 100){
                    PossoMoverPeaoNegro2 = "Posso mover";
                }
                
            }
            
            //Verificar se é possível En Passant
            try{
                if(pecaAserRemovida.getX()+75 == peca.getX() && enPassantDisponivel.equals("Sim")
                        && pecaAserRemovida.getY() == peca.getY()){
                
                    opcaoEnPassant_Esquerda.setLocation(pecaAserRemovida.getX(), peca.getY()+75);
                    opcaoEnPassant_Esquerda.setVisible(true);
                    
                }
                
                if(pecaAserRemovida.getX()-75 == peca.getX() && enPassantDisponivel.equals("Sim")
                        && pecaAserRemovida.getY() == peca.getY()){
                
                    opcaoEnPassant_Direita.setLocation(pecaAserRemovida.getX(), peca.getY()+75);
                    opcaoEnPassant_Direita.setVisible(true);
                    
                }
            }catch(Exception e){
                
            }
            
        }
        
    }
   
    
}
