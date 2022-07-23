import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test  // проверяемя что фильмы записались и выводятся
    public void findAllAndNewFilmsTest() {
        FilmManager manager = new FilmManager();

        manager.newFilms("films1");  // создаем фильмы
        manager.newFilms("films2");
        manager.newFilms("films3");

        String[] expected = {"films1", "films2", "films3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);  // сравниваем значения массивов
    }

    @Test  // проверяем на вывод фильмов из числа по умолчанию
    public void findLastTest() {
        FilmManager manager = new FilmManager();

        manager.newFilms("films1");  // создаем фильмы
        manager.newFilms("films2");
        manager.newFilms("films3");
        manager.newFilms("films4");
        manager.newFilms("films5");
        manager.newFilms("films6");
        manager.newFilms("films7");
        manager.newFilms("films8");
        manager.newFilms("films9");
        manager.newFilms("films10");
        manager.newFilms("films11");
        manager.newFilms("films12");
        manager.newFilms("films13");
        manager.newFilms("films14");
        manager.newFilms("films15");

        String[] expected = {"films15", "films14", "films13", "films12", "films11", "films10", "films9", "films8", "films7", "films6"};
        String[] actual = manager.findLast();

    }

    @Test  // ограничеваем вывод 9 фильмами
    public void findLastTest9() {
        FilmManager manager = new FilmManager(9);

        manager.newFilms("films1");  // создаем фильмы
        manager.newFilms("films2");
        manager.newFilms("films3");
        manager.newFilms("films4");
        manager.newFilms("films5");
        manager.newFilms("films6");
        manager.newFilms("films7");
        manager.newFilms("films8");
        manager.newFilms("films9");
        manager.newFilms("films10");
        manager.newFilms("films11");
        manager.newFilms("films12");
        manager.newFilms("films13");
        manager.newFilms("films14");
        manager.newFilms("films15");

        String[] expected = {"films15", "films14", "films13", "films12", "films11", "films10", "films9", "films8", "films7"};
        String[] actual = manager.findLast();

    }

    @Test // ограничеваем вывод 11 фильмами
    public void findLastTest11() {
        FilmManager manager = new FilmManager(11);

        manager.newFilms("films1");  // создаем фильмы
        manager.newFilms("films2");
        manager.newFilms("films3");
        manager.newFilms("films4");
        manager.newFilms("films5");
        manager.newFilms("films6");
        manager.newFilms("films7");
        manager.newFilms("films8");
        manager.newFilms("films9");
        manager.newFilms("films10");
        manager.newFilms("films11");
        manager.newFilms("films12");
        manager.newFilms("films13");
        manager.newFilms("films14");
        manager.newFilms("films15");

        String[] expected = {"films15", "films14", "films13", "films12", "films11", "films10", "films9", "films8", "films7", "films6", "films5"};
        String[] actual = manager.findLast();

    }

    @Test  // ограничеваем вывод 1-м фильмом
    public void findLastTest1() {
        FilmManager manager = new FilmManager(1);

        manager.newFilms("films1");  // создаем фильмы
        manager.newFilms("films2");
        manager.newFilms("films3");
        manager.newFilms("films4");
        manager.newFilms("films5");
        manager.newFilms("films6");
        manager.newFilms("films7");
        manager.newFilms("films8");
        manager.newFilms("films9");
        manager.newFilms("films10");
        manager.newFilms("films11");
        manager.newFilms("films12");
        manager.newFilms("films13");
        manager.newFilms("films14");
        manager.newFilms("films15");

        String[] expected = {"films15"};
        String[] actual = manager.findLast();
    }

    @Test  // если фильмов меньше 10
    public void findLastTestEquals() {
        FilmManager manager = new FilmManager();

        manager.newFilms("films1");  // создаем фильмы
        manager.newFilms("films2");
        manager.newFilms("films3");


        String[] expected = {"films3", "films2", "films1"};
        String[] actual = manager.findLast();
    }

}
