/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;


import java.util.List;

/**
 *
 * @author Allan Moreira
 */
public class Console {
    
    public static void main (String[] args) {
        LeituraGravacaoArquivo lArq = new LeituraGravacaoArquivo();

//        lArq.editar("/home/allanmoreira/Dropbox/Projetos/Leitura_Arquivos/arquivos_teste/teste1.txt", "Moreira", "Assis");
        List<String> lista = lArq.ler("/home/PORTOALEGRE/12111151/DriveH/Leitura_Arquivos/src/arquivos_teste/teste1.txt");

        for (String s : lista) {
            System.out.println(s);
        }
    }
    
}
