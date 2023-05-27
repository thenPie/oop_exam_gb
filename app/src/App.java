import Domain.ComplexNumber;

public class App {
    public static void main(String[] args) throws Exception {
        
        ComplexNumber cn1 = new ComplexNumber(5, 7);
        ComplexNumber cn2 = new ComplexNumber(3, 4);

        cn1.showC();
        cn2.showC();

        ComplexNumber res = ComplexNumber.add(cn1, cn2);

        res.showC();

    }
}
