package ru.olofmart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        final String PATH = "/Users/olmart/Desktop/ProjectsJava/Netology/Games/";
        final String CREATE_DIR = "Создана директория: ";
        final String CREATE_FILE = "Создан файл: ";
        StringBuilder stringBuilder = new StringBuilder();
        File dir1 = new File(PATH + "src");
        File dir2 = new File(PATH + "res");
        File dir3 = new File(PATH + "savegames");
        File dir4 = new File(PATH + "temp");

        if (dir1.mkdir()) { stringBuilder.append(CREATE_DIR + "src\n"); }
        if (dir2.mkdir()) { stringBuilder.append(CREATE_DIR + "res\n"); }
        if (dir3.mkdir()) { stringBuilder.append(CREATE_DIR + "savegames\n"); }
        if (dir4.mkdir()) { stringBuilder.append(CREATE_DIR + "temp\n"); }

        File dir5 = new File(PATH + "src/main");
        File dir6 = new File(PATH + "src/test");
        File dir7 = new File(PATH + "res/drawables");
        File dir8 = new File(PATH + "res/vectors");
        File dir9 = new File(PATH + "res/icons");

        if (dir5.mkdir()) { stringBuilder.append(CREATE_DIR + "src/main\n"); }
        if (dir6.mkdir()) { stringBuilder.append(CREATE_DIR + "src/test\n"); }
        if (dir7.mkdir()) { stringBuilder.append(CREATE_DIR + "res/drawables\n"); }
        if (dir8.mkdir()) { stringBuilder.append(CREATE_DIR + "res/vectors\n"); }
        if (dir9.mkdir()) { stringBuilder.append(CREATE_DIR + "res/icons\n"); }

        File file1 = new File(PATH + "src/main/Main.java");
        File file2 = new File(PATH + "src/main/Utils.java");
        File file3 = new File(PATH + "temp/temp.txt");

        try{
            if (file1.createNewFile()) { stringBuilder.append(CREATE_FILE + "src/main/Main.java\n"); }
            if (file2.createNewFile()) { stringBuilder.append(CREATE_FILE + "src/main/Utils.java\n"); }
            if (file3.createNewFile()) { stringBuilder.append(CREATE_FILE + "temp/temp.txt\n"); }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e);
        }

        String log = stringBuilder.toString();

        try (FileWriter writer = new FileWriter(PATH + "temp/temp.txt", false)) {
            writer.write(log);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
