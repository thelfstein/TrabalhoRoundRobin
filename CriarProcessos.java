/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approundrobin;

import java.io.BufferedReader;
import java.io.*;
import java.util.regex.Pattern;

public class CriarProcessos {
    String linha, nome, linhaQ[],linhaQ2[];
    Processo processos[];
    
    public int NumeroProcessos(){
        return linhaQ.length;
    }

    public CriarProcessos(String nome){
        this.nome = nome;
    }

    public void GerarLinha() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nome));
            while (br.ready()) {
                linha = br.readLine();
            }
            br.close();
        } catch (IOException ioe) {
        }
    }

    public void QuebrarLinha(){
        
            linhaQ= linha.split(Pattern.quote(","));
        
        
    }
    
    public void Criar(){
        GerarLinha();
        QuebrarLinha();
        processos = new Processo[NumeroProcessos()];
        for (int i = 0; i < NumeroProcessos(); i++) {
            
                linhaQ2 = linhaQ[i].split(Pattern.quote(" "));
                processos[i] = new Processo(linhaQ2[0], 
                        Integer.parseInt(linhaQ2[1]),
                        Integer.parseInt(linhaQ2[2]));
            
        }
    }
}
