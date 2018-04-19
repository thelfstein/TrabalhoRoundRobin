/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approundrobin;

public class AppRoundRobin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CriarProcessos criar = new CriarProcessos("A:\\Processos.txt");
              criar.Criar();
       
               
       
        for (int i = 0; i < criar.NumeroProcessos(); i++) {
            System.out.println("Processo : " + criar.processos[i].getNome() );
            System.out.println("Tempo de Chegada: " + criar.processos[i].getChegada());
            System.out.println("Duração: " + criar.processos[i].getDuracao());
            System.out.println(" ");
        }
        
    }
    
}
