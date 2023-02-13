class Demo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(new FabricaWindows());
        cliente.ejecutar();
        cliente = new Cliente(new FabricaMac());
        cliente.ejecutar();
    }




}
