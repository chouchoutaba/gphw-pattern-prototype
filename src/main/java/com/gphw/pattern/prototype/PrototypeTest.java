package com.gphw.pattern.prototype;

/**
 * @Author: Jiang
 * @Date: 2019/7/21 16:15
 */
public class PrototypeTest {
    public static void main(String[] args) {
        QuestionBank questionBank = new QuestionBank();
        questionBank.setContent("小学三年级数学题");
        questionBank.setAnswer("16");
        questionBank.setGrade("3");

        QuestionBank questionBankClone = (QuestionBank)questionBank.clone();
        System.out.println(questionBank.getContent()==questionBankClone.getContent());
    }
}
