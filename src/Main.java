public class Main {
    public static void main(String[] args) {
        int ticketPrice = 14580;
        int rublesPerMile = 20;

        int miles = (ticketPrice / rublesPerMile);
        System.out.println("Количество начисленных миль: " + miles);
    }
}