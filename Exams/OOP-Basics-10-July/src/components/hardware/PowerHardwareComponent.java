package components.hardware;

/**
 * Created by Sim0o on 3/8/2017.
 */
public class PowerHardwareComponent extends HardwareComponent {
    private static final String type  = "Power";
    public PowerHardwareComponent(String name, int maxCapacity, int maxMemory) {
        super(type,name, maxCapacity, maxMemory);
    }

    @Override
    protected void setMaxCapacity(int maxCapacity){
        double capacity = 0.25*maxCapacity;
        this.maxCapacity=((int)capacity);
    }

    @Override
    protected void setMaxMemory(int maxMemory){
        double memory = maxMemory+(0.75*maxMemory);
        this.maxMemory=((int)memory);
    }
}
