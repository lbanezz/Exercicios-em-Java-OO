public class Cliente {

    private String nome;
    private String cpf;
    private Integer idade;


    public Cliente() {

    }

    public Cliente(String nome) {
    this.nome = nome;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente (String nome, String cpf, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void escreverTexto() {
        System.out.println("Vazio");
    }

    public void escreverTexto(String a) {
        System.out.println(a);
    }

    public void escreverTexto(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }

    public void escreverTexto(int a) {
        System.out.println(a);
    }
}
