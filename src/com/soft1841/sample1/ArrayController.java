package com.soft1841.sample1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import java.util.Random;

public class ArrayController {
    @FXML
    private ListView arrayList;
    @FXML
    private Label maxLabel;

    int[] numbers = new int[20];

    public void listALL() {
        Random random = new Random();
        for (int i = 0;i < numbers.length; i++) {
            //随机产生100以内随机数
            numbers[i] = random.nextInt(100);
            //将整型数转换为字符串，加入ListView中
            arrayList.getItems().add(String.valueOf(numbers[i]));
        }
    }
    public void getMax() {
        //设数组第一个数为最大值
        int max = numbers[0];
        //从第二个开始找最大值
        for (int i = 1; i < numbers.length; i++) {
            //有更大的就跟新max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        maxLabel.setText("最大值是：" + String.valueOf(max));
    }
}
