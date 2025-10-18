/**
 *
 * @Emily Rharysa
 */

import java.io.IOException;
import javax.swing.*;
public class ClassePrincipal {
    public static void main (String[] args) throws IOException{
        ClasseMetodos m = new ClasseMetodos();
        Votacao[] votacao = new Votacao[200];
        
        for(int i=0;i<200;i++){ 
            votacao[i] = new Votacao(); 
        } 
        
        int opc = 0;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("| SISTEMA DE VOTAÇÃO\n| 1 - Carregar Seção/Número Eleitor\n| 2 - Classificar por Seção\n| 3 - Gravar Registros\n| 4 - Mostrar Indicadores\n| 9 - Finalizar"));
            switch(opc){
                case 1:
                    votacao = m.FCADASTRARVOTACAO(votacao);
                    break;
                case 2:
                    votacao = m.FCLASSIFICASECAO(votacao);
                    break;
                case 3:
                    votacao = m.FGRAVAVOTACAO(votacao);
                    break;
                case 4:
                    m.MOSTRARINDICADORES(votacao);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA.");
            }
        }
    }
}
