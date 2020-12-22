import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        //Дата
        Date date = new Date();
        System.out.println(date);

        //Календарь
        Calendar cal = Calendar.getInstance();//приватный конструктор
        cal.setTime(date);
        cal.add(cal.WEEK_OF_MONTH, 1);
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getCalendarType());

        //Форматирование даты
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(cal.getTime()));

        //Пользовательский формат
        SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println(sf.format(cal.getTime()));

        //Обратное преобразование в дату
        SimpleDateFormat sform = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        Date newDate = sform.parse("05/12/1985 3:22");
        System.out.println(newDate);
    }
}
