public class interruptor {

    public static void main (String [ ] args) {

        String estacion = "primavera"; // asignar aquí la estación correspondiente

        switch (estacion) {
            case "primavera":
                System.out.println("Primavera, el paisaje se esta poniendo verde.");
                break;
            case "verano":
                System.out.println("Verano, vamos a la pileta.");
                break;
            case "otoño":
                System.out.println("Otoño, las calles se llenaron de hojas amarillas.");
                break;
            case "invierno":
                System.out.println("Invierno, vamos a la nieve!");
                break;
            default:
                System.out.println("La variable no es ninguna de las cuatro estaciones terraqueas.");
                break;
        }
      

    } 

} 

