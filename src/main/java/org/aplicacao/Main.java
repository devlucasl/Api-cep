
package org.aplicacao;

import org.aplicacao.servico.ApiServico;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ApiServico apiServico = new ApiServico();
        try {
            System.out.println(apiServico.getEndereco("71936250"));
        } catch (IOException e) {
            throw new RuntimeException(e);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }
}
