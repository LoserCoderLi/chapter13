package com.ljh.homework;

/**
 * @author 李家豪
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {

        SignIn huhu = new SignIn("huhu", "123456", "2629827042@qq.com");
        System.out.println(huhu);


    }
}

class SignIn {
    private String name;
    private String passWord;
    private String emile;

    public SignIn(String name, String passWord, String emile) {
        this.setName(name);
        this.setPassWord(passWord);
        this.setEmile(emile);
    }

    @Override
    public String toString() {
        return "SignIn{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", emile='" + emile + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmile() {
        return emile;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            throw new RuntimeException("用户名的长度应在[2, 4]之间");
        }
    }

    public void setPassWord(String passWord) {
        char[] chars = passWord.toCharArray();
        boolean isDigit_ = true;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                isDigit_ = false;
            }

        }
        if (passWord.length() == 6 && isDigit_) {
            this.passWord = passWord;
        } else {
            throw new RuntimeException("密码要求是:长度为6,全是数字");
        }
    }

    public void setEmile(String emile) {
        if (emile.contains(".") && emile.contains("@") && emile.lastIndexOf('@') < emile.lastIndexOf('.')) {
            this.emile = emile;
        } else {
            throw new RuntimeException("邮箱要求包含@和. 且@在.前面面");
        }
    }
}
