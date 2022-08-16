package HomeWork15;

public class Circle {
    private double a = Math.PI;
    private int radius ;



    void setArea (int radius) {
       a*=(radius*radius);

    }
    void setCircumference(int radius){
       a*=2*radius;
    }

    double getArea() {
        return a;
    }
    double getCircumference(){
        return a;
    }
}
