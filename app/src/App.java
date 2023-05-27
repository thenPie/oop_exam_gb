import Domain.CNaddition;
import Domain.ComplexNumber;

public class App {
    public static void main(String[] args) throws Exception {
        
        ComplexNumber cn1 = new ComplexNumber(5, 7);
        ComplexNumber cn2 = new ComplexNumber(3, 4);

        cn1.showCN();
        cn2.showCN();

        ComplexNumber res = CNaddition.add(cn1, cn2);

        res.showCN();

    }
}
