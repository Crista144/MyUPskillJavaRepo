/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.upskilljava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String Grupos[][] = {
            {  
                "André Filipe Oliveira Aguiar",
                "Diana Pereira",
                "João Iglesias",
                "Helder Ferreira",
                "João Raposo"

            }, 
            {  
                "José Fonseca",
                "Daniel Junior", 
                "Paulo Lima",
                "Vania Figueira",
            },
            {  
	        "Diana Ferreira Matos",
                "Marco Pereira",
                "Ana Catarina Hristoff",
                "Coloque aqui o seu nome"
                
            },
            {
                "Diana Ferreira Matos",
                "Coloque aqui o seu nome", 
                "Coloque aqui o seu nome",
                "Andrea Galambos"
            },            
            {  
                "Jorge Pires",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Marco Pereira"
            },            
            {
                "Marco Pereira",
                "Amilcar Cerqueira",
                "Coloque aqui o seu nome", 
                "Coloque aqui o seu nome"
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome"
            },            
            {  
                "Bárbara Leston Bandeira",
                "Ana Batista Pereira",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome"
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome"
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome"
            },            
            {  
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome",
                "Coloque aqui o seu nome"
            }
        };
        
        for (int x = 0; x < Grupos.length; x ++) {
            String Grupo[] = Grupos[x]; 
            System.out.println( "Grupo " + (x+1));
            for (int y = 0; y < Grupo.length; y ++) {
                String formando = Grupo[y];
                System.out.println( "\t" + formando );
            }
            System.out.println("-------");
        }    
    }
}
