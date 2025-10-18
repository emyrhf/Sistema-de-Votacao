/**
 *
 * @Emily Rharysa
 */

import java.io.*;
import javax.swing.*;
import java.util.*;
public class ClasseMetodos { 
    public Votacao[] FCADASTRARVOTACAO(Votacao[] votacao) throws IOException{ 
        Random random = new Random(); 
        for(int i=0;i<200;i++){ 
            votacao[i].NumeroCandidato = random.nextInt(300)+1; 
            votacao[i].NumeroSecao = random.nextInt(10)+1; 
        } 
        System.out.println("200 REGISTROS CADASTRADOS COM SUCESSO!");
        return votacao; 
    }
    
    public Votacao[] FCLASSIFICASECAO(Votacao[] votacao) throws IOException{
        Votacao aux;
        for(int i=0;i<199;i++){
            for(int j=i+1;j<200;j++){
                if(votacao[i].NumeroSecao > votacao[j].NumeroSecao){
                    aux = votacao[i];
                    votacao[i] = votacao[j];
                    votacao[j] = aux;
                }
            }
        }
        System.out.println("DADOS CLASSIFICADOS COM SUCESSO!");
        return votacao;
    }
    
    public Votacao[] FGRAVAVOTACAO(Votacao[] votacao) throws IOException{
        String fileName = "Votacao2025.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));
        for (int i = 0 ; i < 200 ; i++){
            gravar.write("Seção " + votacao[i].NumeroSecao + "");
            gravar.newLine();
            gravar.write("Candidato " + votacao[i].NumeroCandidato + "");
            gravar.newLine();
            gravar.newLine();
        } 
        System.out.println("ARQUIVO GERADO COM SUCESSO!");
        gravar.close();
        return votacao;
    }
    
    public void MOSTRARINDICADORES(Votacao [] votacao) throws IOException{
        int opc = 0;
        
        while(opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("| MOSTRAR INDICADORES\n| Estatísticas de Votação em 2025\n| 1 - Quantidade Eleitores por Seção\n| 2 - Seção com Maior e Menor número de Eleitores\n| 3 - Quantidade de votos por candidato\n| 4 - 10 Primeiros colocados\n| 9 - Finalizar consulta"));
            switch(opc){
                case 1: 
                    QNTDELEITORESSECAO(votacao);
                    break;
                case 2:
                    MAIORMENORELEITORES(votacao);
                    break;
                case 3:
                    QNTDVOTOSCANDIDATOS(votacao);
                    break;
                case 4:
                    PRIMEIROSCOLOCADOS(votacao);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA.");
            }
        }
    }
    public void QNTDELEITORESSECAO(Votacao [] votacao) throws IOException{
        int[] eleitoresPorSecao = new int [11];
        for(int i=0; i<200;i++){
            eleitoresPorSecao[votacao[i].NumeroSecao]++;
        }
        
        String resultado = "Quantidades de votos por seção:\n";
        for(int i=1;i<eleitoresPorSecao.length;i++){
            resultado = resultado + "Seção " + i + " = " + eleitoresPorSecao[i] + " eleitores.\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    public void MAIORMENORELEITORES(Votacao [] votacao) throws IOException{
        int[] eleitoresPorSecao = new int[11];
        for(int i=0; i<200;i++){
            eleitoresPorSecao[votacao[i].NumeroSecao]++;
        }
        int maior = 1, menor = 1;
        for (int i = 2; i < eleitoresPorSecao.length; i++) {
            if (eleitoresPorSecao[i] > eleitoresPorSecao[maior]) maior = i;
            if (eleitoresPorSecao[i] < eleitoresPorSecao[menor]) menor = i;
        }
        JOptionPane.showMessageDialog(null, "Seção com maior número de eleitores:\nSeção " + maior + "\nSeção com menor número de eleitores:\nSeção " + menor);
    }
    public void QNTDVOTOSCANDIDATOS(Votacao [] votacao) throws IOException{
        int[] votosPorCandidato = new int[301];
        
        for (int i = 0; i < votacao.length; i++) {
        votosPorCandidato[votacao[i].NumeroCandidato]++;
        }

        String resultado = "Quantidade de votos por candidato:\n";
        for (int i = 0; i < votosPorCandidato.length; i++) {
            if (votosPorCandidato[i] > 0) {
                resultado = resultado + "Candidato " + i + " = " + votosPorCandidato[i] + " votos\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
    public void PRIMEIROSCOLOCADOS(Votacao [] votacao) throws IOException{
        int[] votosPorCandidato = new int[301];

        for (int i=0;i<200;i++) {
            votosPorCandidato[votacao[i].NumeroCandidato]++;
        }

        Integer[] candidatos = new Integer[301];
        for (int i = 0; i < 301; i++) {
            candidatos[i] = i;
        }

        java.util.Arrays.sort(candidatos, (a, b) -> votosPorCandidato[b] - votosPorCandidato[a]);

        String resultado = "10 primeiros colocados:\n";
        for (int i = 0; i < 10; i++) {
            if (votosPorCandidato[candidatos[i]] > 0) {
                resultado = resultado + (i + 1) + "º - Candidato " + candidatos[i] +
                            " = " + votosPorCandidato[candidatos[i]] + " votos\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
} 

 

 