import Domain.CNaddition;
import Domain.CNdivision;
import Domain.CNmultiplication;
import Domain.ComplexNumber;

public class App {
    public static void main(String[] args) throws Exception {
        
        ComplexNumber cn1 = new ComplexNumber(5.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 6.0);

        cn1.showCN();
        cn2.showCN();
        System.out.println();

        ComplexNumber resAdd = CNaddition.add(cn1, cn2);
        ComplexNumber resMul = CNmultiplication.multiplication(cn1, cn2);
        ComplexNumber resDiv = CNdivision.division(cn1, cn2);

        resAdd.showCN();
        resMul.showCN();
        resDiv.showCN();

    }
}
