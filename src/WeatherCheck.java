public class WeatherCheck {
    public static void main (String[] arg){
int Temperature = -2;
                boolean CurrentlyRaining = true;
if (Temperature > 30) {
    System.out.println("wear high spf sunscreen and breathable clothing");
}
 else if (Temperature < 10 && CurrentlyRaining == false) {
    System.out.println("Wear some warm clothes and bring your winter coat");
}
 else if (CurrentlyRaining == true){
     System.out.println("You need to bring an umbrella!");

 }

 else if ((Temperature < 0 && CurrentlyRaining) == true) {
    System.out.println("Wear your snow shoes, hat and gloves as it is snowing");
}
 else if (Temperature >30 && CurrentlyRaining == true) {
    System.out.println("Look out for a rainbow");
}

 else if (Temperature >25 || CurrentlyRaining == true) {
            System.out.println("The plants will be receiving some elements necessary for photosynthesis, either light or water");
        }
    }
}
