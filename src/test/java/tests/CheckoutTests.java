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
import static com.codeborne.selenide.Selenide.fail;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Layer("e2e")
@Epic("Одностраничная форма")
@Feature("Оформление заказа")
@DisplayName("Оформление заказа")
public class CheckoutTests extends TestBase {

    private static final String CHECKOUT_PAGE = "login.html?ru";

    @Test
    @AllureId("47317")
    @Tag("positive")
    @DisplayName("Добавление товара в корзину с карточки")
    void dobavlenieTovaraKorzinuKartochkiTest() {
        step("Открыть главную страницу интернет-магазина", () ->
                open("login.html?ru"));

        step("Открыть карточку любого доступного товара", () ->
                fail("Шаг не распознан генератором — добавьте правило в gen-python-policy.json или реализуйте вручную"));

        step("Нажать кнопку «В корзину»", () ->
                fail("Шаг не распознан генератором — добавьте правило в gen-python-policy.json или реализуйте вручную"));

        step("Открыть корзину", () ->
                fail("Шаг не распознан генератором — добавьте правило в gen-python-policy.json или реализуйте вручную"));
    }
}
