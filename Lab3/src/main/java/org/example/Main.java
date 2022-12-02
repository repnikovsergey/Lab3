package org.example;
import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    int COUNT = TestTime.COUNT;
    List<Object> listLinked=new LinkedList<>();
    List<Object> listArray = new ArrayList<>();
    String[] columnNames = {
            "Метод",
            "Количество выполнения",
            "Время выполнения",
    };

    String[][] data = {
            {"Добавление в начало LinkedList", "" + COUNT, "" + TestTime.testAddBegin(listLinked)},
            {"Добавление в начало ArrayList", "" + COUNT, "" + TestTime.testAddBegin(listArray) },

            {"Добавление в конец LinkedList", "" + COUNT, "" + TestTime.testAddEnd(listLinked) },
            {"Добавление в конец ArrayList", "" + COUNT, "" + TestTime.testAddEnd(listArray) },

            {"Получение элемента LinkedList", "" + COUNT, "" + TestTime.testGet(listLinked) },
            {"Получение элемента ArrayList", "" + COUNT, "" + TestTime.testGet(listArray) },

            {"Удаление c начала LinkedList", "" + COUNT, "" + TestTime.testRemoveBeg(listLinked) },
            {"Удаление c начала ArrayList", "" + COUNT, "" + TestTime.testRemoveBeg(listArray) },

            {"Удаление с конца LinkedList", "" + COUNT, "" + TestTime.testRemoveEnd(listLinked) },
            {"Удаление с конца ArrayList", "" + COUNT, "" + TestTime.testRemoveEnd(listArray) },

            {"Удаление по индексу LinkedList", "" + COUNT, "" + TestTime.testRemoveIndex(listLinked) },
            {"Удаление по индексу ArrayList", "" + COUNT, "" + TestTime.testRemoveIndex(listArray) },

    };
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            JFrame.setDefaultLookAndFeelDecorated(true);
            Table.createGUI(columnNames,data);
        }
    });
    }
}