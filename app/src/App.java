import Domain.CNaddition;
import Domain.CNdivision;
import Domain.CNmultiplication;
import Domain.ComplexNumber;

public class App {
    public static void main(String[] args) throws Exception {
        
        ComplexNumber cn1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 9.0);

        cn1.showCN();
        cn2.showCN();

        ComplexNumber resAdd = CNaddition.add(cn1, cn2);
        ComplexNumber resMul = CNmultiplication.multiplication(cn1, cn2);
        ComplexNumber resDiv = CNdivision.division(cn1, cn2);

        resAdd.showCN();
        resMul.showCN();
        resDiv.showCN();

    }
}
