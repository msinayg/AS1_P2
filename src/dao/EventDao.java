package dao;
import java.util.*;
import model.EventEntity;
/**
 * 
 */
public class EventDao {

    
    public EventDao() {
    }
    
    public EventEntity readEvent(int id) {
        return null;
    }

    public void updateEvent(EventEntity Event) {
        
    }

    
    public void deleteEvent(int id) {
        
    }

    public void createEvent(EventEntity Event) {
        // TODO implement here
        System.out.println("Se ha creado el evento el día: " + Event.getDate() + " a las: " + Event.getTime() );
    }

}