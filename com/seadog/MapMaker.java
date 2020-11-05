package com.seadog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MapMaker extends JFrame {
    public MapMaker() {
        setTitle("맵 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocation(300, 300);
        setVisible(true);
        setContentPane(new MyPanel());
    }

    class MyPanel extends JPanel {
        public MyPanel() {
            setLayout(null);
            addMouseListener(new MyMouseAdapter());
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }

    public static void main(String[] args) {
        new MapMaker();
    }

    class MyMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            // 추후에 겹쳐서 만들어지는 경우를 생각해야 할듯
            int x = e.getX();
            int y = e.getY();

            add(new Brick(x, y));
            repaint();
        }
    }

    class Brick extends JLabel {
        public Brick(int x, int y) {
            setText("Brick");
            setSize(40, 10);
            setLocation(x, y);
        }
    }

}

// Breakout에서 Brick들을 생성할 때 필요한 정보는 총 브릭의 개수, 각 브릭의 위치가 있으면 될듯
// 배열을 생성해서 각 항마다 좌표를 주면 해결될 듯

// 맵 생성시에는?