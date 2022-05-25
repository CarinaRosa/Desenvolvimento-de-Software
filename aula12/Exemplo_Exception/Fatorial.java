package aula12.Exemplo_Exception;

public class Fatorial {
    
    public static long calcular(int num){

        if (num >= 0) {
            int fat = 1;
            for (int i = 2; i < num; i++) {
                fat *= i;                
            }
            return fat;
        } else {
            System.out.printf("Não existe fatorial de numero negativo: %d", num);
            return -1;
        }
        
    }
}
