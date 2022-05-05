package aula02;

import java.util.Scanner;

public class calendario {
    //Funções procedimentos
    public static String mostrarNomeMesIf(int mes){
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = "Janeiro";
        } else if (mes == 2) {
            nomeMes = "Fevereiro";
        } else if (mes == 3) {
            nomeMes = "Março";
        } else if (mes == 4) {
            nomeMes = "Abril";
        } else if (mes == 5) {
            nomeMes = "Maio";
        } else if (mes == 6) {
            nomeMes = "Junho";
        } else if (mes == 7) {
            nomeMes = "Julho";
        } else if (mes == 8) {
            nomeMes = "Agosto";
        } else if (mes == 9) {
            nomeMes = "Setembro";
        } else if (mes == 10) {
            nomeMes = "Outubro";
        } else if (mes == 11) {
            nomeMes = "Novembro";
        } else if (mes == 12) {
            nomeMes = "Dezembro";
        } 
        return nomeMes;
    }

    public static String mostrarNomeMesSwitch(int mes){
        String nomeMes = "";
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";               
                break;

            case 2:
                nomeMes = "Fevereiro";
                break;

            case 3:
                nomeMes = "Março";
                break;

            case 4:
                nomeMes = "Abril";
                break;

            case 5:
                nomeMes = "Maio";
                break;

            case 6:
                nomeMes = "Junho";
                break;

            case 7:
                nomeMes = "Julho";
                break;

            case 8:
                nomeMes = "Agosto";
                break;

            case 9:
                nomeMes = "Setembro";
                break;

            case 10:
                nomeMes = "Outubro";
                break;

            case 11:
                nomeMes = "Novembro";
                break;

            case 12:
                nomeMes = "Dezembro";
                break;
        
            default:
                break;
        }
        return nomeMes;
    }
    // Função principal
    public static void main(String[] args){
        // Mostrar uma mensagem para o usuario
        System.out.println("Digite o mês:"); 
        Scanner input = new Scanner(System.in);
       
        // Depois quero ler o numero digitado no teclado 
        int mes = input.nextInt();

        // E depois quero mostrar o nome do mes.
        // Com IF
        // Com Switch
        System.out.println("Numero digitado = " + mes);
        System.out.println("Nome do mes (if) = " + mostrarNomeMesIf(mes));
        System.out.println("Nome do mes (Switch) = " + mostrarNomeMesSwitch(mes));
        input.close();

    }
}
