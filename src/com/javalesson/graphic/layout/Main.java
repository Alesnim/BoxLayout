package com.javalesson.graphic.layout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Создание окна
        final JFrame frame = new JFrame("BoxLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Определение интерфейса окна
        BoxLayoutTest.createUI(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
}


class BoxLayoutTest {
    /**
     * Процедура добавления кнопки в контейнер
     *
     * @param caption   заголовок кнопки
     * @param container контейнер
     */
    private static void addButton(String caption, Container container) {
        JButton button = new JButton(caption);
        //  можем управлять выравниванием ячейки в зависимости от параметра alignment
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }

    /**
     * Процедура создания интерфейса формы
     *
     * @param container контейнер
     */
    public static void createUI(Container container) {
        // можем управлять размещением в зависимости от параметра axis
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        addButton("Хлеб", container);
        addButton("Молоко", container);
        addButton("Колбасы", container);
        addButton("Мясо и птица", container);
        addButton("Мороженные продукты", container);
    }
}