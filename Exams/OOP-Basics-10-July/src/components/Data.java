package components;

import components.hardware.HardwareComponent;
import components.software.SoftwareComponent;

import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Sim0o on 3/8/2017.
 */
public class Data {
    private HashMap<String, HardwareComponent> hardware;
    private HashMap<String, SoftwareComponent> software;

    public Data(){
        this.software = new HashMap<>();
        this.hardware = new HashMap<>();
    }

    public HashMap<String, HardwareComponent> getHardware(){
        return this.hardware;
    }
    public HashMap<String, SoftwareComponent> getSoftware(){
        return this.software;
    }
    public void addHardware(HardwareComponent h){
        this.hardware.put(h.getName(), h);
    }

    public String executeAnalysis(){
        String result = String.format("System Analysis\nHardware Components: %s\nSoftware Components: %s\nTotal Operational Memory: %s/%s\nTotal Capacity Taken: %s/%s\n",
                this.hardware.size(), this.getHardware().values().stream().mapToInt(x->x.getSoftwareComponents().size()).sum(),
        this.getHardware().values().stream().mapToInt(x->x.getMemoryTaken()).sum(),
                this.getHardware().values().stream().mapToInt(x->x.getMaxMemory()).sum(),
                this.getHardware().values().stream().mapToInt(x->x.getCapacityTaken()).sum(),
                this.getHardware().values().stream().mapToInt(x->x.getMaxCapacity()).sum());
        return result;
    }
    public void executeSystemSplit(){
        for(HardwareComponent h: this.getHardware().values()){
            System.out.printf("Hardware Component - %s\n", h.getName());
            System.out.printf("Express Software Components - %s\n", h.getSoftwareComponents()
                    .stream()
                    .filter(x->x.getType().equals("Express"))
                    .count());
            System.out.printf("Light Software Components - %s\n", h.getSoftwareComponents()
                    .stream()
                    .filter(x->x.getType().equals("Light"))
                    .count());
            System.out.printf("Memory Usage - %s/%s\n",
                    h.getSoftwareComponents().stream().mapToInt(c->c.getMemoryConsumption()).sum(),
                    h.getMaxMemory());
            System.out.printf("Capacity Usage - %s/%s\n",
                    h.getSoftwareComponents().stream().mapToInt(c->c.getCapacityConsumption()).sum(),
                    h.getMaxCapacity());
            System.out.printf("Type: %s\n", h.getType());
            System.out.printf("Software Components: %s\n", h.getSoftwareComponents().size()==0 ? "None" : h.getSoftwareComponents().stream().map(c->c.getName()).collect(Collectors.joining(", ")));
        }
    }
}
