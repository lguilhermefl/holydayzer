public class App {
    public static void main(String[] args) throws Exception {
        Holydays holydays = new Holydays();
        String holydayDate = "07/09/2023";
        String notHolydayDate = "08/09/2023";

        String checkHolydayDate = holydays.checkDate(holydayDate);
        String checkNotHolydayDate = holydays.checkDate(notHolydayDate);

        System.out.println("\n" + checkHolydayDate);
        System.out.println("\n" + checkNotHolydayDate);

        System.out.println("\nSegue a lista de feriados no Brasil em 2023:\n");
        holydays.getHolydaysList();
    }
}
