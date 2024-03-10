# lista3---Marta
PONTIFÍCIA UNIVERSIDADE CATÓLICA DE MINAS GERAIS
 Lista 03
 Professora: Marta Noronha
 Disciplina: Algoritmos e Estrutura de Dados II
 Data de entrega: 10/03/2024
 Requisitos
 1. Todos os programas deverão ser desenvolvidos na linguagem de programação Java.
 2. Essas práticas poderão ser desenvolvidas em grupos de, no máximo, dois integrantes.
 3. Cópias, se existirem, serão encaminhadas ao colegiado de coordenação didática do curso.
 4. Fique atento ao charset dos arquivos de entrada e saída. Recomenda-se a utilização dos métodos
 daclasse MyIO.javaparaleitura de dadosdoteclado. Énecessáriodefinirocharsetaserutilizado
 antes de começar a leitura de dados do teclado, da seguinte forma:
 MyIO.setCharset("UTF-8").
 5. Assaídas esperadas, cadastradas no VERDE pelo professor, foram geradas empregando-se:
 System.out.println().
 6. Emcada submissão, enviar apenas um arquivo (.java). A regra será necessária para a submissão
 de exercícios no VERDE e no identificador de plágios utilizado na disciplina.
 7. Aresolução (código) de cada exercício deverá ser submetida ao VERDE.
 8. AexecuçãodocódigosubmetidoserárealizadaautomaticamentepeloVERDE,masocódigoserá
 analisado e validado pelo professor.
 9. Se for necessário ler o arquivo "pub.in", o mesmo será disponibilizado para download no VERDE
 juntamente com o arquivo "pub.out".
 Herança em Java
 Definição das classes
 Classe Abstrata Pessoa
 • DeclararumaclasseabstrataPessoa. AclassePessoaéumaSuperclasseedevepossuirosseguintes
 atributos:– nome: umacadeia de caracteres (string) com modificador de acesso protegido.– CPF:umatributo do tipo long com modificador de acesso protegido.
 1
Algoritmos e Estrutura de Dados II– Lista 03
 2– idade: umatributo do tipo inteiro com modificador de acesso privado.
 • Implemente o construtor da classe, onde este deve receber o nome, o CPF e a idade por parâmet
ros. Inicialize as variáveis no construtor por meio dos dados recebidos via parâmetro.
 • Para os atributos nome e idade, declare e implemente os métodos acessores (getters) e modifi
cadores (setters).
 • ParaoatributoCPF,declareummétodoabstratoacessoreoutromodificador. Aodeclará-locomo
 abstrato, o programador é obrigado a implementar as funções em uma das subclasses.
 Classe Abstrata Funcionário
 • Declarar uma classe abstrata Funcionario que deve herdar os métodos e atributos da classe Pes
soa. Esta classe deve possuir os seguintes atributos:– vinculo: uma cadeia de caracteres (string) com modificador de acesso protegido. Este atrib
uto serve para separar em subclasses professores e outros funcionários.– horas semanais: um atributo do tipo int com modificador de acesso protegido.
 • Implemente o construtor da classe, onde este deve receber o vínculo, o nome, o CPF, a idade e as
 horas semanais que o funcionário trabalha na instituição. Inicialize as variáveis no construtor por
 meio dos dados recebidos via parâmetro.
 • Paraoatributo vínculo, declare e implemente o método acessor e modificador de acesso.
 • Para o atributo horas semanais, declare um método abstrato acessor e outro modificador de
 acesso. Ao declará-lo como abstrato, o programador é obrigado a implementar as funções em
 umadassubclasses.
 Classe Estudante
 • Declarar uma classe Estudante que deve herdar os métodos e atributos da classe Pessoa. Esta
 classe deve possuir os seguintes atributos:– vinculo: uma cadeia de caracteres (string).– status: uma cadeia de caracteres (string). Esse atributo armazena se o aluno é veterano ou
 calouro.– matricula: um atributo do tipo int.– disciplinas: um vetor onde cada posição armazena uma cadeia de caracteres, portanto, um
 vetor de strings. O vetor armazena as disciplinas que o aluno está matriculado.– total de disciplinas: um atributo do tipo int. Contabiliza o total de disciplinas que o aluno
 está matriculado.
 • Implemente o construtor da classe, o qual recebe um vetor de strings contendo os dados do es
tudante por parâmetro. Inicialize as variáveis no construtor por meio dos dados recebidos via
 parâmetro.
 • Para os atributos vínculo, status, matricula e disciplinas, declare e implemente os métodos aces
