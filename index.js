import express from "express";

const app = express();

const holidays = [
  { date: "1/1/2022", name: "Confraternização mundial" },
  { date: "3/1/2022", name: "Carnaval" },
  { date: "4/17/2022", name: "Páscoa" },
  { date: "4/21/2022", name: "Tiradentes" },
  { date: "5/1/2022", name: "Dia do trabalho" },
  { date: "6/16/2022", name: "Corpus Christi" },
  { date: "9/7/2022", name: "Independência do Brasil" },
  { date: "10/12/2022", name: "Nossa Senhora Aparecida" },
  { date: "11/2/2022", name: "Finados" },
  { date: "11/15/2022", name: "Proclamação da República" },
  { date: "12/25/2022", name: "Natal" },
];

const today = new Date().toLocaleDateString("en-US");

const checkHoliday = () => {
  const todayHoliday = holidays.filter((holiday) => holiday.date === today);
  if (todayHoliday.length !== 0) {
    return `Sim, hoje é ${todayHoliday.name}`;
  } else {
    return "Não, hoje não é feriado";
  }
};

const holidayMonth = (date) => {
  const indexBar = date.indexOf("/", 0);
  const month = date.slice(0, indexBar);
  return month;
};

const monthHolidays = (month) => holidays.filter((holiday) => month === holidayMonth(holiday.date));

app.get("/holidays", (req, res) => {
  res.send(holidays);
});

app.get("/is-today-holiday", (req, res) => {
  res.send(checkHoliday());
});

app.get("/holidays/:month", (req, res) => {
  const month = req.params.month;

  res.send(monthHolidays(month));
});

app.listen(5000);
