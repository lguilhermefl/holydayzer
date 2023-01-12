public class Holydays {
    private String[] holydays = {
        "01/01/2023:Confraternização mundial",
        "21/02/2023:Carnaval",
        "17/04/2023:Páscoa",
        "21/04/2023:Tiradentes",
        "01/05/2023:Dia do trabalho",
        "08/06/2023:Corpus Christi",
        "07/09/2023:Independência do Brasil",
        "12/10/2023:Nossa Senhora Aparecida",
        "02/11/2023:Finados",
        "15/11/2023:Proclamação da República",
        "25/12/2023:Natal"
    };

    public String checkDate(String date) {
        for(int i = 0; i < this.holydays.length; i++) {
            String holydayDate = this.holydays[i].split(":")[0];
            String holyday = this.holydays[i].split(":")[1];

            if(holydayDate.equals(date)) {
                return "Na data " + date + " temos o feriado " + holyday;
            }
        }
        return "Não há feriado na data " + date;
    }

    public void getHolydaysList() {
        for(int i = 0; i < this.holydays.length; i++) {
            String holydayDate = this.holydays[i].split(":")[0];
            String holyday = this.holydays[i].split(":")[1];

            System.out.println("Na data " + holydayDate + " temos o feriado " + holyday);
        }
    }
}
