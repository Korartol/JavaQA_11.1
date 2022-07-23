public class FilmManager {
    private String[] films = new String[0];  // объявляем пустой [0] массив фильмов
    private int lim;  // объявляем переменную лимита  (для вывода числа фильмов)
    public FilmManager() {  // создаем конструктор со значением по умолчанию  (для вывода числа фильмов)
        this.lim = 10;
    }

    public FilmManager(int lim) {  // создаем конструктор, значение которого задаются вручную (для вывода числа фильмов)
        this.lim = lim;
    }

    public void newFilms(String film) {  // метод добавления фильма в массив
        String[] tmp = new String[films.length + 1];  // объявляем временный массив на 1 больше String[]
        for (int i = 0; i < films.length; i++) {  // пока кол-во ячеек меньше длины массива String[], прибавляем ячейку
            tmp[i] = films[i];  // когда цикл закончится, в него попадут все значения массива String + 1 ячейка
        }
        tmp[tmp.length - 1] = film;  // добавляем новый фильм (film) (-1, так вычисляем номер пустой ячейки которой
                                     // присвоим значение из film
        films = tmp;  // запоминаем новый массив в поле films
    }

    public String[] findAll() {  // метод показа массива всех фильмов
        return films;  // возвращаем массив films
    }

    public String[]  findLast() {  // метод показа массива последних фильмов (размер лимит)
        int resultLength;  // создаем переменную для записи лимита
        if (lim > films.length) {  // если значение лимита больше кол-ва фильмов...
            resultLength = films.length;  //.. то вывести все фильмы которые есть
        } else {
            resultLength = lim;  // иначе ограничить вывод фильмов значением лимита
        }
        String[] tmp = new String[resultLength];  // создаем временный массив равный количеству выводимых фильмов
        for (int i = 0; i < tmp.length; i++) {  // пока количество ячеек массива меньше длины массива...
            tmp[i] = films[tmp.length - 1 - i];  //...копируем его в tmp и переворачиваем
        }
        return tmp;  // возвращаем массив tmp
    }

}
