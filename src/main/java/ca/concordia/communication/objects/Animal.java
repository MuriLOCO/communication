package ca.concordia.communication.objects;

import ca.concordia.communication.enums.AnimalEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Animal extends BaseObject {

    private AnimalEnum animalType;
}
