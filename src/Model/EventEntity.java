package model;
import java.util.*;
import model.EnterpriseEntity;

/**
 * 
 */
public class EventEntity {

    /**
     * Default constructor
     */
    public EventEntity() {
    }

    /**
     * 
     */
    private String Date;

    /**
     * 
     */
    private String Time;

    /**
     * 
     */

    /**
     * @param date 
     * @return
     */
    public void setDate(String date) {
        this.Date = date;
    }

    /**
     * @return
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * @param time 
     * @return
     */
    public void setTime(String time) {
        this.Time = time;
        
    }

    /**
     * @return
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * @param ListEnterprise 
     * @return
     */
    public void setListEnterprise(List<EnterpriseEntity> ListEnterprise) {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public List<EnterpriseEntity> getListEnterprise() {
        // TODO implement here
        return null;
    }

}