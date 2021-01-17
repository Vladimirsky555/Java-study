javac -d classes com/user/hello/Main.java - распределяет по классам


1) С помощью командной строки заходим в папку проекта
2) Помещаем наши файлы в папки, в соответствии с пакетами
 * Main.java в com/user/hello/
 * Print.java в com/user/prnt
3) Помещаем нашу папку com в папку src
3) Компилируем командой
javac -d classes -cp src src/com/user/hello/Main.java
В результате появляется папка classes с байткодом наших классов, по папкам
4) После компиляции, запускаем проект командой
java -cp classes com/user/hello/Main
