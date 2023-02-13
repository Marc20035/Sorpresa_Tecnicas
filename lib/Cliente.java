

package lib;
class Cliente {
   
    private Diealogo dialogo;

    public Cliente(Fabrica fabrica) {
        dialogo = fabrica.crearDialogo();
    }

    public void ejecutar() {
        dialogo.mostrar();
    }
     

}