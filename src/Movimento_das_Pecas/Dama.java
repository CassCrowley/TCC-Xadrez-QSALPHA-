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
public class Dama extends Tabuleiro{
    
    String[] PossibilidadeDeMover = new String[28];
    String[] PossibilidadeDeMover2 = new String[28];
    
    public void clickDaDama(JLabel peca, String quemSouEU, int[] posicaoDasPecasY, int[] posicaoDasPecasX,
            JLabel opcao, JLabel opcao1, JLabel opcao2, JLabel opcao3, JLabel opcao4, JLabel opcao5, JLabel opcao6, 
            JLabel opcao7, JLabel opcao8, JLabel opcao9, JLabel opcao10, JLabel opcao11, JLabel opcao12, JLabel opcao13, 
            JLabel opcao14, JLabel opcao15, JLabel opcao16, JLabel opcao17, JLabel opcao18, JLabel opcao19, JLabel opcao20, 
            JLabel opcao21, JLabel opcao22, JLabel opcao23, JLabel opcao24, JLabel opcao25, JLabel opcao26, JLabel opcao27,
            JLabel opcao28, JLabel opcao29, JLabel opcao30, JLabel opcao31, JLabel opcao32, JLabel opcao33, JLabel opcao34, 
            JLabel opcao35, JLabel opcao36, JLabel opcao37, JLabel opcao38, JLabel opcao39, JLabel opcao40, JLabel opcao41,
            JLabel opcao42, JLabel opcao43, JLabel opcao44, JLabel opcao45, JLabel opcao46, JLabel opcao47, JLabel opcao48, 
            JLabel opcao49, JLabel opcao50, JLabel opcao51, JLabel opcao52, JLabel opcao53, JLabel opcao54, JLabel opcao55, 
            JLabel opcao56, JLabel opcao57){
            
            for(int i = 0; i<=27; i++){
                PossibilidadeDeMover[i] = "Não posso mover";
                PossibilidadeDeMover2[i] = "Não posso mover";
            }
            
            verificarOpcoes(quemSouEU, peca, posicaoDasPecasY, posicaoDasPecasX);
            
            //aparecer opções para cima-vertical
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
            
            //aparecer opções para baixo-vertical
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
            
            //aparecer opções para direita-horizontsl
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
            
            //aparecer opções para esquerda-horizontal
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
            
            
            
            //Direita para cima
            if(PossibilidadeDeMover2[0].equals("Posso mover") && peca.getX()+75 <= 555 && peca.getY()-75 >=25){
            
            opcao28.setLocation(peca.getX()+75, peca.getY()-75);
            opcao28.setVisible(true);
            }
            if(PossibilidadeDeMover2[1].equals("Posso mover") && peca.getX()+150 <= 555 && peca.getY()-150 >=25){
            
            opcao29.setLocation(peca.getX()+150, peca.getY()-150);
            opcao29.setVisible(true);
            }
            if(PossibilidadeDeMover2[2].equals("Posso mover") && peca.getX()+225 <= 555 && peca.getY()-225 >=25){
            
            opcao30.setLocation(peca.getX()+225, peca.getY()-225);
            opcao30.setVisible(true);
            }
            if(PossibilidadeDeMover2[3].equals("Posso mover") && peca.getX()+300 <= 555 && peca.getY()-300 >=25){
            
            opcao31.setLocation(peca.getX()+300, peca.getY()-300);
            opcao31.setVisible(true);
            }
            if(PossibilidadeDeMover2[4].equals("Posso mover") && peca.getX()+375 <= 555 && peca.getY()-375 >=25){
            
            opcao32.setLocation(peca.getX()+375, peca.getY()-375);
            opcao32.setVisible(true);
            }
            if(PossibilidadeDeMover2[5].equals("Posso mover") && peca.getX()+450 <= 555 && peca.getY()-450 >=25){
            
            opcao33.setLocation(peca.getX()+450, peca.getY()-450);
            opcao33.setVisible(true);
            }
            if(PossibilidadeDeMover2[6].equals("Posso mover") && peca.getX()+525 <= 555 && peca.getY()-525 >=25){
            
            opcao34.setLocation(peca.getX()+525, peca.getY()-525);
            opcao34.setVisible(true);
            }
            
            //Esquerda para cima
            if(PossibilidadeDeMover2[7].equals("Posso mover") && peca.getX()-75 >= 30 && peca.getY()-75 >=25){
            
            opcao35.setLocation(peca.getX()-75, peca.getY()-75);
            opcao35.setVisible(true);
            }
            if(PossibilidadeDeMover2[8].equals("Posso mover") && peca.getX()-150 >= 30 && peca.getY()-150 >=25){
            
            opcao36.setLocation(peca.getX()-150, peca.getY()-150);
            opcao36.setVisible(true);
            }
            if(PossibilidadeDeMover2[9].equals("Posso mover") && peca.getX()-225 >= 30 && peca.getY()-225 >=25){
            
            opcao37.setLocation(peca.getX()-225, peca.getY()-225);
            opcao37.setVisible(true);
            }
            if(PossibilidadeDeMover2[10].equals("Posso mover") && peca.getX()-300 >= 30 && peca.getY()-300 >=25){
            
            opcao38.setLocation(peca.getX()-300, peca.getY()-300);
            opcao38.setVisible(true);
            }
            if(PossibilidadeDeMover2[11].equals("Posso mover") && peca.getX()-375 >= 30 && peca.getY()-375 >=25){
            
            opcao39.setLocation(peca.getX()-375, peca.getY()-375);
            opcao39.setVisible(true);
            }
            if(PossibilidadeDeMover2[12].equals("Posso mover") && peca.getX()-450 >= 30 && peca.getY()-450 >=25){
            
            opcao40.setLocation(peca.getX()-450, peca.getY()-450);
            opcao40.setVisible(true);
            }
            if(PossibilidadeDeMover2[13].equals("Posso mover") && peca.getX()-525 >= 30 && peca.getY()-525 >=25){
            
            opcao41.setLocation(peca.getX()-525, peca.getY()-525);
            opcao41.setVisible(true);
            }
            
            
            //Direita para baixo
            
            if(PossibilidadeDeMover2[14].equals("Posso mover") && peca.getX()+75 <= 555 && peca.getY()+75 <=550){
            opcao42.setLocation(peca.getX()+75, peca.getY()+75);
            opcao42.setVisible(true);
            }
            if(PossibilidadeDeMover2[15].equals("Posso mover") && peca.getX()+150 <= 555 && peca.getY()+150 <=550){
            
            opcao43.setLocation(peca.getX()+150, peca.getY()+150);
            opcao43.setVisible(true);
            }
            if(PossibilidadeDeMover2[16].equals("Posso mover") && peca.getX()+225 <= 555 && peca.getY()+225 <=550){
            
            opcao44.setLocation(peca.getX()+225, peca.getY()+225);
            opcao44.setVisible(true);
            }
            if(PossibilidadeDeMover2[17].equals("Posso mover") && peca.getX()+300 <= 555 && peca.getY()+300 <=550){
            
            opcao45.setLocation(peca.getX()+300, peca.getY()+300);
            opcao45.setVisible(true);
            }
            if(PossibilidadeDeMover2[18].equals("Posso mover") && peca.getX()+375 <= 555 && peca.getY()+375 <=550){
            
            opcao46.setLocation(peca.getX()+375, peca.getY()+375);
            opcao46.setVisible(true);
            }
            if(PossibilidadeDeMover2[19].equals("Posso mover") && peca.getX()+450 <= 555 && peca.getY()+450 <=550){
            
            opcao47.setLocation(peca.getX()+450, peca.getY()+450);
            opcao47.setVisible(true);
            }
            if(PossibilidadeDeMover2[20].equals("Posso mover") && peca.getX()+525 <= 555 && peca.getY()+525 <=550){
            
            opcao48.setLocation(peca.getX()+525, peca.getY()+525);
            opcao48.setVisible(true);
            }
              
            //Esquerda para baixo
            if(PossibilidadeDeMover2[21].equals("Posso mover") && peca.getX()-75 >= 30 && peca.getY()+75 <=550){
            
            opcao49.setLocation(peca.getX()-75, peca.getY()+75);
            opcao49.setVisible(true);
            }
            if(PossibilidadeDeMover2[22].equals("Posso mover") && peca.getX()-150 >= 30 && peca.getY()+150 <=550){
            
            opcao50.setLocation(peca.getX()-150, peca.getY()+150);
            opcao50.setVisible(true);
            }
            if(PossibilidadeDeMover2[23].equals("Posso mover") && peca.getX()-225 >= 30 && peca.getY()+225 <=550){
            
            opcao51.setLocation(peca.getX()-225, peca.getY()+225);
            opcao51.setVisible(true);
            }
            if(PossibilidadeDeMover2[24].equals("Posso mover") && peca.getX()-300 >= 30 && peca.getY()+300 <=550){
            
            opcao52.setLocation(peca.getX()-300, peca.getY()+300);
            opcao52.setVisible(true);
            }
            if(PossibilidadeDeMover2[25].equals("Posso mover") && peca.getX()-375 >= 30 && peca.getY()+375 <=550){
            
            opcao53.setLocation(peca.getX()-375, peca.getY()+375);
            opcao53.setVisible(true);
            }
            if(PossibilidadeDeMover2[26].equals("Posso mover") && peca.getX()-450 >= 30 && peca.getY()+450 <=550){
            
            opcao54.setLocation(peca.getX()-450, peca.getY()+450);
            opcao54.setVisible(true);
            }
            if(PossibilidadeDeMover2[27].equals("Posso mover") && peca.getX()-525 >= 30 && peca.getY()+525 <=550){
            
            opcao55.setLocation(peca.getX()-525, peca.getY()+525);
            opcao55.setVisible(true);
            }
            
    }
    
