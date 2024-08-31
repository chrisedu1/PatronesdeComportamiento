package gt.edu.miumg.TampleteMethod;

public abstract class FormatoArchivo {

    public abstract void nombreArchivo();
    public abstract void ObtenerDatos();
    public abstract void cambiarFormato();
    public abstract void Imprimir();

    public final void templete() {
        nombreArchivo();
        ObtenerDatos();
        cambiarFormato();
        Imprimir();
    }
}
