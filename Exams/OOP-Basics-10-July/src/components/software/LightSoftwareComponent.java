package components.software;

/**
 * Created by Sim0o on 3/8/2017.
 */
public class LightSoftwareComponent extends SoftwareComponent {
    private static final String type  = "Light";
    public LightSoftwareComponent(String hardwareName, String name, int capacityConsumption, int memoryConsumption) {
        super(type,hardwareName, name, capacityConsumption, memoryConsumption);
    }

    @Override
    protected void setMemoryConsumption(int memoryConsumption){
        double memory = memoryConsumption - (0.5*memoryConsumption);
        super.setMemoryConsumption((int)memory);
    }

    @Override
    protected void setCapacityConsumption(int capacityConsumption) {
        double capacity = capacityConsumption+(0.5*capacityConsumption);
        super.setCapacityConsumption((int)capacity);
    }
}
