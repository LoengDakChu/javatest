package day05.homework;

public class MyDate {
    private int year;
    private int months;
    private int day;

    public MyDate(int year, int months, int day) {
        this.year = year;
        this.months = months;
        this.day = day;
    }

    public void showDate() {
        System.out.println("日期：" + year + "年" + months + "月" + day + "日");
    }

    public void isBi() {
        if ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)){
            System.out.println(year+"年是润年");
        }else {
            System.out.println(year+"年不是润年");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
