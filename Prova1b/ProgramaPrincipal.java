import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Pessoa felipe = new Pessoa('Felipe', 57, 'M', 90, 100, 80, 30, 70);
        Pessoa vetor[] = new Pessoa[6];
        
        Pessoa indice0 = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70);
        Pessoa indice1 = new Pessoa("Maria", 45, 'F', 50, 70, 100, 50, 90);
        Pessoa indice2 = new Pessoa("Cristina", 30, 'F', 50, 20, 30, 70, 30);
        Pessoa indice3 = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        Pessoa indice4 = new Pessoa("João", 27, 'M', 100, 30, 50, 100, 10);
        Pessoa indice5 = new Pessoa("Jessica", 45, 'F', 85, 60, 70, 50, 60);

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o seu nome:");
            String nome = teclado.next();

            System.out.println("Digite sua idade:");
            int idade = teclado.nextInt();            
            
            if (idade >= 18) {
                System.out.println("Digite seu genero:");
                char genero = teclado.next().charAt(1);

                if (genero == 'F' || genero == 'M') {
                    System.out.println("Entre 0 e 100, quanto você gosta de viajar?");
                    int gostaViajar = teclado.nextInt();

                    if (gostaViajar > 0 && gostaViajar <= 100) {
                        System.out.println("Entre 0 e 100, quanto vc gosta de cozinhar?");
                        int gostaCozinhar = teclado.nextInt();

                        if (gostaCozinhar > 0 && gostaCozinhar <= 100) {
                            System.out.println("Entre 0 e 100, quanto você gosta de ir ao cinema?");
                            int gostaCinema = teclado.nextInt();

                            if (gostaCinema > 0 && gostaCinema <= 100) {
                                System.out.println("Entre 0 e 100, quanto você gosta de balada?");
                                int gostaBalada = teclado.nextInt();

                                if (gostaBalada > 0 && gostaBalada <= 100) {
                                    System.out.println("Entre 0 e 100, quanto você gosta de ficar em casa?");
                                    int gostaFicarEmCasa = teclado.nextInt();

                                    if (gostaFicarEmCasa > 0 && gostaFicarEmCasa <= 100) {
                                        vetor[i] = new Pessoa(nome, idade, genero, gostaViajar, gostaCozinhar, gostaCinema, gostaBalada, gostaFicarEmCasa);

                                    }// fim ultimo if
                                    
                                } // fim Sexto if
                                else{
                                    System.out.println("Digite um numero entre 0 e 100.");
                                }
                            }// fim quinto if
                            else{
                                System.out.println("Digite um numero entre 0 e 100.");
                            }
                        }// fim quarto if
                        else{
                            System.out.println("Digite um numero entre 0 e 100.");
                        }                        
                    }// fim terceiro if
                    else{
                        System.out.println("Digite um numero entre 0 e 100.");
                    }
                }// fim segundo if
                else{
                    System.out.println("Digite F para feminino ou M para masculino.");
                }
            } // fim primeiro if
            else{
                System.out.println("Precisa ser maior de 18 anos para continuar.");
            }

        }// fim do for

        teclado.close();
    } // fim da main
} //fim programa principal
