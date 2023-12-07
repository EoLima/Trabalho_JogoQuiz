public class Pergunta {
    private String textoPergunta;
    private String[] alternativas;
    private char respostaCorreta;

    public Pergunta(String textoPergunta, String[] alternativas, char respostaCorreta) {
        this.textoPergunta = textoPergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public String getTextoPergunta() {
        return textoPergunta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }
}