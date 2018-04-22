/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos_Extras;
import Interfaces.Tabuleiro;
import javax.swing.JLabel;
import Movimento_das_Pecas.Torre;
/**
 *
 * @author PabloCass
 */
public class Captura extends Tabuleiro{

    String[] PossibilidadeDeCaptura = new String[28];
    
    public void verificarSePodeCapturar(JLabel pecaQueCaptura,JLabel pecaAserCapturada, String quemSouEU, 
            String quemVaiSerCapturado, int[] posicaoDasPecasY, int[] posicaoDasPecasX){
        
        
            
        if(quemSouEU.contains("Peão Branco")){
                
            //Captura peças negras com peões brancos    
            if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
            pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
            pecaAserCapturada.setVisible(false);
                adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
            }        
            
            if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
            pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
            pecaAserCapturada.setVisible(false);
                adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            }
            
        }
            
        if(quemSouEU.contains("Peão Negro")){
                
            
            //Captura peças brancas com peões negros    
            if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
            pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
            pecaAserCapturada.setVisible(false);
                adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
            }        
            
            if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
            pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
            pecaAserCapturada.setVisible(false);
                adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            }
            
        }
        
        if(quemSouEU.contains("Torre") || quemSouEU.contains("Rainha")){
                 
            
            
            for(int i = 0; i<28; i++){
                PossibilidadeDeCaptura[i] = "Não posso capturar";
            }
            
            //para horizontal
            try{
            
            if(pecaAserCapturada.getY() == pecaQueCaptura.getY()){
                
                //Direita
                if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]-75 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[0] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[0] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[0].equals("Posso capturar")
                        && pecaQueCaptura.getX()+150 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[0].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]-150 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[1] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[1] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[1].equals("Posso capturar")
                        && pecaQueCaptura.getX()+225 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }

                if(PossibilidadeDeCaptura[1].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]-225 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[2] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[2] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[2].equals("Posso capturar")
                        && pecaQueCaptura.getX()+300 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                if(PossibilidadeDeCaptura[2].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]-300 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[3] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[3] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[3].equals("Posso capturar")
                        && pecaQueCaptura.getX()+375 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                if(PossibilidadeDeCaptura[3].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]-375 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[4] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[4] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[4].equals("Posso capturar")
                        && pecaQueCaptura.getX()+450 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                if(PossibilidadeDeCaptura[4].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]-450 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[5] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[5] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[5].equals("Posso capturar")
                        && pecaQueCaptura.getX()+525 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                    }
                }
                }
            }catch(Exception e){
                e.printStackTrace();
            }    
             
            
            //Esquerda
                
            try{
            
            if(pecaAserCapturada.getY() == pecaQueCaptura.getY()){
                
                //Direita
                if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]+75 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[6] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[6] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[6].equals("Posso capturar")
                        && pecaQueCaptura.getX()-150 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[6].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]+150 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[7] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[7] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[7].equals("Posso capturar")
                        && pecaQueCaptura.getX()-225 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }

                if(PossibilidadeDeCaptura[7].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]+225 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[8] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[8] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[8].equals("Posso capturar")
                        && pecaQueCaptura.getX()-300 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                if(PossibilidadeDeCaptura[8].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]+300 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[9] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[9] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[9].equals("Posso capturar")
                        && pecaQueCaptura.getX()-375 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                if(PossibilidadeDeCaptura[9].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]+375 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[10] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[10] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[10].equals("Posso capturar")
                        && pecaQueCaptura.getX()-450 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                if(PossibilidadeDeCaptura[10].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i] == pecaQueCaptura.getY() && posicaoDasPecasX[i]+450 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[11] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[11] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[11].equals("Posso capturar")
                        && pecaQueCaptura.getX()-525 == pecaAserCapturada.getX()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                    }
                }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
                
            
            //Vertical
            
            //Para cima
            try{
            
            if(pecaAserCapturada.getX() == pecaQueCaptura.getX()){
                
                //Cima
                if(pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+75 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[12] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[12] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[12].equals("Posso capturar")
                        && pecaQueCaptura.getY()-150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[12].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+150 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[13] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[13] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[13].equals("Posso capturar")
                        && pecaQueCaptura.getY()-225 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[13].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+225 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[14] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[14] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[14].equals("Posso capturar")
                        && pecaQueCaptura.getY()-300 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[14].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+300 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[15] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[15] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[15].equals("Posso capturar")
                        && pecaQueCaptura.getY()-375 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[15].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+375 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[16] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[16] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[16].equals("Posso capturar")
                        && pecaQueCaptura.getY()-450 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[16].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+450 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[17] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[17] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[17].equals("Posso capturar")
                        && pecaQueCaptura.getY()-525 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                }
            }catch(Exception e){
                
            }
                
               //Para baixo
               try{
            
            if(pecaAserCapturada.getX() == pecaQueCaptura.getX()){
                
                
                if(pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-75 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[18] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[18] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[18].equals("Posso capturar")
                        && pecaQueCaptura.getY()+150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[18].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-150 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[19] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[19] = "Posso capturar";
                    }
                
                }
                
                 
                    if(PossibilidadeDeCaptura[19].equals("Posso capturar")
                        && pecaQueCaptura.getY()+225 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[19].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-225 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[20] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[20] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[20].equals("Posso capturar")
                        && pecaQueCaptura.getY()+300 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[20].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-300 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[21] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[21] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[21].equals("Posso capturar")
                        && pecaQueCaptura.getY()+375 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[21].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-375 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[22] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[22] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[22].equals("Posso capturar")
                        && pecaQueCaptura.getY()+450 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                if(PossibilidadeDeCaptura[22].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-450 == pecaQueCaptura.getY() && posicaoDasPecasX[i] == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[23] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[23] = "Posso capturar";
                    }
                
                }
                 
                    if(PossibilidadeDeCaptura[23].equals("Posso capturar")
                        && pecaQueCaptura.getY()+525 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                }
                
                }
            }catch(Exception e){
                e.printStackTrace();
            }
                
            }
            
            if(quemSouEU.contains("Cavalo")){
                
                //Direita para cima
                if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                if(pecaQueCaptura.getX()+150 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //Esquerda para cima
                if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                if(pecaQueCaptura.getX()-150 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //Direita para baixo
                if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                if(pecaQueCaptura.getX()+150 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //Esquerda para baixo
                if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                if(pecaQueCaptura.getX()-150 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
            }
        
            if(quemSouEU.contains("Bispo") || quemSouEU.contains("Rainha")){
             
                for(int i = 0; i<28; i++){
                    PossibilidadeDeCaptura[i] = "Não posso capturar";
                }
                
                //Diagonal-cima-Direita
            if(pecaAserCapturada.getY() == pecaQueCaptura.getY()-75 
                    && pecaAserCapturada.getX() == pecaQueCaptura.getX()+75){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+75 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-75 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[0] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[0] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[0].equals("Posso capturar")
                        && pecaQueCaptura.getX()+150 == pecaAserCapturada.getX()
                        && pecaQueCaptura.getY()-150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[0].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+150 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-150 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[1] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[1] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[1].equals("Posso capturar")
                        && pecaQueCaptura.getX()+225 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-225 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[1].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+225 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-225 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[2] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[2] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[2].equals("Posso capturar")
                        && pecaQueCaptura.getX()+300 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-300 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[2].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+300 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-300 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[3] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[3] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[3].equals("Posso capturar")
                        && pecaQueCaptura.getX()+375 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-375 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[3].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+375 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-375 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[4] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[4] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[4].equals("Posso capturar")
                        && pecaQueCaptura.getX()+450 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-450 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[4].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+450 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-450 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[5] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[5] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[5].equals("Posso capturar")
                        && pecaQueCaptura.getX()+525 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-525 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    //Diagonal para cima-esquerda
                    
                    if(pecaAserCapturada.getY() == pecaQueCaptura.getY()-75 
                    && pecaAserCapturada.getX() == pecaQueCaptura.getX()-75){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+75 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+75 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[6] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[6] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[6].equals("Posso capturar")
                        && pecaQueCaptura.getX()-150 == pecaAserCapturada.getX()
                        && pecaQueCaptura.getY()-150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[6].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+150 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+150 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[7] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[7] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[7].equals("Posso capturar")
                        && pecaQueCaptura.getX()-225 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-225 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[7].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+225 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+225 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[8] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[8] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[8].equals("Posso capturar")
                        && pecaQueCaptura.getX()-300 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-300 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[8].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+300 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+300 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[9] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[9] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[9].equals("Posso capturar")
                        && pecaQueCaptura.getX()-375 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-375 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[9].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+375 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+375 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[10] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[10] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[10].equals("Posso capturar")
                        && pecaQueCaptura.getX()-450 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-450 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[10].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]+450 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+450 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[11] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[11] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[11].equals("Posso capturar")
                        && pecaQueCaptura.getX()-525 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()-525 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    //Diagonal para baixo-Direita
                    
                    if(pecaAserCapturada.getY() == pecaQueCaptura.getY()+75 
                    && pecaAserCapturada.getX() == pecaQueCaptura.getX()+75){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-75 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-75 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[12] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[12] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[12].equals("Posso capturar")
                        && pecaQueCaptura.getX()+150 == pecaAserCapturada.getX()
                        && pecaQueCaptura.getY()+150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[12].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-150 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-150 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[13] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[13] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[13].equals("Posso capturar")
                        && pecaQueCaptura.getX()+225 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+225 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[13].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-225 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-225 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[14] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[14] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[14].equals("Posso capturar")
                        && pecaQueCaptura.getX()+300 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+300 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[14].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-300 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-300 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[15] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[15] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[15].equals("Posso capturar")
                        && pecaQueCaptura.getX()+375 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+375 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[15].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-375 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-375 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[16] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[16] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[16].equals("Posso capturar")
                        && pecaQueCaptura.getX()+450 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+450 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[16].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-450 == pecaQueCaptura.getY() && posicaoDasPecasX[i]-450 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[17] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[17] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[17].equals("Posso capturar")
                        && pecaQueCaptura.getX()+525 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+525 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    //Diagonal para baixo-Esquerda
                    
                    if(pecaAserCapturada.getY() == pecaQueCaptura.getY()+75 
                    && pecaAserCapturada.getX() == pecaQueCaptura.getX()-75){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-75 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+75 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[18] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[18] = "Posso capturar";
                    }
                
                }
                
                if(PossibilidadeDeCaptura[18].equals("Posso capturar")
                        && pecaQueCaptura.getX()-150 == pecaAserCapturada.getX()
                        && pecaQueCaptura.getY()+150 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                
                if(PossibilidadeDeCaptura[18].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-150 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+150 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[19] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[19] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[19].equals("Posso capturar")
                        && pecaQueCaptura.getX()-225 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+225 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[19].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-225 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+225 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[20] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[20] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[20].equals("Posso capturar")
                        && pecaQueCaptura.getX()-300 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+300 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                
                    if(PossibilidadeDeCaptura[20].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-300 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+300 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[21] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[21] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[21].equals("Posso capturar")
                        && pecaQueCaptura.getX()-375 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+375 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[21].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-375 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+375 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[22] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[22] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[22].equals("Posso capturar")
                        && pecaQueCaptura.getX()-450 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+450 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                    if(PossibilidadeDeCaptura[22].equals("Posso capturar")){
                    
                    for(int i = 0; i<32; i++){
                
                    if(posicaoDasPecasY[i]-450 == pecaQueCaptura.getY() && posicaoDasPecasX[i]+450 == pecaQueCaptura.getX()){
                    
                        PossibilidadeDeCaptura[23] = "Não posso capturar";
                        break;
                    
                    }else{
                        PossibilidadeDeCaptura[23] = "Posso capturar";
                    }
                
                }
                    
                    if(PossibilidadeDeCaptura[23].equals("Posso capturar")
                        && pecaQueCaptura.getX()-525 == pecaAserCapturada.getX()
                            && pecaQueCaptura.getY()+525 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                        pecaAserCapturada.setVisible(false);
                        adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
                    
                }
                    
                }
                    
                }
    
            if(quemSouEU.contains("Rei")){
               
                //para a direita
                if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY() == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //para a esquerda
                if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY() == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //para cima
                if(pecaQueCaptura.getX() == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //para baixo
                if(pecaQueCaptura.getX() == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //Diagonal para cima
                if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //para a esquerda
                if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()-75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                //Diagonal para baixo
                if(pecaQueCaptura.getX()+75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
                if(pecaQueCaptura.getX()-75 == pecaAserCapturada.getX() 
                        && pecaQueCaptura.getY()+75 == pecaAserCapturada.getY()){
                    
                    pecaQueCaptura.setLocation(pecaAserCapturada.getX(), pecaAserCapturada.getY());
                    pecaAserCapturada.setVisible(false);
                    adicionandoLocalizacaoAposCaptura(pecaQueCaptura, pecaAserCapturada, quemSouEU, quemVaiSerCapturado, posicaoDasPecasY, posicaoDasPecasX);
            
                }
                
            }
            
            
            
            }
            
        }
        

    

