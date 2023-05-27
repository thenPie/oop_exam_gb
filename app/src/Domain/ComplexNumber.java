package Domain;

public class ComplexNumber {
    
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    private int getReal() {
        return real;
    }

    private int getImaginary() {
        return imaginary;
    }

    private void setReal(int real) {
        this.real = real;
    }

    private void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    // useless, to show it
    public void showC() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        ComplexNumber cn = new ComplexNumber(0, 0);

        cn.setReal(cn1.getReal() + cn2.getReal());
        cn.setImaginary(cn1.getImaginary() + cn2.getImaginary());

        return cn;
    }

}
