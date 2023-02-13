package lib;

class FabricaWindows implements Fabrica {
        public Diealogo crearDialogo() {
            return new DialogoWindows();
        }
    }
