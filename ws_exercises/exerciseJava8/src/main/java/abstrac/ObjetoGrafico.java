package abstrac;

public abstract class ObjetoGrafico {

    protected int x,y;
    public void moverA(int nuevaX, int nuevaY ){
        this.x=   nuevaX;
        this.y= nuevaY;

    }

    abstract  public void  dibujar();
    abstract public void cambiarTamanio(int factorAumento);
}
