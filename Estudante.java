public class Estudante {
    private String nome;
    private int idade;
    private double frequencia;
    private boolean transferido;
    private char periodo; // 'm' - manhã, 't' - tarde, 'n' - noite, 'i' - integral

    // Construtor
    public Estudante(String nome, int idade, char periodo) {
        this.nome = nome;
        this.idade = idade;
        this.periodo = periodo;
        this.frequencia = 0.0;
        this.transferido = false;
    }

    // Método para apresentar o estudante
    public void apresentarEstudante() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Período: " + periodo);
        System.out.println("Frequência: " + frequencia + " horas aula");
        System.out.println("Transferido: " + (transferido ? "Sim" : "Não"));
    }

    // Método para responder chamada e aumentar a frequência
    public void responderChamada() {
        this.frequencia += 1.25;
    }

    // Métodos Geers e Setterstt
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public boolean isTransferido() {
        return transferido;
    }

    public char getPeriodo() {
        return periodo;
    }

    public void setTransferido(boolean transferido) {
        this.transferido = transferido;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Estudante eu = new Estudante("Meu Nome", 20, 'm');
        Estudante colega = new Estudante("Colega Favorito", 21, 't');

        eu.responderChamada();
        eu.responderChamada();
        colega.responderChamada();

        eu.apresentarEstudante();
        System.out.println();
        colega.apresentarEstudante();
    }
}