/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Movimento_das_Pecas.Peao;
import Movimento_das_Pecas.Torre;
import Movimento_das_Pecas.Cavalo;
import Movimento_das_Pecas.Bispo;
import Movimento_das_Pecas.Dama;
import Movimento_das_Pecas.Rei;
import Codigos_Extras.Captura;
import Codigos_Extras.MoverPeca;
import Codigos_Extras.Xeque_Rei_Branco;
import Codigos_Extras.Xeque_Rei_Negro;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author PabloCass
 */
public class Tabuleiro extends javax.swing.JFrame {

    /**
     * Creates new form Tabuleiro
     */
    public Tabuleiro() {
        initComponents();
        
    }
    
    
    String[] PossibiladeDeMover = new String[32];
    
    //Armazena posições de X e Y nos Arrays 
    int[] PossicaoDasPecasX = new int[32];
    int[] PossicaoDasPecasY = new int[32];
    
    String SouUM;
    JLabel Peca;
    Boolean Executar = true;
    String VezDeQuem = "Brancas";
    String ReiBrancoMexeu = "Não";
    String ReiNegroMexeu = "Não";
    String TorreBranca1Mexeu = "Não";
    String TorreBranca2Mexeu = "Não";
    String TorreNegra1Mexeu = "Não";
    String TorreNegra2Mexeu = "Não";
    String EuSouQuem;
    String EuSouQuemParaEnPassant = "";
    String EnpassantDispobivel = "Não";
    
    JLabel OqueSou;
    JLabel PecaQueCaptura;
    JLabel PecaAserCapturada;
    
    int imagem = 0;
    
    //Variavel que armazenará o peão a ser removido pelo En Passant;
    JLabel pecaAserRemovida_EnPassante;
    
    
    void recebendoPeca(JLabel oquesou){
        OqueSou = oquesou;
    }
    
    public void pecaQueCaptura(JLabel pecaQueCaptura){
        PecaQueCaptura = pecaQueCaptura;
    }
    
    public void removerEDeixarFalso(){
                        
                        Opcao.setVisible(false);
                        Opcao1.setVisible(false);
                        Opcao2.setVisible(false);
                        Opcao22.setVisible(false);
                        Opcao3.setVisible(false);
                        Opcao4.setVisible(false);
                        Opcao5.setVisible(false);
                        Opcao6.setVisible(false);
                        Opcao7.setVisible(false);
                        Opcao8.setVisible(false);
                        Opcao9.setVisible(false);
                        Opcao10.setVisible(false);
                        Opcao11.setVisible(false);
                        Opcao12.setVisible(false);
                        Opcao13.setVisible(false);
                        Opcao14.setVisible(false);
                        Opcao15.setVisible(false);
                        Opcao16.setVisible(false);
                        Opcao17.setVisible(false);
                        Opcao18.setVisible(false);
                        Opcao19.setVisible(false);
                        Opcao20.setVisible(false);
                        Opcao21.setVisible(false);
                        Opcao23.setVisible(false);
                        Opcao24.setVisible(false);
                        Opcao25.setVisible(false);
                        Opcao26.setVisible(false);
                        Opcao27.setVisible(false);
                        Opcao28.setVisible(false);
                        Opcao29.setVisible(false);
                        Opcao30.setVisible(false);
                        Opcao31.setVisible(false);
                        Opcao32.setVisible(false);
                        Opcao33.setVisible(false);
                        Opcao34.setVisible(false);
                        Opcao35.setVisible(false);
                        Opcao36.setVisible(false);
                        Opcao37.setVisible(false);
                        Opcao38.setVisible(false);
                        Opcao39.setVisible(false);
                        Opcao40.setVisible(false);
                        Opcao41.setVisible(false);
                        Opcao42.setVisible(false);
                        Opcao43.setVisible(false);
                        Opcao44.setVisible(false);
                        Opcao45.setVisible(false);
                        Opcao46.setVisible(false);
                        Opcao47.setVisible(false);
                        Opcao48.setVisible(false);
                        Opcao49.setVisible(false);
                        Opcao50.setVisible(false);
                        Opcao51.setVisible(false);
                        Opcao52.setVisible(false);
                        Opcao53.setVisible(false);
                        Opcao54.setVisible(false);
                        Opcao55.setVisible(false);
                        Opcao56.setVisible(false);
                        OpcaoRoquePequeno.setVisible(false);
                        OpcaoRoqueGrande.setVisible(false);
                        OpcaoEnPassanteEsquerda.setVisible(false);
                        OpcaoEnPassanteDireita.setVisible(false);
    }
    
    //Recebe o nome da peça
    //public void quemSouEu(String alguem, JLabel peca){
      //  SouUM = alguem;
        //Peca = peca;
    //}
    
    public void definirPosicoes(){
        
        if(Executar == true){
        //Array que armazena a possibildade de mover de acordo com a posição no array
        for(int i = 0; i<=31; i++){
            PossibiladeDeMover[i] = "Posso mover";
            //System.out.println(i+PossibiladeDeMover[i]);
        }
        
        //Define posição das peças no eixo X
        for(int i = 0; i<=31; i++){
            
            PossicaoDasPecasX[0] = 30;
            PossicaoDasPecasX[8] = 30;
            PossicaoDasPecasX[16] = 30;
            PossicaoDasPecasX[24] = 30;
            
            if(i>0 && i<8){
                
                PossicaoDasPecasX[i] = PossicaoDasPecasX[i-1] + 75; 
                
            }
            if(i>8 && i<16){
                
                PossicaoDasPecasX[i] = PossicaoDasPecasX[i-1] + 75; 
                
            }
            if(i>16 && i<24){
                
                PossicaoDasPecasX[i] = PossicaoDasPecasX[i-1] + 75; 
                
            }
            if(i>24 && i<32){
                
                PossicaoDasPecasX[i] = PossicaoDasPecasX[i-1] + 75; 
                
            }
        
            System.out.println(i+" "+PossicaoDasPecasX[i]);
        }
        
        //Define posição das peças no eixo Y
        for(int i = 0; i<=31; i++){
            
            if(i>=0 && i<8){
                
                PossicaoDasPecasY[i] = 550; 
                
            }
            if(i>=8 && i<16){
                
                PossicaoDasPecasY[i] = 475; 
                
            }
            if(i>=16 && i<24){
                
                PossicaoDasPecasY[i] = 25; 
                
            }
            if(i>=24 && i<32){
                
                PossicaoDasPecasY[i] = 100; 
                
            }
            System.out.println(i+" "+PossicaoDasPecasY[i]);
        }
        Executar = false;
        //JOptionPane.showMessageDialog(null, "ghdfgf");
        }
    }
    
    public void opcoes(JLabel opcao){
        MoverPeca moverPeca = new MoverPeca();
        moverPeca.recebendoOpcao(opcao, OqueSou);
        removerEDeixarFalso();
        adicionandoLocalizacao(OqueSou, PossicaoDasPecasY, PossicaoDasPecasX);
        //JOptionPane.showMessageDialog(null, PossicaoDasPecasX[8]+" "+PossicaoDasPecasY[8]);
        
        //Possibilidade de roque
        if(OqueSou.equals(Rei_Branco)){
            ReiBrancoMexeu = "Sim";
        }
        
        if(OqueSou.equals(Rei_Negro)){
            ReiNegroMexeu = "Sim";
        }
        
        if(OqueSou.equals(Torre_Branca1)){
            TorreBranca1Mexeu = "Sim";
        }
        
        if(OqueSou.equals(Torre_Branca2)){
            TorreBranca2Mexeu = "Sim";
        }
        
        if(OqueSou.equals(Torre_Negra1)){
            TorreNegra1Mexeu = "Sim";
        }
        
        if(OqueSou.equals(Torre_Negra2)){
            TorreNegra2Mexeu = "Sim";
        }
        
        //Possibilidade de En Passant;
        if(opcao.equals(Opcao1) && EuSouQuem.contains("Peão")){
            
            EnpassantDispobivel = "Sim";                
            pecaAserRemovida_EnPassante = OqueSou;            
            //JOptionPane.showMessageDialog(null, OqueSou.getName());
            
        }else{
            EnpassantDispobivel = "Não";
            pecaAserRemovida_EnPassante = null;
        }
        
    }
    
