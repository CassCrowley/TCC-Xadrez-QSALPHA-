/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos_Extras;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author PabloCass
 */
public class Xeque_Rei_Negro {
    
    String[] PossibilidadesDeXeque = new String[56];
    Boolean XequeReiNegro = false;
    
    //Verificaçao de Xeque-Mate
    String PossoSair = "Não";
    String AlguemPodeCapturar = "sim";
   
    String[] PossibilidadeDeDefesa = new String[56]; 
    String[] PossibilidadeDeMover = new String[10];
    
    int LarguraMinima = 30;
    int LarguraMaxima = 555;
    int AlturaMinima = 25;
    int AlturaMaxima = 550;
    
    int GuardarPeca;
    
    public void verificarXeque(JLabel reiBranco, JLabel reiNegro, int[] posicaoDasPecasX, int[] posicaoDasPecasY){
        
        for(int i = 0; i<56; i++){
            
            PossibilidadesDeXeque[i] = "Não";
            
        }
        
        for(int i = 0; i<10; i++){
            
            PossibilidadeDeMover[i] = "Não";
            
        }
        
        for(int i = 0; i<56; i++){
            
            PossibilidadeDeDefesa[i] = "Não";
            
        }
        
        //Diagonal Direita-cima
        if(PossibilidadesDeXeque[0].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == reiNegro.getY() && posicaoDasPecasX[i]-75 == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão Branco
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[0] = "Não";
                    PossibilidadesDeXeque[1] = "Não";
                    PossibilidadesDeXeque[2] = "Não";
                    PossibilidadesDeXeque[3] = "Não";
                    PossibilidadesDeXeque[4] = "Não";
                    PossibilidadesDeXeque[5] = "Não";
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[0] = "Sim";
                    //reiNegro.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[0].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+150 == reiNegro.getY() && posicaoDasPecasX[i]-150 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiNegro.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[1] = "Não";
                    PossibilidadesDeXeque[2] = "Não";
                    PossibilidadesDeXeque[3] = "Não";
                    PossibilidadesDeXeque[4] = "Não";
                    PossibilidadesDeXeque[5] = "Não";
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[1] = "Sim";
                    //reiNegro.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[1].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+225 == reiNegro.getY() && posicaoDasPecasX[i]-225 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        reiNegro.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[2] = "Não";
                    PossibilidadesDeXeque[3] = "Não";
                    PossibilidadesDeXeque[4] = "Não";
                    PossibilidadesDeXeque[5] = "Não";
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[2] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[2].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+300 == reiNegro.getY() && posicaoDasPecasX[i]-300 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiNegro.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[3] = "Não";
                    PossibilidadesDeXeque[4] = "Não";
                    PossibilidadesDeXeque[5] = "Não";
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[3] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[3].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+375 == reiNegro.getY() && posicaoDasPecasX[i]-375 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[4] = "Não";
                    PossibilidadesDeXeque[5] = "Não";
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[4] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[4].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+450 == reiNegro.getY() && posicaoDasPecasX[i]-450 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[5] = "Não";
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[5] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[5].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+525 == reiNegro.getY() && posicaoDasPecasX[i]-525 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[6] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[6] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Diagonal Esquerda-cima
        
        if(PossibilidadesDeXeque[7].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == reiNegro.getY() && posicaoDasPecasX[i]+75 == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[7] = "Não";
                    PossibilidadesDeXeque[8] = "Não";
                    PossibilidadesDeXeque[9] = "Não";
                    PossibilidadesDeXeque[10] = "Não";
                    PossibilidadesDeXeque[11] = "Não";
                    PossibilidadesDeXeque[12] = "Não";
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[7] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[7].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+150 == reiNegro.getY() && posicaoDasPecasX[i]+150 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[8] = "Não";
                    PossibilidadesDeXeque[9] = "Não";
                    PossibilidadesDeXeque[10] = "Não";
                    PossibilidadesDeXeque[11] = "Não";
                    PossibilidadesDeXeque[12] = "Não";
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[8] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[8].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+225 == reiNegro.getY() && posicaoDasPecasX[i]+225 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[9] = "Não";
                    PossibilidadesDeXeque[10] = "Não";
                    PossibilidadesDeXeque[11] = "Não";
                    PossibilidadesDeXeque[12] = "Não";
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[9] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[9].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+300 == reiNegro.getY() && posicaoDasPecasX[i]+300 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[10] = "Não";
                    PossibilidadesDeXeque[11] = "Não";
                    PossibilidadesDeXeque[12] = "Não";
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[10] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[10].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+375 == reiNegro.getY() && posicaoDasPecasX[i]+375 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[11] = "Não";
                    PossibilidadesDeXeque[12] = "Não";
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[11] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[11].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+450 == reiNegro.getY() && posicaoDasPecasX[i]+450 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[12] = "Não";
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[12] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[12].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+525 == reiNegro.getY() && posicaoDasPecasX[i]+525 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[13] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[13] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Diagonal Direita-baixo
        if(PossibilidadesDeXeque[14].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == reiNegro.getY() && posicaoDasPecasX[i]-75 == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 2 || i == 3 || i == 5 || (i>= 8 && i<=15)){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                        GuardarPeca = i;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[14] = "Não";
                    PossibilidadesDeXeque[15] = "Não";
                    PossibilidadesDeXeque[16] = "Não";
                    PossibilidadesDeXeque[17] = "Não";
                    PossibilidadesDeXeque[18] = "Não";
                    PossibilidadesDeXeque[19] = "Não";
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[14] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[14].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-150 == reiNegro.getY() && posicaoDasPecasX[i]-150 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[15] = "Não";
                    PossibilidadesDeXeque[16] = "Não";
                    PossibilidadesDeXeque[17] = "Não";
                    PossibilidadesDeXeque[18] = "Não";
                    PossibilidadesDeXeque[19] = "Não";
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[15] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[15].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-225 == reiNegro.getY() && posicaoDasPecasX[i]-225 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[16] = "Não";
                    PossibilidadesDeXeque[17] = "Não";
                    PossibilidadesDeXeque[18] = "Não";
                    PossibilidadesDeXeque[19] = "Não";
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[16] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[16].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-300 == reiNegro.getY() && posicaoDasPecasX[i]-300 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[17] = "Não";
                    PossibilidadesDeXeque[18] = "Não";
                    PossibilidadesDeXeque[19] = "Não";
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[17] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[17].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-375 == reiNegro.getY() && posicaoDasPecasX[i]-375 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[18] = "Não";
                    PossibilidadesDeXeque[19] = "Não";
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[18] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[18].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-450 == reiNegro.getY() && posicaoDasPecasX[i]-450 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[19] = "Não";
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[19] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[19].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-525 == reiNegro.getY() && posicaoDasPecasX[i]-525 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[20] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[20] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Diagonal Esquerda-baixo
        
        if(PossibilidadesDeXeque[21].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == reiNegro.getY() && posicaoDasPecasX[i]+75 == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 2 || i == 3 || i == 5 || (i>= 8 && i<=15)){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[21] = "Não";
                    PossibilidadesDeXeque[22] = "Não";
                    PossibilidadesDeXeque[23] = "Não";
                    PossibilidadesDeXeque[24] = "Não";
                    PossibilidadesDeXeque[25] = "Não";
                    PossibilidadesDeXeque[26] = "Não";
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[21] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[21].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-150 == reiNegro.getY() && posicaoDasPecasX[i]+150 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[22] = "Não";
                    PossibilidadesDeXeque[23] = "Não";
                    PossibilidadesDeXeque[24] = "Não";
                    PossibilidadesDeXeque[25] = "Não";
                    PossibilidadesDeXeque[26] = "Não";
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[22] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[22].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-225 == reiNegro.getY() && posicaoDasPecasX[i]+225 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[23] = "Não";
                    PossibilidadesDeXeque[24] = "Não";
                    PossibilidadesDeXeque[25] = "Não";
                    PossibilidadesDeXeque[26] = "Não";
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[23] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[23].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-300 == reiNegro.getY() && posicaoDasPecasX[i]+300 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[24] = "Não";
                    PossibilidadesDeXeque[25] = "Não";
                    PossibilidadesDeXeque[26] = "Não";
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[24] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[24].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-375 == reiNegro.getY() && posicaoDasPecasX[i]+375 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[25] = "Não";
                    PossibilidadesDeXeque[26] = "Não";
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[25] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[25].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-450 == reiNegro.getY() && posicaoDasPecasX[i]+450 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[26] = "Não";
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[26] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[26].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-525 == reiNegro.getY() && posicaoDasPecasX[i]+525 == reiNegro.getX()){
                    
                    
                    if(i == 2 || i == 3 || i == 5){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[27] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[27] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Vertical-cima
        
        if(PossibilidadesDeXeque[28].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+75 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[28] = "Não";
                    PossibilidadesDeXeque[29] = "Não";
                    PossibilidadesDeXeque[30] = "Não";
                    PossibilidadesDeXeque[31] = "Não";
                    PossibilidadesDeXeque[32] = "Não";
                    PossibilidadesDeXeque[33] = "Não";
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[28] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[28].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+150 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[29] = "Não";
                    PossibilidadesDeXeque[30] = "Não";
                    PossibilidadesDeXeque[31] = "Não";
                    PossibilidadesDeXeque[32] = "Não";
                    PossibilidadesDeXeque[33] = "Não";
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[29] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[29].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+225 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[30] = "Não";
                    PossibilidadesDeXeque[31] = "Não";
                    PossibilidadesDeXeque[32] = "Não";
                    PossibilidadesDeXeque[33] = "Não";
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[30] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[30].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+300 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                    //    reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[31] = "Não";
                    PossibilidadesDeXeque[32] = "Não";
                    PossibilidadesDeXeque[33] = "Não";
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[31] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[31].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+375 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[32] = "Não";
                    PossibilidadesDeXeque[33] = "Não";
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[32] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[32].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+450 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[33] = "Não";
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[33] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[33].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]+525 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[34] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[34] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Vertical-Baixo
        
        
        if(PossibilidadesDeXeque[35].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-75 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[35] = "Não";
                    PossibilidadesDeXeque[36] = "Não";
                    PossibilidadesDeXeque[37] = "Não";
                    PossibilidadesDeXeque[38] = "Não";
                    PossibilidadesDeXeque[39] = "Não";
                    PossibilidadesDeXeque[40] = "Não";
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[35] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[35].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-150 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[36] = "Não";
                    PossibilidadesDeXeque[37] = "Não";
                    PossibilidadesDeXeque[38] = "Não";
                    PossibilidadesDeXeque[39] = "Não";
                    PossibilidadesDeXeque[40] = "Não";
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[36] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[36].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-225 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[37] = "Não";
                    PossibilidadesDeXeque[38] = "Não";
                    PossibilidadesDeXeque[39] = "Não";
                    PossibilidadesDeXeque[40] = "Não";
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[37] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[37].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-300 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[38] = "Não";
                    PossibilidadesDeXeque[39] = "Não";
                    PossibilidadesDeXeque[40] = "Não";
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[38] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[38].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-375 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[39] = "Não";
                    PossibilidadesDeXeque[40] = "Não";
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[39] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[39].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-450 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[40] = "Não";
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[40] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[40].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i]-525 == reiNegro.getY() && posicaoDasPecasX[i] == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[41] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[41] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Horizontal-Direita
        
        
        if(PossibilidadesDeXeque[42].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-75 == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                    //    reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[42] = "Não";
                    PossibilidadesDeXeque[43] = "Não";
                    PossibilidadesDeXeque[44] = "Não";
                    PossibilidadesDeXeque[45] = "Não";
                    PossibilidadesDeXeque[46] = "Não";
                    PossibilidadesDeXeque[47] = "Não";
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[42] = "Sim";
                  //  reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[42].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-150 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                     //   reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                       // reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[43] = "Não";
                    PossibilidadesDeXeque[44] = "Não";
                    PossibilidadesDeXeque[45] = "Não";
                    PossibilidadesDeXeque[46] = "Não";
                    PossibilidadesDeXeque[47] = "Não";
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[43] = "Sim";
                   // reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[43].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-225 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[44] = "Não";
                    PossibilidadesDeXeque[45] = "Não";
                    PossibilidadesDeXeque[46] = "Não";
                    PossibilidadesDeXeque[47] = "Não";
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[44] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[44].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-300 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[45] = "Não";
                    PossibilidadesDeXeque[46] = "Não";
                    PossibilidadesDeXeque[47] = "Não";
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[45] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[45].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-375 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                       // reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                     //   reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[46] = "Não";
                    PossibilidadesDeXeque[47] = "Não";
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[46] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[46].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-450 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[47] = "Não";
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[47] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[47].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]-525 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[48] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[48] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Horizontal-Esquerda
        
        
        if(PossibilidadesDeXeque[49].equals("Não")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+75 == reiNegro.getX()){
                    
                    //Valor de I sendo Rainha, Bispo ou peão negro
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                      //  reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[49] = "Não";
                    PossibilidadesDeXeque[50] = "Não";
                    PossibilidadesDeXeque[51] = "Não";
                    PossibilidadesDeXeque[52] = "Não";
                    PossibilidadesDeXeque[53] = "Não";
                    PossibilidadesDeXeque[54] = "Não";
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[49] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }   
            
        }
        
        if(PossibilidadesDeXeque[49].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+150 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[50] = "Não";
                    PossibilidadesDeXeque[51] = "Não";
                    PossibilidadesDeXeque[52] = "Não";
                    PossibilidadesDeXeque[53] = "Não";
                    PossibilidadesDeXeque[54] = "Não";
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[50] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[50].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+225 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[51] = "Não";
                    PossibilidadesDeXeque[52] = "Não";
                    PossibilidadesDeXeque[53] = "Não";
                    PossibilidadesDeXeque[54] = "Não";
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[51] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[51].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+300 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                        //reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[52] = "Não";
                    PossibilidadesDeXeque[53] = "Não";
                    PossibilidadesDeXeque[54] = "Não";
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[52] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[52].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+375 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[53] = "Não";
                    PossibilidadesDeXeque[54] = "Não";
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[53] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[53].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+450 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        //reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[54] = "Não";
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[54] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        if(PossibilidadesDeXeque[54].equals("Sim")){
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasY[i] == reiNegro.getY() && posicaoDasPecasX[i]+525 == reiNegro.getX()){
                    
                    
                    if(i == 0 || i == 3 || i == 7){
                        
                      //  reiBranco.setBorder(new MatteBorder(2, 2, 2, 2, Color.CYAN));
                        XequeReiNegro = true;
                    }else{
                        reiBranco.setBorder(null);
                    }
                    
                    PossibilidadesDeXeque[55] = "Não";
                    
                    break;
                    
                }else{
                    PossibilidadesDeXeque[55] = "Sim";
                    //reiBranco.setBorder(null);
                }
                
            }    
            
        }
        
        //Se cavalo der xeque
        for(int i = 0; i<32; i++){
            
            //Direita para cima
            if(posicaoDasPecasX[i]-75 == reiNegro.getX() && posicaoDasPecasY[i]+150 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            if(posicaoDasPecasX[i]-150 == reiNegro.getX() && posicaoDasPecasY[i]+75 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            //Esquerda para cima
            if(posicaoDasPecasX[i]+75 == reiNegro.getX() && posicaoDasPecasY[i]+150 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            if(posicaoDasPecasX[i]+150 == reiNegro.getX() && posicaoDasPecasY[i]+75 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            
            //Direita para baixo
            if(posicaoDasPecasX[i]-75 == reiNegro.getX() && posicaoDasPecasY[i]-150 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            
            if(posicaoDasPecasX[i]-150 == reiNegro.getX() && posicaoDasPecasY[i]-75 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            //Esquerda para baixo
            if(posicaoDasPecasX[i]+75 == reiNegro.getX() && posicaoDasPecasY[i]-150 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
            
            if(posicaoDasPecasX[i]+150 == reiNegro.getX() && posicaoDasPecasY[i]-75 == reiNegro.getY()){
                
                if(i == 1 || i == 6){
                    
                    XequeReiNegro = true;
                    
                }
                
            }
            
        }
        
        if(XequeReiNegro.equals(true)){
            
            reiNegro.setBorder(new LineBorder(new Color(51,113,255), 2));
            XequeReiNegro = false;
            
        }else{
            
            reiNegro.setBorder(null);
            
        }
        
        //-----------------------------------------------------------------------------------//
        
        //VERIFICAR SE HÁ POSSIBILIDADE DE FUGA
        
        //opção para cima
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i] == reiNegro.getX() && posicaoDasPecasY[i]+75 == reiNegro.getY() 
                        || reiNegro.getY() == AlturaMinima){
                    
                PossibilidadeDeMover[0] = "Não posso mover";
                    break;
                    
                }
                
            }
        
        //opção para baixo
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i] == reiNegro.getX() && posicaoDasPecasY[i]-75 == reiNegro.getY()
                        || reiNegro.getY() == AlturaMaxima){
                    PossibilidadeDeMover[1] = "Não posso mover";
                    break;
                    
                }
                
            }
            
            //opção para Direita
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == reiNegro.getX() && posicaoDasPecasY[i] == reiNegro.getY()
                        || reiNegro.getX() == LarguraMaxima){
                    PossibilidadeDeMover[2] = "Não posso mover";
                    break;
                    
                }
                
            }    
            
            //opção para Esquerda
            
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == reiNegro.getX() && posicaoDasPecasY[i] == reiNegro.getY()
                        || reiNegro.getX() == LarguraMinima){
                    PossibilidadeDeMover[3] = "Não posso mover";
                    break;
                    
                }
                
            }
            
        //Opção Diagonal-Direita-Cima
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == reiNegro.getX() && posicaoDasPecasY[i]+75 == reiNegro.getY()
                        || (i == 4 && posicaoDasPecasX[i]-150 == reiNegro.getX() && posicaoDasPecasY[i]+150 == reiNegro.getY())
                        || (i == 20 && posicaoDasPecasX[i]-150 == reiNegro.getX() && posicaoDasPecasY[i]+150 == reiNegro.getY())
                        || reiNegro.getX() == LarguraMaxima && reiNegro.getY() == AlturaMinima){
                    PossibilidadeDeMover[4] = "Não posso mover";
                    break;
                    
                }
                
            }
            
            //Opção Diagonal-Esquerda-Cima
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == reiNegro.getX() && posicaoDasPecasY[i]+75 == reiNegro.getY()
                        || (i == 4 && posicaoDasPecasX[i]+150 == reiNegro.getX() && posicaoDasPecasY[i]+150 == reiNegro.getY())
                        || (i == 20 && posicaoDasPecasX[i]+150 == reiNegro.getX() && posicaoDasPecasY[i]+150 == reiNegro.getY())
                        || reiNegro.getX() == LarguraMinima && reiNegro.getY() == AlturaMinima){
                    PossibilidadeDeMover[5] = "Não posso mover";
                    break;
                    
                }
                
            }
            
            //Opção Diagonal-Direita-Baixo
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]-75 == reiNegro.getX() && posicaoDasPecasY[i]-75 == reiNegro.getY()
                        || (i == 4 && posicaoDasPecasX[i]-150 == reiNegro.getX() && posicaoDasPecasY[i]-150 == reiNegro.getY())
                        || (i == 20 && posicaoDasPecasX[i]-150 == reiNegro.getX() && posicaoDasPecasY[i]-150 == reiNegro.getY())
                        || reiNegro.getX() == LarguraMaxima && reiNegro.getY() == AlturaMaxima){
                    PossibilidadeDeMover[6] = "Não posso mover";
                    break;
                    
                }
                
            }
            
            //Opção Diagonal-Esquerda-Baixo
            for(int i = 0; i<32; i++){
                
                if(posicaoDasPecasX[i]+75 == reiNegro.getX() && posicaoDasPecasY[i]-75 == reiNegro.getY()
                        || (i == 4 && posicaoDasPecasX[i]+150 == reiNegro.getX() && posicaoDasPecasY[i]-150 == reiNegro.getY())
                        || (i == 20 && posicaoDasPecasX[i]+150 == reiNegro.getX() && posicaoDasPecasY[i]-150 == reiNegro.getY())
                        || reiNegro.getX() == LarguraMinima && reiNegro.getY() == AlturaMaxima){
                    PossibilidadeDeMover[7] = "Não posso mover";
                    break;
                    
                }
                
            }    
            
            for(int i = 0; i<8; i++){
                if(!(PossibilidadeDeMover[i].equals("Não posso mover"))){
                    PossoSair = "Sim";
                    break;
                }
            }
            
            if(PossoSair.equals("Não")){
                JOptionPane.showMessageDialog(null, "mateeee");
            }
            
        //if(GuardarPeca == 3){
            //JOptionPane.showMessageDialog(null, "Xeque-mate");
        //}
        
    }
    
}
