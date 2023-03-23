
import java.util.*;

public class ComplexNumber{
    double real, img;

    ComplexNumber(double x, double y){
        this.real = x;
        this.img = y;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        //returning the output complex number
        return temp;
    }

    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real * c2.real - c1.img * c2.img;
        temp.img = c1.real * c2.img + c1.img * c2.real;
        
        //returning the output complex number
        return temp;
    }

    public static ComplexNumber pauliX(ComplexNumber c1, ComplexNumber c2){

        ComplexNumber cmp1 = new ComplexNumber(0, 0);
        ComplexNumber cmp2 = new ComplexNumber(0, 0);

        cmp1.real = c1.real * 0;
        cmp1.img = c1.img * 0;


        return cmp1;
    }
    
    public static void main(String args[]){
    
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(1, 7);
    
        ComplexNumber temp = multiply(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}
