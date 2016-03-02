package Model;

import Model.Enums.PetStatus;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Eiger on 1/03/2016.
 */
@Embeddable
public class BoardingPetStatus  implements Serializable{

    public BoardingPetStatus() {

    }

    private Date last_fed;
    private Date last_status_update;

    private PetStatus status;

    public Date getLastFed() {
        return last_fed;
    }

    public void setLastFed(Date last_fed) {
        this.last_fed = last_fed;
    }


    public void setLastStatusUpdate(Date last_status_update) {
        this.last_status_update = last_status_update;
    }

    public Date getLastStatusUpdate() {
        return last_status_update;
    }

    public void setStatus(PetStatus status) {
        last_status_update = new Date();
        this.status = status;
    }

    public PetStatus getStatus() {
        return status;
    }

}
