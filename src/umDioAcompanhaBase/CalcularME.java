package umDioAcompanhaBase;

public class CalcularME {

    public static void main (String []args){

        //Calculadora
        System.out.println(" Exercicios Calculadora");

        CalculadorII.soma(3,6);

        CalculadorII.subtrair(9,1.8);

        CalculadorII.multiplicacao(7,8);

        CalculadorII.divisao(5,2.5);

        //Mensagem
        System.out.println("Exercicios mensagem");

        Mensagem.obterMensagem(9);

        Mensagem.obterMensagem(14);

        Mensagem.obterMensagem(1);

        //Emprestimo

        System.out.println("Exercicio de valorizacao");

        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());

        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());

        Emprestimo.calcular(1000,5);

    }
}
