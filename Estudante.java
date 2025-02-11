public class Estudante {
    private String nome;
    private int idade;
    private double frequencia;
    private boolean transferido;
    private char periodo; // 'm' - manhã, 't' - tarde, 'n' - noite, 'i' - integral

    // Construtor
    public Estudante(String nome, int idade, char periodo, boolean transferido) {
        this.nome = nome;
        this.idade = idade;
        this.periodo = periodo;
        this.frequencia = 0.0;
        this.transferido = transferido;
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

    // Método principal para testar a classe
    public static void main(String[] args) {
        Estudante bruno = new Estudante("Bruno", 18, 'm', true);
        Estudante rafael = new Estudante("Rafael", 17, 'm', false);

        bruno.responderChamada();
        bruno.responderChamada();
        rafael.responderChamada();

        bruno.apresentarEstudante();
        System.out.println();
        rafael.apresentarEstudante();
    }
}