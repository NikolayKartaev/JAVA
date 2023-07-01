package JAVA.Homework;

import java.util.ArrayList;
/* */
public class Notebook {
    private Integer IMEI;
    private String Producer;
    private String CPU;
    private Integer RAM;
    private Integer HDD;
    private String OS;
    private String Color;

    ArrayList<String> filtered_notebooks = new ArrayList<>();

    //ctor - вызов конструктора

    public Notebook(Integer IMEI, String Producer, String CPU, String OS, String Color, Integer RAM, Integer HDD) {
        this.CPU = CPU;
        this.Color = Color;
        this.HDD = HDD;
        this.IMEI = IMEI;
        this.OS = OS;
        this.RAM = RAM;
        this.Producer = Producer;

    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cpu) {
        this.CPU = cpu;
    }

    public String getColor() {
        return Color;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer hdd) {
        this.HDD = hdd;
    }

    public Integer getIMEI() {
        return IMEI;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String os) {
        this.OS = os;
    }

    public String getProducer() {
        return Producer;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer ram) {
        this.RAM = ram;
    }

    @Override
    public String toString() {
        return String.format("IMEI: %d, Producer: %s, CPU: %s, OS: %s, Color: %s, RAM: %d, HDD: %d", IMEI, Producer,
                CPU, OS, Color, RAM, HDD);
    }

}
