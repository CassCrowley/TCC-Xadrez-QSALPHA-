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
public class MoverPeca {
    
    //Método para mover a peça
    public void recebendoOpcao(JLabel opcaoEscolhida, JLabel peca){
       
       peca.setLocation(opcaoEscolhida.getX(), opcaoEscolhida.getY());
       opcaoEscolhida.setVisible(false);
       peca.setVisible(true);
       //JOptionPane.showMessageDialog(null, peca.getX()+" "+peca.getY());

       //remove(TabuleiroIMG);
       //Peao_Branco1.setVisible(false);
       //TabuleiroIMG.updateUI();
       //Peao_Branco1.updateUI();
       
   }
    
}
