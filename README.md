# Desenvolvimento de Software
 Primeira aula de desenvolvimento em Java

Linguagem compilada - 

Processador (arquitetura) // Sistema Operacional:

		      x86 // GNU Linux
		      x64 // Windows 10
		      ARM // Android
		      x86 // Windows XP
		      x86 // Windows 10

*Não é possivel abrir um arquivo que foi programado em um determinado sistema operacional/Processador em outro sistema operacional/Processador diferente.
*Programas Compilados tem uma forte dependencia das plataformas que estão sendo criados/executados (Proc. + SO)


Linguagem interpretada - 

Precisa de um interpretador (servidor) para ser executavel (Proc. + SO);

--------------//--------------

.java (codigo fonte) -> java.exe (programa executavel) -> .class (bytecode)

*Bytecode é a compilação especial para codigo fonte de Java (compilador Java).
*Java API ("dicionario" para comunicação de programas distintos), (facilitador para acessar de forma adequada outro programa).

--------------//--------------

https://devdocs.io/openjdk/

Java.lang
Java.util
Organização de codigo em pacotes


-----------------------------------------------//--------------------------------------------

// variáveis de instância - substitua o exemplo abaixo pelo seu próprio
/*
     * Construtor para objetos da classe Aluno
     */
	 // inicializa variáveis de instância

// getters e setters


-----------------------------------------------//--------------------------------------------

DICAS:

Primeiro fazer listas das classes (do que vai conter nas classes)
Dividir por arvore de herdeiros

**quanto maior a arvore maior o nivel de especificação
**Superclasse é a classe mãe - ex: A é superclasse de B
**Subclasse é a classe filha - ex: B é subclasse de A
**Herança Simples: somente uma Superclasse
**Herança multipla: possui mais de uma Superclasse (Java não utiliza)
**classes herdam metodos e atributos.
