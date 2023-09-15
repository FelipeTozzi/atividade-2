package RT;

public class Resultado extends Notas {


    public int resultado(){
        return (this.getNt1() + this.getNt2())  + getNp();
    }
}
