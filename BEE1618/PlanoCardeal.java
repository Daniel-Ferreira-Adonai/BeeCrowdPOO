package BEE1618;

public class PlanoCardeal {
    private int tamanhoX;

    private int tamanhoY;


    PlanoCardeal(){
        tamanhoY = 10;
        tamanhoX = 10;
    }

    public int getTamanhoX() {
        return tamanhoX;
    }

    public void setTamanhoX(int tamanhoX) {
        this.tamanhoX = tamanhoX;
    }

    public int getTamanhoY() {
        return tamanhoY;
    }

    public void setTamanhoY(int tamanhoY) {
        this.tamanhoY = tamanhoY;
    }

    public int verificaRobo(int Ax, int Ay, int Bx, int By, int Cx, int Cy, int dX, int Dy, int Rx, int Ry){

        if(Rx >= Ax && Rx <= Bx && Ry >= By && Ry <= Cy){
            return 1;
        }
        else{
            return 0;
        }
    }
}
