package zw.demo.extends_exercise;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    /**
     * 构造器的注释
     *
     * @param cpu    CPU
     * @param memory 内存
     * @param disk   硬盘
     */
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String details() {
        return "CPU is " + this.getCpu() + ",Memory is " + this.getMemory() + ",disk is " + this.getDisk();
    }
}
