/* Population projection for next 5 years

starting population = 312,032,486
birth rate per sec = 1.0/7.0
death rate per sec = 1.0/13.0
immigration per sec = 1.0/45.0

assuming 365 days in a year
seconds in a year = 31536000
*/
public class Pop_Proj{
    public static void main(String[] args){
    double b_r, d_r, i_r, years, start_pop;
    b_r= (1.0/7.0)*31536000;
    d_r =(1.0/13.0)*31536000;
    i_r = (1.0/45.0)*31536000;
    years = 5.0;
    start_pop = 312032486;
    
    // pop formula with just birth = starting population(y intercept) + bx(b=births per year)
    // possible formula = starting population + birth rate - death rate + immigration rate
        
    //double proj= start_pop + b_r*years - d_r*years + i_r*years;
    // using a for loop makes life much much easier
    for (int i = 1; i <= 5; i++) {
            start_pop += b_r + i_r - d_r;
            System.out.println("Year " + i + " = " + (int)currentPopulation);
    //System.out.println("The projected population in " + years + "years is " + proj);
        // says it should be 3.259329695164835E8
        // which should be about 32593296.9516, confirmed by below code
    }
}
}

/* online solution
import java.util.Scanner;
 
public class PopulationProjection {
 
    public static void main(String[] args) {
         
                int birth = 7;
  int death = 13;
  int immigrant = 45;
  int currentPopulation = 312032486;
  int year = 365;
  int yearlyBirths = (((60 * 60 * 24 * year) / birth));
  int yearlyDeaths = (((60 * 60 * 24 * year) / death));
  int yearlyImmigrants = (((60 * 60 * 24 * year) / immigrant));
  int yearlyPopulation = (yearlyBirths + yearlyImmigrants - yearlyDeaths);
 
  System.out.println("Current Year Population = " + currentPopulation);
  System.out.println("Next Year's Population = "
    + (currentPopulation + yearlyPopulation));
  System.out.println("Next Two Year's Population = "
    + (currentPopulation + (yearlyPopulation * 2)));
  System.out.println("Next Three Year's Population = "
    + (currentPopulation + (yearlyPopulation * 3)));
  System.out.println("Next Four Year's Population = "
    + (currentPopulation + (yearlyPopulation * 4)));
  System.out.println("Next Five Year's Population = "
    + (currentPopulation + (yearlyPopulation * 5)));
    }
}

Current Year Population = 312032486
Next Year's Population = 314812582
Next Two Year's Population = 317592678
Next Three Year's Population = 320372774
Next Four Year's Population = 323152870
Next Five Year'ss Population = 325932966

*/