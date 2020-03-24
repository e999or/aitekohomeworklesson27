#language: ru

Функционал: Проверка работы сайта банка на :
  открытие основной страницы
  переход по вкладкам
  выбор чек-боксов
  нажать вкладку

  Сценарий:
    Дано пользователь вводит в адресную строку браузера название сайта.
    Тогда переход осуществлен, проверяем название страницы "«Сбербанк» - Частным клиентам".
    Когда  в верхней панели меню сайта нажимаем кнопку Вклады.
    Тогда переход осуществлен, название страницы "«Сбербанк» - Подбор вкладов".
    Когда нажать на вкладку "Подобрать вклад" .
    Тогда отображаются 4 чек-бокса
      | Хочу снимать   |
      | Хочу пополнять |
      | Онлайн         |
      | Я - пенсионер  |
    И Установлен чекбокс Онлайн ,отображается 3 вкладки
      | Вклад Сохраняй |
      | Вклад Пополняй |
      | Вклад Управляй |
    Когда выбрать чек-боксы Хочу снять, Хочу пополнять.
    Тогда во вкладах остались остался только
      | Вклад Управляй |
    Когда нажать на кнопку "Подробнее" вклад Управляй.
    Тогда открылось окно с названием "«Сбербанк» - Вклад Управляй".
    И странице отображается надпись "Вклад Управляй".