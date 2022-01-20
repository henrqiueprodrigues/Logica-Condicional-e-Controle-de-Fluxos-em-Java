package Controle_de_Fluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        ifComFlecha(scan);
        ifSemFlechas(scan);
        ifFerias(scan);
        ifMenor();

        switchDiaSemana(scan);
        switchNumero(scan);
        switchFerias(scan);


        scan.close();
    }
    public static void ifComFlecha(Scanner scan){
        System.out.println("Insira o numero do mes desejado:");
        int mes= scan.nextInt();
        if (mes == 1){
            System.out.println("Janeiro");
        } else {
            if (mes == 2){
                System.out.println("Fevereiro");
            } else {
                if (mes == 3){
                    System.out.println("Março");
                } else {
                    if (mes == 4){
                        System.out.println("Abril");
                    } else {
                        if (mes == 5){
                            System.out.println("Maio");
                        } else {
                            if (mes == 6){
                                System.out.println("Junho");
                            } else {
                                if (mes == 7){
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8){
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9){
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10){
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11){
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12){
                                                        System.out.println("dezembro");
                                                    } else {
                                                        System.out.println("Mes invalido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static void ifSemFlechas(Scanner scan){
        System.out.println("Digite o numero do mes desejado:");
        int mes= scan.nextInt();
        if(mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevreiro");
        } else if (mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8){
            System.out.println("Agosto");
        } else if (mes == 9){
            System.out.println("Setembro");
        } else if (mes == 10){
            System.out.println("Outubro");
        } else if (mes == 11){
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Mes invalido");
        }

    }

    public static void ifFerias(Scanner scan){
        System.out.println("Digite o mes atual:");
        String mes= scan.nextLine();
        System.out.println("mes= " + mes);
        if(mes.equals("Junho") || mes.equals("Dezembro") || mes.equals( "Janeiro")){
            System.out.println("Mes de ferias");
        } else {
            System.out.println("Mes normal");
        }

    }

    public static void ifMenor(){
        double salarioMensal= 11893.58d;
        double mediaSalario= 10500d;

        int quantidadeDependentes= 4;
        int meidaDependentes= 2;

        //evitar
        if((salarioMensal < mediaSalario) && (quantidadeDependentes >= meidaDependentes)){
            System.out.println("Deve receber auxilio");
        }

        //solucionar dessa maneiro
        boolean salarioBaixo= salarioMensal < mediaSalario;
        boolean muitosDependente= quantidadeDependentes> meidaDependentes;
        boolean recebeAuxilio= salarioBaixo && muitosDependente;
        if (recebeAuxilio){
            System.out.println("Deve receber auxilio");
        } else {
            System.out.println("Não deve recceber auxilio");
        }
    }

    public static void switchDiaSemana(Scanner scan){
        System.out.println("Digite o dia da semana:");
        String dia= scan.nextLine();
        switch (dia){
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sabado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia da semana invalido");
                break;
        }
    }

    public static void switchNumero(Scanner scan){
        System.out.println("Digite um numero:");
        int numero = scan.nextInt();
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Numero não definido");
                break;
        }
    }

    public static void switchFerias(Scanner scan){
        System.out.println("Digite o mes atua:");
        String mes= scan.nextLine();
        System.out.println("mes= " + mes);
        switch (mes){
            case "Julho":
            case "Dezembro":
            case "Janeiro":
                System.out.println("Mes de ferias");
                break;
            default:
                System.out.println("Mes normal");
                break;
        }
    }


}
