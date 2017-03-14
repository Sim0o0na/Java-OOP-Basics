package components.software;

/**
 * Created by Sim0o on 3/8/2017.
 */
public class SoftwareComponent {
    protected String type;
    private String hardwareName;
    private String name;
    private int capacityConsumption;
    private int memoryConsumption;

    public SoftwareComponent(String type,String hardwareName, String name, int capacityConsumption, int memoryConsumption){
        this.type = type;
        this.setHardwareName(hardwareName);
        this.setName(name);
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }
    public String getType(){
        return this.type;
    }
    public String getHardwareName() {
        return hardwareName;
    }

    protected void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getCapacityConsumption() {
        return capacityConsumption;
    }

    protected void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
    }

    public int getMemoryConsumption() {
        return memoryConsumption;
    }

    protected void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
    }

}
