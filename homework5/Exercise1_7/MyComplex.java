package Exercise1_7;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex() {

    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }

    public boolean isReal() {
        if (imag == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (real == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if ((Double.compare(this.real, real) == 0)
                && (Double.compare(this.imag, imag) == 0)) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex right) {
        if ((Double.compare(this.real, right.real) == 0)
                && (Double.compare(this.imag, right.imag) == 0)) {
            return true;
        }
        return false;
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right) {
//        setReal(real + right.real);
//        setImag(imag + right.imag);
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {

        return new MyComplex(real + right.real, imag + right.imag);
    }


}
