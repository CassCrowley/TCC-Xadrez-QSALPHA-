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
public class Bispo extends Tabuleiro{
    
    String[] PossibilidadeDeMover = new String[28];
    
    public void clickDoBispo(JLabel peca, String quemSouEU, int[] posicaoDasPecasY, int[] posicaoDasPecasX,
            JLabel opcao28, JLabel opcao29, JLabel opcao30, JLabel opcao31, JLabel opcao32, JLabel opcao33, JLabel opcao34, 
            JLabel opcao35, JLabel opcao36, JLabel opcao37, JLabel opcao38, JLabel opcao39, JLabel opcao40, JLabel opcao41,
            JLabel opcao42, JLabel opcao43, JLabel opcao44, JLabel opcao45, JLabel opcao46, JLabel opcao47, JLabel opcao48, 
            JLabel opcao49, JLabel opcao50, JLabel opcao51, JLabel opcao52, JLabel opcao53, JLabel opcao54, JLabel opcao55, 
            JLabel opcao56, JLabel opcao57){
            
        
            for(int i = 0; i<=27; i++){
                PossibilidadeDeMover[i] = "Não posso mover";
            }
            
            verificarOpcoes(quemSouEU, peca, posicaoDasPecasY, posicaoDasPecasX);
            
            //Direita para cima
            if(PossibilidadeDeMover[0].equals("Posso mover") && peca.getX()+75 <= 555 && peca.getY()-75 >=25){
            
            opcao28.setLocation(peca.getX()+75, peca.getY()-75);
            opcao28.setVisible(true);
            }
            if(PossibilidadeDeMover[1].equals("Posso mover") && peca.getX()+150 <= 555 && peca.getY()-150 >=25){
            
            opcao29.setLocation(peca.getX()+150, peca.getY()-150);
            opcao29.setVisible(true);
            }
            if(PossibilidadeDeMover[2].equals("Posso mover") && peca.getX()+225 <= 555 && peca.getY()-225 >=25){
            
            opcao30.setLocation(peca.getX()+225, peca.getY()-225);
            opcao30.setVisible(true);
            }
            if(PossibilidadeDeMover[3].equals("Posso mover") && peca.getX()+300 <= 555 && peca.getY()-300 >=25){
            
            opcao31.setLocation(peca.getX()+300, peca.getY()-300);
            opcao31.setVisible(true);
            }
            if(PossibilidadeDeMover[4].equals("Posso mover") && peca.getX()+375 <= 555 && peca.getY()-375 >=25){
            
            opcao32.setLocation(peca.getX()+375, peca.getY()-375);
            opcao32.setVisible(true);
            }
            if(PossibilidadeDeMover[5].equals("Posso mover") && peca.getX()+450 <= 555 && peca.getY()-450 >=25){
            
            opcao33.setLocation(peca.getX()+450, peca.getY()-450);
            opcao33.setVisible(true);
            }
            if(PossibilidadeDeMover[6].equals("Posso mover") && peca.getX()+525 <= 555 && peca.getY()-525 >=25){
            
            opcao34.setLocation(peca.getX()+525, peca.getY()-525);
            opcao34.setVisible(true);
            }
            
            //Esquerda para cima
            if(PossibilidadeDeMover[7].equals("Posso mover") && peca.getX()-75 >= 30 && peca.getY()-75 >=25){
            
            opcao35.setLocation(peca.getX()-75, peca.getY()-75);
            opcao35.setVisible(true);
            }
            if(PossibilidadeDeMover[8].equals("Posso mover") && peca.getX()-150 >= 30 && peca.getY()-150 >=25){
            
            opcao36.setLocation(peca.getX()-150, peca.getY()-150);
            opcao36.setVisible(true);
            }
            if(PossibilidadeDeMover[9].equals("Posso mover") && peca.getX()-225 >= 30 && peca.getY()-225 >=25){
            
            opcao37.setLocation(peca.getX()-225, peca.getY()-225);
            opcao37.setVisible(true);
            }
            if(PossibilidadeDeMover[10].equals("Posso mover") && peca.getX()-300 >= 30 && peca.getY()-300 >=25){
            
            opcao38.setLocation(peca.getX()-300, peca.getY()-300);
            opcao38.setVisible(true);
            }
            if(PossibilidadeDeMover[11].equals("Posso mover") && peca.getX()-375 >= 30 && peca.getY()-375 >=25){
            
            opcao39.setLocation(peca.getX()-375, peca.getY()-375);
            opcao39.setVisible(true);
            }
            if(PossibilidadeDeMover[12].equals("Posso mover") && peca.getX()-450 >= 30 && peca.getY()-450 >=25){
            
            opcao40.setLocation(peca.getX()-450, peca.getY()-450);
            opcao40.setVisible(true);
            }
            if(PossibilidadeDeMover[13].equals("Posso mover") && peca.getX()-525 >= 30 && peca.getY()-525 >=25){
            
            opcao41.setLocation(peca.getX()-525, peca.getY()-525);
            opcao41.setVisible(true);
            }
            
            
            //Direita para baixo
            
            if(PossibilidadeDeMover[14].equals("Posso mover") && peca.getX()+75 <= 555 && peca.getY()+75 <=550){
            opcao42.setLocation(peca.getX()+75, peca.getY()+75);
            opcao42.setVisible(true);
            }
            if(PossibilidadeDeMover[15].equals("Posso mover") && peca.getX()+150 <= 555 && peca.getY()+150 <=550){
            
            opcao43.setLocation(peca.getX()+150, peca.getY()+150);
            opcao43.setVisible(true);
            }
            if(PossibilidadeDeMover[16].equals("Posso mover") && peca.getX()+225 <= 555 && peca.getY()+225 <=550){
            
            opcao44.setLocation(peca.getX()+225, peca.getY()+225);
            opcao44.setVisible(true);
            }
            if(PossibilidadeDeMover[17].equals("Posso mover") && peca.getX()+300 <= 555 && peca.getY()+300 <=550){
            
            opcao45.setLocation(peca.getX()+300, peca.getY()+300);
            opcao45.setVisible(true);
            }
            if(PossibilidadeDeMover[18].equals("Posso mover") && peca.getX()+375 <= 555 && peca.getY()+375 <=550){
            
            opcao46.setLocation(peca.getX()+375, peca.getY()+375);
            opcao46.setVisible(true);
            }
            if(PossibilidadeDeMover[19].equals("Posso mover") && peca.getX()+450 <= 555 && peca.getY()+450 <=550){
            
            opcao47.setLocation(peca.getX()+450, peca.getY()+450);
            opcao47.setVisible(true);
            }
            if(PossibilidadeDeMover[20].equals("Posso mover") && peca.getX()+525 <= 555 && peca.getY()+525 <=550){
            
            opcao48.setLocation(peca.getX()+525, peca.getY()+525);
            opcao48.setVisible(true);
            }
              
            //Esquerda para baixo
            if(PossibilidadeDeMover[21].equals("Posso mover") && peca.getX()-75 >= 30 && peca.getY()+75 <=550){
            
            opcao49.setLocation(peca.getX()-75, peca.getY()+75);
            opcao49.setVisible(true);
            }
            if(PossibilidadeDeMover[22].equals("Posso mover") && peca.getX()-150 >= 30 && peca.getY()+150 <=550){
            
            opcao50.setLocation(peca.getX()-150, peca.getY()+150);
            opcao50.setVisible(true);
            }
            if(PossibilidadeDeMover[23].equals("Posso mover") && peca.getX()-225 >= 30 && peca.getY()+225 <=550){
            
            opcao51.setLocation(peca.getX()-225, peca.getY()+225);
            opcao51.setVisible(true);
            }
            if(PossibilidadeDeMover[24].equals("Posso mover") && peca.getX()-300 >= 30 && peca.getY()+300 <=550){
            
            opcao52.setLocation(peca.getX()-300, peca.getY()+300);
            opcao52.setVisible(true);
            }
            if(PossibilidadeDeMover[25].equals("Posso mover") && peca.getX()-375 >= 30 && peca.getY()+375 <=550){
            
            opcao53.setLocation(peca.getX()-375, peca.getY()+375);
            opcao53.setVisible(true);
            }
            if(PossibilidadeDeMover[26].equals("Posso mover") && peca.getX()-450 >= 30 && peca.getY()+450 <=550){
            
            opcao54.setLocation(peca.getX()-450, peca.getY()+450);
            opcao54.setVisible(true);
            }
            if(PossibilidadeDeMover[27].equals("Posso mover") && peca.getX()-525 >= 30 && peca.getY()+525 <=550){
            
            opcao55.setLocation(peca.getX()-525, peca.getY()+525);
            opcao55.setVisible(true);
            }
            
    }
    
