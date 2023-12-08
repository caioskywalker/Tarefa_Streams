package com.br.cfarias;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaPrograma = new Pessoa().pessoas();
        List<Pessoa> novaLista = listaPrograma.stream()
                .collect(Collectors.toList());



        Scanner s = new Scanner(System.in);

        System.out.println("Quantas pessoas você deseja adicionar? \n");
        int resposta = s.nextInt();
        System.out.println((resposta));

        if(resposta != 0){
            for (int i = 0; i < resposta; i++) {
                System.out.println("Digite o nome e sexo separado por vírgulas, ex: Caio,Masculino ; Ana, Feminino");
                String respostaUser = s.next();
                String[] partes = respostaUser.split(",");
                String nome = partes[0];
                String genero = partes[1];
                novaLista.add(new Pessoa(nome,genero));

            }
        } else{
            System.out.println("Reinicie e o programa...");


        }

        List<Pessoa> listaFeminina = novaLista.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());

        novaLista.forEach(p -> System.out.print("Lista Geral: " + p +"\n"));
        listaFeminina.forEach(p -> System.out.print("Lista feminina: " + p + "\n"));





    }
}