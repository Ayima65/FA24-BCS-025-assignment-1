public class SystemUnit {

    private String cpuName;
    private int RamSize;
    private int DiscSize;
    private String Systemid;
    private String LCDmodel;

    
    public SystemUnit(String cpuName, int RamSize, int DiscSize, String Systemid, String LCDmodel) {
        this.cpuName = cpuName;
        this.RamSize = RamSize;
        this.DiscSize = DiscSize;
        this.Systemid = Systemid;
        this.LCDmodel = LCDmodel;
    }

    
    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public int getRamSize() {
        return RamSize;
    }

    public void setRamSize(int RamSize) {
        this.RamSize = RamSize;
    }

    public int getDiscSize() {
        return DiscSize;
    }

    public void setDiscSize(int DiscSize) {
        this.DiscSize = DiscSize;
    }

    public String getSystemid() {
        return Systemid;
    }

    public void setSystemid(String Systemid) {
        this.Systemid = Systemid;
    }

    public String getLCDmodel() {
        return LCDmodel;
    }

    public void setLCDmodel(String LCDmodel) {
        this.LCDmodel = LCDmodel;
    }

    
    public String toString() {
        return String.format("\nSystemUnit Details:\ncpuName: %s\nRamSize: %d\nDiscSize: %d\nSystemid: %s\nLCD model: %s\n", 
                             cpuName, RamSize, DiscSize, Systemid, LCDmodel);
    }
}
