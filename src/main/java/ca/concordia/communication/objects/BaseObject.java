package ca.concordia.communication.objects;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BaseObject {

    private UUID id;
    private String objectName;
    private double positionX;
    private double positionY;
    private double positionZ;
    private Timestamp time;
}
