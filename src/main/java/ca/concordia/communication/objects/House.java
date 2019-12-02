package ca.concordia.communication.objects;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class House extends BaseObject{

    private Double dimensionInSquareMeters;
}
