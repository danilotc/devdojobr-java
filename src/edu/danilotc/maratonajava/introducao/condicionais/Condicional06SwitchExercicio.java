package edu.danilotc.maratonajava.introducao.condicionais;

public class Condicional06SwitchExercicio {
    public static void main(String[] args) {
        byte diaSemana = 3;
        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválido");
                break;
        }
    }
}
