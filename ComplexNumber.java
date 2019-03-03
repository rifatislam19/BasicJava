/**
Introduction to Java demo for HackTrin VI, by Cleo de Rocco and Rifat Islam
 */
import java.awt.Graphics;


public class ComplexNumber {

private double a;
private double b;

/**
* Creates a new ComplexNumber with both real and imaginary components
* @param a the real component of the complex number
* @param b the imaginary component of the complex number
*/
public ComplexNumber(double a, double b){
this.a = a;
this.b = b;
}

/**
* The "copy constructor",
* Creates a new ComplexNumber from an existing ComplexNumber
* @param c a ComplexNumber
*/
public ComplexNumber(ComplexNumber c){
a = c.getReal();
b = c.getImaginary();
}

/**
* The "default constructor",
* Creates a ComplexNumber with the real and scalar being equal to 0
*/
public ComplexNumber(){
this.a = 0;
this.b = 0;
}

/**
* An "accessor" method,
* Returns the real component of this ComplexNumber
* @return a the private real component of this ComplexNumber
*/
public double getReal(){
return a;
}

/**
* An "accessor" method,
* Returns the imaginary component of this ComplexNumber
* @return b the private imaginary component of this ComplexNumber
*/
public double getImaginary(){
return b;
}

/**
* An "conjugate" method,
* private method
* Returns the conjugate of a ComplexNumber
*/
private ComplexNumber conjugate() {
return new ComplexNumber(this.a,this.b*-1);
}

/**
* An "add" method,
* Instance method,
* Returns the addition of two ComplexNumbers
*/
public ComplexNumber add(ComplexNumber c2) {
return new ComplexNumber(this.a + c2.getReal(),this.b + c2.getImaginary());
}

/**
* An "add" method,
* Static method,
* Returns the addition of two ComplexNumbers
*/
public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
double aNew = c1.getReal() + c2.getReal();
double bNew = c1.getImaginary() + c2.getImaginary();
return new ComplexNumber(aNew,bNew);
}

/**
* An "subtract" method,
* Instance method,
* Returns the subtraction of two ComplexNumbers
*/
public ComplexNumber subtract(ComplexNumber c2) {
double aNew = this.a - c2.getReal();
double bNew = this.b - c2.getImaginary();
return new ComplexNumber(aNew,bNew);
}

/**
* An "subtract" method,
* Static method,
* Returns the subtraction of two ComplexNumbers
*/
public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
double aNew = c1.getReal() - c2.getReal();
double bNew = c1.getImaginary() - c2.getImaginary();
return new ComplexNumber(aNew,bNew);
}

/**
* A "toString" method,
* Returns the ComplexNumber in string form
* @return string, the string form of the ComplexNumber
*/
public String toString(){
String sign1,sign2,a,b;

if(this.a == 0 && this.b ==0)
{
  sign1 = "0";
  return sign1;
}
if (this.b < 0)
{
sign2 = "-";
}
else{
sign2 = "+";
}
if(this.a < 0)
{
  sign1 = "-";
}
else{
  sign1 = "";
}
if(Math.abs(this.a) == 0)
{
  a = "";
  sign1 = "";
}
else {
  a = ("" + Math.abs(this.a));
}
if(Math.abs(this.b) == 0)
{
  b = "";
  sign2 = "";
}
else if (Math.abs(this.b) == 1) {
  b = "i";
}
else {
  b = ("" + Math.abs(this.b) + "i");
}
sign1 = sign1 + a + sign2 + b;
return sign1;
}

/**
* A tester method
* @param args
*/
public static void main(String[] args) {


ComplexNumber firstCN = new ComplexNumber(2,3);
System.out.println(firstCN.toString());
ComplexNumber secondCN = new ComplexNumber(7, -19);
System.out.println(secondCN.toString());
ComplexNumber thirdCN = firstCN.add(secondCN);
System.out.println(thirdCN.toString());
}
}
