package Domain;

public class CNaddition {

    static public ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        ComplexNumber cn = new ComplexNumber(0, 0);

        cn.setReal(cn1.getReal() + cn2.getReal());
        cn.setImaginary(cn1.getImaginary() + cn2.getImaginary());

        return cn;
    }

}
