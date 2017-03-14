package components.software;

/**
 * Created by Sim0o on 3/8/2017.
 */
public class ExpressSoftwareComponent extends SoftwareComponent {
    private static final String type  = "Express";
    public ExpressSoftwareComponent(String hardwareName, String name, int capacityConsumption, int memoryConsumption) {
        super(type,hardwareName, name, capacityConsumption, memoryConsumption);
    }

    @Override
    protected void setMemoryConsumption(int memoryConsumption){
        double memory = memoryConsumption*2;
        super.setMemoryConsumption((int)memory);
    }
}
