/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Allan Moreira
 */
public class FileInfo {

    private String caminhoCompletoArquivo;
    private String separadorDiretorio;
    private final char SEPARADOR_DE_EXTENSAO = '.';
    private int indicePontoExtensao;
    private String diretorioArquivo;
//    private char separadorDiretorio;

    public FileInfo(File arquivo) {
        this.diretorioArquivo = arquivo.getParent();
        this.caminhoCompletoArquivo = arquivo.getAbsolutePath();
        this.separadorDiretorio = File.separator;
        this.indicePontoExtensao = this.caminhoCompletoArquivo.lastIndexOf(SEPARADOR_DE_EXTENSAO);
    }

    /*
    public FileInfo(String caminhoCompletoArquivo, char separadorDiretorio) {
        this.indicePontoExtensao = this.caminhoCompletoArquivo.lastIndexOf(SEPARADOR_DE_EXTENSAO);
    }
    */

    public String getSeparadorDiretorio() {
        return separadorDiretorio;
    }
    
    public String getExtensao() {
        return caminhoCompletoArquivo.substring(indicePontoExtensao + 1);
    }

    public String getNomeArquivo() { // gets filename without extension
        int indiceSeparador = caminhoCompletoArquivo.lastIndexOf(separadorDiretorio);
        return caminhoCompletoArquivo.substring(indiceSeparador + 1, indicePontoExtensao);
    }

    public String getCaminhoArquivo() {
        int sep = caminhoCompletoArquivo.lastIndexOf(separadorDiretorio);
        return caminhoCompletoArquivo.substring(0, sep);
    }

    public String getDiretorioArquivo(){
        return diretorioArquivo;
    }
}
