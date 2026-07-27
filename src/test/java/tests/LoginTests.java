package tests;

import annotations.Layer;
import io.qameta.allure.AllureId;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.fail;

@Layer("e2e")
@Epic("Одностраничная форма")
@Feature("Авторизация")
@DisplayName("Авторизация")
public class LoginTests extends TestBase {

    private static final String LOGIN_PAGE = "login.html?ru";

    @Test
    @AllureId("47322")
    @Tag("smoke")
    @Tag("positive")
    @DisplayName("Успешный логин user1 (ручной триггер AI)")
    void successfulLoginTest() {
        step("Открыть login.html?ru", () ->
                open("login.html?ru"));

        step("Ввести user1 в поле логина", () ->
                $("[data-testid=login-input]").setValue("user1"));

        step("Ввести password1 в поле пароля", () ->
                $("[data-testid=password-input]").setValue("password1"));

        step("Нажать кнопку submit", () ->
                $("[data-testid=submit-button]").click());

        step("Проверить приветствие \"Добро пожаловать, user1!\"", () ->
                $("[data-testid=welcome-message]").shouldHave(text("Добро пожаловать, user1!")));
    }


    @Test
    @AllureId("47323")
    @Tag("smoke")
    @Tag("negative")
    @DisplayName("Демо: неверный пароль (ручной триггер AI)")
    void demoNevernyyParolRuchnoyTriggerTest() {
        step("Открыть login.html?ru", () ->
                open("login.html?ru"));

        step("Ввести user1 в поле логина", () ->
                $("[data-testid=login-input]").setValue("user1"));

        step("Ввести неверный пароль в поле пароля", () ->
                $("[data-testid=password-input]").setValue("wrongpassword"));

        step("Нажать кнопку submit", () ->
                $("[data-testid=submit-button]").click());

        step("Проверить текст ошибки \"Неверный логин или пароль\"", () ->
                $("[data-testid=error-message]").shouldHave(text("Неверный логин или пароль")));
    }


    @Test
    @AllureId("47324")
    @Tag("smoke")
    @Tag("negative")
    @DisplayName("Демо: неверный пароль (ручной триггер AI)")
    void demoNevernyyParolRuchnoyTriggerTest47324() {
        step("Открыть login.html?ru", () ->
                open("login.html?ru"));

        step("Ввести user1 в поле логина", () ->
                $("[data-testid=login-input]").setValue("user1"));

        step("Ввести неверный пароль в поле пароля", () ->
                $("[data-testid=password-input]").setValue("wrongpassword"));

        step("Нажать кнопку submit", () ->
                $("[data-testid=submit-button]").click());

        step("Проверить текст ошибки \"Неверный логин или пароль\"", () ->
                $("[data-testid=error-message]").shouldHave(text("Неверный логин или пароль")));
    }


    @Test
    @AllureId("47325")
    @Tag("smoke")
    @Tag("positive")
    @DisplayName("Демо: успешный логин (ручной триггер AI)")
    void successfulLoginTest47325() {
        step("Открыть login.html?ru", () ->
                open("login.html?ru"));

        step("Ввести user1 в поле логина", () ->
                $("[data-testid=login-input]").setValue("user1"));

        step("Ввести password1 в поле пароля", () ->
                $("[data-testid=password-input]").setValue("password1"));

        step("Нажать кнопку submit", () ->
                $("[data-testid=submit-button]").click());

        step("Проверить приветствие \"Добро пожаловать, user1!\"", () ->
                $("[data-testid=welcome-message]").shouldHave(text("Добро пожаловать, user1!")));
    }


    @Test
    @AllureId("47326")
    @Tag("smoke")
    @Tag("negative")
    @DisplayName("Неуспешный логин с неверным паролем")
    void wrongPasswordLoginTest() {
        step("Открыть login.html?ru", () ->
                open("login.html?ru"));

        step("Ввести user1 в поле логина", () ->
                $("[data-testid=login-input]").setValue("user1"));

        step("Ввести неверный пароль в поле пароля", () ->
                $("[data-testid=password-input]").setValue("wrongpassword"));

        step("Нажать кнопку submit", () ->
                $("[data-testid=submit-button]").click());

        step("Проверить текст ошибки \"Неверный логин или пароль\"", () ->
                $("[data-testid=error-message]").shouldHave(text("Неверный логин или пароль")));
    }
}
