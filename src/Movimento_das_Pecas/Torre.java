/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimento_das_Pecas;

import Interfaces.Tabuleiro;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author PabloCass
 */
public class Torre extends Tabuleiro{

    String[] PossibilidadeDeMover = new String[28];
        
    public void clickDaTorre(JLabel peca, String quemSouEU, int[] posicaoDasPecasY, int[] posicaoDasPecasX,
            JLabel opcao, JLabel opcao1, JLabel opcao2, JLabel opcao3, JLabel opcao4, JLabel opcao5, JLabel opcao6, 
            JLabel opcao7, JLabel opcao8, JLabel opcao9, JLabel opcao10, JLabel opcao11, JLabel opcao12, JLabel opcao13, 
            JLabel opcao14, JLabel opcao15, JLabel opcao16, JLabel opcao17, JLabel opcao18, JLabel opcao19, JLabel opcao20, 
            JLabel opcao21, JLabel opcao22, JLabel opcao23, JLabel opcao24, JLabel opcao25, JLabel opcao26, JLabel opcao27){
            
            for(int i = 0; i<=27; i++){
                PossibilidadeDeMover[i] = "Não posso mover";
            }
            
            
            verificarOpcoes(quemSouEU, peca, posicaoDasPecasY, posicaoDasPecasX);
            
            //aparecer opções para cima
            if(PossibilidadeDeMover[0].equals("Posso mover") && peca.getY()-75 >= 25){
            
            opcao.setLocation(peca.getX(), peca.getY()-75);
            opcao.setVisible(true);
            }
            if(PossibilidadeDeMover[1].equals("Posso mover") && peca.getY()-150 >= 25){
            
            opcao1.setLocation(peca.getX(), peca.getY()-150);
            opcao1.setVisible(true);
            }
            if(PossibilidadeDeMover[2].equals("Posso mover") && peca.getY()-225 >= 25){
            
            opcao2.setLocation(peca.getX(), peca.getY()-225);
            opcao2.setVisible(true);
            }
            if(PossibilidadeDeMover[3].equals("Posso mover") && peca.getY()-300 >= 25){
            
            opcao3.setLocation(peca.getX(), peca.getY()-300);
            opcao3.setVisible(true);
            }
            if(PossibilidadeDeMover[4].equals("Posso mover") && peca.getY()-375 >= 25){
            
            opcao4.setLocation(peca.getX(), peca.getY()-375);
            opcao4.setVisible(true);
            }
            if(PossibilidadeDeMover[5].equals("Posso mover") && peca.getY()-450 >= 25){
            
            opcao5.setLocation(peca.getX(), peca.getY()-450);
            opcao5.setVisible(true);
            }
            if(PossibilidadeDeMover[6].equals("Posso mover") && peca.getY()-525 >= 25){
            
            opcao6.setLocation(peca.getX(), peca.getY()-525);
            opcao6.setVisible(true);
            }
            
            //aparecer opções para baixo
            if(PossibilidadeDeMover[7].equals("Posso mover") && peca.getY()+75 <= 550){
            
            opcao7.setLocation(peca.getX(), peca.getY()+75);
            opcao7.setVisible(true);
            }
            if(PossibilidadeDeMover[8].equals("Posso mover") && peca.getY()+150 <= 550){
            
            opcao8.setLocation(peca.getX(), peca.getY()+150);
            opcao8.setVisible(true);
            }
            if(PossibilidadeDeMover[9].equals("Posso mover") && peca.getY()+225 <= 550){
            
            opcao9.setLocation(peca.getX(), peca.getY()+225);
            opcao9.setVisible(true);
            }
            if(PossibilidadeDeMover[10].equals("Posso mover") && peca.getY()+300 <= 550){
            
            opcao10.setLocation(peca.getX(), peca.getY()+300);
            opcao10.setVisible(true);
            }
            if(PossibilidadeDeMover[11].equals("Posso mover") && peca.getY()+375 <= 550){
            
            opcao11.setLocation(peca.getX(), peca.getY()+375);
            opcao11.setVisible(true);
            }
            if(PossibilidadeDeMover[12].equals("Posso mover") && peca.getY()+450 <= 550){
            
            opcao12.setLocation(peca.getX(), peca.getY()+450);
            opcao12.setVisible(true);
            }
            if(PossibilidadeDeMover[13].equals("Posso mover") && peca.getY()+525 <= 550){
            
            opcao13.setLocation(peca.getX(), peca.getY()+525);
            opcao13.setVisible(true);
            }
            
            //aparecer opções para direita
            if(PossibilidadeDeMover[14].equals("Posso mover") && peca.getX()+75 <= 555){
            
            opcao14.setLocation(peca.getX()+75, peca.getY());
            opcao14.setVisible(true);
            }
            if(PossibilidadeDeMover[15].equals("Posso mover") && peca.getX()+150 <= 555){
            
            opcao15.setLocation(peca.getX()+150, peca.getY());
            opcao15.setVisible(true);
            }
            if(PossibilidadeDeMover[16].equals("Posso mover") && peca.getX()+225 <= 555){
            
            opcao16.setLocation(peca.getX()+225, peca.getY());
            opcao16.setVisible(true);
            }
            if(PossibilidadeDeMover[17].equals("Posso mover") && peca.getX()+300 <= 555){
            
            opcao17.setLocation(peca.getX()+300, peca.getY());
            opcao17.setVisible(true);
            }
            if(PossibilidadeDeMover[18].equals("Posso mover") && peca.getX()+375 <= 555){
            
            opcao18.setLocation(peca.getX()+375, peca.getY());
            opcao18.setVisible(true);
            }
            if(PossibilidadeDeMover[19].equals("Posso mover") && peca.getX()+450 <= 555){
            
            opcao19.setLocation(peca.getX()+450, peca.getY());
            opcao19.setVisible(true);
            }
            if(PossibilidadeDeMover[20].equals("Posso mover") && peca.getX()+525<=555){
            
            opcao20.setLocation(peca.getX()+525, peca.getY());
            opcao20.setVisible(true);
            }
            
            //aparecer opções para esquerda
            if(PossibilidadeDeMover[21].equals("Posso mover") && peca.getX()-75 >= 30){
            
            opcao21.setLocation(peca.getX()-75, peca.getY());
            opcao21.setVisible(true);
            }
            if(PossibilidadeDeMover[22].equals("Posso mover") && peca.getX()-150 >= 30){
            
            opcao22.setLocation(peca.getX()-150, peca.getY());
            opcao22.setVisible(true);
            }
            if(PossibilidadeDeMover[23].equals("Posso mover") && peca.getX()-225 >= 30){
            
            opcao23.setLocation(peca.getX()-225, peca.getY());
            opcao23.setVisible(true);
            }
            if(PossibilidadeDeMover[24].equals("Posso mover") && peca.getX()-300 >= 30){
            
            opcao24.setLocation(peca.getX()-300, peca.getY());
            opcao24.setVisible(true);
            }
            if(PossibilidadeDeMover[25].equals("Posso mover") && peca.getX()-375 >= 30){
            
            opcao25.setLocation(peca.getX()-375, peca.getY());
            opcao25.setVisible(true);
            }
            if(PossibilidadeDeMover[26].equals("Posso mover") && peca.getX()-450 >= 30){
            
            opcao26.setLocation(peca.getX()-450, peca.getY());
            opcao26.setVisible(true);
            }
            if(PossibilidadeDeMover[27].equals("Posso mover") && peca.getX()-525 >= 30){
            
            opcao27.setLocation(peca.getX()-525, peca.getY());
            opcao27.setVisible(true);
            }
            
    }
    