    public void adicionandoLocalizacao(JLabel peca, int[] PosicaoDasPecasY, int[] PosicaoDasPecasX){
        
        // Adicionando Localização nas peças Brancas
        
        if(peca.equals(Torre_Branca1)){
            PosicaoDasPecasX[0] = peca.getX();
            PosicaoDasPecasY[0] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Cavalo_Branco1)){
            PosicaoDasPecasX[1] = peca.getX();
            PosicaoDasPecasY[1] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Bispo_Branco_De_Casa_Escura)){
            PosicaoDasPecasX[2] = peca.getX();
            PosicaoDasPecasY[2] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Rainha_Branca)){
            PosicaoDasPecasX[3] = peca.getX();
            PosicaoDasPecasY[3] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Rei_Branco)){
            PosicaoDasPecasX[4] = peca.getX();
            PosicaoDasPecasY[4] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Bispo_Branco_De_Casa_Branca)){
            PosicaoDasPecasX[5] = peca.getX();
            PosicaoDasPecasY[5] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Cavalo_Branco2)){
            PosicaoDasPecasX[6] = peca.getX();
            PosicaoDasPecasY[6] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Torre_Branca2)){
            PosicaoDasPecasX[7] = peca.getX();
            PosicaoDasPecasY[7] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco1)){
            PosicaoDasPecasX[8] = peca.getX();
            PosicaoDasPecasY[8] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco2)){
            PosicaoDasPecasX[9] = peca.getX();
            PosicaoDasPecasY[9] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco3)){
            PosicaoDasPecasX[10] = peca.getX();
            PosicaoDasPecasY[10] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco4)){
            PosicaoDasPecasX[11] = peca.getX();
            PosicaoDasPecasY[11] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco5)){
            PosicaoDasPecasX[12] = peca.getX();
            PosicaoDasPecasY[12] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco6)){
            PosicaoDasPecasX[13] = peca.getX();
            PosicaoDasPecasY[13] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco7)){
            PosicaoDasPecasX[14] = peca.getX();
            PosicaoDasPecasY[14] = peca.getY();
            VezDeQuem = "Negras";
        }
        if(peca.equals(Peao_Branco8)){
            PosicaoDasPecasX[15] = peca.getX();
            PosicaoDasPecasY[15] = peca.getY();
            VezDeQuem = "Negras";
        }
        
        // Adicionando Localização das peças Negras
        
        if(peca.equals(Torre_Negra1)){
            PosicaoDasPecasX[16] = peca.getX();
            PosicaoDasPecasY[16] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Cavalo_Negro1)){
            PosicaoDasPecasX[17] = peca.getX();
            PosicaoDasPecasY[17] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Bispo_Negro_De_Casa_Branca)){
            PosicaoDasPecasX[18] = peca.getX();
            PosicaoDasPecasY[18] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Rainha_Negra)){
            PosicaoDasPecasX[19] = peca.getX();
            PosicaoDasPecasY[19] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Rei_Negro)){
            PosicaoDasPecasX[20] = peca.getX();
            PosicaoDasPecasY[20] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Bispo_Negro_De_Casa_Escura)){
            PosicaoDasPecasX[21] = peca.getX();
            PosicaoDasPecasY[21] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Cavalo_Negro2)){
            PosicaoDasPecasX[22] = peca.getX();
            PosicaoDasPecasY[22] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Torre_Negra2)){
            PosicaoDasPecasX[23] = peca.getX();
            PosicaoDasPecasY[23] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro1)){
            PosicaoDasPecasX[24] = peca.getX();
            PosicaoDasPecasY[24] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro2)){
            PosicaoDasPecasX[25] = peca.getX();
            PosicaoDasPecasY[25] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro3)){
            PosicaoDasPecasX[26] = peca.getX();
            PosicaoDasPecasY[26] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro4)){
            PosicaoDasPecasX[27] = peca.getX();
            PosicaoDasPecasY[27] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro5)){
            PosicaoDasPecasX[28] = peca.getX();
            PosicaoDasPecasY[28] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro6)){
            PosicaoDasPecasX[29] = peca.getX();
            PosicaoDasPecasY[29] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro7)){
            PosicaoDasPecasX[30] = peca.getX();
            PosicaoDasPecasY[30] = peca.getY();
            VezDeQuem = "Brancas";
        }
        if(peca.equals(Peao_Negro8)){
            PosicaoDasPecasX[31] = peca.getX();
            PosicaoDasPecasY[31] = peca.getY();
            VezDeQuem = "Brancas";
        }
        
        Xeque_Rei_Branco xeque = new Xeque_Rei_Branco();
        xeque.verificarXeque(Rei_Branco, Rei_Negro, PosicaoDasPecasX, PosicaoDasPecasY);
        
        Xeque_Rei_Negro xeque2 = new Xeque_Rei_Negro();
        xeque2.verificarXeque(Rei_Branco, Rei_Negro, PosicaoDasPecasX, PosicaoDasPecasY);
    }    
        //JOptionPane.showMessageDialog(null, peca.getX()+" "+peca.getY());
        
        public void adicionandoLocalizacaoAposCaptura(JLabel pecaQueCaptura, JLabel pecaAserCapturada, 
                String quemSouEU, String capturado, int[] PosicaoDasPecasY, int[] PosicaoDasPecasX){
        
        // Adicionando Localização nas peças Brancas
        
        if(quemSouEU.equals("Torre Branca1")){
            PosicaoDasPecasX[0] = pecaQueCaptura.getX();
            PosicaoDasPecasY[0] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Cavalo Branco1")){
            PosicaoDasPecasX[1] = pecaQueCaptura.getX();
            PosicaoDasPecasY[1] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Bispo Branco1")){
            PosicaoDasPecasX[2] = pecaQueCaptura.getX();
            PosicaoDasPecasY[2] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Rainha Branca")){
            PosicaoDasPecasX[3] = pecaQueCaptura.getX();
            PosicaoDasPecasY[3] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Rei Branco")){
            PosicaoDasPecasX[4] = pecaQueCaptura.getX();
            PosicaoDasPecasY[4] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Bispo Branco2")){
            PosicaoDasPecasX[5] = pecaQueCaptura.getX();
            PosicaoDasPecasY[5] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Cavalo Branco2")){
            PosicaoDasPecasX[6] = pecaQueCaptura.getX();
            PosicaoDasPecasY[6] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Torre Branca2")){
            PosicaoDasPecasX[7] = pecaQueCaptura.getX();
            PosicaoDasPecasY[7] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco1")){
            PosicaoDasPecasX[8] = pecaQueCaptura.getX();
            PosicaoDasPecasY[8] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
            //JOptionPane.showMessageDialog(null, PosicaoDasPecasX[8]+" "+PosicaoDasPecasY[8]+" "+VezDeQuem);
            
        }
        if(quemSouEU.equals("Peão Branco2")){
            PosicaoDasPecasX[9] = pecaQueCaptura.getX();
            PosicaoDasPecasY[9] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco3")){
            PosicaoDasPecasX[10] = pecaQueCaptura.getX();
            PosicaoDasPecasY[10] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco4")){
            PosicaoDasPecasX[11] = pecaQueCaptura.getX();
            PosicaoDasPecasY[11] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco5")){
            PosicaoDasPecasX[12] = pecaQueCaptura.getX();
            PosicaoDasPecasY[12] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco6")){
            PosicaoDasPecasX[13] = pecaQueCaptura.getX();
            PosicaoDasPecasY[13] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco7")){
            PosicaoDasPecasX[14] = pecaQueCaptura.getX();
            PosicaoDasPecasY[14] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        if(quemSouEU.equals("Peão Branco8")){
            PosicaoDasPecasX[15] = pecaQueCaptura.getX();
            PosicaoDasPecasY[15] = pecaQueCaptura.getY();
            VezDeQuem = "Negras";
        }
        
        // Adicionando Localização das peças Negras
        
        if(quemSouEU.equals("Torre Negra1")){
            PosicaoDasPecasX[16] = pecaQueCaptura.getX();
            PosicaoDasPecasY[16] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Cavalo Negro1")){
            PosicaoDasPecasX[17] = pecaQueCaptura.getX();
            PosicaoDasPecasY[17] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Bispo Negro1")){
            PosicaoDasPecasX[18] = pecaQueCaptura.getX();
            PosicaoDasPecasY[18] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Rainha Negra")){
            PosicaoDasPecasX[19] = pecaQueCaptura.getX();
            PosicaoDasPecasY[19] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Rei Negro")){
            PosicaoDasPecasX[20] = pecaQueCaptura.getX();
            PosicaoDasPecasY[20] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Bispo Negro2")){
            PosicaoDasPecasX[21] = pecaQueCaptura.getX();
            PosicaoDasPecasY[21] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Cavalo Negro2")){
            PosicaoDasPecasX[22] = pecaQueCaptura.getX();
            PosicaoDasPecasY[22] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Torre Negra2")){
            PosicaoDasPecasX[23] = pecaQueCaptura.getX();
            PosicaoDasPecasY[23] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro1")){
            PosicaoDasPecasX[24] = pecaQueCaptura.getX();
            PosicaoDasPecasY[24] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro2")){
            PosicaoDasPecasX[25] = pecaQueCaptura.getX();
            PosicaoDasPecasY[25] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
            
        }
        if(quemSouEU.equals("Peão Negro3")){
            PosicaoDasPecasX[26] = pecaQueCaptura.getX();
            PosicaoDasPecasY[26] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro4")){
            PosicaoDasPecasX[27] = pecaQueCaptura.getX();
            PosicaoDasPecasY[27] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro5")){
            PosicaoDasPecasX[28] = pecaQueCaptura.getX();
            PosicaoDasPecasY[28] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro6")){
            PosicaoDasPecasX[29] = pecaQueCaptura.getX();
            PosicaoDasPecasY[29] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro7")){
            PosicaoDasPecasX[30] = pecaQueCaptura.getX();
            PosicaoDasPecasY[30] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        if(quemSouEU.equals("Peão Negro8")){
            PosicaoDasPecasX[31] = pecaQueCaptura.getX();
            PosicaoDasPecasY[31] = pecaQueCaptura.getY();
            VezDeQuem = "Brancas";
        }
        
        
        
        //Zerar valores
        if(capturado.equals("Torre Branca1")){
            PosicaoDasPecasX[0] = 0;
            PosicaoDasPecasY[0] = 0;
         
        }
        if(capturado.equals("Cavalo Branco1")){
            PosicaoDasPecasX[1] = 0;
            PosicaoDasPecasY[1] = 0;
            //System.out.println("teste");
        }
        if(capturado.equals("Bispo Branco1")){
            PosicaoDasPecasX[2] = 0;
            PosicaoDasPecasY[2] = 0;
         
        }
        if(capturado.equals("Rainha Branca")){
            PosicaoDasPecasX[3] = 0;
            PosicaoDasPecasY[3] = 0;
            
        }
        if(capturado.equals("Rei Branco")){
            PosicaoDasPecasX[4] = 0;
            PosicaoDasPecasY[4] = 0;
         
        }
        if(capturado.equals("Bispo Branco1")){
            PosicaoDasPecasX[5] = 0;
            PosicaoDasPecasY[5] = 0;
         
        }
        if(capturado.equals("Cavalo Branco2")){
            PosicaoDasPecasX[6] = 0;
            PosicaoDasPecasY[6] = 0;
         
        }
        if(capturado.equals("Torre Branca2")){
            PosicaoDasPecasX[7] = 0;
            PosicaoDasPecasY[7] = 0;
         
        }
        if(capturado.equals("Peão Branco1")){
            PosicaoDasPecasX[8] = 0;
            PosicaoDasPecasY[8] = 0;
            
        }
        if(capturado.equals("Peão Branco2")){
            PosicaoDasPecasX[9] = 0;
            PosicaoDasPecasY[9] = 0;
         
        }
        if(capturado.equals("Peão Branco3")){
            PosicaoDasPecasX[10] = 0;
            PosicaoDasPecasY[10] = 0;
         
        }
        if(capturado.equals("Peão Branco4")){
            PosicaoDasPecasX[11] = 0;
            PosicaoDasPecasY[11] = 0;
         
        }
        if(capturado.equals("Peão Branco5")){
            PosicaoDasPecasX[12] = 0;
            PosicaoDasPecasY[12] = 0;
         
        }
        if(capturado.equals("Peão Branco6")){
            PosicaoDasPecasX[13] = 0;
            PosicaoDasPecasY[13] = 0;
         
        }
        if(capturado.equals("Peão Branco7")){
            PosicaoDasPecasX[14] = 0;
            PosicaoDasPecasY[14] = 0;
         
        }
        if(quemSouEU.equals("Peão Branco8")){
            PosicaoDasPecasX[15] = 0;
            PosicaoDasPecasY[15] = 0;
         
        }
        
        // Adicionando Localização das peças Negras
        
        if(capturado.equals("Torre Negra1")){
            PosicaoDasPecasX[16] = 0;
            PosicaoDasPecasY[16] = 0;
         
        }
        if(capturado.equals("Cavalo Negro1")){
            PosicaoDasPecasX[17] = 0;
            PosicaoDasPecasY[17] = 0;
            
        }
        if(capturado.equals("Bispo Negro1")){
            PosicaoDasPecasX[18] = 0;
            PosicaoDasPecasY[18] = 0;
         
        }
        if(capturado.equals("Rainha Negra")){
            PosicaoDasPecasX[19] = 0;
            PosicaoDasPecasY[19] = 0;
         
        }
        if(capturado.equals("Rei Negro")){
            PosicaoDasPecasX[20] = 0;
            PosicaoDasPecasY[20] = 0;
         
        }
        if(capturado.equals("Bispo Negro1")){
            PosicaoDasPecasX[21] = 0;
            PosicaoDasPecasY[21] = 0;
         
        }
        if(capturado.equals("Cavalo Negro2")){
            PosicaoDasPecasX[22] = 0;
            PosicaoDasPecasY[22] = 0;
         
        }
        if(capturado.equals("Torre Negra2")){
            PosicaoDasPecasX[23] = 0;
            PosicaoDasPecasY[23] = 0;
         
        }
        if(capturado.equals("Peão Negro1")){
            PosicaoDasPecasX[24] = 0;
            PosicaoDasPecasY[24] = 0;
         
        }
        if(capturado.equals("Peão Negro2")){
            PosicaoDasPecasX[25] = 0;
            PosicaoDasPecasY[25] = 0;
         
        }
        if(capturado.equals("Peão Negro3")){
            PosicaoDasPecasX[26] = 0;
            PosicaoDasPecasY[26] = 0;
         
        }
        if(capturado.equals("Peão Negro4")){
            PosicaoDasPecasX[27] = 0;
            PosicaoDasPecasY[27] = 0;
         
        }
        if(capturado.equals("Peão Negro5")){
            PosicaoDasPecasX[28] = 0;
            PosicaoDasPecasY[28] = 0;
         
        }
        if(capturado.equals("Peão Negro6")){
            PosicaoDasPecasX[29] = 0;
            PosicaoDasPecasY[29] = 0;
         
        }
        if(capturado.equals("Peão Negro7")){
            PosicaoDasPecasX[30] = 0;
            PosicaoDasPecasY[30] = 0;
         
        }
        if(capturado.equals("Peão Negro8")){
            PosicaoDasPecasX[31] = 0;
            PosicaoDasPecasY[31] = 0;
         
        }
        
            
        
    }
    
        public void verificarXeque(){
            
        Xeque_Rei_Branco xeque = new Xeque_Rei_Branco();
        xeque.verificarXeque(Rei_Branco, Rei_Negro, PossicaoDasPecasX, PossicaoDasPecasY);
        
        Xeque_Rei_Negro xeque2 = new Xeque_Rei_Negro();
        xeque2.verificarXeque(Rei_Branco, Rei_Negro, PossicaoDasPecasX, PossicaoDasPecasY);
            
        }
        
        public void adicionandoLocalizacaoDoEnPassant(JLabel oQueSou, JLabel pecaAserRemovida){
            
            if(oQueSou.equals(Peao_Branco1)){
            PossicaoDasPecasX[8] = oQueSou.getX();
            PossicaoDasPecasY[8] = oQueSou.getY();
            VezDeQuem = "Negras";
            //JOptionPane.showMessageDialog(null, PosicaoDasPecasX[8]+" "+PosicaoDasPecasY[8]+" "+VezDeQuem);
            
        }
        if(oQueSou.equals(Peao_Branco2)){
            PossicaoDasPecasX[9] = oQueSou.getX();
            PossicaoDasPecasY[9] = oQueSou.getY();
            VezDeQuem = "Negras";
        }
        if(oQueSou.equals(Peao_Branco3)){
            PossicaoDasPecasX[10] = oQueSou.getX();
            PossicaoDasPecasY[10] = oQueSou.getY();
            VezDeQuem = "Negras";
        }
        if(oQueSou.equals(Peao_Branco4)){
            PossicaoDasPecasX[11] = oQueSou.getX();
            PossicaoDasPecasY[11] = oQueSou.getY();
            VezDeQuem = "Negras";
        }
        if(oQueSou.equals(Peao_Branco5)){
            PossicaoDasPecasX[12] = oQueSou.getX();
            PossicaoDasPecasY[12] = oQueSou.getY();
            VezDeQuem = "Negras";
            //JOptionPane.showMessageDialog(null, oQueSou.getX()+" "+oQueSou.getY());
        }
        if(oQueSou.equals(Peao_Branco6)){
            PossicaoDasPecasX[13] = oQueSou.getX();
            PossicaoDasPecasY[13] = oQueSou.getY();
            VezDeQuem = "Negras";
        }
        if(oQueSou.equals(Peao_Branco7)){
            PossicaoDasPecasX[14] = oQueSou.getX();
            PossicaoDasPecasY[14] = oQueSou.getY();
            VezDeQuem = "Negras";
        }
        if(oQueSou.equals(Peao_Branco8)){
            PossicaoDasPecasX[15] = oQueSou.getX();
            PossicaoDasPecasY[15] = oQueSou.getY();
            VezDeQuem = "Negras";
        }
            
        if(oQueSou.equals(Peao_Negro1)){
            PossicaoDasPecasX[24] = oQueSou.getX();
            PossicaoDasPecasY[24] = oQueSou.getY();
            VezDeQuem = "Brancas";
            //JOptionPane.showMessageDialog(null, PosicaoDasPecasX[8]+" "+PosicaoDasPecasY[8]+" "+VezDeQuem);
            
        }
        if(oQueSou.equals(Peao_Negro2)){
            PossicaoDasPecasX[25] = oQueSou.getX();
            PossicaoDasPecasY[25] = oQueSou.getY();
            VezDeQuem = "Brancas";
        }
        if(oQueSou.equals(Peao_Negro3)){
            PossicaoDasPecasX[26] = oQueSou.getX();
            PossicaoDasPecasY[26] = oQueSou.getY();
            VezDeQuem = "Brancas";
        }
        if(oQueSou.equals(Peao_Negro4)){
            PossicaoDasPecasX[27] = oQueSou.getX();
            PossicaoDasPecasY[27] = oQueSou.getY();
            VezDeQuem = "Brancas";
        }
        if(oQueSou.equals(Peao_Negro5)){
            PossicaoDasPecasX[28] = oQueSou.getX();
            PossicaoDasPecasY[28] = oQueSou.getY();
            VezDeQuem = "Brancas";
            
        }
        if(oQueSou.equals(Peao_Negro6)){
            PossicaoDasPecasX[29] = oQueSou.getX();
            PossicaoDasPecasY[29] = oQueSou.getY();
            VezDeQuem = "Brancas";
        }
        if(oQueSou.equals(Peao_Negro7)){
            PossicaoDasPecasX[30] = oQueSou.getX();
            PossicaoDasPecasY[30] = oQueSou.getY();
            VezDeQuem = "Brancas";
        }
        if(oQueSou.equals(Peao_Negro8)){
            PossicaoDasPecasX[31] = oQueSou.getX();
            PossicaoDasPecasY[31] = oQueSou.getY();
            VezDeQuem = "Brancas";
        }
        
        //Zerar valores
        
        if(pecaAserRemovida.equals(Peao_Branco1)){
            PossicaoDasPecasX[8] = 0;
            PossicaoDasPecasY[8] = 0;
            
            //JOptionPane.showMessageDialog(null, PosicaoDasPecasX[8]+" "+PosicaoDasPecasY[8]+" "+VezDeQuem);
            
        }
        if(pecaAserRemovida.equals(Peao_Branco2)){
            PossicaoDasPecasX[9] = 0;
            PossicaoDasPecasY[9] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Branco3)){
            PossicaoDasPecasX[10] = 0;
            PossicaoDasPecasY[10] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Branco4)){
            PossicaoDasPecasX[11] = 0;
            PossicaoDasPecasY[11] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Branco5)){
            PossicaoDasPecasX[12] = 0;
            PossicaoDasPecasY[12] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Branco6)){
            PossicaoDasPecasX[13] = 0;
            PossicaoDasPecasY[13] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Branco7)){
            PossicaoDasPecasX[14] = 0;
            PossicaoDasPecasY[14] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Branco8)){
            PossicaoDasPecasX[15] = 0;
            PossicaoDasPecasY[15] = 0;
            
        }
            
        if(pecaAserRemovida.equals(Peao_Negro1)){
            PossicaoDasPecasX[24] = 0;
            PossicaoDasPecasY[24] = 0;
            
            //JOptionPane.showMessageDialog(null, PosicaoDasPecasX[8]+" "+PosicaoDasPecasY[8]+" "+VezDeQuem);
            
        }
        if(pecaAserRemovida.equals(Peao_Negro2)){
            PossicaoDasPecasX[25] = 0;
            PossicaoDasPecasY[25] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Negro3)){
            PossicaoDasPecasX[26] = 0;
            PossicaoDasPecasY[26] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Negro4)){
            PossicaoDasPecasX[27] = 0;
            PossicaoDasPecasY[27] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Negro5)){
            PossicaoDasPecasX[28] = 0;
            PossicaoDasPecasY[28] = 0;
            
            
        }
        if(pecaAserRemovida.equals(Peao_Negro6)){
            PossicaoDasPecasX[29] = 0;
            PossicaoDasPecasY[29] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Negro7)){
            PossicaoDasPecasX[30] = 0;
            PossicaoDasPecasY[30] = 0;
            
        }
        if(pecaAserRemovida.equals(Peao_Negro8)){
            PossicaoDasPecasX[31] = 0;
            PossicaoDasPecasY[31] = 0;
            
        }
        
        Xeque_Rei_Branco xeque = new Xeque_Rei_Branco();
        xeque.verificarXeque(Rei_Branco, Rei_Negro, PossicaoDasPecasX, PossicaoDasPecasY);
        
        Xeque_Rei_Negro xeque2 = new Xeque_Rei_Negro();
        xeque2.verificarXeque(Rei_Branco, Rei_Negro, PossicaoDasPecasX, PossicaoDasPecasY);
        
        }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Torre_Branca2 = new javax.swing.JLabel();
        Rei_Branco = new javax.swing.JLabel();
        Peao_Branco2 = new javax.swing.JLabel();
        Cavalo_Branco1 = new javax.swing.JLabel();
        Cavalo_Branco2 = new javax.swing.JLabel();
        Bispo_Branco_De_Casa_Branca = new javax.swing.JLabel();
        Bispo_Branco_De_Casa_Escura = new javax.swing.JLabel();
        Rainha_Branca = new javax.swing.JLabel();
        Cavalo_Negro2 = new javax.swing.JLabel();
        Peao_Branco3 = new javax.swing.JLabel();
        Peao_Branco4 = new javax.swing.JLabel();
        Peao_Branco5 = new javax.swing.JLabel();
        Peao_Branco6 = new javax.swing.JLabel();
        Peao_Branco7 = new javax.swing.JLabel();
        Peao_Branco8 = new javax.swing.JLabel();
        Torre_Branca1 = new javax.swing.JLabel();
        Peao_Negro2 = new javax.swing.JLabel();
        Bispo_Negro_De_Casa_Escura = new javax.swing.JLabel();
        Rei_Negro = new javax.swing.JLabel();
        Rainha_Negra = new javax.swing.JLabel();
        Bispo_Negro_De_Casa_Branca = new javax.swing.JLabel();
        Cavalo_Negro1 = new javax.swing.JLabel();
        Torre_Negra2 = new javax.swing.JLabel();
        Torre_Negra1 = new javax.swing.JLabel();
        Peao_Negro3 = new javax.swing.JLabel();
        Peao_Negro4 = new javax.swing.JLabel();
        Peao_Negro5 = new javax.swing.JLabel();
        Peao_Negro6 = new javax.swing.JLabel();
        Peao_Negro7 = new javax.swing.JLabel();
        Peao_Negro8 = new javax.swing.JLabel();
        Peao_Negro1 = new javax.swing.JLabel();
        Peao_Branco1 = new javax.swing.JLabel();
        Opcao = new javax.swing.JLabel();
        Opcao1 = new javax.swing.JLabel();
        Opcao2 = new javax.swing.JLabel();
        Opcao3 = new javax.swing.JLabel();
        Opcao4 = new javax.swing.JLabel();
        Opcao5 = new javax.swing.JLabel();
        Opcao6 = new javax.swing.JLabel();
        Opcao7 = new javax.swing.JLabel();
        Opcao8 = new javax.swing.JLabel();
        Opcao9 = new javax.swing.JLabel();
        Opcao10 = new javax.swing.JLabel();
        Opcao11 = new javax.swing.JLabel();
        Opcao12 = new javax.swing.JLabel();
        Opcao13 = new javax.swing.JLabel();
        Opcao14 = new javax.swing.JLabel();
        Opcao15 = new javax.swing.JLabel();
        Opcao16 = new javax.swing.JLabel();
        Opcao17 = new javax.swing.JLabel();
        Opcao18 = new javax.swing.JLabel();
        Opcao19 = new javax.swing.JLabel();
        Opcao20 = new javax.swing.JLabel();
        Opcao21 = new javax.swing.JLabel();
        Opcao22 = new javax.swing.JLabel();
        Opcao23 = new javax.swing.JLabel();
        Opcao24 = new javax.swing.JLabel();
        Opcao25 = new javax.swing.JLabel();
        Opcao26 = new javax.swing.JLabel();
        Opcao27 = new javax.swing.JLabel();
        Opcao28 = new javax.swing.JLabel();
        Opcao29 = new javax.swing.JLabel();
        Opcao30 = new javax.swing.JLabel();
        Opcao31 = new javax.swing.JLabel();
        Opcao32 = new javax.swing.JLabel();
        Opcao33 = new javax.swing.JLabel();
        Opcao34 = new javax.swing.JLabel();
        Opcao35 = new javax.swing.JLabel();
        Opcao36 = new javax.swing.JLabel();
        Opcao37 = new javax.swing.JLabel();
        Opcao38 = new javax.swing.JLabel();
        Opcao39 = new javax.swing.JLabel();
        Opcao40 = new javax.swing.JLabel();
        Opcao41 = new javax.swing.JLabel();
        Opcao42 = new javax.swing.JLabel();
        Opcao43 = new javax.swing.JLabel();
        Opcao44 = new javax.swing.JLabel();
        Opcao45 = new javax.swing.JLabel();
        Opcao46 = new javax.swing.JLabel();
        Opcao47 = new javax.swing.JLabel();
        Opcao48 = new javax.swing.JLabel();
        Opcao49 = new javax.swing.JLabel();
        Opcao50 = new javax.swing.JLabel();
        Opcao51 = new javax.swing.JLabel();
        Opcao52 = new javax.swing.JLabel();
        Opcao53 = new javax.swing.JLabel();
        Opcao54 = new javax.swing.JLabel();
        Opcao55 = new javax.swing.JLabel();
        Opcao56 = new javax.swing.JLabel();
        OpcaoRoquePequeno = new javax.swing.JLabel();
        OpcaoRoqueGrande = new javax.swing.JLabel();
        OpcaoEnPassanteEsquerda = new javax.swing.JLabel();
        OpcaoEnPassanteDireita = new javax.swing.JLabel();
        TabuleiroIMG = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Fundo_Jogar = new javax.swing.JPanel();
        Jogar1 = new javax.swing.JLabel();
        Fundo_salvar = new javax.swing.JPanel();
        Jogar2 = new javax.swing.JLabel();
        Fundo_partidas = new javax.swing.JPanel();
        Jogar = new javax.swing.JLabel();
        Fundo_sair = new javax.swing.JPanel();
        Jogar4 = new javax.swing.JLabel();
        Fundo_editar = new javax.swing.JPanel();
        Jogar3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(128, 128, 84));
        jPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(106, 106, 73));
        jPanel6.setLayout(null);
        jPanel6.add(jLabel1);
        jLabel1.setBounds(0, 0, 30, 650);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(630, 0, 30, 700);

        jPanel2.setBackground(new java.awt.Color(106, 106, 73));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("8");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 40, 30, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("7");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 120, 30, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("6");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 190, 30, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("5");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 270, 30, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("4");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 350, 30, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("3");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 420, 30, 30);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 500, 30, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 570, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 30, 700);

        jPanel4.setBackground(new java.awt.Color(106, 106, 73));
        jPanel4.setLayout(null);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 0, 630, 25);

        jPanel5.setBackground(new java.awt.Color(106, 106, 73));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("D");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(250, 0, 30, 25);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("A");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(20, 0, 30, 25);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("B");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(100, 0, 30, 25);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("E");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(320, 0, 30, 25);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("F");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(400, 0, 30, 25);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("G");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(470, 0, 30, 25);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("H");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(550, 0, 30, 25);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("C");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(170, 0, 30, 25);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(30, 625, 630, 25);

        Torre_Branca2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/torre-branca.png"))); // NOI18N
        Torre_Branca2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Torre_Branca2MouseClicked(evt);
            }
        });
        Torre_Branca2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Torre_Branca2ComponentHidden(evt);
            }
        });
        jPanel1.add(Torre_Branca2);
        Torre_Branca2.setBounds(555, 550, 70, 70);

        Rei_Branco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/rei-branco.png"))); // NOI18N
        Rei_Branco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rei_BrancoMouseClicked(evt);
            }
        });
        jPanel1.add(Rei_Branco);
        Rei_Branco.setBounds(330, 550, 75, 75);

        Peao_Branco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco2MouseClicked(evt);
            }
        });
        Peao_Branco2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco2ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco2);
        Peao_Branco2.setBounds(105, 475, 75, 75);

        Cavalo_Branco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/Cavalo-Branco1.png"))); // NOI18N
        Cavalo_Branco1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cavalo_Branco1MouseClicked(evt);
            }
        });
        Cavalo_Branco1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Cavalo_Branco1ComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                Cavalo_Branco1ComponentMoved(evt);
            }
        });
        jPanel1.add(Cavalo_Branco1);
        Cavalo_Branco1.setBounds(105, 550, 75, 75);

        Cavalo_Branco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/Cavalo-Branco2.png"))); // NOI18N
        Cavalo_Branco2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cavalo_Branco2MouseClicked(evt);
            }
        });
        Cavalo_Branco2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Cavalo_Branco2ComponentHidden(evt);
            }
        });
        jPanel1.add(Cavalo_Branco2);
        Cavalo_Branco2.setBounds(480, 550, 75, 75);

        Bispo_Branco_De_Casa_Branca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/Bispo-Branco1.png"))); // NOI18N
        Bispo_Branco_De_Casa_Branca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bispo_Branco_De_Casa_BrancaMouseClicked(evt);
            }
        });
        Bispo_Branco_De_Casa_Branca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Bispo_Branco_De_Casa_BrancaComponentHidden(evt);
            }
        });
        jPanel1.add(Bispo_Branco_De_Casa_Branca);
        Bispo_Branco_De_Casa_Branca.setBounds(405, 550, 75, 70);

        Bispo_Branco_De_Casa_Escura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/Bispo-Branco2.png"))); // NOI18N
        Bispo_Branco_De_Casa_Escura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bispo_Branco_De_Casa_EscuraMouseClicked(evt);
            }
        });
        Bispo_Branco_De_Casa_Escura.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Bispo_Branco_De_Casa_EscuraComponentHidden(evt);
            }
        });
        jPanel1.add(Bispo_Branco_De_Casa_Escura);
        Bispo_Branco_De_Casa_Escura.setBounds(180, 550, 75, 75);

        Rainha_Branca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/dama-branca.png"))); // NOI18N
        Rainha_Branca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rainha_BrancaMouseClicked(evt);
            }
        });
        Rainha_Branca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Rainha_BrancaComponentHidden(evt);
            }
        });
        jPanel1.add(Rainha_Branca);
        Rainha_Branca.setBounds(255, 550, 70, 70);

        Cavalo_Negro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/cavalo-cortado2.png"))); // NOI18N
        Cavalo_Negro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cavalo_Negro2MouseClicked(evt);
            }
        });
        Cavalo_Negro2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Cavalo_Negro2ComponentHidden(evt);
            }
        });
        jPanel1.add(Cavalo_Negro2);
        Cavalo_Negro2.setBounds(480, 25, 75, 75);

        Peao_Branco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco3MouseClicked(evt);
            }
        });
        Peao_Branco3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco3ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco3);
        Peao_Branco3.setBounds(180, 475, 75, 70);

        Peao_Branco4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco4MouseClicked(evt);
            }
        });
        Peao_Branco4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco4ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco4);
        Peao_Branco4.setBounds(255, 475, 75, 75);

        Peao_Branco5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco5MouseClicked(evt);
            }
        });
        Peao_Branco5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco5ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco5);
        Peao_Branco5.setBounds(330, 475, 75, 70);

        Peao_Branco6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco6MouseClicked(evt);
            }
        });
        Peao_Branco6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco6ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco6);
        Peao_Branco6.setBounds(405, 475, 75, 75);

        Peao_Branco7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco7MouseClicked(evt);
            }
        });
        Peao_Branco7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco7ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco7);
        Peao_Branco7.setBounds(480, 475, 75, 70);

        Peao_Branco8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco8MouseClicked(evt);
            }
        });
        Peao_Branco8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco8ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Branco8);
        Peao_Branco8.setBounds(555, 475, 75, 75);

        Torre_Branca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/torre-branca.png"))); // NOI18N
        Torre_Branca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Torre_Branca1MouseClicked(evt);
            }
        });
        Torre_Branca1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Torre_Branca1ComponentHidden(evt);
            }
        });
        jPanel1.add(Torre_Branca1);
        Torre_Branca1.setBounds(30, 550, 75, 75);

        Peao_Negro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro2MouseClicked(evt);
            }
        });
        Peao_Negro2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro2ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro2);
        Peao_Negro2.setBounds(105, 100, 70, 75);

        Bispo_Negro_De_Casa_Escura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/bispo-cortado1.png"))); // NOI18N
        Bispo_Negro_De_Casa_Escura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bispo_Negro_De_Casa_EscuraMouseClicked(evt);
            }
        });
        Bispo_Negro_De_Casa_Escura.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Bispo_Negro_De_Casa_EscuraComponentHidden(evt);
            }
        });
        jPanel1.add(Bispo_Negro_De_Casa_Escura);
        Bispo_Negro_De_Casa_Escura.setBounds(405, 25, 75, 75);

        Rei_Negro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/rei-cortado.png"))); // NOI18N
        Rei_Negro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rei_NegroMouseClicked(evt);
            }
        });
        Rei_Negro.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Rei_NegroComponentHidden(evt);
            }
        });
        jPanel1.add(Rei_Negro);
        Rei_Negro.setBounds(330, 25, 75, 75);

        Rainha_Negra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rainha_Negra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/dama-cortada1.png"))); // NOI18N
        Rainha_Negra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rainha_NegraMouseClicked(evt);
            }
        });
        Rainha_Negra.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Rainha_NegraComponentHidden(evt);
            }
        });
        jPanel1.add(Rainha_Negra);
        Rainha_Negra.setBounds(255, 25, 75, 75);

        Bispo_Negro_De_Casa_Branca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/bispo-cortado2.png"))); // NOI18N
        Bispo_Negro_De_Casa_Branca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bispo_Negro_De_Casa_BrancaMouseClicked(evt);
            }
        });
        Bispo_Negro_De_Casa_Branca.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Bispo_Negro_De_Casa_BrancaComponentHidden(evt);
            }
        });
        jPanel1.add(Bispo_Negro_De_Casa_Branca);
        Bispo_Negro_De_Casa_Branca.setBounds(180, 25, 75, 70);

        Cavalo_Negro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/cavalo-cortado.png"))); // NOI18N
        Cavalo_Negro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cavalo_Negro1MouseClicked(evt);
            }
        });
        Cavalo_Negro1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Cavalo_Negro1ComponentHidden(evt);
            }
        });
        jPanel1.add(Cavalo_Negro1);
        Cavalo_Negro1.setBounds(105, 25, 75, 75);

        Torre_Negra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/torre-cortada.png"))); // NOI18N
        Torre_Negra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Torre_Negra2MouseClicked(evt);
            }
        });
        Torre_Negra2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Torre_Negra2ComponentHidden(evt);
            }
        });
        jPanel1.add(Torre_Negra2);
        Torre_Negra2.setBounds(555, 25, 75, 75);

        Torre_Negra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/torre-cortada.png"))); // NOI18N
        Torre_Negra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Torre_Negra1MouseClicked(evt);
            }
        });
        Torre_Negra1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Torre_Negra1ComponentHidden(evt);
            }
        });
        jPanel1.add(Torre_Negra1);
        Torre_Negra1.setBounds(30, 25, 75, 75);

        Peao_Negro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro3MouseClicked(evt);
            }
        });
        Peao_Negro3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro3ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro3);
        Peao_Negro3.setBounds(180, 100, 75, 75);

        Peao_Negro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro4MouseClicked(evt);
            }
        });
        Peao_Negro4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro4ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro4);
        Peao_Negro4.setBounds(255, 100, 70, 75);

        Peao_Negro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro5MouseClicked(evt);
            }
        });
        Peao_Negro5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro5ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro5);
        Peao_Negro5.setBounds(330, 100, 75, 75);

        Peao_Negro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro6MouseClicked(evt);
            }
        });
        Peao_Negro6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro6ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro6);
        Peao_Negro6.setBounds(405, 100, 75, 75);

        Peao_Negro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro7MouseClicked(evt);
            }
        });
        Peao_Negro7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro7ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro7);
        Peao_Negro7.setBounds(480, 100, 75, 75);

        Peao_Negro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro8MouseClicked(evt);
            }
        });
        Peao_Negro8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro8ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro8);
        Peao_Negro8.setBounds(555, 100, 70, 75);

        Peao_Negro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Negras/peao-cortado.png"))); // NOI18N
        Peao_Negro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Negro1MouseClicked(evt);
            }
        });
        Peao_Negro1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Negro1ComponentHidden(evt);
            }
        });
        jPanel1.add(Peao_Negro1);
        Peao_Negro1.setBounds(30, 100, 75, 75);

        Peao_Branco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Pecas_Brancas/peao-branco.png"))); // NOI18N
        Peao_Branco1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Peao_Branco1MouseClicked(evt);
            }
        });
        Peao_Branco1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                Peao_Branco1ComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                Peao_Branco1ComponentMoved(evt);
            }
        });
        Peao_Branco1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                Peao_Branco1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel1.add(Peao_Branco1);
        Peao_Branco1.setBounds(30, 475, 75, 75);

        Opcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcaoMouseClicked(evt);
            }
        });
        jPanel1.add(Opcao);
        Opcao.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);
        Opcao53.setVisible(false);
        Opcao54.setVisible(false);
        Opcao55.setVisible(false);
        Opcao56.setVisible(false);
        OpcaoRoquePequeno.setVisible(false);
        OpcaoRoqueGrande.setVisible(false);
        OpcaoEnPassanteEsquerda.setVisible(false);
        OpcaoEnPassanteDireita.setVisible(false);

        Opcao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao1MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao1);
        Opcao1.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao2MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao2);
        Opcao2.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao3MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao3);
        Opcao3.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao4MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao4);
        Opcao4.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao5MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao5);
        Opcao5.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao6MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao6);
        Opcao6.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao7MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao7);
        Opcao7.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao8MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao8);
        Opcao8.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao9MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao9);
        Opcao9.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao10MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao10);
        Opcao10.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao11MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao11);
        Opcao11.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao12MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao12);
        Opcao12.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao13MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao13);
        Opcao13.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao14MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao14);
        Opcao14.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao15MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao15);
        Opcao15.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao16MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao16);
        Opcao16.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao17MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao17);
        Opcao17.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao18MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao18);
        Opcao18.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao19MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao19);
        Opcao19.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao20MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao20);
        Opcao20.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao21MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao21);
        Opcao21.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao22MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao22);
        Opcao22.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao23MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao23);
        Opcao23.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao24MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao24);
        Opcao24.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao25MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao25);
        Opcao25.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao26MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao26);
        Opcao26.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao27MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao27);
        Opcao27.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao28MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao28);
        Opcao28.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao29MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao29);
        Opcao29.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao30MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao30);
        Opcao30.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao31MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao31);
        Opcao31.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao32MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao32);
        Opcao32.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao33MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao33);
        Opcao33.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao34MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao34);
        Opcao34.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao35MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao35);
        Opcao35.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao36MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao36);
        Opcao36.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao37MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao37);
        Opcao37.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao38MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao38);
        Opcao38.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao39MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao39);
        Opcao39.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao40MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao40);
        Opcao40.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao41MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao41);
        Opcao41.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao42MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao42);
        Opcao42.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao43MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao43);
        Opcao43.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao44MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao44);
        Opcao44.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao45MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao45);
        Opcao45.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao46MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao46);
        Opcao46.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao47MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao47);
        Opcao47.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao48MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao48);
        Opcao48.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao49MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao49);
        Opcao49.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao50MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao50);
        Opcao50.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao51MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao51);
        Opcao51.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao52MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao52);
        Opcao52.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);

        Opcao53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao53MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao53);
        Opcao53.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        Opcao54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao54MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao54);
        Opcao54.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        Opcao55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao55MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao55);
        Opcao55.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        Opcao56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Opcao56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        Opcao56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Opcao56MouseClicked(evt);
            }
        });
        jPanel1.add(Opcao56);
        Opcao56.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        OpcaoRoquePequeno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpcaoRoquePequeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        OpcaoRoquePequeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcaoRoquePequenoMouseClicked(evt);
            }
        });
        jPanel1.add(OpcaoRoquePequeno);
        OpcaoRoquePequeno.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        OpcaoRoqueGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpcaoRoqueGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        OpcaoRoqueGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcaoRoqueGrandeMouseClicked(evt);
            }
        });
        jPanel1.add(OpcaoRoqueGrande);
        OpcaoRoqueGrande.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        OpcaoEnPassanteEsquerda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpcaoEnPassanteEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        OpcaoEnPassanteEsquerda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcaoEnPassanteEsquerdaMouseClicked(evt);
            }
        });
        jPanel1.add(OpcaoEnPassanteEsquerda);
        OpcaoEnPassanteEsquerda.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        OpcaoEnPassanteDireita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpcaoEnPassanteDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Outras_Imagens/lentes-de-contato-coloridas4.png"))); // NOI18N
        OpcaoEnPassanteDireita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcaoEnPassanteDireitaMouseClicked(evt);
            }
        });
        jPanel1.add(OpcaoEnPassanteDireita);
        OpcaoEnPassanteDireita.setBounds(255, 325, 75, 80);
        Opcao.setVisible(false);
        Opcao1.setVisible(false);
        Opcao2.setVisible(false);
        Opcao3.setVisible(false);
        Opcao4.setVisible(false);
        Opcao5.setVisible(false);
        Opcao6.setVisible(false);
        Opcao7.setVisible(false);
        Opcao8.setVisible(false);
        Opcao9.setVisible(false);
        Opcao10.setVisible(false);
        Opcao11.setVisible(false);
        Opcao12.setVisible(false);
        Opcao13.setVisible(false);
        Opcao14.setVisible(false);
        Opcao15.setVisible(false);
        Opcao16.setVisible(false);
        Opcao17.setVisible(false);
        Opcao18.setVisible(false);
        Opcao19.setVisible(false);
        Opcao20.setVisible(false);
        Opcao21.setVisible(false);
        Opcao22.setVisible(false);
        Opcao23.setVisible(false);
        Opcao24.setVisible(false);
        Opcao25.setVisible(false);
        Opcao26.setVisible(false);
        Opcao27.setVisible(false);
        Opcao28.setVisible(false);
        Opcao29.setVisible(false);
        Opcao30.setVisible(false);
        Opcao31.setVisible(false);
        Opcao32.setVisible(false);
        Opcao33.setVisible(false);
        Opcao34.setVisible(false);
        Opcao35.setVisible(false);
        Opcao36.setVisible(false);
        Opcao37.setVisible(false);
        Opcao38.setVisible(false);
        Opcao39.setVisible(false);
        Opcao40.setVisible(false);
        Opcao41.setVisible(false);
        Opcao42.setVisible(false);
        Opcao43.setVisible(false);
        Opcao44.setVisible(false);
        Opcao45.setVisible(false);
        Opcao46.setVisible(false);
        Opcao47.setVisible(false);
        Opcao48.setVisible(false);
        Opcao49.setVisible(false);
        Opcao50.setVisible(false);
        Opcao51.setVisible(false);
        Opcao52.setVisible(false);

        TabuleiroIMG.setBackground(new java.awt.Color(51, 113, 255));
        TabuleiroIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens_Tabuleiro/tabuleiroTeste14.png"))); // NOI18N
        TabuleiroIMG.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        TabuleiroIMG.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TabuleiroIMGAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TabuleiroIMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabuleiroIMGMouseReleased(evt);
            }
        });
        TabuleiroIMG.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                TabuleiroIMGComponentMoved(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TabuleiroIMGComponentShown(evt);
            }
        });
        jPanel1.add(TabuleiroIMG);
        TabuleiroIMG.setBounds(30, 25, 600, 600);

        jPanel7.setBackground(new java.awt.Color(4, 16, 20));
        jPanel7.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(4, 16, 20));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(null);

        Fundo_Jogar.setBackground(new java.awt.Color(4, 16, 20));
        Fundo_Jogar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Fundo_Jogar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Fundo_JogarFocusGained(evt);
            }
        });
        Fundo_Jogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fundo_JogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fundo_JogarMouseExited(evt);
            }
        });
        Fundo_Jogar.setLayout(null);

        Jogar1.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        Jogar1.setForeground(new java.awt.Color(255, 255, 255));
        Jogar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jogar1.setText("Jogar");
        Jogar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jogar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jogar1MouseExited(evt);
            }
        });
        Fundo_Jogar.add(Jogar1);
        Jogar1.setBounds(0, 0, 230, 60);

        jPanel3.add(Fundo_Jogar);
        Fundo_Jogar.setBounds(20, 20, 230, 60);

        Fundo_salvar.setBackground(new java.awt.Color(4, 16, 20));
        Fundo_salvar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Fundo_salvar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Fundo_salvarFocusGained(evt);
            }
        });
        Fundo_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fundo_salvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fundo_salvarMouseExited(evt);
            }
        });
        Fundo_salvar.setLayout(null);

        Jogar2.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        Jogar2.setForeground(new java.awt.Color(255, 255, 255));
        Jogar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jogar2.setText("Salvar");
        Jogar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jogar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jogar2MouseExited(evt);
            }
        });
        Fundo_salvar.add(Jogar2);
        Jogar2.setBounds(0, 0, 230, 60);

        jPanel3.add(Fundo_salvar);
        Fundo_salvar.setBounds(20, 100, 230, 60);

        Fundo_partidas.setBackground(new java.awt.Color(4, 16, 20));
        Fundo_partidas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Fundo_partidas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Fundo_partidasFocusGained(evt);
            }
        });
        Fundo_partidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fundo_partidasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fundo_partidasMouseExited(evt);
            }
        });
        Fundo_partidas.setLayout(null);

        Jogar.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        Jogar.setForeground(new java.awt.Color(255, 255, 255));
        Jogar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jogar.setText("Partidas salvas");
        Jogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JogarMouseExited(evt);
            }
        });
        Fundo_partidas.add(Jogar);
        Jogar.setBounds(0, 0, 230, 60);

        jPanel3.add(Fundo_partidas);
        Fundo_partidas.setBounds(20, 180, 230, 60);

        Fundo_sair.setBackground(new java.awt.Color(4, 16, 20));
        Fundo_sair.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Fundo_sair.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Fundo_sairFocusGained(evt);
            }
        });
        Fundo_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fundo_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fundo_sairMouseExited(evt);
            }
        });
        Fundo_sair.setLayout(null);

        Jogar4.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        Jogar4.setForeground(new java.awt.Color(255, 255, 255));
        Jogar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jogar4.setText("Sair");
        Jogar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jogar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jogar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jogar4MouseExited(evt);
            }
        });
        Fundo_sair.add(Jogar4);
        Jogar4.setBounds(0, 0, 230, 60);

        jPanel3.add(Fundo_sair);
        Fundo_sair.setBounds(20, 340, 230, 60);

        Fundo_editar.setBackground(new java.awt.Color(4, 16, 20));
        Fundo_editar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Fundo_editar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Fundo_editarFocusGained(evt);
            }
        });
        Fundo_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Fundo_editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Fundo_editarMouseExited(evt);
            }
        });
        Fundo_editar.setLayout(null);

        Jogar3.setFont(new java.awt.Font("Sylfaen", 0, 30)); // NOI18N
        Jogar3.setForeground(new java.awt.Color(255, 255, 255));
        Jogar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jogar3.setText("Alterar tabuleiro");
        Jogar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jogar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Jogar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Jogar3MouseExited(evt);
            }
        });
        Fundo_editar.add(Jogar3);
        Jogar3.setBounds(0, 0, 230, 60);

        jPanel3.add(Fundo_editar);
        Fundo_editar.setBounds(20, 260, 230, 60);

        jPanel7.add(jPanel3);
        jPanel3.setBounds(30, 100, 270, 420);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(660, 0, 340, 650);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 650);

        setSize(new java.awt.Dimension(1000, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Peao_Branco1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco1MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco1);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco1, Opcao, "Peão Branco", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco1);
        EuSouQuem = "Peão Branco1";
        
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco1, EuSouQuem, "Peão Branco1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco1MouseClicked

    private void Peao_Branco2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco2MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco2);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco2, Opcao, "Peão Branco", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco2);
        EuSouQuem = "Peão Branco2";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco2, EuSouQuem, "Peão Branco2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco2MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void Fundo_JogarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Fundo_JogarFocusGained
            
     
        
    }//GEN-LAST:event_Fundo_JogarFocusGained

    private void Fundo_salvarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Fundo_salvarFocusGained
     
        
    }//GEN-LAST:event_Fundo_salvarFocusGained

    private void Fundo_partidasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Fundo_partidasFocusGained
     
        
    }//GEN-LAST:event_Fundo_partidasFocusGained

    private void Fundo_editarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Fundo_editarFocusGained
       
        
    }//GEN-LAST:event_Fundo_editarFocusGained

    private void Fundo_salvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_salvarMouseEntered
        
        
        
    }//GEN-LAST:event_Fundo_salvarMouseEntered

    private void Fundo_partidasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_partidasMouseEntered
        
        
        
    }//GEN-LAST:event_Fundo_partidasMouseEntered

    private void Fundo_editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_editarMouseEntered
        
        
        
    }//GEN-LAST:event_Fundo_editarMouseEntered

    private void Fundo_JogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_JogarMouseEntered
        
        
        
    }//GEN-LAST:event_Fundo_JogarMouseEntered

    private void Fundo_JogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_JogarMouseExited
        
         
        
    }//GEN-LAST:event_Fundo_JogarMouseExited

    private void Fundo_salvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_salvarMouseExited
        
        
        
    }//GEN-LAST:event_Fundo_salvarMouseExited

    private void Fundo_partidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_partidasMouseExited
        
        
        
    }//GEN-LAST:event_Fundo_partidasMouseExited

    private void Fundo_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_editarMouseExited
        
        
        
    }//GEN-LAST:event_Fundo_editarMouseExited

    private void Fundo_sairFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Fundo_sairFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Fundo_sairFocusGained

    private void Fundo_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_sairMouseEntered
        
        
        
    }//GEN-LAST:event_Fundo_sairMouseEntered

    private void Fundo_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fundo_sairMouseExited
        
    }//GEN-LAST:event_Fundo_sairMouseExited

    private void Jogar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_Jogar4MouseClicked

    private void Jogar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar4MouseEntered
        
        Fundo_sair.setBackground(new Color(29,129,159));
        
    }//GEN-LAST:event_Jogar4MouseEntered

    private void Jogar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar4MouseExited
        
        Fundo_sair.setBackground(new Color(4,16,20));
        
    }//GEN-LAST:event_Jogar4MouseExited

    private void Jogar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar3MouseClicked
        URL url1 = this.getClass().getResource("/Imagens_Tabuleiro/tabuleiroTeste11.png");
        URL url2 = this.getClass().getResource("/Imagens_Tabuleiro/tabuleiroTeste12.png");
        URL url3 = this.getClass().getResource("/Imagens_Tabuleiro/tabuleiroTeste13.png");
        URL url4 = this.getClass().getResource("/Imagens_Tabuleiro/tabuleiroTeste14.png");
        URL url5 = this.getClass().getResource("/Imagens_Tabuleiro/tabuleiroTeste8.png");
        
        ImageIcon img = new ImageIcon(url1);
        ImageIcon img2 = new ImageIcon(url2);
        ImageIcon img3 = new ImageIcon(url3);
        ImageIcon img4 = new ImageIcon(url4);
        ImageIcon img5 = new ImageIcon(url5);
        
        if(imagem == 0){
            TabuleiroIMG.setIcon(img);
            
        }
        if(imagem == 1){
            TabuleiroIMG.setIcon(img2);
            
        }
        if(imagem == 2){
            TabuleiroIMG.setIcon(img3);
            
        }
        if(imagem == 3){
            TabuleiroIMG.setIcon(img5);
            
        }
        if(imagem == 4){
            TabuleiroIMG.setIcon(img4);
            
        }
        
        imagem++;
        
        if(imagem == 5){
            imagem = 0;
        }
        
        
    }//GEN-LAST:event_Jogar3MouseClicked

    private void Jogar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar3MouseEntered
        
        Fundo_editar.setBackground(new Color(29,129,159));
        
    }//GEN-LAST:event_Jogar3MouseEntered

    private void Jogar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar3MouseExited
        
        Fundo_editar.setBackground(new Color(4,16,20));
        
    }//GEN-LAST:event_Jogar3MouseExited

    private void JogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarMouseEntered
        
        Fundo_partidas.setBackground(new Color(29,129,159));
        
    }//GEN-LAST:event_JogarMouseEntered

    private void JogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarMouseExited
        
        Fundo_partidas.setBackground(new Color(4,16,20));
        
    }//GEN-LAST:event_JogarMouseExited

    private void Jogar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar2MouseEntered
        
        Fundo_salvar.setBackground(new Color(29,129,159));
        
    }//GEN-LAST:event_Jogar2MouseEntered

    private void Jogar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar2MouseExited
        
        Fundo_salvar.setBackground(new Color(4,16,20));
        
    }//GEN-LAST:event_Jogar2MouseExited

    private void Jogar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar1MouseEntered
        
        Fundo_Jogar.setBackground(new Color(29,129,159));
        
    }//GEN-LAST:event_Jogar1MouseEntered

    private void Jogar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar1MouseExited
        
        Fundo_Jogar.setBackground(new Color(4,16,20));
        
    }//GEN-LAST:event_Jogar1MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void Peao_Branco3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco3MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco3);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco3, Opcao, "Peão Branco", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco3);
        EuSouQuem = "Peão Branco3";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco3, EuSouQuem, "Peão Branco3", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco3MouseClicked

    private void Peao_Branco4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco4MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco4);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco4, Opcao, "Peão Branco", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco4);
        EuSouQuem = "Peão Branco4";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco4, EuSouQuem, "Peão Branco4", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco4MouseClicked

    private void Peao_Branco5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco5MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco5);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco5, Opcao, "Peão Branco", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco5);
        EuSouQuem = "Peão Branco5";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco5, EuSouQuem, "Peão Branco5", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco5MouseClicked

    private void Peao_Branco6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco6MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco6);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco6, Opcao, "Peão Branco", Opcao1,  PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco6);
        EuSouQuem = "Peão Branco6";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco6, EuSouQuem, "Peão Branco6", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco6MouseClicked

    private void Peao_Branco7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco7MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco7);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco7, Opcao, "Peão Branco", Opcao1,  PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco7);
        EuSouQuem = "Peão Branco7";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco7, EuSouQuem, "Peão Branco7", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco7MouseClicked

    private void Peao_Branco8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Branco8MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Branco8);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Branco8, Opcao, "Peão Branco", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Branco8);
        EuSouQuem = "Peão Branco8";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Branco8, EuSouQuem, "Peão Branco8", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Branco8MouseClicked

    private void Peao_Negro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro1MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro1);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro1, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro1);
        EuSouQuem = "Peão Negro1";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro1, EuSouQuem, "Peão Negro1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
        
    }//GEN-LAST:event_Peao_Negro1MouseClicked

    private void Peao_Negro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro2MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro2);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro2, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro2);
        EuSouQuem = "Peão Negro2";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            PecaAserCapturada = Peao_Negro2;
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro2, EuSouQuem, "Peão Negro2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
        
    }//GEN-LAST:event_Peao_Negro2MouseClicked

    private void Peao_Negro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro3MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro3);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro3, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro3);
        EuSouQuem = "Peão Negro3";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro3, EuSouQuem, "Peão Negro3", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Negro3MouseClicked

    private void Peao_Negro4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro4MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro4);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro4, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro4);
        EuSouQuem = "Peão Negro4";
        }
        
        if(VezDeQuem.equals("Brancas")){
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro4, EuSouQuem, "Peão Negro4", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Negro4MouseClicked

    private void Peao_Negro5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro5MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro5);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro5, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro5);
        EuSouQuem = "Peão Negro5";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro5, EuSouQuem, "Peão Negro5", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Negro5MouseClicked

    private void Peao_Negro6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro6MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro6);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro6, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro6);
        EuSouQuem = "Peão Negro6";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro6, EuSouQuem, "Peão Negro6", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Negro6MouseClicked

    private void Peao_Negro7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro7MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro7);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro7, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro7);
        EuSouQuem = "Peão Negro7";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro7, EuSouQuem, "Peão Negro7", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Negro7MouseClicked

    private void Peao_Negro8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Peao_Negro8MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Peao_Negro8);
        Peao peao = new Peao();
        peao.clickDoPeao(Peao_Negro8, Opcao, "Peão Negro", Opcao1, PossicaoDasPecasY, PossicaoDasPecasX, 
                EnpassantDispobivel, pecaAserRemovida_EnPassante, OpcaoEnPassanteEsquerda, OpcaoEnPassanteDireita);
        
        pecaQueCaptura(Peao_Negro8);
        EuSouQuem = "Peão Negro8";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Peao_Negro8, EuSouQuem, "Peão Negro8", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Peao_Negro8MouseClicked

    private void Opcao53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao53MouseClicked
        opcoes(Opcao53);
    }//GEN-LAST:event_Opcao53MouseClicked

    private void Opcao54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao54MouseClicked
        opcoes(Opcao54);
    }//GEN-LAST:event_Opcao54MouseClicked

    private void Opcao55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao55MouseClicked
        opcoes(Opcao55);
    }//GEN-LAST:event_Opcao55MouseClicked

    private void Opcao56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao56MouseClicked
        opcoes(Opcao56);
    }//GEN-LAST:event_Opcao56MouseClicked

    private void OpcaoRoquePequenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcaoRoquePequenoMouseClicked
        if(EuSouQuem.equals("Rei Branco")){
        
            Rei_Branco.setLocation(480, 550);
            Rei_Branco.setVisible(true);
            Torre_Branca2.setLocation(405, 550);
            Torre_Branca2.setVisible(true);
            
            PossicaoDasPecasX[4] = 480;
            PossicaoDasPecasY[4] = 550;
            PossicaoDasPecasX[7] = 405;
            PossicaoDasPecasY[7] = 550;
            
            ReiBrancoMexeu = "Sim";
            TorreBranca2Mexeu = "Sim";
            VezDeQuem = "Negras";
            removerEDeixarFalso();
        }
        
        if(EuSouQuem.equals("Rei Negro")){
        
            Rei_Negro.setLocation(480, 25);
            Rei_Negro.setVisible(true);
            Torre_Negra2.setLocation(405, 25);
            Torre_Negra2.setVisible(true);
            
            PossicaoDasPecasX[20] = 480;
            PossicaoDasPecasY[20] = 25;
            PossicaoDasPecasX[23] = 405;
            PossicaoDasPecasY[23] = 25;
            
            ReiNegroMexeu = "Sim";
            TorreNegra2Mexeu = "Sim";
            VezDeQuem = "Brancas";
            removerEDeixarFalso();
        }
    }//GEN-LAST:event_OpcaoRoquePequenoMouseClicked

    private void OpcaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcaoMouseClicked
        opcoes(Opcao);
    }//GEN-LAST:event_OpcaoMouseClicked

    private void Opcao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao1MouseClicked
        opcoes(Opcao1);
    }//GEN-LAST:event_Opcao1MouseClicked

    private void Torre_Branca1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Torre_Branca1MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Torre_Branca1);
        Torre torre = new Torre();
        torre.clickDaTorre(Torre_Branca1, "Torre Branca", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7, Opcao8, Opcao9, Opcao10, Opcao11, 
                Opcao12, Opcao13, Opcao14, Opcao15, Opcao16, Opcao17, Opcao18, Opcao19, Opcao20, Opcao21, Opcao22, Opcao23, 
                Opcao24, Opcao25, Opcao26, Opcao27);
        
        pecaQueCaptura(Torre_Branca1);
        EuSouQuem = "Torre Branca1";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Torre_Branca1, EuSouQuem, "Torre Branca1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Torre_Branca1MouseClicked

    private void Opcao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao2MouseClicked
        opcoes(Opcao2);
    }//GEN-LAST:event_Opcao2MouseClicked

    private void Opcao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao3MouseClicked
        opcoes(Opcao3);
    }//GEN-LAST:event_Opcao3MouseClicked

    private void Opcao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao4MouseClicked
        opcoes(Opcao4);
    }//GEN-LAST:event_Opcao4MouseClicked

    private void Opcao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao5MouseClicked
        opcoes(Opcao5);
    }//GEN-LAST:event_Opcao5MouseClicked

    private void Opcao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao6MouseClicked
        opcoes(Opcao6);
    }//GEN-LAST:event_Opcao6MouseClicked

    private void Opcao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao7MouseClicked
        opcoes(Opcao7);
    }//GEN-LAST:event_Opcao7MouseClicked

    private void Opcao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao8MouseClicked
        opcoes(Opcao8);
    }//GEN-LAST:event_Opcao8MouseClicked

    private void Opcao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao9MouseClicked
        opcoes(Opcao9);
    }//GEN-LAST:event_Opcao9MouseClicked

    private void Opcao10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao10MouseClicked
        opcoes(Opcao10);
    }//GEN-LAST:event_Opcao10MouseClicked

    private void Opcao11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao11MouseClicked
        opcoes(Opcao11);
    }//GEN-LAST:event_Opcao11MouseClicked

    private void Opcao12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao12MouseClicked
        opcoes(Opcao12);
    }//GEN-LAST:event_Opcao12MouseClicked

    private void Opcao13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao13MouseClicked
        opcoes(Opcao13);
    }//GEN-LAST:event_Opcao13MouseClicked

    private void Opcao14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao14MouseClicked
        opcoes(Opcao14);
    }//GEN-LAST:event_Opcao14MouseClicked

    private void Opcao15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao15MouseClicked
        opcoes(Opcao15);
    }//GEN-LAST:event_Opcao15MouseClicked

    private void Opcao16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao16MouseClicked
        opcoes(Opcao16);
    }//GEN-LAST:event_Opcao16MouseClicked

    private void Opcao17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao17MouseClicked
        opcoes(Opcao17);
    }//GEN-LAST:event_Opcao17MouseClicked

    private void Opcao18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao18MouseClicked
        opcoes(Opcao18);
    }//GEN-LAST:event_Opcao18MouseClicked

    private void Opcao19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao19MouseClicked
        opcoes(Opcao19);
    }//GEN-LAST:event_Opcao19MouseClicked

    private void Opcao20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao20MouseClicked
        opcoes(Opcao20);
    }//GEN-LAST:event_Opcao20MouseClicked

    private void Opcao21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao21MouseClicked
        opcoes(Opcao21);
    }//GEN-LAST:event_Opcao21MouseClicked

    private void Opcao22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao22MouseClicked
        opcoes(Opcao22);
    }//GEN-LAST:event_Opcao22MouseClicked

    private void Opcao23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao23MouseClicked
        opcoes(Opcao23);
    }//GEN-LAST:event_Opcao23MouseClicked

    private void Opcao24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao24MouseClicked
        opcoes(Opcao24);
    }//GEN-LAST:event_Opcao24MouseClicked

    private void Opcao25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao25MouseClicked
        opcoes(Opcao25);
    }//GEN-LAST:event_Opcao25MouseClicked

    private void Opcao26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao26MouseClicked
        opcoes(Opcao26);
    }//GEN-LAST:event_Opcao26MouseClicked

    private void Opcao27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao27MouseClicked
        opcoes(Opcao27);
    }//GEN-LAST:event_Opcao27MouseClicked

    private void Opcao28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao28MouseClicked
        opcoes(Opcao28);
    }//GEN-LAST:event_Opcao28MouseClicked

    private void Opcao29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao29MouseClicked
        opcoes(Opcao29);
    }//GEN-LAST:event_Opcao29MouseClicked

    private void Opcao30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao30MouseClicked
        opcoes(Opcao30);
    }//GEN-LAST:event_Opcao30MouseClicked

    private void Opcao31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao31MouseClicked
        opcoes(Opcao31);
    }//GEN-LAST:event_Opcao31MouseClicked

    private void Opcao32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao32MouseClicked
        opcoes(Opcao32);
    }//GEN-LAST:event_Opcao32MouseClicked

    private void Opcao33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao33MouseClicked
        opcoes(Opcao33);
    }//GEN-LAST:event_Opcao33MouseClicked

    private void Opcao34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao34MouseClicked
        opcoes(Opcao34);
    }//GEN-LAST:event_Opcao34MouseClicked

    private void Opcao35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao35MouseClicked
        opcoes(Opcao35);
    }//GEN-LAST:event_Opcao35MouseClicked

    private void Opcao36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao36MouseClicked
        opcoes(Opcao36);
    }//GEN-LAST:event_Opcao36MouseClicked

    private void Opcao37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao37MouseClicked
        opcoes(Opcao37);
    }//GEN-LAST:event_Opcao37MouseClicked

    private void Opcao38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao38MouseClicked
        opcoes(Opcao38);
    }//GEN-LAST:event_Opcao38MouseClicked

    private void Opcao39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao39MouseClicked
        opcoes(Opcao39);
    }//GEN-LAST:event_Opcao39MouseClicked

    private void Opcao40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao40MouseClicked
        opcoes(Opcao40);
    }//GEN-LAST:event_Opcao40MouseClicked

    private void Opcao41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao41MouseClicked
        opcoes(Opcao41);
    }//GEN-LAST:event_Opcao41MouseClicked

    private void Opcao42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao42MouseClicked
        opcoes(Opcao42);
    }//GEN-LAST:event_Opcao42MouseClicked

    private void Opcao43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao43MouseClicked
        opcoes(Opcao43);
    }//GEN-LAST:event_Opcao43MouseClicked

    private void Opcao44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao44MouseClicked
        opcoes(Opcao44);
    }//GEN-LAST:event_Opcao44MouseClicked

    private void Opcao45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao45MouseClicked
        opcoes(Opcao45);
    }//GEN-LAST:event_Opcao45MouseClicked

    private void Opcao46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao46MouseClicked
        opcoes(Opcao46);
    }//GEN-LAST:event_Opcao46MouseClicked

    private void Opcao47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao47MouseClicked
        opcoes(Opcao47);
    }//GEN-LAST:event_Opcao47MouseClicked

    private void Opcao48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao48MouseClicked
        opcoes(Opcao48);
    }//GEN-LAST:event_Opcao48MouseClicked

    private void Opcao49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao49MouseClicked
        opcoes(Opcao49);
    }//GEN-LAST:event_Opcao49MouseClicked

    private void Opcao50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao50MouseClicked
        opcoes(Opcao50);
    }//GEN-LAST:event_Opcao50MouseClicked

    private void Opcao51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao51MouseClicked
        opcoes(Opcao51);
    }//GEN-LAST:event_Opcao51MouseClicked

    private void Opcao52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcao52MouseClicked
        opcoes(Opcao52);
    }//GEN-LAST:event_Opcao52MouseClicked

    private void Torre_Branca2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Torre_Branca2MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Torre_Branca2);
        Torre torre = new Torre();
        torre.clickDaTorre(Torre_Branca2, "Torre Branca", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7, Opcao8, Opcao9, Opcao10, Opcao11, 
                Opcao12, Opcao13, Opcao14, Opcao15, Opcao16, Opcao17, Opcao18, Opcao19, Opcao20, Opcao21, Opcao22, Opcao23, 
                Opcao24, Opcao25, Opcao26, Opcao27);
        
        pecaQueCaptura(Torre_Branca2);
        EuSouQuem = "Torre Branca2";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Torre_Branca2, EuSouQuem, "Torre Branca2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Torre_Branca2MouseClicked

    private void Torre_Negra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Torre_Negra1MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Torre_Negra1);
        Torre torre = new Torre();
        torre.clickDaTorre(Torre_Negra1, "Torre Negra", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7, Opcao8, Opcao9, Opcao10, Opcao11, 
                Opcao12, Opcao13, Opcao14, Opcao15, Opcao16, Opcao17, Opcao18, Opcao19, Opcao20, Opcao21, Opcao22, Opcao23, 
                Opcao24, Opcao25, Opcao26, Opcao27);
        
        pecaQueCaptura(Torre_Negra1);
        EuSouQuem = "Torre Negra1";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Torre_Negra1, EuSouQuem, "Torre Negra1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Torre_Negra1MouseClicked

    private void Torre_Negra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Torre_Negra2MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Torre_Negra2);
        Torre torre = new Torre();
        torre.clickDaTorre(Torre_Negra2, "Torre Negra", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7, Opcao8, Opcao9, Opcao10, Opcao11, 
                Opcao12, Opcao13, Opcao14, Opcao15, Opcao16, Opcao17, Opcao18, Opcao19, Opcao20, Opcao21, Opcao22, Opcao23, 
                Opcao24, Opcao25, Opcao26, Opcao27);
        
        pecaQueCaptura(Torre_Negra2);
        EuSouQuem = "Torre Negra2";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Torre_Negra2, EuSouQuem, "Torre Negra2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Torre_Negra2MouseClicked

    private void Cavalo_Branco1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cavalo_Branco1MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Cavalo_Branco1);
        Cavalo cavalo = new Cavalo();
        cavalo.clickDoCavalo(Cavalo_Branco1, "Cavalo Branco", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7);
        
        pecaQueCaptura(Cavalo_Branco1);
        EuSouQuem = "Cavalo Branco1";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Cavalo_Branco1, EuSouQuem, "Cavalo Branco1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Cavalo_Branco1MouseClicked

    private void Cavalo_Branco2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cavalo_Branco2MouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Cavalo_Branco2);
        Cavalo cavalo = new Cavalo();
        cavalo.clickDoCavalo(Cavalo_Branco2, "Cavalo Branco", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7);
        
        pecaQueCaptura(Cavalo_Branco2);
        EuSouQuem = "Cavalo Branco2";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Cavalo_Branco2, EuSouQuem, "Cavalo Branco2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Cavalo_Branco2MouseClicked

    private void Cavalo_Negro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cavalo_Negro1MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Cavalo_Negro1);
        Cavalo cavalo = new Cavalo();
        cavalo.clickDoCavalo(Cavalo_Negro1, "Cavalo Negro", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7);
        
        pecaQueCaptura(Cavalo_Negro1);
        EuSouQuem = "Cavalo Negro1";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Cavalo_Negro1, EuSouQuem, "Cavalo Negro1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Cavalo_Negro1MouseClicked

    private void Cavalo_Negro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cavalo_Negro2MouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Cavalo_Negro2);
        Cavalo cavalo = new Cavalo();
        cavalo.clickDoCavalo(Cavalo_Negro2, "Cavalo Negro", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5, Opcao6, Opcao7);
        
        pecaQueCaptura(Cavalo_Negro2);
        EuSouQuem = "Cavalo Negro2";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Cavalo_Negro2, EuSouQuem, "Cavalo Negro2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Cavalo_Negro2MouseClicked

    private void Bispo_Branco_De_Casa_EscuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bispo_Branco_De_Casa_EscuraMouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Bispo_Branco_De_Casa_Escura);
        Bispo bispo = new Bispo();
        bispo.clickDoBispo(Bispo_Branco_De_Casa_Escura, "Bispo Branco", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao28, Opcao29, Opcao30, Opcao31, Opcao32, Opcao33, Opcao34, Opcao35, Opcao36, Opcao37, Opcao38, Opcao39, Opcao40, Opcao41, 
                Opcao42, Opcao43, Opcao44, Opcao45, Opcao46, Opcao47, Opcao48, Opcao49, Opcao50, Opcao51, Opcao52, Opcao53, 
                Opcao54, Opcao55, Opcao56, OpcaoRoquePequeno);
        
        pecaQueCaptura(Bispo_Branco_De_Casa_Escura);
        EuSouQuem = "Bispo Branco1";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Bispo_Branco_De_Casa_Escura, EuSouQuem, "Bispo Branco1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Bispo_Branco_De_Casa_EscuraMouseClicked

    private void Bispo_Branco_De_Casa_BrancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bispo_Branco_De_Casa_BrancaMouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Bispo_Branco_De_Casa_Branca);
        Bispo bispo = new Bispo();
        bispo.clickDoBispo(Bispo_Branco_De_Casa_Branca, "Bispo Branco", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao28, Opcao29, Opcao30, Opcao31, Opcao32, Opcao33, Opcao34, Opcao35, Opcao36, Opcao37, Opcao38, Opcao39, Opcao40, Opcao41, 
                Opcao42, Opcao43, Opcao44, Opcao45, Opcao46, Opcao47, Opcao48, Opcao49, Opcao50, Opcao51, Opcao52, Opcao53, 
                Opcao54, Opcao55, Opcao56, OpcaoRoquePequeno);
        
        pecaQueCaptura(Bispo_Branco_De_Casa_Branca);
        EuSouQuem = "Bispo Branco2";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Bispo_Branco_De_Casa_Branca, EuSouQuem, "Bispo Branco2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Bispo_Branco_De_Casa_BrancaMouseClicked

    private void Bispo_Negro_De_Casa_BrancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bispo_Negro_De_Casa_BrancaMouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Bispo_Negro_De_Casa_Branca);
        Bispo bispo = new Bispo();
        bispo.clickDoBispo(Bispo_Negro_De_Casa_Branca, "Bispo Negro", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao28, Opcao29, Opcao30, Opcao31, Opcao32, Opcao33, Opcao34, Opcao35, Opcao36, Opcao37, Opcao38, Opcao39, Opcao40, Opcao41, 
                Opcao42, Opcao43, Opcao44, Opcao45, Opcao46, Opcao47, Opcao48, Opcao49, Opcao50, Opcao51, Opcao52, Opcao53, 
                Opcao54, Opcao55, Opcao56, OpcaoRoquePequeno);
        
        pecaQueCaptura(Bispo_Negro_De_Casa_Branca);
        EuSouQuem = "Bispo Negro1";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Bispo_Negro_De_Casa_Branca, EuSouQuem, "Bispo Negro1", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Bispo_Negro_De_Casa_BrancaMouseClicked

    private void Bispo_Negro_De_Casa_EscuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bispo_Negro_De_Casa_EscuraMouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Bispo_Negro_De_Casa_Escura);
        Bispo bispo = new Bispo();
        bispo.clickDoBispo(Bispo_Negro_De_Casa_Escura, "Bispo Negro", PossicaoDasPecasY, PossicaoDasPecasX, 
                Opcao28, Opcao29, Opcao30, Opcao31, Opcao32, Opcao33, Opcao34, Opcao35, Opcao36, Opcao37, Opcao38, Opcao39, Opcao40, Opcao41, 
                Opcao42, Opcao43, Opcao44, Opcao45, Opcao46, Opcao47, Opcao48, Opcao49, Opcao50, Opcao51, Opcao52, Opcao53, 
                Opcao54, Opcao55, Opcao56, OpcaoRoquePequeno);
        
        pecaQueCaptura(Bispo_Negro_De_Casa_Escura);
        EuSouQuem = "Bispo Negro2";
        }
        
        if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Bispo_Negro_De_Casa_Escura, EuSouQuem, "Bispo Negro2", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Bispo_Negro_De_Casa_EscuraMouseClicked

    private void Rainha_BrancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rainha_BrancaMouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Rainha_Branca);
        Dama dama = new Dama();
        dama.clickDaDama(Rainha_Branca, "Rainha Branca", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5,
                Opcao6, Opcao7, Opcao8, Opcao9, Opcao10, Opcao11, Opcao12, Opcao13, Opcao14, Opcao15, Opcao16, Opcao17, 
                Opcao18, Opcao19, Opcao20, Opcao21, Opcao22, Opcao23, Opcao24, Opcao25, Opcao26, Opcao27, Opcao28, Opcao29, 
                Opcao30, Opcao31, Opcao32, Opcao33, Opcao34, Opcao35, Opcao36, Opcao37, Opcao38, Opcao39, Opcao40, Opcao41, 
                Opcao42, Opcao43, Opcao44, Opcao45, Opcao46, Opcao47, Opcao48, Opcao49, Opcao50, Opcao51, Opcao52, Opcao53, 
                Opcao54, Opcao55, Opcao56, OpcaoRoquePequeno);
        
        pecaQueCaptura(Rainha_Branca);
        EuSouQuem = "Rainha Branca";
        }
        
        if(VezDeQuem.equals("Negras")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Rainha_Branca, EuSouQuem, "Rainha Branca", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Rainha_BrancaMouseClicked

    private void Rainha_NegraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rainha_NegraMouseClicked
       if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Rainha_Negra);
        Dama dama = new Dama();
        dama.clickDaDama(Rainha_Negra, "Rainha Negra", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5,
                Opcao6, Opcao7, Opcao8, Opcao9, Opcao10, Opcao11, Opcao12, Opcao13, Opcao14, Opcao15, Opcao16, Opcao17, 
                Opcao18, Opcao19, Opcao20, Opcao21, Opcao22, Opcao23, Opcao24, Opcao25, Opcao26, Opcao27, Opcao28, Opcao29, 
                Opcao30, Opcao31, Opcao32, Opcao33, Opcao34, Opcao35, Opcao36, Opcao37, Opcao38, Opcao39, Opcao40, Opcao41, 
                Opcao42, Opcao43, Opcao44, Opcao45, Opcao46, Opcao47, Opcao48, Opcao49, Opcao50, Opcao51, Opcao52, Opcao53, 
                Opcao54, Opcao55, Opcao56, OpcaoRoquePequeno);
        
        pecaQueCaptura(Rainha_Negra);
        EuSouQuem = "Rainha Negra";
       }
       
       if(VezDeQuem.equals("Brancas")){
            
            removerEDeixarFalso();
            Captura captura = new Captura();
            captura.verificarSePodeCapturar(PecaQueCaptura, Rainha_Negra, EuSouQuem, "Rainha Negra", PossicaoDasPecasY, PossicaoDasPecasX);
            
        }
    }//GEN-LAST:event_Rainha_NegraMouseClicked

    private void Rei_BrancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rei_BrancoMouseClicked
        if(VezDeQuem.equals("Brancas")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Rei_Branco);
        Rei rei = new Rei();
        rei.clickDoRei(Rei_Branco, "Rei Branco", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5,
                Opcao6, Opcao7, OpcaoRoquePequeno, OpcaoRoqueGrande, ReiBrancoMexeu, TorreBranca1Mexeu, TorreBranca2Mexeu, TorreNegra1Mexeu, TorreNegra2Mexeu);
        
        pecaQueCaptura(Rei_Branco);
        EuSouQuem = "Rei Branco";
        }
    }//GEN-LAST:event_Rei_BrancoMouseClicked

    private void Rei_NegroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rei_NegroMouseClicked
        if(VezDeQuem.equals("Negras")){
        definirPosicoes();
        removerEDeixarFalso();
        recebendoPeca(Rei_Negro);
        Rei rei = new Rei();
        rei.clickDoRei(Rei_Negro, "Rei Negro", PossicaoDasPecasY, PossicaoDasPecasX, Opcao, Opcao1, Opcao2, Opcao3, Opcao4, Opcao5,
                Opcao6, Opcao7, OpcaoRoquePequeno, OpcaoRoqueGrande, ReiNegroMexeu, TorreBranca1Mexeu, TorreBranca2Mexeu, TorreNegra1Mexeu, TorreNegra2Mexeu);
        
        pecaQueCaptura(Rei_Negro);
        EuSouQuem = "Rei Negro";
        }
    }//GEN-LAST:event_Rei_NegroMouseClicked

    private void Peao_Branco1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco1ComponentMoved
        
    }//GEN-LAST:event_Peao_Branco1ComponentMoved

    private void Peao_Branco1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Peao_Branco1CaretPositionChanged
        
    }//GEN-LAST:event_Peao_Branco1CaretPositionChanged

    private void Peao_Negro2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro2ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro2ComponentHidden

    private void Peao_Negro1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro1ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro1ComponentHidden

    private void Peao_Negro3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro3ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro3ComponentHidden

    private void Peao_Negro4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro4ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro4ComponentHidden

    private void Peao_Negro5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro5ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro5ComponentHidden

    private void Peao_Negro6ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro6ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro6ComponentHidden

    private void Peao_Negro7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro7ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro7ComponentHidden

    private void Peao_Negro8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Negro8ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Peao_Negro8ComponentHidden

    private void Torre_Negra1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Torre_Negra1ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Torre_Negra1ComponentHidden

    private void Cavalo_Negro1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Cavalo_Negro1ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Cavalo_Negro1ComponentHidden

    private void Bispo_Negro_De_Casa_BrancaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Bispo_Negro_De_Casa_BrancaComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Bispo_Negro_De_Casa_BrancaComponentHidden

    private void Rainha_NegraComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Rainha_NegraComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Rainha_NegraComponentHidden

    private void Rei_NegroComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Rei_NegroComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Rei_NegroComponentHidden

    private void Bispo_Negro_De_Casa_EscuraComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Bispo_Negro_De_Casa_EscuraComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Bispo_Negro_De_Casa_EscuraComponentHidden

    private void Cavalo_Negro2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Cavalo_Negro2ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Cavalo_Negro2ComponentHidden

    private void Torre_Negra2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Torre_Negra2ComponentHidden
        VezDeQuem = "Negras";
        verificarXeque();
    }//GEN-LAST:event_Torre_Negra2ComponentHidden

    private void Peao_Branco1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco1ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco1ComponentHidden

    private void Peao_Branco2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco2ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco2ComponentHidden

    private void Peao_Branco3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco3ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco3ComponentHidden

    private void Peao_Branco4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco4ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco4ComponentHidden

    private void Peao_Branco5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco5ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco5ComponentHidden

    private void Peao_Branco6ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco6ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco6ComponentHidden

    private void Peao_Branco7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco7ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco7ComponentHidden

    private void Peao_Branco8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Peao_Branco8ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Peao_Branco8ComponentHidden

    private void Torre_Branca1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Torre_Branca1ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Torre_Branca1ComponentHidden

    private void Cavalo_Branco1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Cavalo_Branco1ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Cavalo_Branco1ComponentHidden

    private void Bispo_Branco_De_Casa_EscuraComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Bispo_Branco_De_Casa_EscuraComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Bispo_Branco_De_Casa_EscuraComponentHidden

    private void Rainha_BrancaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Rainha_BrancaComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Rainha_BrancaComponentHidden

    private void Bispo_Branco_De_Casa_BrancaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Bispo_Branco_De_Casa_BrancaComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Bispo_Branco_De_Casa_BrancaComponentHidden

    private void Cavalo_Branco2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Cavalo_Branco2ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Cavalo_Branco2ComponentHidden

    private void Torre_Branca2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Torre_Branca2ComponentHidden
        VezDeQuem = "Brancas";
        verificarXeque();
    }//GEN-LAST:event_Torre_Branca2ComponentHidden

    private void OpcaoRoqueGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcaoRoqueGrandeMouseClicked
        if(EuSouQuem.equals("Rei Branco")){
        
            Rei_Branco.setLocation(180, 550);
            Rei_Branco.setVisible(true);
            Torre_Branca1.setLocation(255, 550);
            Torre_Branca1.setVisible(true);
            
            PossicaoDasPecasX[4] = 180;
            PossicaoDasPecasY[4] = 550;
            PossicaoDasPecasX[7] = 255;
            PossicaoDasPecasY[7] = 550;
            
            ReiBrancoMexeu = "Sim";
            TorreBranca1Mexeu = "Sim";
            VezDeQuem = "Negras";
            removerEDeixarFalso();
        }
        
        if(EuSouQuem.equals("Rei Negro")){
        
            Rei_Negro.setLocation(180, 25);
            Rei_Negro.setVisible(true);
            Torre_Negra1.setLocation(255, 25);
            Torre_Negra1.setVisible(true);
            
            PossicaoDasPecasX[20] = 180;
            PossicaoDasPecasY[20] = 25;
            PossicaoDasPecasX[16] = 255;
            PossicaoDasPecasY[16] = 25;
            
            ReiNegroMexeu = "Sim";
            TorreNegra1Mexeu = "Sim";
            VezDeQuem = "Brancas";
            removerEDeixarFalso();
        }
        
    }//GEN-LAST:event_OpcaoRoqueGrandeMouseClicked

    private void OpcaoEnPassanteEsquerdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcaoEnPassanteEsquerdaMouseClicked
        if(EuSouQuem.contains("Branco")){
            
            OqueSou.setLocation(OqueSou.getX()-75, OqueSou.getY()-75);
            OqueSou.setVisible(true);
            
            pecaAserRemovida_EnPassante.setVisible(false);
            
        }
        if(EuSouQuem.contains("Negro")){
            
            OqueSou.setLocation(OqueSou.getX()-75, OqueSou.getY()+75);
            OqueSou.setVisible(true);
            
            pecaAserRemovida_EnPassante.setVisible(false);
            
        }
        
        adicionandoLocalizacaoDoEnPassant(OqueSou, pecaAserRemovida_EnPassante);
        
        removerEDeixarFalso();
    }//GEN-LAST:event_OpcaoEnPassanteEsquerdaMouseClicked

    private void OpcaoEnPassanteDireitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcaoEnPassanteDireitaMouseClicked
        if(EuSouQuem.contains("Branco")){
            
            OqueSou.setLocation(OqueSou.getX()+75, OqueSou.getY()-75);
            OqueSou.setVisible(true);
            
            pecaAserRemovida_EnPassante.setVisible(false);
            
        }
        if(EuSouQuem.contains("Negro")){
            
            OqueSou.setLocation(OqueSou.getX()+75, OqueSou.getY()+75);
            OqueSou.setVisible(true);
            
            pecaAserRemovida_EnPassante.setVisible(false);
            
        }
        
        adicionandoLocalizacaoDoEnPassant(OqueSou, pecaAserRemovida_EnPassante);
        
        removerEDeixarFalso();
    }//GEN-LAST:event_OpcaoEnPassanteDireitaMouseClicked

    private void TabuleiroIMGComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TabuleiroIMGComponentMoved
        
    }//GEN-LAST:event_TabuleiroIMGComponentMoved

    private void TabuleiroIMGComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TabuleiroIMGComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_TabuleiroIMGComponentShown

    private void TabuleiroIMGMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabuleiroIMGMouseReleased
        
    }//GEN-LAST:event_TabuleiroIMGMouseReleased

    private void TabuleiroIMGAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabuleiroIMGAncestorMoved
        
    }//GEN-LAST:event_TabuleiroIMGAncestorMoved

    private void Cavalo_Branco1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Cavalo_Branco1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Cavalo_Branco1ComponentMoved

    
    public JPanel getFundo_Jogar() {
        return Fundo_Jogar;
    }

    public void setFundo_Jogar(JPanel Fundo_Jogar) {
        this.Fundo_Jogar = Fundo_Jogar;
    }

    public JLabel getOpcao1() {
        return Opcao1;
    }

    public void setOpcao1(JLabel Opcao1) {
        this.Opcao1 = Opcao1;
    }

    
    public JLabel getPeao_Branco1() {
        return Peao_Branco1;
    }

    public void setPeao_Branco1(JLabel Peao_Branco1) {
        this.Peao_Branco1 = Peao_Branco1;
    }

    public JLabel getTabuleiroIMG() {
        return TabuleiroIMG;
    }

    public void setTabuleiroIMG(JLabel TabuleiroIMG) {
        this.TabuleiroIMG = TabuleiroIMG;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bispo_Branco_De_Casa_Branca;
    private javax.swing.JLabel Bispo_Branco_De_Casa_Escura;
    private javax.swing.JLabel Bispo_Negro_De_Casa_Branca;
    private javax.swing.JLabel Bispo_Negro_De_Casa_Escura;
    private javax.swing.JLabel Cavalo_Branco1;
    private javax.swing.JLabel Cavalo_Branco2;
    private javax.swing.JLabel Cavalo_Negro1;
    private javax.swing.JLabel Cavalo_Negro2;
    private javax.swing.JPanel Fundo_Jogar;
    private javax.swing.JPanel Fundo_editar;
    private javax.swing.JPanel Fundo_partidas;
    private javax.swing.JPanel Fundo_sair;
    private javax.swing.JPanel Fundo_salvar;
    private javax.swing.JLabel Jogar;
    private javax.swing.JLabel Jogar1;
    private javax.swing.JLabel Jogar2;
    private javax.swing.JLabel Jogar3;
    private javax.swing.JLabel Jogar4;
    private javax.swing.JLabel Opcao;
    private javax.swing.JLabel Opcao1;
    private javax.swing.JLabel Opcao10;
    private javax.swing.JLabel Opcao11;
    private javax.swing.JLabel Opcao12;
    private javax.swing.JLabel Opcao13;
    private javax.swing.JLabel Opcao14;
    private javax.swing.JLabel Opcao15;
    private javax.swing.JLabel Opcao16;
    private javax.swing.JLabel Opcao17;
    private javax.swing.JLabel Opcao18;
    private javax.swing.JLabel Opcao19;
    private javax.swing.JLabel Opcao2;
    private javax.swing.JLabel Opcao20;
    private javax.swing.JLabel Opcao21;
    private javax.swing.JLabel Opcao22;
    private javax.swing.JLabel Opcao23;
    private javax.swing.JLabel Opcao24;
    private javax.swing.JLabel Opcao25;
    private javax.swing.JLabel Opcao26;
    private javax.swing.JLabel Opcao27;
    private javax.swing.JLabel Opcao28;
    private javax.swing.JLabel Opcao29;
    private javax.swing.JLabel Opcao3;
    private javax.swing.JLabel Opcao30;
    private javax.swing.JLabel Opcao31;
    private javax.swing.JLabel Opcao32;
    private javax.swing.JLabel Opcao33;
    private javax.swing.JLabel Opcao34;
    private javax.swing.JLabel Opcao35;
    private javax.swing.JLabel Opcao36;
    private javax.swing.JLabel Opcao37;
    private javax.swing.JLabel Opcao38;
    private javax.swing.JLabel Opcao39;
    private javax.swing.JLabel Opcao4;
    private javax.swing.JLabel Opcao40;
    private javax.swing.JLabel Opcao41;
    private javax.swing.JLabel Opcao42;
    private javax.swing.JLabel Opcao43;
    private javax.swing.JLabel Opcao44;
    private javax.swing.JLabel Opcao45;
    private javax.swing.JLabel Opcao46;
    private javax.swing.JLabel Opcao47;
    private javax.swing.JLabel Opcao48;
    private javax.swing.JLabel Opcao49;
    private javax.swing.JLabel Opcao5;
    private javax.swing.JLabel Opcao50;
    private javax.swing.JLabel Opcao51;
    private javax.swing.JLabel Opcao52;
    private javax.swing.JLabel Opcao53;
    private javax.swing.JLabel Opcao54;
    private javax.swing.JLabel Opcao55;
    private javax.swing.JLabel Opcao56;
    private javax.swing.JLabel Opcao6;
    private javax.swing.JLabel Opcao7;
    private javax.swing.JLabel Opcao8;
    private javax.swing.JLabel Opcao9;
    private javax.swing.JLabel OpcaoEnPassanteDireita;
    private javax.swing.JLabel OpcaoEnPassanteEsquerda;
    private javax.swing.JLabel OpcaoRoqueGrande;
    private javax.swing.JLabel OpcaoRoquePequeno;
    private javax.swing.JLabel Peao_Branco1;
    private javax.swing.JLabel Peao_Branco2;
    private javax.swing.JLabel Peao_Branco3;
    private javax.swing.JLabel Peao_Branco4;
    private javax.swing.JLabel Peao_Branco5;
    private javax.swing.JLabel Peao_Branco6;
    private javax.swing.JLabel Peao_Branco7;
    private javax.swing.JLabel Peao_Branco8;
    private javax.swing.JLabel Peao_Negro1;
    private javax.swing.JLabel Peao_Negro2;
    private javax.swing.JLabel Peao_Negro3;
    private javax.swing.JLabel Peao_Negro4;
    private javax.swing.JLabel Peao_Negro5;
    private javax.swing.JLabel Peao_Negro6;
    private javax.swing.JLabel Peao_Negro7;
    private javax.swing.JLabel Peao_Negro8;
    private javax.swing.JLabel Rainha_Branca;
    private javax.swing.JLabel Rainha_Negra;
    private javax.swing.JLabel Rei_Branco;
    private javax.swing.JLabel Rei_Negro;
    private javax.swing.JLabel TabuleiroIMG;
    private javax.swing.JLabel Torre_Branca1;
    private javax.swing.JLabel Torre_Branca2;
    private javax.swing.JLabel Torre_Negra1;
    private javax.swing.JLabel Torre_Negra2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
