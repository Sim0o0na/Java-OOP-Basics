package components.hardware;

/**
 * Created by Sim0o0na on 3/8/2017.
 */
public class HeavyHardwareComponent extends HardwareComponent {
    private static final String type  = "Heavy";
    public HeavyHardwareComponent(String name, int maxCapacity, int maxMemory) {
        super(type,name, maxCapacity, maxMemory);
    }

    @Override
    protected void setMaxCapacity(int maxCapacity){
        double capacity = 2*maxCapacity;
        this.maxCapacity=((int)capacity);
    }

    @Override
    protected void setMaxMemory(int maxMemory){
        double memory = maxMemory-(0.25*maxMemory);
        this.maxMemory=((int)memory);
    }
}