    public void verificarOpcoes(String quemSouEU, JLabel peca, int[] posicaoDasPecasY, int[] posicaoDasPecasX) {
        
        removerEDeixarFalso();
        
        //possibilidade para cima
        
        if(PossibilidadeDeMover[0].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    PossibilidadeDeMover[0] = "Não posso mover";
                    PossibilidadeDeMover[1] = "Não posso mover";
                    PossibilidadeDeMover[2] = "Não posso mover";
                    PossibilidadeDeMover[3] = "Não posso mover";
                    PossibilidadeDeMover[4] = "Não posso mover";
                    PossibilidadeDeMover[5] = "Não posso mover";
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[0] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover[0].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+150 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    PossibilidadeDeMover[1] = "Não posso mover";
                    PossibilidadeDeMover[2] = "Não posso mover";
                    PossibilidadeDeMover[3] = "Não posso mover";
                    PossibilidadeDeMover[4] = "Não posso mover";
                    PossibilidadeDeMover[5] = "Não posso mover";
                    PossibilidadeDeMover[6] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover[1] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover[1].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+225 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[2] = "Não posso mover";
                    PossibilidadeDeMover[3] = "Não posso mover";
                    PossibilidadeDeMover[4] = "Não posso mover";
                    PossibilidadeDeMover[5] = "Não posso mover";
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[2] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover[2].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+300 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[3] = "Não posso mover";
                    PossibilidadeDeMover[4] = "Não posso mover";
                    PossibilidadeDeMover[5] = "Não posso mover";
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[3] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover[3].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+375 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[4] = "Não posso mover";
                    PossibilidadeDeMover[5] = "Não posso mover";
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[4] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover[4].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+450 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[5] = "Não posso mover";
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[5] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover[5].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+525 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[6] = "Posso mover";
                }
                
            }
            
        }
        
            //JOptionPane.showMessageDialog(null, PossibilidadeDeMover);
        
        
        //possibilidade para baixo
        if(PossibilidadeDeMover[7].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    PossibilidadeDeMover[7] = "Não posso mover";
                    PossibilidadeDeMover[8] = "Não posso mover";
                    PossibilidadeDeMover[9] = "Não posso mover";
                    PossibilidadeDeMover[10] = "Não posso mover";
                    PossibilidadeDeMover[11] = "Não posso mover";
                    PossibilidadeDeMover[12] = "Não posso mover";
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[7] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover[7].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-150 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    PossibilidadeDeMover[8] = "Não posso mover";
                    PossibilidadeDeMover[9] = "Não posso mover";
                    PossibilidadeDeMover[10] = "Não posso mover";
                    PossibilidadeDeMover[11] = "Não posso mover";
                    PossibilidadeDeMover[12] = "Não posso mover";
                    PossibilidadeDeMover[13] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover[8] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover[8].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-225 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[9] = "Não posso mover";
                    PossibilidadeDeMover[10] = "Não posso mover";
                    PossibilidadeDeMover[11] = "Não posso mover";
                    PossibilidadeDeMover[12] = "Não posso mover";
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[9] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover[9].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-300 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[10] = "Não posso mover";
                    PossibilidadeDeMover[11] = "Não posso mover";
                    PossibilidadeDeMover[12] = "Não posso mover";
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[10] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover[10].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-375 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[11] = "Não posso mover";
                    PossibilidadeDeMover[12] = "Não posso mover";
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[11] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover[11].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-450 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[12] = "Não posso mover";
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[12] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover[12].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-525 == peca.getY() && posicaoDasPecasX[i] == peca.getX()){
                    
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[13] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para direita
        if(PossibilidadeDeMover[14].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-75 == peca.getX()){
                    PossibilidadeDeMover[14] = "Não posso mover";
                    PossibilidadeDeMover[15] = "Não posso mover";
                    PossibilidadeDeMover[16] = "Não posso mover";
                    PossibilidadeDeMover[17] = "Não posso mover";
                    PossibilidadeDeMover[18] = "Não posso mover";
                    PossibilidadeDeMover[19] = "Não posso mover";
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[14] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover[14].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-150 == peca.getX()){
                    PossibilidadeDeMover[15] = "Não posso mover";
                    PossibilidadeDeMover[16] = "Não posso mover";
                    PossibilidadeDeMover[17] = "Não posso mover";
                    PossibilidadeDeMover[18] = "Não posso mover";
                    PossibilidadeDeMover[19] = "Não posso mover";
                    PossibilidadeDeMover[20] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover[15] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover[15].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-225 == peca.getX()){
                    
                    PossibilidadeDeMover[16] = "Não posso mover";
                    PossibilidadeDeMover[17] = "Não posso mover";
                    PossibilidadeDeMover[18] = "Não posso mover";
                    PossibilidadeDeMover[19] = "Não posso mover";
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[16] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover[16].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-300 == peca.getX()){
                    
                    PossibilidadeDeMover[17] = "Não posso mover";
                    PossibilidadeDeMover[18] = "Não posso mover";
                    PossibilidadeDeMover[19] = "Não posso mover";
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[17] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover[17].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-375 == peca.getX()){
                    
                    PossibilidadeDeMover[18] = "Não posso mover";
                    PossibilidadeDeMover[19] = "Não posso mover";
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[18] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover[18].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-450 == peca.getX()){
                    
                    PossibilidadeDeMover[19] = "Não posso mover";
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[19] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover[19].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]-525 == peca.getX()){
                    
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[20] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para esquerda
        if(PossibilidadeDeMover[21].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+75 == peca.getX()){
                    PossibilidadeDeMover[21] = "Não posso mover";
                    PossibilidadeDeMover[22] = "Não posso mover";
                    PossibilidadeDeMover[23] = "Não posso mover";
                    PossibilidadeDeMover[24] = "Não posso mover";
                    PossibilidadeDeMover[25] = "Não posso mover";
                    PossibilidadeDeMover[26] = "Não posso mover";
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[21] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover[21].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+150 == peca.getX()){
                    PossibilidadeDeMover[22] = "Não posso mover";
                    PossibilidadeDeMover[23] = "Não posso mover";
                    PossibilidadeDeMover[24] = "Não posso mover";
                    PossibilidadeDeMover[25] = "Não posso mover";
                    PossibilidadeDeMover[26] = "Não posso mover";
                    PossibilidadeDeMover[27] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover[22] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover[22].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+225 == peca.getX()){
                    
                    PossibilidadeDeMover[23] = "Não posso mover";
                    PossibilidadeDeMover[24] = "Não posso mover";
                    PossibilidadeDeMover[25] = "Não posso mover";
                    PossibilidadeDeMover[26] = "Não posso mover";
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[23] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover[23].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+300 == peca.getX()){
                    
                    PossibilidadeDeMover[24] = "Não posso mover";
                    PossibilidadeDeMover[25] = "Não posso mover";
                    PossibilidadeDeMover[26] = "Não posso mover";
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[24] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover[24].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+375 == peca.getX()){
                    
                    PossibilidadeDeMover[25] = "Não posso mover";
                    PossibilidadeDeMover[26] = "Não posso mover";
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[25] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover[25].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+450 == peca.getX()){
                    
                    PossibilidadeDeMover[26] = "Não posso mover";
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[26] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover[26].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == peca.getY() && posicaoDasPecasX[i]+525 == peca.getX()){
                    
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[27] = "Posso mover";
                }
                
            }
            
        }
        
    }

    public String[] getPossibilidadeDeMover() {
        return PossibilidadeDeMover;
    }

    public void setPossibilidadeDeMover(String[] PossibilidadeDeMover) {
        this.PossibilidadeDeMover = PossibilidadeDeMover;
    }
    
    
    
}
