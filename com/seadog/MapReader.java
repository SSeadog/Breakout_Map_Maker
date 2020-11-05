package com.seadog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MapReader {
    public static void main(String[] args) {
        try {
            File file = new File("Bricks.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                // 한줄에서 x, y 추출해서 배열로 만들면 Braekout에 적용 가능할 듯
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
