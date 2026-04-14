//5. Projeto de Marcenaria (IOException e finally)
//Simule a leitura de um arquivo de instruções de corte. Crie um método que declare throws IOException e tente ler um arquivo chamado projeto_mesa.txt. Force o lançamento da IOException. 
//No main, faça o try-catch. Adicione um bloco finally que imprima no console: "Limpando a bancada e desligando as máquinas...", garantindo que esta mensagem apareça sempre, com ou sem erro no arquivo.

package Exercicio5Marcenaria;

import java.io.IOException;

public class Marcenaria {

    public void lerProjeto() throws IOException {

        throw new IOException("Arquivo projeto_mesa.txt não encontrado");
    }
}
