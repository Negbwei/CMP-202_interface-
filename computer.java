public class computer implements Electronics{

    public computer(RAM ram, Processor cpu, Strorage Storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = strorage;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
}