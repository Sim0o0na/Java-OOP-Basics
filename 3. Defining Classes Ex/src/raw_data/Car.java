package raw_data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires = new ArrayList<>();
    //“<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure>
    // <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>”
    public Car(String model, Engine engine, Cargo cargo,
               double tire1pressure, int tire1Age,double tire2pressure, int tire2Age,
               double tire3pressure, int tire3Age,double tire4pressure, int tire4Age) {
        this.setModel(model);
        this.engine = engine;
        this.cargo = cargo;
        this.setTires(tire1pressure, tire1Age,tire2pressure,tire2Age, tire3pressure, tire3Age, tire4pressure,tire4Age);
    }
    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(double tire1pressure, int tire1Age, double tire2pressure, int tire2Age,
                         double tire3pressure, int tire3Age, double tire4pressure, int tire4Age) {
        this.tires.add(new Tire(tire1Age, tire1pressure));
        this.tires.add(new Tire(tire2Age, tire2pressure));
        this.tires.add(new Tire(tire3Age, tire3pressure));
        this.tires.add(new Tire(tire4Age, tire4pressure));
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString(){
        return this.model;
    }
}

