package dev.wson.logicaprogramacao.exercicios;

import java.util.Scanner;

public class CarregadorDeListas {
    public void iniciar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lógica de Programação\nDigite o número da lista de exercícios desejada para execução:");
        System.out.println("1 - Variáveis e tipos.");
        System.out.println("2 - Arrays, entradas e saídas.");
        System.out.println("3 - Controle de fluxo e estruturas de repetição.");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1 -> executarLista1();
            case 2 -> executarLista2();
            case 3 -> executarLista3();
            default -> System.out.println("Opção inválida.");
        }
        scan.close();
    }
    public void executarLista1(){
        ListaDeExercicios1 lista = new ListaDeExercicios1();
        lista.converterCelsiusParaOutrasEscalas()
                .definirCavalosPotencia()
                .calcularEmprestimoAJurosCompostos()
                .calcularDiasVividos()
                .reajustarSalario()
                .converterRealParaOutrasMoedas()
                .realizarOperacoesBasicas()
                .calcularConsumoVeiculo()
                .calcularMediaSemestral()
                .calcularRendimentoDeposito()
                .calcularValorPrestacao()
                .calcularValorDeVenda()
                .calcularCustoAoConsumidor()
                .calcularAreaDoCirculo()
                .calcularTotalDeFerraduras()
                .fecharScanner();
    }
    public void executarLista2() {
        ListaDeExercicios2 lista = new ListaDeExercicios2();
        lista.calcularMediaAluno()
                .listarDadosPessoais()
                .listarAlunosENotas()
                .listarDadosDePraias()
                .calcularCombustivelParaViagem()
                .calcularSomaDosQuadrados()
                .fecharScanner();
    }
    public void executarLista3() {
        ListaDeExercicios3 lista = new ListaDeExercicios3();
        lista.definirResultadoEscolar()
                .verificarSinalDeNumeros()
                .encontrarMultiplosDeDez()
                .listarNumerosEmOrdemDecrescente()
                .calcularIMC()
                .listarNumerosEmOrdemDecrescente2()
                .calcularFatorial()
                .lerValores()
                .verificarIdade()
                .listarNumerosNumIntervalo()
                .gerarNumeroAleatorio()
                .validarDados()
                .fecharScanner();
    }
}