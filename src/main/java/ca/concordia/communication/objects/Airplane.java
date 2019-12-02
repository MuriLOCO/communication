package ca.concordia.communication.objects;

import ca.concordia.communication.enums.AirplaneEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Airplane extends BaseObject {

    private double size;
    private AirplaneEnum airplaneType;
}
