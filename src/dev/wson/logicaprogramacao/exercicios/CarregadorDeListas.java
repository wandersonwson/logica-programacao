package dev.wson.logicaprogramacao.exercicios;

import java.util.Scanner;

public class CarregadorDeListas {
    Scanner scan = new Scanner(System.in);
    public void iniciar() {
        int opcao;
        do {
            opcao = exibirMenu();
            switch (opcao) {
                case 0 -> System.exit(0);
                case 1 -> executarLista1();
                case 2 -> executarLista2();
                case 3 -> executarLista3();
                case 4 -> executarLista4();
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    public int exibirMenu() {
        System.out.println("----------- Lógica de Programação ------------");
        System.out.println("Escolha uma lista de exercícios para execução:");
        System.out.println("1 - Variáveis e tipos.");
        System.out.println("2 - Arrays, entradas e saídas.");
        System.out.println("3 - Controle de fluxo e laços de repetição.");
        System.out.println("4 - Matrizes.");
        System.out.println("0 - Sair.");
        return scan.nextInt();
    }
    public void executarLista1() {
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
                .calcularTotalDeFerraduras();
    }
    public void executarLista2() {
        ListaDeExercicios2 lista = new ListaDeExercicios2();
        lista.calcularMediaAluno()
                .listarDadosPessoais()
                .listarAlunosENotas()
                .listarDadosDePraias()
                .calcularCombustivelParaViagem()
                .calcularSomaDosQuadrados();
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
                .validarDados();
    }
    public void executarLista4() {
        ListaDeExercicios4 lista = new ListaDeExercicios4();
        lista.buscarNome()
                .gerarNumerosAleatorios()
                .lerESalvarDezNumeros()
                .encontrarMaiorValorDaMatriz()
                .somarValoresDaMatriz()
                .calcularMediaPorLinha()
                .apostarNaLoteriaEsportiva()
                .corrigirProva()
                .buscarValorNaMatriz()
                .localizarCidadePeloDDD();
    }
}