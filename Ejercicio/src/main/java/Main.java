import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Resta;
import Operaciones.Suma;

import javax.lang.model.element.ModuleElement;

public class Main {
    public static void main(String[] args) {
        Suma objSuma = new Suma();
        Resta objResta = new Resta();
        Multiplicacion objMulti = new Multiplicacion();
        Division objDivision = new Division();

        objSuma.operacionSuma(23, 3);
        objResta.operacionResta(12, 3);
        objMulti.operacionMult(5, 3);
        objDivision.operacionDivision(6, 3);
    }
}
