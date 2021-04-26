/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importadoraparcial2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.EventEntity;
import service.EventService;
/**
 *
 * @author Mario
 */
public class ImportadoraParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        EventService eventService = new EventService();
        EventEntity evententity = new EventEntity();
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Por favor ingrese la fecha: ");
        String date = br.readLine();
        evententity.setDate(date);

        System.out.println("Por favor ingrese la hora: ");

        String time = br.readLine(); 
        
        
        evententity.setTime(time);
        eventService.createEvent(evententity);

    }
        
    
}