sores e modificadores de acesso para cada atributo.
 • ImplementeométodoacessoremodificadordoCPFnestaclasse. (OBS:Nãoénecessáriodeclarar
 o atributo CPF nesta classe porque esta classe herda o atributo por herança.
 • Implemente uma função para imprimir algumas informações solicitadas quando a função for
 chamada. O formato de impressão é nome, cpf, idade, matrícula, vetor das disciplinas que o aluno
 está matriculado. Observe o espaçamento entre cada informação.
 Exemplo: Luis Diogo Ávila de Perez, 79099723492, 38, 795222, Química Orgânica, Algoritmos e Estru
turas de Dados I, Física I, Ética e Sociedade, Banco de Dados
 Marta Noronha
Algoritmos e Estrutura de Dados II– Lista 03
 3
 Classe OutrosFuncionarios
 • Declarar uma classe OutrosFuncionarios que deve herdar os métodos e atributos da classe Fun
cionario. Esta classe deve possuir o seguinte atributo:– função: uma cadeia de caracteres (string) com modificador de acesso privado.
 • Implemente o construtor da classe, o qual recebe um vetor de strings contendo os dados do fun
cionário por parâmetro. Inicialize as variáveis no construtor por meio dos dados recebidos via
 parâmetro.
 • Implemente os métodos acessores e modificadores do CPF e das horas semanais nesta classe.
 (OBS: Não é necessário declarar os atributos nesta classe porque esta classe herda o atributo por
 herança.
 • Paraoatributo função, declare e implemente o método acessor e modificador de acesso.
 • Implemente uma função para imprimir algumas informações solicitadas quando a função for
 chamada. Oformato deimpressão é nome, cpf, idade, horas semanais. Observe o espaçamento entre
 cada informação.
 Exemplo: Lena Rosângela Carmona de Britto, 79606551557, 50, 40
 Classe Professor
 • DeclararumaclasseProfessor quedeveherdarosmétodoseatributosdaclasseFuncionario. Esta
 classe deve possuir os seguintes atributos:– disciplinas: um vetor onde cada posição armazena uma cadeia de caracteres, portanto, um
 vetor de strings. O vetor armazena as disciplinas que o professor leciona na instituição.– total de disciplinas: um atributo do tipo int.
 • Implemente o construtor da classe, o qual recebe um vetor de strings contendo os dados do pro
fessor por parâmetro. Inicialize as variáveis no construtor por meio dos dados recebidos via
 parâmetro.
 • Implemente os métodos acessores e modificadores do CPF e das horas semanais nesta classe.
 (OBS: Não é necessário declarar os atributos nesta classe porque esta classe herda o atributo por
 herança.
 • Implemente o método acessor e modificador das disciplinas.
 • Implemente uma função para imprimir algumas informações solicitadas quando a função for
 chamada. O formato de impressão é nome, cpf, idade, horas semanais, disciplinas lecionadas. Observe
 o espaçamento entre cada informação.
 Exemplo: José Assunção de Delgado, 88443157238, 56, 12, Química, Química Orgânica, Química In
orgânica
 Classe Main
 • Inicialize um vetor de objetos da classe para cada uma das classes:– classe Estudante: O vetor deve conter 70 posições;– classe Outros Funcionarios: O vetor deve conter 60 posições;– classe Professor: o vetor deve conter 60 posições.
 • Leitura do arquivo pub.in: Leia o arquivo até encontrar a palavra "FIM". Neste arquivo, os dados
 de cada pessoa estão separados por uma vírgula. Para cada pessoa, verifique:– Seapessoa for um estudante, armazene os dados na classe Estudante.
 Marta Noronha
Algoritmos e Estrutura de Dados II– Lista 03
 4– Seapessoa for um professor, armazene os dados na classe Professor.– Seapessoa for outro funcionário, armazene os dados na classe OutrosFuncionarios.
 • Apósfinalizar a leitura do arquivo pub.in, utilize a função imprimir declarada em cada uma das
 subclasses (Estudante, Professor, OutrosFuncionarios) para imprimir o conteúdo de cada vetor
 de objetos destas classes. Imprima primeiramente o vetor de objetos da classe Estudante, após
 imprima o vetor da classe OutrosFuncionarios e, por fim, o vetor da classe Professores. (OBS:
 Fique atento para não acessar posições inválidas ou não inicializadas ao realizar a leitura.)
 DICAS:- Para repassar os atributos recebidos em cada subclasse para a superclasse, utilize a função super(var1,
 var2,...,varn).- Utilize extends para conectar as classes por herança. Ex: class x extends z..., onde x é a subclasse e z é
 umasuperclasse.
 Marta Noronha