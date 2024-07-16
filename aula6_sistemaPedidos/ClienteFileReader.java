package aula6_sistemaPedidos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteFileReader {
    public static List<Cliente> lerArquivo(String caminhoArquivo) {
        List<Cliente> clientes = new ArrayList<Cliente>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int idCliente = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String email = dados[2];
                String endereco = dados[3];
                String numEndereco = dados[4];
                String username = dados[5];
                int telefone = Integer.parseInt(dados[6]);

                Cliente currCliente = new Cliente(idCliente, nome, email, endereco, numEndereco, username, telefone);
                clientes.add(currCliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clientes;
    }
    
}