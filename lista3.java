import java.util.Scanner;

abstract class Pessoa {
    protected String nome;
    protected long CPF;
    private int idade;

    public Pessoa(String nome, long CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCPF(){
        return CPF;
    }

    public void setCPF(long CPF){
        this.CPF = CPF;
    }

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

    public Funcionario(String vinculo, String nome, long CPF, int idade, int horasSemanais) {
        super(nome, CPF, idade);
        this.vinculo = vinculo;
        this.horasSemanais = horasSemanais;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public int getHorasSemanais(){
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais){
        this.horasSemanais = horasSemanais;
    }
}

class Estudante extends Pessoa {
    private String vinculo;
    private String status;
    private int matricula;
    private String[] disciplinas;

    public Estudante(String nome, long CPF, int idade, String vinculo, String status, int matricula, String[] disciplinas) {
        super(nome, CPF, idade);
        this.vinculo = vinculo;
        this.status = status;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }


    public void imprimir() {
        System.out.printf(nome + ", " + CPF + ", " + getIdade() + ", " + matricula);
        for(int i = 0; i < disciplinas.length; i++){
            System.out.printf(", " + disciplinas[i]);
        }
        System.out.println();
    }
}

class OutrosFuncionarios extends Funcionario {
    private String funcao;

    public OutrosFuncionarios(String nome, long CPF, int idade, String vinculo, int horasSemanais, String funcao) {
        super(vinculo, nome, CPF, idade, horasSemanais);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    public void imprimir() {
        System.out.printf(nome + ", " + CPF + ", " + getIdade() + ", " + horasSemanais);
        System.out.println();
    }
}

class Professor extends Funcionario {
    private String[] disciplinas;

    public Professor(String nome, long CPF, int idade, String vinculo, String[] disciplinas, int horasSemanais) {
        super(vinculo, nome, CPF, idade, horasSemanais);
        this.disciplinas = disciplinas;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }


    public void imprimir() {
        System.out.printf(nome + ", " + CPF + ", " + getIdade() + ", " + horasSemanais);
        for(int i = 0; i < disciplinas.length; i++){

            System.out.printf(", " + disciplinas[i]);
        }
        System.out.println();
    }
}

public class lista3 {

    public static void main(String[] args) {
        Estudante[] estudantes = new Estudante[70];
        OutrosFuncionarios[] outrosFuncionarios = new OutrosFuncionarios[60];
        Professor[] professores = new Professor[60];

        Scanner ler = new Scanner(System.in);

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            if (linha.equals("FIM")) {
                break;
            }
            String[] info = linha.split(",");


            if (info[0].trim().equals("Estudante")) {

                String vinculo = info[0].trim();
                String nome = info[1].trim();
                long CPF = Long.parseLong(info[2].trim());
                int idade = Integer.parseInt(info[3].trim());
                String status = info[4].trim();
                int matricula = Integer.parseInt(info[5].trim());
                String[] disciplinas = new String[info.length - 6];
                for (int i = 6; i < info.length; i++) {
                    disciplinas[i - 6] = info[i].trim();
                }

                Estudante estudante = new Estudante(nome, CPF, idade, vinculo, status, matricula, disciplinas);

                for (int i = 0; i < estudantes.length; i++) {
                    if (estudantes[i] == null) {
                        estudantes[i] = estudante;
                        break;
                    }
                }
            }

            if(info[0].trim().equals("Funcionario")){
                if (info[1].trim().equals("OutrosFuncionarios")){
                    String vinculo = info[1].trim();
                    String nome = info[2].trim();
                    long CPF = Long.parseLong(info[3].trim());
                    int idade = Integer.parseInt(info[4].trim());
                    String funcao = info[5].trim();
                    int horasSemanais = Integer.parseInt(info[6].trim());

                    OutrosFuncionarios outroFuncionario = new OutrosFuncionarios(nome, CPF, idade, vinculo, horasSemanais, funcao);
                    for (int i = 0; i < outrosFuncionarios.length - 1; i++) {
                        if (outrosFuncionarios[i] == null) {
                            outrosFuncionarios[i] = outroFuncionario;
                            break;
                        }
                    }
                }
                else if (info[1].trim().equals("Professor")){
                    String vinculo = info[1].trim();
                    String nome = info[2].trim();
                    long CPF = Long.parseLong(info[3].trim());
                    int idade = Integer.parseInt(info[4].trim());
                    String[] disciplinas = new String[info.length - 6];
                    int horasSemanais = Integer.parseInt(info[info.length - 1].trim());

                    for (int i = 5; i < info.length - 1; i++) {
                        disciplinas[i - 5] = info[i].trim();
                    }

                    Professor professor = new Professor(nome, CPF, idade, vinculo, disciplinas, horasSemanais);
                    for (int i = 0; i < professores.length; i++) {
                        if (professores[i] == null) {
                            professores[i] = professor;
                            break;
                        }
                    }
                }
            }
        }


        for (Estudante estudante : estudantes) {
            if (estudante != null) {
                estudante.imprimir();
            }
        }

        for (OutrosFuncionarios outrosFuncionario : outrosFuncionarios) {
            if (outrosFuncionario != null) {
                outrosFuncionario.imprimir();
            }
        }

        for (Professor professor : professores) {
            if (professor != null) {
                professor.imprimir();
            }
        }
        ler.close();
    }

}