    public void verificarOpcoes(String quemSouEU, JLabel peca, int[] posicaoDasPecasY, int[] posicaoDasPecasX) {
        
        removerEDeixarFalso();
        
        //possibilidade para cima-vertical
        
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
                                        
        if(PossibilidadeDeMover[3].equals("Posso mover")){
            
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
        
        
        //possibilidade para baixo-vertical
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
        
        //possibilidade para direita-horizontal
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
        
        //possibilidade para esquerda-horizontal
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
            
        if(PossibilidadeDeMover[26].equals("Posso mover")){
            
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
        
        
        //possibilidade para Direita-cima
        
        if(PossibilidadeDeMover2[0].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == peca.getY() && posicaoDasPecasX[i]-75 == peca.getX()){
                    PossibilidadeDeMover2[0] = "Não posso mover";
                    PossibilidadeDeMover2[1] = "Não posso mover";
                    PossibilidadeDeMover2[2] = "Não posso mover";
                    PossibilidadeDeMover2[3] = "Não posso mover";
                    PossibilidadeDeMover2[4] = "Não posso mover";
                    PossibilidadeDeMover2[5] = "Não posso mover";
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[0] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover2[0].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+150 == peca.getY() && posicaoDasPecasX[i]-150 == peca.getX()){
                    PossibilidadeDeMover2[1] = "Não posso mover";
                    PossibilidadeDeMover2[2] = "Não posso mover";
                    PossibilidadeDeMover2[3] = "Não posso mover";
                    PossibilidadeDeMover2[4] = "Não posso mover";
                    PossibilidadeDeMover2[5] = "Não posso mover";
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover2[1] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover2[1].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+225 == peca.getY() && posicaoDasPecasX[i]-225 == peca.getX()){
                    
                    PossibilidadeDeMover2[2] = "Não posso mover";
                    PossibilidadeDeMover2[3] = "Não posso mover";
                    PossibilidadeDeMover2[4] = "Não posso mover";
                    PossibilidadeDeMover2[5] = "Não posso mover";
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[2] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover2[2].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+300 == peca.getY() && posicaoDasPecasX[i]-300 == peca.getX()){
                    
                    PossibilidadeDeMover2[3] = "Não posso mover";
                    PossibilidadeDeMover2[4] = "Não posso mover";
                    PossibilidadeDeMover2[5] = "Não posso mover";
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[3] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover2[3].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+375 == peca.getY() && posicaoDasPecasX[i]-375 == peca.getX()){
                    
                    PossibilidadeDeMover2[4] = "Não posso mover";
                    PossibilidadeDeMover2[5] = "Não posso mover";
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[4] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover2[4].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+450 == peca.getY() && posicaoDasPecasX[i]-450 == peca.getX()){
                    
                    PossibilidadeDeMover2[5] = "Não posso mover";
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[5] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover2[5].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+525 == peca.getY() && posicaoDasPecasX[i]-525 == peca.getX()){
                    
                    PossibilidadeDeMover2[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[6] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para Esquerda-cima
        
        if(PossibilidadeDeMover2[7].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == peca.getY() && posicaoDasPecasX[i]+75 == peca.getX()){
                    PossibilidadeDeMover2[7] = "Não posso mover";
                    PossibilidadeDeMover2[8] = "Não posso mover";
                    PossibilidadeDeMover2[9] = "Não posso mover";
                    PossibilidadeDeMover2[10] = "Não posso mover";
                    PossibilidadeDeMover2[11] = "Não posso mover";
                    PossibilidadeDeMover2[12] = "Não posso mover";
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[7] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover2[7].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+150 == peca.getY() && posicaoDasPecasX[i]+150 == peca.getX()){
                    PossibilidadeDeMover2[8] = "Não posso mover";
                    PossibilidadeDeMover2[9] = "Não posso mover";
                    PossibilidadeDeMover2[10] = "Não posso mover";
                    PossibilidadeDeMover2[11] = "Não posso mover";
                    PossibilidadeDeMover2[12] = "Não posso mover";
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover2[8] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover2[8].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+225 == peca.getY() && posicaoDasPecasX[i]+225 == peca.getX()){
                    
                    PossibilidadeDeMover2[9] = "Não posso mover";
                    PossibilidadeDeMover2[10] = "Não posso mover";
                    PossibilidadeDeMover2[11] = "Não posso mover";
                    PossibilidadeDeMover2[12] = "Não posso mover";
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[9] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover2[9].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+300 == peca.getY() && posicaoDasPecasX[i]+300 == peca.getX()){
                    
                    PossibilidadeDeMover2[10] = "Não posso mover";
                    PossibilidadeDeMover2[11] = "Não posso mover";
                    PossibilidadeDeMover2[12] = "Não posso mover";
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[10] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover2[10].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+375 == peca.getY() && posicaoDasPecasX[i]+375 == peca.getX()){
                    
                    PossibilidadeDeMover2[11] = "Não posso mover";
                    PossibilidadeDeMover2[12] = "Não posso mover";
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[11] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover2[11].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+450 == peca.getY() && posicaoDasPecasX[i]+450 == peca.getX()){
                    
                    PossibilidadeDeMover2[12] = "Não posso mover";
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[12] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover2[12].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+525 == peca.getY() && posicaoDasPecasX[i]+525 == peca.getX()){
                    
                    PossibilidadeDeMover2[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[13] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para Direita-baixo
        
        if(PossibilidadeDeMover2[14].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == peca.getY() && posicaoDasPecasX[i]-75 == peca.getX()){
                    PossibilidadeDeMover2[14] = "Não posso mover";
                    PossibilidadeDeMover2[15] = "Não posso mover";
                    PossibilidadeDeMover2[16] = "Não posso mover";
                    PossibilidadeDeMover2[17] = "Não posso mover";
                    PossibilidadeDeMover2[18] = "Não posso mover";
                    PossibilidadeDeMover2[19] = "Não posso mover";
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[14] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover2[14].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-150 == peca.getY() && posicaoDasPecasX[i]-150 == peca.getX()){
                    PossibilidadeDeMover2[15] = "Não posso mover";
                    PossibilidadeDeMover2[16] = "Não posso mover";
                    PossibilidadeDeMover2[17] = "Não posso mover";
                    PossibilidadeDeMover2[18] = "Não posso mover";
                    PossibilidadeDeMover2[19] = "Não posso mover";
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover2[15] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover2[15].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-225 == peca.getY() && posicaoDasPecasX[i]-225 == peca.getX()){
                    
                    PossibilidadeDeMover2[16] = "Não posso mover";
                    PossibilidadeDeMover2[17] = "Não posso mover";
                    PossibilidadeDeMover2[18] = "Não posso mover";
                    PossibilidadeDeMover2[19] = "Não posso mover";
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[16] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover2[16].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-300 == peca.getY() && posicaoDasPecasX[i]-300 == peca.getX()){
                    
                    PossibilidadeDeMover2[17] = "Não posso mover";
                    PossibilidadeDeMover2[18] = "Não posso mover";
                    PossibilidadeDeMover2[19] = "Não posso mover";
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[17] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover2[17].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-375 == peca.getY() && posicaoDasPecasX[i]-375 == peca.getX()){
                    
                    PossibilidadeDeMover2[18] = "Não posso mover";
                    PossibilidadeDeMover2[19] = "Não posso mover";
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[18] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover2[18].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-450 == peca.getY() && posicaoDasPecasX[i]-450 == peca.getX()){
                    
                    PossibilidadeDeMover2[19] = "Não posso mover";
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[19] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover2[19].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-525 == peca.getY() && posicaoDasPecasX[i]-525 == peca.getX()){
                    
                    PossibilidadeDeMover2[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[20] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para Esquerda-baixo
        
        if(PossibilidadeDeMover2[21].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == peca.getY() && posicaoDasPecasX[i]+75 == peca.getX()){
                    PossibilidadeDeMover2[21] = "Não posso mover";
                    PossibilidadeDeMover2[22] = "Não posso mover";
                    PossibilidadeDeMover2[23] = "Não posso mover";
                    PossibilidadeDeMover2[24] = "Não posso mover";
                    PossibilidadeDeMover2[25] = "Não posso mover";
                    PossibilidadeDeMover2[26] = "Não posso mover";
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[21] = "Posso mover";
                }
                
            }
            
        }                        
                            
        if(PossibilidadeDeMover2[21].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-150 == peca.getY() && posicaoDasPecasX[i]+150 == peca.getX()){
                    PossibilidadeDeMover2[22] = "Não posso mover";
                    PossibilidadeDeMover2[23] = "Não posso mover";
                    PossibilidadeDeMover2[24] = "Não posso mover";
                    PossibilidadeDeMover2[25] = "Não posso mover";
                    PossibilidadeDeMover2[26] = "Não posso mover";
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    
                    break;
                    
                }else{
                    PossibilidadeDeMover2[22] = "Posso mover";
                }
                
            }
            
        }                    
            
        if(PossibilidadeDeMover2[22].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-225 == peca.getY() && posicaoDasPecasX[i]+225 == peca.getX()){
                    
                    PossibilidadeDeMover2[23] = "Não posso mover";
                    PossibilidadeDeMover2[24] = "Não posso mover";
                    PossibilidadeDeMover2[25] = "Não posso mover";
                    PossibilidadeDeMover2[26] = "Não posso mover";
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[23] = "Posso mover";
                }
                
            }
            
        }                
                                        
        if(PossibilidadeDeMover2[23].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-300 == peca.getY() && posicaoDasPecasX[i]+300 == peca.getX()){
                    
                    PossibilidadeDeMover2[24] = "Não posso mover";
                    PossibilidadeDeMover2[25] = "Não posso mover";
                    PossibilidadeDeMover2[26] = "Não posso mover";
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[24] = "Posso mover";
                }
                
            }
            
        }        
                
        if(PossibilidadeDeMover2[24].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-375 == peca.getY() && posicaoDasPecasX[i]+375 == peca.getX()){
                    
                    PossibilidadeDeMover2[25] = "Não posso mover";
                    PossibilidadeDeMover2[26] = "Não posso mover";
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[25] = "Posso mover";
                }
                
            }
            
        }
            
        if(PossibilidadeDeMover2[25].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-450 == peca.getY() && posicaoDasPecasX[i]+450 == peca.getX()){
                    
                    PossibilidadeDeMover2[26] = "Não posso mover";
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[26] = "Posso mover";
                }
                
            }
            
        }
        
        if(PossibilidadeDeMover2[26].equals("Posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-525 == peca.getY() && posicaoDasPecasX[i]+525 == peca.getX()){
                    
                    PossibilidadeDeMover2[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover2[27] = "Posso mover";
                }
                
            }
            
        }
        
    }
    
}
