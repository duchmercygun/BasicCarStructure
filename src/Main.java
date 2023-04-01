import java.util.List;

public class Main {
    public static void main(String[] args) {

        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="500cc";

        Engine x=new Engine();
        x.cylinder="8";
        x.size="1234cc";
        x.weight="6453k";

        Lights neon=new Lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";
    }
}