    public void verificarOpcoes(String quemSouEU, JLabel peca, int[] posicaoDasPecasY, int[] posicaoDasPecasX) {
        
        removerEDeixarFalso();
        
        //possibilidade para Direita-cima
        
        if(PossibilidadeDeMover[0].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == peca.getY() && posicaoDasPecasX[i]-75 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]+150 == peca.getY() && posicaoDasPecasX[i]-150 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]+225 == peca.getY() && posicaoDasPecasX[i]-225 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+300 == peca.getY() && posicaoDasPecasX[i]-300 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+375 == peca.getY() && posicaoDasPecasX[i]-375 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+450 == peca.getY() && posicaoDasPecasX[i]-450 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+525 == peca.getY() && posicaoDasPecasX[i]-525 == peca.getX()){
                    
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[6] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para Esquerda-cima
        
        if(PossibilidadeDeMover[7].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == peca.getY() && posicaoDasPecasX[i]+75 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]+150 == peca.getY() && posicaoDasPecasX[i]+150 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]+225 == peca.getY() && posicaoDasPecasX[i]+225 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+300 == peca.getY() && posicaoDasPecasX[i]+300 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+375 == peca.getY() && posicaoDasPecasX[i]+375 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+450 == peca.getY() && posicaoDasPecasX[i]+450 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]+525 == peca.getY() && posicaoDasPecasX[i]+525 == peca.getX()){
                    
                    PossibilidadeDeMover[13] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[13] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para Direita-baixo
        
        if(PossibilidadeDeMover[14].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == peca.getY() && posicaoDasPecasX[i]-75 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]-150 == peca.getY() && posicaoDasPecasX[i]-150 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]-225 == peca.getY() && posicaoDasPecasX[i]-225 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-300 == peca.getY() && posicaoDasPecasX[i]-300 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-375 == peca.getY() && posicaoDasPecasX[i]-375 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-450 == peca.getY() && posicaoDasPecasX[i]-450 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-525 == peca.getY() && posicaoDasPecasX[i]-525 == peca.getX()){
                    
                    PossibilidadeDeMover[20] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[20] = "Posso mover";
                }
                
            }
            
        }
        
        //possibilidade para Esquerda-baixo
        
        if(PossibilidadeDeMover[21].equals("Não posso mover")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == peca.getY() && posicaoDasPecasX[i]+75 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]-150 == peca.getY() && posicaoDasPecasX[i]+150 == peca.getX()){
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
                
                if(posicaoDasPecasY[i]-225 == peca.getY() && posicaoDasPecasX[i]+225 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-300 == peca.getY() && posicaoDasPecasX[i]+300 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-375 == peca.getY() && posicaoDasPecasX[i]+375 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-450 == peca.getY() && posicaoDasPecasX[i]+450 == peca.getX()){
                    
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
                
                if(posicaoDasPecasY[i]-525 == peca.getY() && posicaoDasPecasX[i]+525 == peca.getX()){
                    
                    PossibilidadeDeMover[27] = "Não posso mover";
                    break;
                    
                }else{
                    PossibilidadeDeMover[27] = "Posso mover";
                }
                
            }
            
        }
        
    }
}
