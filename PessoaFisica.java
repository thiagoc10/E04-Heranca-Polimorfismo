public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
