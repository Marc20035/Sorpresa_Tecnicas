package lib;

class FabricaMac implements Fabrica {
     public Diealogo crearDialogo() {
         return new DialogoMac();
     }
 }
