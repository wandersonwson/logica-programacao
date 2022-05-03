package dev.wson.logicaprogramacao.exercicios;

import java.util.Scanner;

public class ListaDeExercicios4 {
    private Scanner scan = new Scanner(System.in);
    public ListaDeExercicios4 gerarNumerosAleatorios(){
        System.out.println("Questão 1: Gerar 10 números aleatórios (double) e salvá-los num array.");
        double[] numeros = new double[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random()*100+1;
        }
        System.out.println("Números gerados: ");
        for (double numero : numeros) {
            System.out.printf("%.1f ", numero);
        }
        System.out.println("\n---");
        return this;
    }
    public ListaDeExercicios4 lerESalvarDezNumeros(){
        System.out.println("Questão 2: Ler 10 números (double) e salvá-los numa matriz 2x5.");
        double[][] numeros = new double[2][5];
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                System.out.print("Digite um número: ");
                numeros[i][j] = scan.nextDouble();
            }
        }
        System.out.println("Números armazenados: ");
        for (double numero : numeros[0]) {
            System.out.printf("%.1f ", numero);
        }
        System.out.println();
        for (double numero : numeros[1]) {
            System.out.printf("%.1f ", numero);
        }
        System.out.println("\n---");
        return this;
    }
    public ListaDeExercicios4 encontrarMaiorValorDaMatriz(){
        System.out.println("Questão 3: Encontrar o maior valor em uma matriz.");
        double[][] numeros = {{12, 34, 99, 29, 35.8}, {12, 43, 71, 9.6, 65.3}};
        System.out.println("Números da matriz: ");
        for (double numero : numeros[0]) {
            System.out.printf("%.1f ", numero);
        }
        System.out.println();
        for (double numero : numeros[1]) {
            System.out.printf("%.1f ", numero);
        }
        double maior = numeros[0][0];
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                if (numeros[i][j] > maior){
                    maior = numeros[i][j];
                }
            }
        }
        System.out.printf("%nO maior número é %.1f%n", maior);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 somarValoresDaMatriz(){
        System.out.println("Questão 4: Somar todos os valores de uma matriz.");
        int[][] numeros = {{5, 14, 29, 40, 8}, {72, 32, 11, 84, 30}};
        System.out.println("Números da matriz: ");
        for (int i = 0; i < numeros.length; i++){
            for (int numero : numeros[i]) {
                System.out.printf("%d ", numero);
            }
            System.out.println();
        }
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                soma += numeros[i][j];
            }
        }
        System.out.printf("%nResultado: %d%n", soma);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 calcularMediaPorLinha(){
        System.out.println("Questão 5: Calcular a média dos valores de uma linha da matriz.");
        int[][] numeros = {{5, 14, 29, 40, 8}, {72, 32, 11, 84, 30}, {24, 8, 17, 39, 45}};
        System.out.println("Números da matriz: ");
        for(int i = 0; i < numeros.length; i++){
            for (int numero : numeros[i]) {
                System.out.printf("%d ", numero);
            }
            System.out.println();
        }
        System.out.print("Digite o número da linha desejada (1 a 3): ");
        int linha = scan.nextInt();
        double soma = 0;
        for (int numero : numeros[linha-1]) {
            soma += numero;
        }
        System.out.printf("Média dos valores na linha %d: %.1f%n", linha, soma/5);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 apostarNaLoteriaEsportiva(){
        System.out.println("Questão 6: Verificar o resultado de uma aposta na loteria esportiva.");
        int numeroCartao = (int)(Math.random()*100+1);
        int[] apostas = new int[13];
        System.out.println("Escolha as suas colunas (1, 2 ou 3):");
        for (int i = 0; i < apostas.length; i++){
            System.out.printf("Linha %d: ", i+1);
            apostas[i] = scan.nextInt();
        }
        int[] gabarito = {1, 2, 3, 3, 2, 1, 2, 2, 3, 1, 3, 1, 2};
        int totalPontos = 0;
        for (int i = 0; i < apostas.length; i++){
            if(apostas[i] == gabarito[i]){
                totalPontos++;
            }
        }
        System.out.println("Resultados:");
        System.out.printf("Apostador: %d.%n", numeroCartao);
        System.out.printf("Número de acertos: %d.%n", totalPontos);
        System.out.println((totalPontos == 13) ? "Parabéns, você ganhou!" : "Que pena, você não ganhou.");
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 corrigirProva(){
        System.out.println("Questão 7: Corrigir a prova de um aluno.");
        char[] respostas = new char[10];
        System.out.println("Digite as suas resposta (A, B, C, D ou E):");
        for (int i = 0; i < respostas.length; i++){
            System.out.printf("Questão %d: ", i+1);
            respostas[i] = scan.next().toUpperCase().charAt(0);
        }
        char[] gabarito = {'A', 'B', 'D', 'A', 'E', 'C', 'B', 'D', 'E', 'C'};
        int totalAcertos = 0;
        for (int i = 0; i < respostas.length; i++){
            if(respostas[i] == gabarito[i]){
                totalAcertos++;
            }
        }
        System.out.println("Resultado:");
        System.out.printf("Número de acertos: %d.%n", totalAcertos);
        System.out.printf("Situação: %s.%n", (totalAcertos >= 6) ? "APROVADO" : "REPROVADO");
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 buscarValorNaMatriz(){
        System.out.println("Questão 8: Verificar se um número existe dentro de uma matriz.");
        int[][] numeros = new int[2][5];
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = (int)(Math.random()*100+1);
            }
        }
        System.out.println("Uma matriz com 10 números inteiros foi gerada.");
        System.out.print("Digite um número a ser encontrado na matriz (1 a 100): ");
        int busca = scan.nextInt();
        boolean valorEncontrado = false;
        for(int i = 0; i < numeros.length; i++){
            for (int numero : numeros[i]) {
                if(busca == numero){
                    valorEncontrado = true;
                }
            }
        }
        System.out.println((valorEncontrado) ? "O valor existe no conjunto." : "O valor não existe no conjunto.");
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 localizarCidadePeloDDD(){
        System.out.println("Questão 9: Identificar a cidade a partir do DDD.");
        System.out.print("Digite o DDD desejado: ");
        int DDD = scan.nextInt();
        System.out.print("Resultado: ");
        switch (DDD) {
            case 11 -> System.out.println("São Paulo");
            case 19 -> System.out.println("Campinas");
            case 21 -> System.out.println("Rio de Janeiro");
            case 27 -> System.out.println("Vitória");
            case 31 -> System.out.println("Belo Horizonte");
            case 32 -> System.out.println("Juiz de Fora");
            case 61 -> System.out.println("Brasília");
            case 71 -> System.out.println("Salvador");
            default -> System.out.println("DDD não cadastrado");
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios4 buscarNome(){
        System.out.println("Questão 10: Verificar se um nome existe na lista de pessoas.");
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("Digite o nome da %dª pessoa: ", i+1);
            nomes[i] = scan.nextLine();
        }
        System.out.print("Digite um nome a ser buscado na lista: ");
        String busca = scan.nextLine();
        boolean nomeEncontrado = false;
        for (String nome : nomes) {
            if (busca.equals(nome)){
                nomeEncontrado = true;
            }
        }
        System.out.println((nomeEncontrado) ? "ACHEI" : "NÃO ACHEI");
        System.out.println("---");
        return this;
    }
}