package caixa;

import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {

        long cpf; //12345678900L
        int senha; //01020304
        double deposito, saque, saldo = 1000.00;
        int caixa = 0, menu, menuf;
        int contador;

        Scanner ler = new Scanner(System.in);

        while (caixa == 0) {

            //CPF ----------------------------------------------
            
            System.out.print("Insira seu cpf: ");
            cpf = ler.nextLong();
            System.out.println("");

            if (cpf != 12345678900) {
                
                System.out.println("TELA DE ACESSO NAO PERMITIDA!");
                System.exit(0);

            } else {
                
                //SENHA ----------------------------------------------
                
                contador = 0;
                
                while (contador <= 2) {

                    contador++;
                    System.out.print("Insira sua senha: ");
                    senha = ler.nextInt();
                    System.out.println("");

                    if (senha != 01020304) {
                        System.out.println("VOCE TEM: " + (3 - contador) + " TENTATIVAS(S) ");
                    } else {

                        contador = 0;
                        
                        // MENU ----------------------------------------------
                        
                        for (int i = 0; i < 10; i++) {
                            
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
                                    i = 0;
                                    break;

                                default:
                                    System.out.println("");
                                    System.out.println("OPERAÇÃO INVALIDA");
                                    System.out.println("");
                                    continue; 
                            }
                            
                            // MENU FINAL --------------------------------------
                            
                            do {
                                
                                System.out.println("");
                                System.out.println("Aperte 1 para: Nova operação");
                                System.out.println("Aperte 0 para: Sair");
                                System.out.print("Escolha: ");
                                menuf = ler.nextInt();
                                System.out.println("");

                                if (menuf != 1 && menuf != 0) {
                                    System.out.println("");
                                    System.out.println("OPÇÃO INEXISTENTE");
                                    i = 10;
                                    
                                } else {
                                    if (menuf == 0){
                                        i = 10;
                                        contador = 4;
                                        
                                    } else {
                                        i = 0;
                                    }
                                }

                            } while (menuf != 1 && menuf != 0);
                        }
                    }

                    if (contador == 3) {
                        System.out.println("");
                        System.out.println("CONTA BLOQUEADA");
                        System.exit(0);
                    }
                }

            }
        }

    }
}
