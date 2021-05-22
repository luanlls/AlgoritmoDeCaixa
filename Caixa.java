package caixa;

import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {

        long cpfv, cpf = 123L;
        int senhav, senha = 123;
        int menu = 0, menuf;
        float saldo = 1000.00f;
        int contador = 0, contador2 = 0;
        int tudo = 0;
        float deposito, saque;

        Scanner ler = new Scanner(System.in);

        while (tudo != 1) {

            System.out.print("Insira seu cpf: ");
            cpfv = ler.nextLong();

            if (cpf != cpfv) {

                System.out.println("");
                System.out.println("TELA DE ACESSO NAO PERMITIDA!");
                System.exit(0);

            } else {

                System.out.print("Digite sua senha: ");
                senhav = ler.nextInt();

                    do {                          
                        contador++;
                        System.out.println("");
                        System.out.println( (3 - contador) + " TENTATIVA(S) RESTANTES!");
                        System.out.print("Digite sua senha: ");
                        senhav = ler.nextInt();
                        
                        if (contador == 2) {
                            System.out.println("");
                            System.out.println("CONTA BLOQUEADA");
                            System.exit(0);
                        }
                        
                    } while (senha != senhav);

                while (menu < 0 || menu > 3) {

                    System.out.println("");
                    System.out.println("--------MENU--------");
                    System.out.println("Aperte 1 para: Saldo.");
                    System.out.println("Aperte 2 para: Deposito.");
                    System.out.println("Aperte 3 para: Saque.");
                    System.out.println("Aperte 0 para: Sair.");
                    System.out.print("Escolha: ");
                    menu = ler.nextInt();

                    switch (menu) {

                        case 1:
                            System.out.println("");
                            System.out.println("Seu saldo é de: " + saldo);
                            break;

                        case 2:
                            System.out.println("");
                            System.out.println("Insira o valor do deposito: ");
                            deposito = ler.nextFloat();
                            System.out.println("");
                            System.out.println("Seu saldo após o deposito é de: " + (saldo + deposito));
                            saldo = saldo + deposito;
                            break;

                        case 3:
                            System.out.println("");
                            System.out.println("Insira o valor do saque: ");
                            saque = ler.nextFloat();
                            System.out.println("");
                            System.out.println("Seu saldo após o saque é de: " + (saldo - saque));
                            saldo = saldo - saque;
                            break;

                        case 0:
                            tudo = 1;
                            break;

                        default:
                            System.out.println("");
                            System.out.println("OPERA��O INVALIDA");
                    }

                    for (int l = 0; l < 10; l++) {

                        System.out.println("");
                        System.out.println("Aperte 1 para: Nova operação.");
                        System.out.println("Aperte 0 para: Sair.");
                        System.out.print("Escolha: ");
                        menuf = ler.nextInt();
                        System.out.println("");

                        switch (menuf) {

                            case 1:
                                h = 0;
                                l = 10;
                                break;

                            case 0:
                                tudo = 0;
                                h = 10;
                                l = 10;
                                break;

                            default:
                                l = 0;
                        }
                    }
                }
                }
            }
        }
    }