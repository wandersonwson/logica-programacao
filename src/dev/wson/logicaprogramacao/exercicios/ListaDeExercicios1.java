package dev.wson.logicaprogramacao.exercicios;

import java.util.Scanner;

public class ListaDeExercicios1 {
    private Scanner scan = new Scanner(System.in);
    public ListaDeExercicios1 converterCelsiusParaOutrasEscalas(){
        System.out.println("Questão 1: Conversão de graus Celsius para outras escalas.");
        System.out.print("Digite a temperatura em Celsius para conversão: ");
        float grausCelsius = scan.nextFloat();
        System.out.printf("Conversão de %.2f ºC para outras escalas:%n", grausCelsius);
        System.out.printf("Kelvin: %.2f ºK%n", (grausCelsius + 273.15));
        System.out.printf("Fahrenheit: %.2f ºF%n", (grausCelsius * 1.8 + 32));
        System.out.printf("Rankine: %.2f ºRa%n", (grausCelsius * 1.8 + 32 + 459.67));
        System.out.printf("Reaumur: %.2f ºRe%n", (grausCelsius * 0.8));
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 definirCavalosPotencia(){
        System.out.println("Questão 2: Cálculo da quantidade de cavalos necessários para\n" +
                "se levantar uma massa de m quilos a uma altura de h metros em t segundos.");
        System.out.print("Digite a massa do objeto em quilos: ");
        float massa = scan.nextFloat();
        System.out.print("Digite a altura em metros: ");
        float altura = scan.nextFloat();
        System.out.print("Digite o tempo em segundos: ");
        float tempo = scan.nextFloat();
        System.out.printf("São necesários %.2f cavalos para levantar o objeto.%n", (massa*altura/tempo)/745.6999);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularEmprestimoAJurosCompostos(){
        System.out.println("Questão 3: Cálculo de empréstimo a juros compostos (Taxa de 2% a.m).");
        System.out.print("Digite o valor desejado: ");
        float valor = scan.nextFloat();
        System.out.print("Digite o número de parcelas a pagar: ");
        int numeroDeParcelas = scan.nextInt();
        double totalEmprestimo = valor * Math.pow(1.02, numeroDeParcelas);
        System.out.printf("Total do empréstimo: R$ %.2f.%n", totalEmprestimo);
        System.out.printf("Total dos juros: R$ %.2f.%n", totalEmprestimo-valor);
        System.out.printf("Valor da parcela: R$ %.2f.%n", totalEmprestimo/numeroDeParcelas);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularDiasVividos(){
        System.out.println("Questão 4: Cálcular a quantidade de dias vividos a partir da idade.");
        System.out.print("Digite a idade em anos: ");
        int idade = scan.nextInt();
        System.out.printf("Total de dias vividos: %d.%n", idade*365);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 reajustarSalario(){
        System.out.println("Questão 5: Reajustar em 7% o salário informado.");
        System.out.print("Digite o valor do salário: ");
        float salario = scan.nextFloat();
        System.out.printf("Salário reajustado: R$ %.2f.%n", salario*1.07);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 converterRealParaOutrasMoedas(){
        System.out.println("Questão 6: Conversão de real para dólar, euro e libra.");
        System.out.print("Digite o valor em reais: ");
        float valorReais = scan.nextFloat();
        System.out.printf("Dólar: %.2f USD.%n", valorReais/4.68);
        System.out.printf("Euro: %.2f EUR.%n", valorReais/5.06);
        System.out.printf("Libra: %.2f GBP.%n", valorReais/6.08);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 realizarOperacoesBasicas(){
        System.out.println("Questão 7: Realizar a soma, a subtração, a multiplicação e a divisão de 2 números.");
        System.out.print("Digite o primeiro número: ");
        float numero1 = scan.nextFloat();
        System.out.print("Digite o segundo número: ");
        float numero2 = scan.nextFloat();
        System.out.printf("Soma: %.2f.%n", numero1+numero2);
        System.out.printf("Subtração: %.2f.%n", numero1-numero2);
        System.out.printf("Multiplicação: %.2f.%n", numero1*numero2);
        if (numero2 == 0){
            System.out.println("Divisão: erro, o divisor é 0.");
        } else {
            System.out.printf("Divisão: %.2f.%n", numero1/numero2);
        }
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularConsumoVeiculo(){
        System.out.println("Questão 8: Calcular o consumo de um veículo.");
        System.out.print("Digite a distância percorrida em km: ");
        float distancia = scan.nextFloat();
        System.out.print("Digite a quantidade de combustível gasta em litros: ");
        float litrosGastos = scan.nextFloat();
        System.out.printf("Consumo de %.2f km/l.%n", distancia/litrosGastos);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularMediaSemestral(){
        System.out.println("Questão 9: Calcular a média semestral de um(a) aluno(a).");
        scan.nextLine();
        System.out.print("Digite o nome do aluno(a): ");
        String nome = scan.nextLine();
        System.out.print("Digite a 1ª nota: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        float nota2 = scan.nextFloat();
        System.out.print("Digite a 3ª nota: ");
        float nota3 = scan.nextFloat();
        System.out.printf("A média de %s é %.1f.%n", nome, (nota1+nota2+nota3)/3);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularRendimentoDeposito(){
        System.out.println("Questão 10: Calcular o rendimento de um depósito após um mês.");
        System.out.print("Digite o valor depositado: ");
        float deposito = scan.nextFloat();
        System.out.printf("Valor com rendimento de 70%% após um mês: R$ %.2f.%n", deposito*1.7);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularValorPrestacao(){
        System.out.println("Questão 11: Calcular o valor da prestação de uma compra sem juros.");
        System.out.print("Digite o valor da compra: ");
        float valorCompra = scan.nextFloat();
        System.out.printf("Pagamento em 5 parcelas de R$ %.2f.%n", valorCompra/5);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularValorDeVenda(){
        System.out.println("Questão 12: Calcular o valor de venda de um produto.");
        System.out.print("Digite o valor do produto: ");
        float valorDeCompra = scan.nextFloat();
        System.out.print("Digite a porcentagem de lucro (apenas números): ");
        float porcentagemDeLucro = scan.nextFloat();
        float valorDeVenda = valorDeCompra*(1+porcentagemDeLucro/100);
        System.out.printf("Com lucro de %.1f%%, o valor de venda será R$ %.2f.%n", porcentagemDeLucro, valorDeVenda);
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularCustoAoConsumidor(){
        System.out.println("Questão 13: Calcular o custo ao consumidor de um carro novo.");
        System.out.print("Digite o valor do custo de fábrica: ");
        float custoDeFabrica = scan.nextFloat();
        System.out.printf("Custo ao consumidor: R$ %.2f.%n", custoDeFabrica+(custoDeFabrica*0.28)+(custoDeFabrica*0.45));
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularAreaDoCirculo(){
        System.out.println("Questão 14: Calcular a área de um círculo.");
        System.out.print("Digite o valor do raio: ");
        float raio = scan.nextFloat();
        System.out.printf("A área do círculo de raio %.2f é igual a %.2f.%n", raio, Math.PI*(raio*raio));
        System.out.println("---");
        return this;
    }
    public ListaDeExercicios1 calcularTotalDeFerraduras(){
        System.out.println("Questão 15: Calcular o total de ferraduras necessárias para um haras.");
        System.out.print("Digite a quantidade de cavalos: ");
        int numeroCavalos = scan.nextInt();
        System.out.printf("Serão necessárias %d ferraduras.%n", numeroCavalos*4);
        System.out.println("---");
        return this;
    }
}