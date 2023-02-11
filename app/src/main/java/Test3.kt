import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

//2c

fun main() {

    weekendEr("25/4/2023")
    dateCompare("2023-11-7")

}

/*
2c.  Задайте через перечисление праздничные дни в году. Напишите функцию с использованием when
для проверки по введенной дате (день, месяц, год) - будний или праздничный день. Предусмотрите
вариант, когда пользователь передал null строку или формат не соответствует.
*/


@SuppressLint("SimpleDateFormat")
fun dateCompare(date:String) {

    val date1 = LocalDate.of(2023, 1, 1) //создавать объекты LocalDate
    val date2 = LocalDate.of(2023, 1, 2) //...как оказалось, не лучшая идея
    val date3 = LocalDate.of(2023, 1, 7) //стоило это делать в String
    val date4 = LocalDate.of(2023, 3, 8)
    val date5 = LocalDate.of(2023, 4, 25)
    val date6 = LocalDate.of(2023, 5, 1)
    val date7 = LocalDate.of(2023, 1, 9)
    val date8 = LocalDate.of(2023, 7, 3)
    val date9 = LocalDate.of(2023, 11, 7)
    val date10 = LocalDate.of(2023, 12, 25)
    //все праздничные дни собираем в список:
    val list: List<LocalDate> = listOf(date1, date2, date3, date4, date5, date6, date7, date8, date9, date10)
    //введенную строку с датой парсим в объект SimpleDateFormat
    val formatter = SimpleDateFormat("yyyy-mm-dd")
    val userDate = formatter.parse(date)

    for (d in list) {
        val temp = formatter.parse(d.toString())
        if (temp.compareTo(userDate)==0)
            println("It's weekend!")
    }
}
fun weekendEr(date: String) {
    val date1 = "1/1/2023"
    val date2 = "2/1/2023"
    val date3 = "7/1/2023"
    val date4 = "8/3/2023"
    val date5 = "25/4/2023"
    val date6 = "1/5/2023"
    val date7 = "9/5/2023"
    val date8 = "3/7/2023"
    val date9 = "7/11/2023"
    val date10 = "25/12/2023"

    val dateList = listOf<String>(date1,date2,date3,date4,date5,date6,date7,date8,date9,date10)
    val formatter = SimpleDateFormat("DD/mm/yyyy")

    val firstDate: Date = formatter.parse(date)
    for (d in dateList) {
        val compare = formatter.parse(d).compareTo(firstDate)
        when {
            compare == 0 -> {
                System.out.println("It's Weekend dude!))")
            }
            compare < 0 && compare > 0 -> {
                System.out.println("You should work hard!")
            }
        }
    }
}
