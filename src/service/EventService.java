package service;
import dao.EventDao;
import java.util.*;
import model.EnterpriseEntity;
import model.EventEntity;

/**
 * 
 */
public class EventService {

    public EventService() {
    }
    
    public void createEvent(EventEntity Event) {
        EventDao e = new EventDao();
        e.createEvent(Event);
    }

    public void setDateTime(String Date, String Time) {
        
    }

    public void sendInvitation(List<EnterpriseEntity> ListEnterprise) {
        
    }

}