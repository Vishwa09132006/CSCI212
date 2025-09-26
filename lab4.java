public class lab4 {
public static void main(String[] args) {

float fahrenheit;
float centigrade;

fahrenheit = 98.6f;

centigrade = (5f/9f)*(fahrenheit - 32);

System.out.println("The Farhenheit Value is: " + fahrenheit);
System.out.println("The Centigrade Value is: " + centigrade);

//For Loop version 
 System.out.println(" Centigrade values of 0.0 - 40.0 in multiples of 5 using For Loop ");
for (int i = 0; i <= 40; i+= 5) {

    float newCentigrade = (5f/9f)*(i - 32);
    
    System.out.println(newCentigrade);
    
    
}
//While Loop version
System.out.println(" Centigrade values of 0.0 - 40.0 in multiples of 5 using While Loop ");
int i = 0;
while(i <= 40) {
    float newCentigrade = (5f/9f)*(i - 32);
    i+=5;

    System.out.println(newCentigrade);


}



} 
}