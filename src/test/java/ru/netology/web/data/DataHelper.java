package ru.netology.web.data;


import lombok.Value;

import java.util.Random;


public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo() {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class InfoCard {
        private String cardNumber;
        private String cardId;
    }

    public static InfoCard getFirstInfoCard() {
        return new InfoCard("5559000000000001",
                "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static InfoCard getSecondInfoCard() {
        return new InfoCard("5559000000000002",
                "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    public static VerificationCode getOtherVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("54321");
    }

    public static int generateValidAmount(int balance) {
        return new Random().nextInt(balance) + 1;
    }

    public static int generateInvalidAmount(int balance) {
        return Math.abs(balance) + new Random().nextInt(10000);
    }
}
