package com.yaojiaxu.utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Utils {
    /*
       函数功能:将选项字符串按照ABCD拆分成数组
       例:splitOptions("A.虚拟网状创业团队B.星状创业团队C.网状创业团队D.虚拟星状创业团队")
          =["A.虚拟网状创业团队","B.星状创业团队","C.网状创业团队","D.虚拟星状创业团队"]
     */
    public static LinkedList splitOptions(String options) {
        LinkedList<String> ResultOptionList = new LinkedList<>();
        ArrayList<Character> choices = new ArrayList<>();
        Collections.addAll(choices, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I');
        int cur = 0, pre = 0;
        boolean flag = false;
        while (cur < options.length()) {
            if (choices.contains(options.charAt(cur))) {
                if (cur + 2 < options.length()) {
                    if (options.charAt(cur + 1) == '.' || options.charAt(cur + 2) == '.'
                    ||options.charAt(cur + 1) == '．' || options.charAt(cur + 2) == '．'
                    ) {
                        flag = true;
                        ResultOptionList.add(options.substring(pre, cur));
                        pre = cur;
                    }
                }
            }
            cur++;
        }
        if (flag) {
            ResultOptionList.add(options.substring(pre, cur));
            ResultOptionList.removeFirst();
        } else {
            ResultOptionList.add(options);
        }
        return ResultOptionList;
    }
    public static String filterWords(String replacement){
        return replacement
                .replace("×", "错误")
                .replace("√", "正确")
                .replace("正确答案：", "")
                .replace("参考答案:", "")
                .replace("答案：", "")
                .replace("[\"","")
                .replace("\"]","")
                .replace("&#8194","")
                .replace("\"","")
                .replace("(.*?分)","")
                .replace("\\r\\n","")
                .replace("&nbsp;"," ")
                .replaceAll("</?span[^>]*>","")
                .replaceAll("</?p[^>]*>","")
                .replaceAll("</?br[^>]*>","")
                .replaceAll("</?answer[^>]*>","")
//        return replacement
//                .replace("×", "错误")
//                .replace("√", "正确")
//                .replace("&nbsp;", " ")
//                .replaceAll("正确答案：" +
//                        "|参考答案:" +
//                        "|答案：" +
//                        "|[\"" +
//                        "|\"]" +
//                        "|&#8194" +
//                        "|\"" +
//                        "|(.*?分)" +
//                        "|\\r\\n" +
//                        "|</?span[^>]*>" +
//                        "|</?p[^>]*>"+
//                        "|</?span[^>]*>"+
//                        "|</?br[^>]*>"+
//                        "|</?answer[^>]*>","")
    ;}
}
