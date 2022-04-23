package dev.wson.logicaprogramacao.exercicios;

import java.util.Scanner;

public class ListaDeExercicios2 {
    private Scanner scan = new Scanner(System.in);
    public ListaDeExercicios2 calcularMediaAluno(){
        System.out.println("Questão 1: Cálcular a média das notas de um aluno.");
        String[] dadosMatricula = new String[2];
        System.out.print("Digite o nome do(a) aluno(a): ");
        dadosMatricula[0] = scan.nextLine();
        System.out.print("Digite a turma: ");
        dadosMatricula[1] = scan.nextLine();
        float[] notas = new float[3];
        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %dª nota: ", i+1);
            notas[i] = scan.nextFloat();
        }
        float somatorio = 0;
        for (float nota: notas) {
            somatorio += nota;
        }
        float media = somatorio/3;
        System.out.printf("A média de %s é %.1f.%n", dadosMatricula[0], media);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios2 listarDadosPessoais(){
        scan.nextLine();
        System.out.println("Questão 2: Listar dados pessoais.");
        String[] dadosPessoais = new String[4];
        System.out.print("Digite o nome completo: ");
        dadosPessoais[0] = scan.nextLine();
        System.out.print("Digite o endereço: ");
        dadosPessoais[1] = scan.nextLine();
        System.out.print("Digite o CEP: ");
        dadosPessoais[2] = scan.nextLine();
        System.out.print("Digite o telefone: ");
        dadosPessoais[3] = scan.nextLine();
        System.out.println("Dados informados:");
        System.out.printf("Nome completo: %s.%n", dadosPessoais[0]);
        System.out.printf("Endereço: %s.%n", dadosPessoais[1]);
        System.out.printf("CEP: %s. Telefone: %s.%n", dadosPessoais[2], dadosPessoais[3]);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios2 listarAlunosENotas(){
        System.out.println("Questão 3: Listar nomes e notas de alunos.");
        String[] nomes = new String[4];
        float[] notas = new float[4];
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("Digite o nome do %dº aluno: ", i+1);
            nomes[i] = scan.nextLine();
            System.out.print("Digite sua nota: ");
            notas[i] = scan.nextFloat();
            scan.nextLine();
        }
        System.out.printf("%s%10s%n", "ALUNO(A)", "NOTA");
        System.out.printf("%s%11s%n", "========", "=====");
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("%-15S%.1f%n", nomes[i], notas[i]);
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios2 listarDadosDePraias(){
        System.out.println("Questão 4: Listar dados das praias de uma cidade.");
        String[] nomes = new String[5];
        float[] distancias = new float[5];
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("Digite o nome da %dª praia: ", i+1);
            nomes[i] = scan.nextLine();
            System.out.print("Digite sua distância para o hotel (em Km): ");
            distancias[i] = scan.nextFloat();
            scan.nextLine();
        }
        float maiorDistancia = distancias[0];
        String praiaMaisDistante = "";
        int contador = 0;
        float somatorio = 0;
        for (int i = 0; i < nomes.length; i++){
            if(distancias[i] > maiorDistancia){
                maiorDistancia = distancias[i];
                praiaMaisDistante = nomes[i];
            }
            if (distancias[i] > 10 && distancias[i] < 15){
                contador++;
            }
            somatorio += distancias[i];
        }
        System.out.println("Dados das praias:");
        System.out.printf("A praia mais distante do hotel é %s.%n", praiaMaisDistante);
        System.out.printf("%d praias estão a mais de 10km e a menos de 15km do hotel.%n", contador);
        System.out.printf("A média de distância das praias para o hotel é de %.1f.%n", somatorio/5);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios2 calcularCombustivelParaViagem(){
        System.out.println("Questão 5: Calcular a quantidade de combustível necessária em uma viagem.");
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        float duracao = scan.nextFloat();
        System.out.print("Digite a velocidade média (em Km): ");
        float velocidadeMedia = scan.nextFloat();
        float distancia = duracao*velocidadeMedia;
        float combustivel = distancia/12;
        System.out.printf("Serão necessários %.1f litros de combustível para a viagem de %.1f Km.%n", combustivel, distancia);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios2 calcularSomaDosQuadrados(){
        System.out.println("Questão 6: Calcular os quadrados de 4 numeros e apresentar a soma deles.");
        int[] numeros = new int[4];
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = scan.nextInt();
        }
        int somatorio = 0;
        for (int numero: numeros) {
            somatorio += (numero*numero);
        }
        System.out.printf("A soma dos quadrados dos números informados é igual a %d.%n", somatorio);
        System.out.println("---");
        return this;
    }
    public void fecharScanner(){
        scan.close();
    }
}
