package com.test.text04;

public class StringBufferEx02 {
    public static void main(String[] args) {
        /*
            思路分析：
            1，定义一个Scanner对象，接受用户的输入
            2，希望使用StringBuffer的insert，需要将String转成StringBuffer
            3，然后进行字符串的处理
        */
        String price  = "6688641593.1415962";
        StringBuffer stringBuffer = new StringBuffer(price);
//         int i = stringBuffer.lastIndexOf(".");
//         stringBuffer = stringBuffer.insert(i-3,",");
        for (int i = stringBuffer.lastIndexOf(".")-3;i>0;i-=3){
            stringBuffer = stringBuffer.insert(i,",");
        }
        System.out.println(stringBuffer);


    }
}
