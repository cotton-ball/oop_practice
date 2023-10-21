package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String password = passwordGenerator.generatePassword();
        //8자 이상, 12자 이하가 아니면 초기화 X

        if(password.length()>=8 && password.length()<=12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
