/*
 * 
 */
package estudodirigido2;

import java.util.Scanner;

public class MainDesconto 

{
    public static void main(String[] args)
    
        {
        Scanner ler = new Scanner(System.in);

        Desconto d1 =  new Desconto();
        
        
        System.out.println("Digite o nome do produto: ");
        d1.setNome(ler.nextLine());
        
        System.out.println("Digite o valor do produto: ");
        d1.setValor(ler.nextDouble());
        
        System.out.println("Produto: " + d1.getNome());
        System.out.println("valor: " + d1.getValor());
        System.out.println("Desconto: " + d1.calcularDesconto());
        
        
        
        }   
    }

