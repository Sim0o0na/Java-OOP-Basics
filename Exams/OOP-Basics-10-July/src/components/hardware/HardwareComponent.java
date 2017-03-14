package components.hardware;

import components.software.SoftwareComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0ona on 3/8/2017.
 */
public abstract class HardwareComponent {
    protected String name;
    protected String type;
    protected int maxCapacity;
    protected int maxMemory;
    protected int capacityTaken;
    protected int memoryTaken;
    protected List<SoftwareComponent> softwareComponents;

    public HardwareComponent(String type, String name, int maxCapacity, int maxMemory){
        this.type = type;
        this.name = name;
        this.setMaxCapacity(maxCapacity);
        this.setMaxMemory(maxMemory);
        this.softwareComponents = new ArrayList<>();
    }
    public int getCapacityTaken() {
        return capacityTaken;
    }

    public int getMemoryTaken() {
        return memoryTaken;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }

    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    protected void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public int getMaxMemory(){
        return this.maxMemory;
    }

    protected void setMaxMemory(int maxCapacity){
        this.maxMemory = maxMemory;
    }

    public boolean canAddSoftwareComponent(SoftwareComponent s){
//        System.out.printf("Max memory: %s, component memory+taken: %s\n", this.maxMemory, s.getMemoryConsumption() + this.memoryTaken);
//        System.out.printf("Max capacity: %s, component capacity+taken: %s\n", this.maxCapacity, s.getCapacityConsumption() + this.capacityTaken);
        if(this.maxMemory>=(s.getMemoryConsumption() + this.memoryTaken) &&
                this.maxCapacity>=(s.getCapacityConsumption() + this.capacityTaken)){
            return true;
        }
        return false;
    }

    public void addSoftwareComponent(SoftwareComponent s){
        this.capacityTaken+=s.getCapacityConsumption();
        this.memoryTaken+=s.getMemoryConsumption();
        this.softwareComponents.add(s);
    }

    public List<SoftwareComponent> getSoftwareComponents(){
        return this.softwareComponents;
    }
    public void ReleaseSoftwareComponent(String softwareComponentName){
        try {
            SoftwareComponent toRemove = this.softwareComponents.stream().filter(x->x.getName().equals(softwareComponentName)).findFirst().get();
            this.softwareComponents.remove(toRemove);
        }catch(Exception e){
            System.out.println("No such component");
        }
    }
}
