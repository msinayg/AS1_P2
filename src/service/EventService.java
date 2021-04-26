package service;
import dao.EventDao;
import java.util.*;
import model.EnterpriseEntity;
import model.EventEntity;

/**
 * 
 */
public class EventService {

    /**
     * Default constructor
     */
    public EventService() {
    }

    /**
     * @param Event 
     * @return
     */
    public void createEvent(EventEntity Event) {
        EventDao e = new EventDao();
        e.createEvent(Event);
    }

    /**
     * @param Date 
     * @param Time 
     * @return
     */
    public void setDateTime(String Date, String Time) {
        // TODO implement here
        
    }

    /**
     * @param ListEnterprise 
     * @return
     */
    public void sendInvitation(List<EnterpriseEntity> ListEnterprise) {
        // TODO implement here
        
    }

}