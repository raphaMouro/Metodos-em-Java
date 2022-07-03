package aulajavametodo.bootcamp;

/**
 * Classe Principal
 */


public class Main {


    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício - calculadora");
        Calculadora.soma(4,6);
        Calculadora.subtracao(9, 2.7);
        Calculadora.multiplicacao(9, 3);
        Calculadora.divisao(5, 2.5);


        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);


        // Emprestimos

        System.out.println("Exercicio emprestimo");
        Emprestimos.calcular( 1000, Emprestimos.getDuasParcelas());
        Emprestimos.calcular( 1000, Emprestimos.getTresParcelas());
        Emprestimos.calcular( 1000, 5);


    }
}
