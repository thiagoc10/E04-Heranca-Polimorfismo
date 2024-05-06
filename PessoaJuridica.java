public class PessoaJuridica extends Cliente {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número de funcionários: " + numFuncionarios);
        System.out.println("Setor: " + setor);
    }
}
