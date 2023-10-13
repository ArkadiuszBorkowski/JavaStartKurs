package Super.lesson;

class Notebook extends Computer {
    private int batteryCapacity; // pojemność baterii mAh

    public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public Notebook(double cpuTemperature, int ramMemory) {
        super(cpuTemperature, ramMemory);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void coolDown() {
        super.coolDown();
        turboCool();
    }

    private void turboCool() {
        setCpuTemperature(getBatteryCapacity()-1);
    }
}