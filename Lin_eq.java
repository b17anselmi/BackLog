/*Exercise 1.13, solving the linear equations below
3.4x + 50.2y = 44.5
2.1x + .55y = 5.9

Using Cramer's rule:
ax + by = e
cx + dy = f

x=(e*d-b*f)/(a*d-b*c)
y=(a*f-e*c)/(a*d-b*c)
*/
public class Lin_eq {
    public static void main(String[] args){
        double x = ((3.4*.55)-(50.2*5.9))/((3.4*.55)-(50.2*2.1));
        double y = ((3.4*5.9)-(44.5*2.1))/((3.4*.55)-(50.2*2.1));
        System.out.println("X = "+ x);
        System.out.println("Y= "+ y); 
    }
    
}
/* online jdk says answers are as follows
X = 2.842201834862385
Y= 0.7087397392563978

irb and solver website says correct
*/