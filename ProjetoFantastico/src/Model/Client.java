package Model;

public class Client {
    private String nome;
    private String cc;
    private String email;
    private int anoNascimento;

    public Client(String nome, String cc, String email, int anoNascimento) {
        this.nome = nome;
        this.cc = cc;
        this.email = email;
        this.anoNascimento = anoNascimento;
    }
}
