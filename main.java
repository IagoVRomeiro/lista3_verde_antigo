import java.util.Scanner;

class main{

  public static void main(String[] args) {

    // Scanner entrada = new Scanner(System.in);
    // String valor = entrada.nextLine();

  }

}

abstract class Pessoa {

  protected String nome;
  protected long CPF;
  private int idade;

  // metodos

  public String getNomePessoa() {
    return nome;
  }

  public long getCPFPessoa() {
    return CPF;
  }

  public int getIdadePessoa() {
    return idade;
  }

  public void setNomePessoa() {
    this.nome = nome;
  }

  public void setCPFPessoa() {
    this.CPF = CPF;
  }

  public void setIdadePessoa() {
    this.idade = idade;
  }

  // contrutor
  public Pessoa(String nome, long CPF, int idade) {
    this.nome = nome;
    this.CPF = CPF;
    this.idade = idade;
  }

}

abstract class Funcionario extends Pessoa {
  protected String vinculo;
  protected int horasSemanais;

  // contrutor
  public Funcionario(String vinculo, int horasSemanais, long CPF, int idade, String nome) {
    super(nome, CPF, idade);
    this.vinculo = vinculo;
    this.horasSemanais = horasSemanais;

  }

}

class Estudante extends Pessoa {
  String vinculo;
  String status;
  int matricula;
  String[] disciplinas;
  int totalDisciplinas;

  public Estudante(String vinculo, String status, int matricula, String[] disciplinas,
      int totalDisciplinas, long CPF, int idade, String nome) {
    super(nome, CPF, idade);
  }

}

class OutrosFuncionarios extends Funcionario {
  private String[] funcao;

  public OutrosFuncionarios(String[] funcao, String vinculo, int horasSemanais) {
    super(vinculo, horasSemanais);
    this.funcao = funcao;
  }

}

class Professor extends Funcionario {
  String[] disciplinas;
  int totalDisciplinas;

  public Professor(String[] disciplinas, int totalDisciplinas, String vinculo, int horasSemanais){
    super(vinculo, horasSemanais);
    this.disciplinas = disciplinas;
    this.totalDisciplinas = totalDisciplinas;

  }
}