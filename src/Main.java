public class Main {
    public static void main(String[] args) {
        int ticketPrice = 600;    // цена билета
        int minimumMiles = 20;    // минимальная цена билета для 1 бонусной мили
        int bonusMiles;           // бонусные мили

        bonusMiles = ticketPrice / minimumMiles;

        System.out.println(bonusMiles);
    }
}