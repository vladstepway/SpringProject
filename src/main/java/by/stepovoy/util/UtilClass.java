package by.stepovoy.util;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class UtilClass {

    private static final String RIGHT_DATE_REG_EXP = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|" +
            "(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|" +
            "(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
            "^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
            "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|" +
            "(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|" +
            "(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    private static final int NUMBER_OF_DIGITS_IN_YEAR = 4;
    private static final int FIRST_YEAR_OF_21_CENTURY = 2000;
    private static final int FIRST_YEAR_OF_20_CENTURY = 1900;
    private static final int NULL_YEARS = 0;
    private static final int LAST_YEAR_OF_20_CENTURY = 99;



    public static boolean checkDate(String dateFormat) {
        return dateFormat.matches(RIGHT_DATE_REG_EXP);
    }

    /**
     * @param listWithDate splitted date to 3 components : year,month,day
     * @return age of user
     */
    public static int calculateAge(ArrayList<Integer> listWithDate) {

        LocalDate birthDate = LocalDate.of(listWithDate.get(0),
                listWithDate.get(1), listWithDate.get(2));
        String current = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String[] arr = current.split("-");
        LocalDate currentDate = LocalDate.of(Integer.parseInt(arr[0]),
                Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
        return Period.between(birthDate, currentDate).getYears();
    }

    /**
     * @param year to convert in digit
     * @return converted year to int with 2 digits
     */
    private static int turnToYear(String year) {
        if (year.length() == NUMBER_OF_DIGITS_IN_YEAR)
            return Integer.parseInt(year);
        else {
            int additionalPartOfYear = Integer.parseInt(year);
            int border = Integer.parseInt(new SimpleDateFormat("yy").format(new Date()));
            if (additionalPartOfYear >= NULL_YEARS &&
                    additionalPartOfYear <= border)
                return FIRST_YEAR_OF_21_CENTURY + additionalPartOfYear;
            else if (additionalPartOfYear >= border &&
                    additionalPartOfYear <= LAST_YEAR_OF_20_CENTURY)
                return FIRST_YEAR_OF_20_CENTURY + additionalPartOfYear;
        }
        return NULL_YEARS;
    }

    /**
     * method splits date to 3 components : year,month,day
     *
     * @param date date of birthday
     * @return arrayList with year,month,day
     */
    public static ArrayList<Integer> splittingDate(String date) {
        ArrayList<Integer> resultDate = new ArrayList<>();
        String[] slash = date.split("/");
        String[] hyphen = date.split("-");
        if (hyphen.length != 0 && slash.length == 1) {
            resultDate.add(turnToYear(hyphen[2]));
            resultDate.add(Integer.parseInt(hyphen[1]));
            resultDate.add(Integer.parseInt(hyphen[0]));
        } else if (slash.length != 0 && hyphen.length == 1) {
            resultDate.add(turnToYear(slash[2]));
            resultDate.add(Integer.parseInt(slash[1]));
            resultDate.add(Integer.parseInt(slash[0]));
        }
        // без ограничений наш формат будет ГОД-МЕСЯЦ-ДЕНЬ
        return resultDate;
    }

    private static boolean isLeap(int year) {
        if (year < 0 || year == 0)
            return false;
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            return true;
        else if (year % 4 == 0 && year % 100 == 0) {
            return false;
        } else
            return year % 4 == 0;
    }

    public static long calcDaysToNextBirthday(ArrayList<Integer> birth) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(birth.get(0), birth.get(1), birth.get(2));
        LocalDate nextBDay = birthday.withYear(today.getYear());
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }
        return ChronoUnit.DAYS.between(today, nextBDay);
    }

}