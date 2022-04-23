package dev.wson.logicaprogramacao.exercicios;

import java.util.Scanner;

public class ListaDeExercicios3 {
    private Scanner scan = new Scanner(System.in);
    public ListaDeExercicios3 definirResultadoEscolar(){
        System.out.println("Questão 1: Definir se um aluno foi aprovado ou não a partir da média.");
        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        float[] notas = new float[4];
        for (int i = 0;i < notas.length;i++){
            System.out.printf("Digite a %dª nota: ", i+1);
            notas[i] = scan.nextFloat();
        }
        float somatorio = 0;
        for (float nota: notas) {
            somatorio += nota;
        }
        float media = somatorio/4;
        if (media >= 7){
            System.out.printf("Média: %.1f.%n", media);
            System.out.printf("Situação de %s: Aprovado(a).%n", nome);
        } else {
            System.out.printf("Média: %.1f.%n", media);
            System.out.printf("Situação de %s: Recuperação.%n", nome);
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 verificarSinalDeNumeros(){
        System.out.println("Questão 2: Verificar se um numero é positivo ou negativo.");
        int numero = 1;
        while (numero != 0){
            System.out.print("Digite um numero inteiro diferente de zero para verificação de sinal: ");
            numero = scan.nextInt();
            if (numero > 0){
                System.out.printf("O número %d é positivo.%n", numero);
            }
            if (numero < 0){
                System.out.printf("O número %d é negativo.%n", numero);
            }
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 encontrarMultiplosDeDez(){
        System.out.println("Questão 3: Identificar os múltiplos de 10 entre 1 e 100.");
        for (int i = 1; i <= 100; i++){
            if (i%10 == 0){
                System.out.printf("%d é múltiplo de 10%n", i);
            } else {
                System.out.printf("%d%n", i);
            }
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 listarNumerosEmOrdemDecrescente(){
        System.out.println("Questão 4: Imprimir os números informados em ordem decrescente.");
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = scan.nextInt();
        }
        boolean troca = true;
        int aux;
        while (troca){
            troca = false;
            for (int i = 0;i < numeros.length-1;i++){
                if (numeros[i] < numeros[i+1]){
                    aux = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = aux;
                    troca = true;
                }
            }
        }
        System.out.print("Números em ordem crescente: ");
        for (int numero: numeros) {
            System.out.printf("%d ", numero);
        }
        System.out.println("\n---");
        return this;
    }
    public ListaDeExercicios3 calcularIMC(){
        System.out.println("Questão 5: Calcular o IMC de uma pessoa.");
        System.out.print("Digite o peso em Kg: ");
        float peso = scan.nextFloat();
        System.out.print("Digite a altura em metros: ");
        float altura = scan.nextFloat();
        float imc = peso/(altura*altura);
        if (imc < 18.5){
            System.out.printf("IMC: %.1f.%n", imc);
            System.out.print("Situação: Abaixo do peso.\n");
        }
        if (imc >= 18.5 && imc <= 24.9){
            System.out.printf("IMC: %.1f.%n", imc);
            System.out.print("Situação: Peso normal.\n");
        }
        if (imc >= 25 && imc <= 29.9){
            System.out.printf("IMC: %.1f.%n", imc);
            System.out.print("Situação: Excesso de peso.\n");
        }
        if (imc >= 30){
            System.out.printf("IMC: %.1f.%n", imc);
            System.out.print("Situação: Obesidade.\n");
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 listarNumerosEmOrdemDecrescente2(){
        System.out.println("Questão 6: Imprimir de 1 a 100 em ordem decrescente.");
        int numero = 100;
        while(numero > 0){
            System.out.printf("%d ", numero);
            numero--;
        }
        System.out.println("\n---");
        return this;
    }
    public ListaDeExercicios3 calcularFatorial(){
        System.out.println("Questão 7: Calcular o fatorial do número informado.");
        System.out.print("Digite um número inteiro maior que zero: ");
        int numero = scan.nextInt();
        int fatorial = 1;
        if (numero > 1){
            fatorial = numero;
            while (numero > 1){
                fatorial *= (numero-1);
                numero--;
            }
        }
        System.out.printf("Resultado: %d.%n", fatorial);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 lerValores(){
        System.out.println("Questão 8: Ler 10 números inteiros e retornar o maior, o menor e a média deles.");
        int[] numeros = new int[10];
        for (int i = 0;i < numeros.length;i++){
            System.out.printf("Digite o %dº número inteiro positivo: ", i+1);
            numeros[i] = scan.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;
        for (int numero: numeros){
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
            soma += numero;
        }
        System.out.printf("Maior: %d.%n", maior);
        System.out.printf("Menor: %d.%n", menor);
        System.out.printf("Média: %.1f.%n", (float)(soma/10));
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 verificarIdade(){
        System.out.println("Questão 9: Informar o número de pessoas com mais de 18 anos.");
        int[] idades = new int[10];
        for (int i = 0;i < idades.length;i++){
            System.out.printf("Digite a idade da %dª pessoa: ", i+1);
            idades[i] = scan.nextInt();
        }
        int maioresDeIdade = 0;
        for (int idade: idades) {
            if (idade > 18){
                maioresDeIdade++;
            }
        }
        System.out.printf("%d pessoas tem mais de 18 anos.%n", maioresDeIdade);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 gerarNumeroAleatorio(){
        System.out.println("Questão 10: Gerar número inteiro aleatório entre 1 e 10.");
        int numero = (int)(Math.random()*10+1);
        System.out.println("O número foi gerado, você tem três tentativas para acertar.");
        int tentativas = 0;
        while (tentativas < 3){
            System.out.printf("%dª tentativa: ", tentativas+1);
            int chute = scan.nextInt();
            if (chute == numero){
                System.out.println("Parabéns, você acertou!");
                break;
            }
            if(chute > numero){
                System.out.println("Que pena, você errou!");
                System.out.println("Uma dica: escolha um número menor.");
            } else {
                System.out.println("Que pena, você errou!");
                System.out.println("Uma dica: escolha um número maior.");
            }
            tentativas++;
        }
        if (tentativas == 3){
            System.out.printf("Tentativas esgotadas.%nO número gerado foi %d.%n", numero);
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios3 listarNumerosNumIntervalo(){
        System.out.println("Questão 11: Listar os números contidos entre dois números informados.");
        System.out.print("Digite o 1º número inteiro: ");
        int numero1 = scan.nextInt();
        System.out.print("Digite o 2º número inteiro: ");
        int numero2 = scan.nextInt();
        System.out.print("Números no intervalo: ");
        for (int i = numero1+1;i < numero2;i++){
            System.out.printf("%d ", i);
        }
        System.out.println("\n---");
        return this;
    }
    public ListaDeExercicios3 validarDados(){
        System.out.println("Questão 12: Validação dos dados informados pelo usuário.");
        scan.nextLine();
        boolean sinal = false;
        while (!sinal){
            System.out.print("Digite o seu nome: ");
            String nome = scan.nextLine();
            if (nome.length() > 3){
                System.out.println("Informação válida para NOME.");
                sinal = true;
            } else {
                System.out.println("Informação inválida: o nome deve ter mais de 3 caracteres.");
            }
        }
        sinal = false;
        while (!sinal){
            System.out.print("Digite a sua idade: ");
            int idade = scan.nextInt();
            if (idade > 0 && idade < 150){
                System.out.println("Informação válida para IDADE.");
                sinal = true;
            } else {
                System.out.println("Informação inválida: o valor da idade deve estar entre 0 e 150.");
            }
        }
        sinal = false;
        while (!sinal){
            System.out.print("Digite o seu salário: ");
            float salario = scan.nextFloat();
            if (salario > 0){
                System.out.println("Informação válida para SALÁRIO.");
                sinal = true;
            } else {
                System.out.println("Informação inválida: o valor do salário deve ser maior que 0.");
            }
        }
        sinal = false;
        while (!sinal){
            System.out.print("Digite seu sexo (apenas uma letra): ");
            String sexo = scan.next();
            switch (String.valueOf(sexo.charAt(0)).toLowerCase()) {
                case "f", "m" -> {
                    System.out.println("Informação válida para SEXO.");
                    sinal = true;
                }
                default -> System.out.println("Informação inválida: digite apenas uma letra (f ou m).");
            }
        }
        sinal = false;
        while (!sinal){
            System.out.print("Digite seu estado civil (apenas uma letra): ");
            String estadoCivil = scan.next();
            switch (String.valueOf(estadoCivil.charAt(0)).toLowerCase()) {
                case "s", "c", "v", "d" -> {
                    System.out.println("Informação válida para ESTADO CIVIL.");
                    sinal = true;
                }
                default -> System.out.println("Informação inválida: digite apenas uma letra (s, c, v ou d).");
            }
        }
        System.out.println("---");
        return this;
    }
    public void fecharScanner(){
        scan.close();
    }
}