package com.oom;

/**
 * 把一个字符串，转为double 类型 的二维数组
 */
public class Test {

    public static void main(String[] args) {
        String str = "1,2;3,4,5;6,7";
        String[] split = str.split(";");
        double[][] d = new double[split.length][]; //创建一个二维数组
        for (int i = 0; i < split.length; i++) {
            String[] num = split[i].split(",");
            d[i] = new double[num.length]; //在数组里创建一个数据

            for (int j = 0; j < num.length; j++) {
                d[i][j] = Double.parseDouble(num[j]);
            }
        }

        //打印二维数组
        for(int x = 0; x < d.length; x++){
               for (int y = 0 ; y<d[x].length; y++){

                   System.out.print(d[x][y]+" ");
               }
            System.out.println();
        }

    }
}
