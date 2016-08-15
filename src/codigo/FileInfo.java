/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Allan Moreira
 */
public class FileInfo {

    private String fullPath;
    private char pathSeparator;
    private final char extensionSeparator = '.';
    private int pontoExtensao;
    private char separadorDiretorio;

    public FileInfo(String caminhoCompletoArquivo, char separadorDiretorio) {
        this.fullPath = caminhoCompletoArquivo;
        this.pathSeparator = separadorDiretorio;
        this.pontoExtensao = fullPath.lastIndexOf(extensionSeparator);
        this.separadorDiretorio = separadorDiretorio;
    }

    public char getSeparadorDiretorio() {
        return separadorDiretorio;
    }
    
    public String getExtension() {
        return fullPath.substring(pontoExtensao + 1);
    }

    public String getFileName() { // gets filename without extension
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, pontoExtensao);
    }

    public String getFilePath() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
}
