import java.util.Scanner;

abstract class Pessoa {
    protected String nome;
    protected long CPF;
    private int idade;

    //construtor
    public Pessoa(String nome, long CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }
   
    //idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //cpf
    public abstract long getCPF();
    public abstract void setCPF(long CPF);
    
    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

abstract class Funcionario extends Pessoa {
    protected String vinculo;
    protected int horasSemanais;

    //construtor
    public Funcionario(String vinculo, String nome, long CPF, int idade, int horasSemanais) {
        super(nome, CPF, idade);
        this.vinculo = vinculo;
        this.horasSemanais = horasSemanais;
    }

    //vinculo
    public String getVinculo() {
        return vinculo;
    }
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    //horasSemanais
    public abstract int getHorasSemanais();
    public abstract void setHorasSemanais(int horasSemanais);
}

class Estudante extends Pessoa {
    private String vinculo;
    private String status;
    private int matricula;
    private String[] disciplinas;
    private int totalDisciplinas;

    //construtor
    public Estudante(String nome, long CPF, int idade, String vinculo, String status, int matricula, String[] disciplinas, int totalDisciplinas) {
        super(nome, CPF, idade);
        this.vinculo = vinculo;
        this.status = status;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
        this.totalDisciplinas = totalDisciplinas;
    }

    //vinculo
    public String getVinculo() {
        return vinculo;
    }
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    //status
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //matricula
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //disciplinas
    public String[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    //totalDisciplinas
    public int getTotalDisciplinas() {
        return totalDisciplinas;
    }
    public void setTotalDisciplinas(int totalDisciplinas) {
        this.totalDisciplinas = totalDisciplinas;
    }

    //CPF
    public long getCPF() {
        return this.CPF;
    }
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    //imprimir Estudante
    public void imprimir() {
        System.out.println(nome + ", " + CPF + ", " + getIdade() + ", " + vinculo + ", " + status + ", " + matricula + ", " + arrayToString(disciplinas));
    }

    //converter array de strings em uma unica string
    private String arrayToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}

class OutrosFuncionarios extends Funcionario {
    private String funcao;

    //construtor
    public OutrosFuncionarios(String nome, long CPF, int idade, String vinculo, int horasSemanais, String funcao) {
        super(vinculo, nome, CPF, idade, horasSemanais);
        this.funcao = funcao;
    }

    //função
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    //HorasSemanais
    public int getHorasSemanais() {
        return this.horasSemanais;
    }
    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    //CPF
    public long getCPF() {
        return this.CPF;
    }
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    //imprimir outrosfunc
    public void imprimir() {
        System.out.println(nome + ", " + CPF + ", " + getIdade() + ", " + horasSemanais + ", " + vinculo);
    }
}

class Professor extends Funcionario {
    private String[] disciplinas;

    //construtor
    public Professor(String nome, long CPF, int idade, String vinculo, int horasSemanais, String[] disciplinas) {
        super(vinculo, nome, CPF, idade, horasSemanais);
        this.disciplinas = disciplinas;
    }

    //disciplinas
    public String[] getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    //horasSemanais
    public int getHorasSemanais() {
        return this.horasSemanais;
    }
    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    //CPF
    public long getCPF() {
        return this.CPF;
    }
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    //imprimir Professor
    public void imprimir() {
        System.out.print(nome + ", " + CPF + ", " + getIdade() + ", " + horasSemanais + ", ");
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print(disciplinas[i]);
            if (i != disciplinas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class main {

    public static void main(String[] args) {
        // Criação de vetores de objetos
        Estudante[] estudantes = new Estudante[70];
        OutrosFuncionarios[] outrosFuncionarios = new OutrosFuncionarios[60];
        Professor[] professores = new Professor[60];

        // Leitura do arquivo pub.in
        Scanner ler = new Scanner(System.in);
        while (ler.hasNextLine()) {
            String line = ler.nextLine();
            if (line.equals("FIM")) {
                break;
            }
            String[] data = line.split(",");
            if (data.length < 5) {
                continue; // Linha inválida, ignorar
            }
            long CPF = Long.parseLong(data[2].trim());


            int idade = Integer.parseInt(data[2].trim());
            if (data[0].trim().equals("Estudante")) {
                String vinculo = data[3].trim();
                String status = data[4].trim();
                int matricula = Integer.parseInt(data[5].trim());
                String[] disciplinas = new String[data.length - 6];
                for (int i = 6; i < data.length; i++) {
                    disciplinas[i - 6] = data[i].trim();
                }
                Estudante estudante = new Estudante(data[0].trim(), CPF, idade, vinculo, status, matricula, disciplinas, disciplinas.length);
                // Adiciona o estudante ao vetor
                for (int i = 0; i < estudantes.length; i++) {
                    if (estudantes[i] == null) {
                        estudantes[i] = estudante;
                        break;
                    }
                }
            } else if (data[0].trim().equals("Outros Funcionarios")) {
                String vinculo = data[3].trim();
                int horasSemanais = Integer.parseInt(data[4].trim());
                String funcao = data[5].trim();
                OutrosFuncionarios outroFuncionario = new OutrosFuncionarios(data[0].trim(), CPF, idade, vinculo, horasSemanais, funcao);
                // Adiciona o funcionário ao vetor
                for (int i = 0; i < outrosFuncionarios.length; i++) {
                    if (outrosFuncionarios[i] == null) {
                        outrosFuncionarios[i] = outroFuncionario;
                        break;
                    }
                }
            } else if (data[0].trim().equals("Professor")) {
                String vinculo = data[3].trim();
                int horasSemanais = Integer.parseInt(data[4].trim());
                String[] disciplinas = new String[data.length - 5];

                for (int i = 5; i < data.length; i++) {
                    disciplinas[i - 5] = data[i].trim();
                }
                Professor professor = new Professor(data[0].trim(), CPF, idade, vinculo, horasSemanais, disciplinas);
                // Adiciona o professor ao vetor
                for (int i = 0; i < professores.length; i++) {
                    if (professores[i] == null) {
                        professores[i] = professor;
                        break;
                    }
                }
            }
        }

        // Impressão dos dados
        System.out.println("Estudantes:");
        for (Estudante estudante : estudantes) {
            if (estudante != null) {
                estudante.imprimir();
            }
        }

        System.out.println("\nOutros Funcionários:");
        for (OutrosFuncionarios funcionario : outrosFuncionarios) {
            if (funcionario != null) {
                funcionario.imprimir();
            }
        }

        System.out.println("\nProfessores:");
        for (Professor professor : professores) {
            if (professor != null) {
                professor.imprimir();
            }
        }
    }
}
