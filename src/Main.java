import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pergunta> perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("1 - Qual foi o ano da Independência do Brasil?",
                new String[]{"A) 1820", "B) 1822", "C) 1824", "D) 1830"}, 'B'));
        perguntas.add(new Pergunta("2 - Qual é a capital do Brasil?",
                new String[]{"A) São Paulo", "B) Brasília", "C) Rio de Janeiro", "D) Belo Horizonte"}, 'B'));
        perguntas.add(new Pergunta("3 - Quem foi o primeiro presidente do Brasil após a redemocratização em 1985?",
                new String[]{"A) Luiz Inácio Lula da Silva", "B) Fernando Henrique Cardoso", "C) José Sarney", "D) Tancredo Neves"}, 'D'));
        perguntas.add(new Pergunta("4 -Qual é o rio mais longo do Brasil?",
                new String[]{"A) Rio Paraná", "B) Rio Amazonas", "C) Rio São Francisco", "D) Rio Tietê"}, 'B'));
        perguntas.add(new Pergunta("5 - Qual é o maior bioma brasileiro em extensão territorial?",
                new String[]{"A) Cerrado", "B) Pantanal", "C) Amazônia", "D) Caatinga"}, 'C'));
        perguntas.add(new Pergunta("6 - Em que ano o Brasil sediou a Copa do Mundo de Futebol pela última vez antes de 2014?",
                new String[]{"A) 1950", "B) 1962", "C) 1974", "D) 1986"}, 'A'));
        perguntas.add(new Pergunta("7 - Quem proclamou a independência do Brasil?",
                new String[]{"A) Dom Pedro I", "B) Dom João VI", "C) Dom Pedro II", "D) Dom Manuel I"}, 'A'));
        perguntas.add(new Pergunta("8 - Qual é o maior estado brasileiro em área territorial?",
                new String[]{"A) São Paulo", "B) Amazonas", "C) Minas Gerais", "D) Rio de Janeiro"}, 'B'));
        perguntas.add(new Pergunta("9 - Qual é o prato típico brasileiro feito com feijão preto e carne de porco?",
                new String[]{"A) Coxinha", "B) Feijoada", "C) Açaí", "D) Moqueca"}, 'B'));
        perguntas.add(new Pergunta("10 - Qual é o escritor brasileiro famoso por obras como 'Dom Casmurro' e 'Memórias Póstumas de Brás Cubas'?",
                new String[]{"A) Clarice Lispector", "B) Machado de Assis", "C) Guimarães Rosa", "D) Jorge Amado"}, 'B'));
        perguntas.add(new Pergunta("11 - Quem foi o líder do movimento abolicionista no Brasil?",
                new String[]{"A) Tiradentes", "B) Zumbi dos Palmares", "C) Princesa Isabel", "D) Dom Pedro II"}, 'C'));
        perguntas.add(new Pergunta("12 - Qual é a maior festa popular do Brasil, conhecida por desfiles de escolas de samba?",
                new String[]{"A) Carnaval", "B) Oktoberfest", "C) São João", "D) Festa Junina"}, 'A'));
        perguntas.add(new Pergunta("13 - Qual é o nome da estátua icônica localizada no Rio de Janeiro?",
                new String[]{"A) Estátua da Liberdade", "B) Cristo Redentor", "C) Estátua de São Francisco", "D) Estátua de Iemanjá"}, 'B'));
        perguntas.add(new Pergunta("14 - Qual é a moeda oficial do Brasil?",
                new String[]{"A) Dólar", "B) Euro", "C) Real", "D) Peso"}, 'C'));
        perguntas.add(new Pergunta("15 - Em que ano o Brasil sediou os Jogos Olímpicos de Verão pela primeira vez?",
                new String[]{"A) 2004", "B) 2008", "C) 2012", "D) 2016"}, 'D'));


        int pontuacao = 0;
        boolean jogarNovamente = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n************************************************************\n" + "*  Bem-vindo ao Jogo Quiz em Java!\n" + "*  Desenvolvido por Lucas Lima\n" + "************************************************************\n");


        while (jogarNovamente) {
            for (Pergunta pergunta : perguntas) {
                System.out.println(pergunta.getTextoPergunta());
                String[] alternativas = pergunta.getAlternativas();

                for (String alternativa : alternativas) {
                    System.out.println(alternativa);
                }

                System.out.print("Escolha uma alternativa (A, B, C ou D): ");
                char respostaJogador = scanner.next().toUpperCase().charAt(0);

                if (respostaJogador == pergunta.getRespostaCorreta()) {
                    System.out.println("Resposta correta!");
                    pontuacao++;
                } else {
                    System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
                }
                System.out.println();
            }
            System.out.println("Sua pontuação final: " + pontuacao + "\n Parabéns!!!");
            System.out.println("Você deseja jogar novamente? (Digite 1 para sim, 0 para não): ");
            int opcao = scanner.nextInt();

            if (opcao != 1) {
                jogarNovamente = false;
                System.out.println("Obrigado por jogar! Até a próxima.");
            }
        }

        scanner.close();
    }
}
