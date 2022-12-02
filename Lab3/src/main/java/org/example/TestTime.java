package org.example;
import java.util.*;

public class TestTime {
    private static final Object ITEM = new Object();
    public static final int COUNT = 3000;

    /** Добавление в конец
     *
     * @param list
     * @return Время выполнения программы
     */
    public static long testAddEnd(List<Object> list) {
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            list.add(ITEM);
        }
        return (System.nanoTime()- start)/ 100000;
    }

    /** Добавление в начало
     *
     * @param list
     * @return Время выполнения программы
     */
    public static long testAddBegin(List<Object> list) {
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            list.add(0, ITEM);
        }
        return (System.nanoTime()- start)/ 100000;
    }

    /** Получение элемента
     *
     * @param list
     * @return Время выполнения программы
     */
    public static long testGet(List<Object> list) {
        testAddBegin(list);
        Random random = new Random(4);
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            int index = random.nextInt(list.size());
            list.get(index);
        }
        long finish = System.nanoTime();
        return (System.nanoTime()- start)/ 100000;
    }

    /** Удаление с начала
     *
     * @param list
     * @return Время выполнения программы
     */
    public static long testRemoveBeg(List<Object> list) {
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            list.remove(0);
        }
        long finish = System.nanoTime();
        return (System.nanoTime()- start)/ 100000;
    }

    /** Удаление с конца
     *
     * @param list
     * @return Время выполнения программы
     */
    public static long testRemoveEnd(List<Object> list) {
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            list.remove(list.size()-1);
        }
        long finish = System.nanoTime();
        return (System.nanoTime()- start)/ 100000;
    }


    /** Удаление по индексу
     *
     * @param list
     * @return Время выполнения программы
     */
    public static long testRemoveIndex(List<Object> list) {
        testAddBegin(list);
        Random random = new Random(4);
        long start = System.nanoTime();
        for (int i = 0; i < COUNT; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        return (System.nanoTime()- start)/ 100000;
    }
}