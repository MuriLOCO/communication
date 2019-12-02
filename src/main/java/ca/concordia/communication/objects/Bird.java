package ca.concordia.communication.objects;

import ca.concordia.communication.enums.BirdEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Bird extends BaseObject {

    private BirdEnum specie;
}
