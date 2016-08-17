package testes;

import codigo.FileInfo;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by 12111151 on 8/16/16.
 */
public class FileInfoTest {

    private FileInfo fileInfo;
    private static final String CAMINHO_ARQUIVO = "/home/PORTOALEGRE/12111151/DriveH/Leitura_Arquivos/src/arquivos_teste/teste1.txt";

    @Before
    public void setUp() throws Exception {
        fileInfo = new FileInfo(new File(CAMINHO_ARQUIVO));
    }

    @Test
    public void testGetSeparadorDiretorio() throws Exception {
        System.out.println("Separador de diretório: "+fileInfo.getSeparadorDiretorio()+"");
    }

    @Test
    public void testGetExtensao() throws Exception {
        System.out.println("Extensão do arquivo: "+fileInfo.getExtensao());
    }

    @Test
    public void testGetNomeArquivo() throws Exception {
        System.out.println("Nome do arquivo: "+fileInfo.getNomeArquivo());
    }

    @Test
    public void testGetCaminhoArquivo() throws Exception {
        System.out.println("Caminho do arquivo: "+fileInfo.getCaminhoArquivo());
    }
}