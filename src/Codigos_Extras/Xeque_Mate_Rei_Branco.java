/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos_Extras;
import Interfaces.Tabuleiro;
import javax.swing.JLabel;
/**
 *
 * @author PabloCass
 */
public class Xeque_Mate_Rei_Branco extends Tabuleiro{
    
    String PossoSair = "Sim";
    String AlguemPodeCapturar = "sim";
   
    String[] PossibilidadeDeDefesa = new String[56]; 
    
    int LarguraMinima = 30;
    int LarguraMaxima = 555;
    int AlturaMinima = 25;
    int AlturaMaxima = 550;
    
    public void verificarXequeMate(JLabel reiBranco, int[] posicaoDasPecasX, int[] posicaoDasPecasY){
        
        
        
    }
    
}
