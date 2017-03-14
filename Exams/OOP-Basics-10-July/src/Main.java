import components.Data;
import components.hardware.HeavyHardwareComponent;
import components.hardware.PowerHardwareComponent;
import components.software.ExpressSoftwareComponent;
import components.software.LightSoftwareComponent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Created by Sim0o on 3/8/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Data data = new Data();

        while(true){
            String command = reader.readLine();
            if(command.equals("System Split")){
                data.executeSystemSplit();
                break;
            }
            int index1 = command.indexOf("(");
            int index2 = command.indexOf(")");
            String commandType = command.substring(0,index1);
            switch (commandType){
                case "RegisterPowerHardware":
                    RegisterPowerHardwareComponent(data, command, index1, index2);
                    break;
                case "RegisterHeavyHardware":
                    RegisterHeavyHardwareComponent(data, command, index1, index2);
                    break;
                case "RegisterExpressSoftware":
                    RegisterExpressSoftwareComponent(data, command, index1, index2);
                    break;
                case "RegisterLightSoftware":
                    RegisterLightSoftwareComponent(data, command, index1, index2);
                    break;
                case "ReleaseSoftwareComponent":
                    ReleaseComponent(data, command, index1, index2);
                    break;
                case "Analyze":
                    System.out.println(data.executeAnalysis());
                    break;

            }
        }
    }

    private static void ReleaseComponent(Data data, String command, int index1, int index2) {
        String[] releaseInfo = command.substring(index1+1,index2).split(",\\s*");
        data.getHardware().get(releaseInfo[0]).ReleaseSoftwareComponent(releaseInfo[1]);
    }

    private static void RegisterLightSoftwareComponent(Data data, String command, int index1, int index2) {
        String[] lsInfo = command.substring(index1+1,index2).split(",\\s*");
        LightSoftwareComponent lsc = new LightSoftwareComponent(lsInfo[0], lsInfo[1],
                Integer.parseInt(lsInfo[2]),Integer.parseInt(lsInfo[3]));
        if(data.getHardware().get(lsInfo[0]).canAddSoftwareComponent(lsc)){
            data.getHardware().get(lsInfo[0]).addSoftwareComponent(lsc);
        }
    }

    private static void RegisterExpressSoftwareComponent(Data data, String command, int index1, int index2) {
        String[] esInfo = command.substring(index1+1,index2).split(",\\s*");
        ExpressSoftwareComponent esc = new ExpressSoftwareComponent(esInfo[0], esInfo[1],
                Integer.parseInt(esInfo[2]),Integer.parseInt(esInfo[3]));
        if(data.getHardware().get(esInfo[0]).canAddSoftwareComponent(esc)){
            data.getHardware().get(esInfo[0]).addSoftwareComponent(esc);
        }
    }

    private static void RegisterHeavyHardwareComponent(Data data, String command, int index1, int index2) {
        String[] hhInfo = command.substring(index1+1,index2).split(",\\s*");
        HeavyHardwareComponent hhc = new HeavyHardwareComponent(hhInfo[0],
                Integer.parseInt(hhInfo[1]),Integer.parseInt(hhInfo[2]));
        data.addHardware(hhc);
    }

    private static void RegisterPowerHardwareComponent(Data data, String command, int index1, int index2) {
        String[] phInfo = command.substring(index1+1,index2).split(",\\s*");
        PowerHardwareComponent phc = new PowerHardwareComponent(phInfo[0],
                Integer.parseInt(phInfo[1]),Integer.parseInt(phInfo[2]));
        data.addHardware(phc);
    }
}
