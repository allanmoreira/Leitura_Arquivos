package testes;

import codigo.LeituraGravacaoArquivo;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 12111151 on 8/15/16.
 */
public class LeituraGravacaoArquivoTest {

    private LeituraGravacaoArquivo leituraGravacaoArquivo;

    @org.junit.Before
    public void setUp() throws Exception {
        leituraGravacaoArquivo = new LeituraGravacaoArquivo();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testLer() throws Exception {
        List<String> strings = leituraGravacaoArquivo.ler("/home/PORTOALEGRE/12111151/Downloads/teste_2.txt");

        System.out.println(strings.size());
        System.out.println(strings.toString());
    }
}