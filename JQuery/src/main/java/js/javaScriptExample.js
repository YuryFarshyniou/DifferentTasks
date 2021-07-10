//ВЫБОРКИ
// $("a"); // Выбираем все теги a.Реализовано все на селекторах.
// $(".logo") // Класс
// $("#receive") // Id
// $("nav menu") // Вложенный селектор.
// $(".class .nav")//ложенный для классов,так же для id
// $(".icon > div") // Через пробел ко всем , через > к одному тегу внутри класса.
// $(".icons img +h4") // В классе айконс  выбирается тег img и первый тег h4 ,котроый за ним следует.
// $("img[height=150]")  // Селекторы по аттрибуту.
// $("img[src^='img/']") // Все src аттрибуты,которые начинаются с img/
// $("img[src$='.png']") // Все src аттрибуты,которые заканчиваются на png/
// $("a[href*=#]") // Все href,содержашие #
// $("menu li:even") // Все четные тэги li
// $("menu li:odd") // Все нечетные теги li
// $("img:not(.logo img)") // Исключаем из нашей выборки .logo
// $("li:has(a)") // Все теги li,внутри которых есть тег а.
// $("p:contains(client)") //Все теги p,внутри которого есть слово client.
// $("li:first") // Первый тег li,или последний.Такж е это относится и к классам,id,вложенным и так далее
// $("div:hidden") // Скрытые блоки.

$(document).ready(function () { //Используется для того,что бы скрипты можно было подключить  в head.Весь код пишется в этом методе.

    // const tagP = $(".mainText p").text("New text for tag p") // Заменяет текст в тэге р.
    // const tagP = $(".mainText p").hide(3000) // Скрывает конкретный тэг
    // $(".mainText p").show(3000) // Показывает элементы
    // const tagP = $(".mainText p").hide(3000).show(3000) //Так как каждый раз jquery заного ищет этот элемент в html,пистаь сразу вместе 2 метода позволяет ускорить этот процесс.Т.е происходить одна итерация вместо 2.Методов может быть сколько угодно
    // const tagP = $(".mainText p")
    // tagP.hide(2000).text("New text for our page").show(1000) // Динамически заменяем текст.
    // const arr = $(".icons >div") // Прячем сразу группу элементов.
    // arr.hide(3000)
    // const w = $(".mainText").width() // Меняем ширину и высоту.
    // const h = $(".mainText").height()
    // function widthAndHeight(element) {  // Функция для изменения ширины и высоты.
    //     const className = "." + element;
    //     const w = $(className).width();
    //     const h = $(className).height();
    //     $(".mainText p").text("Width: " + w + "; Height: " + h);
    // }
    // widthAndHeight("recive");
    // $(".mainText").html("<b> New Header</b>") // Позволяет заменять html код.
    // $(".mainText").fadeOut(2000).fadeIn(3000); // Скрывает и показывает элемент за определенное время.
    // function elementOut(element, time) {    // Функция для исчезновения определенного класса.
    //     if (time > 5000 || time < 1000 || isNaN(time)) {
    //         return false
    //     } else {
    //         const className = "." + element;
    //         $(className).fadeOut(time);
    //     }
    // }
    // elementOut("mainText", 2000)

    // $(".mainText").fadeTo(4000, 0.2).fadeTo(2000, 1) // Изменение прозрачности.В css это свойство opacity.

    // $(".mainText").slideUp(2000).slideDown(3000); // Сворачивание и разворачивание элемента.
    // const src = $(".logo img").attr("src","img/icon1.png") //Меняем атрибуты в тэгах.Извлечение,добавление,изменение
    //  $(".logo img").removeAttr("src") // Удаление аттрибута.
    // function changeAttr(element, newAttr, newValue) {  // Функция для изменения аттрибута.
    //     const className = "." + element
    //     $("className").attr(newAttr, newValue)
    // }
    // changeAttr("logo", "title", "Advice")

    // $("nav menu").addClass("border").removeClass("border"); // Добавление и удаление нового класса элементу menu.
    // $("nav menu li a").css("color","black") // Можно менять любые css свойства.
    // $("nav menu li a").css({  // Передаем сразу несколько свойств с помощью объекта.
    //     "color":"brown",
    //     "fontsize":"20px",
    //     "padding":"100px"
    // })
    // $("nav menu li a").animate({ // Изменения css свойств за определенное время.На строковые параметры не действует,действует только на числовые параметры.
    //     "color":"brown",
    //         "fontsize":"20px",
    //         "padding":"30px"
    // },3000)
    // $(".mainText").before("<span>New block</span>") // Вставляет новый тег перед классом
    // $(".mainText").after("<span>New block</span>")// Вставляет новый тег осле класса
    // $(".mainText").append("<span>New block</span>") // Вставляет новый тег в конце класса
    // $(".mainText").prepend("<span>New block</span>") // Вставляет новый тег в начало класса

    // $(".icons img").each(function () { // Обращаемся к каждому тэгу img в классе .icons, и выполняем действия над ними.
    //     if ($(this).attr("src") === "img/icon2.png") {
    //         $(this).fadeOut(1000);
    //     }
    // })
    // alert($("div").length) // Количество тегов на странице.
    // const mainText = $(".mainText").clone(); // Клонирование элемента.
    // $("body").append(mainText)
    // const mainText = $(".mainText").remove(); // Клонирование элемента.
    // $("body").append(mainText) // даление элемента.
    // $("img,a").css("background","yellow") // Выборка ,подразумеваюшая перечесление объектов через запятую.Всем этим элементам будет применено свойство css.
    // $("img[alt]").css("background","red") // Выборка для всех элементов,у которых есть аттрибут alt

    //СОБЫТИЯ

    // $(".logo").mouseover(function (){ // Событие во время наведения мыши
    //     alert("Mouse over")
    // })
    //  $(".logo").mouseout(function (){ // Событие после отвода мыши.
    //     alert("Mouse mouse out")
    // })
    //  $(".logo").click(function (){ // Событие при нажатии мыши.
    //     alert("Click")
    // })
    // $(".logo").mousemove(function () { // Событие при передвижении мыши в этой области.
    //     alert("Mouse move")
    // })
    // $(".logo").mouseup(function () { // Событие при нажатии мыши не срабатывает,при отпускании срабатывает.
    //     alert("Mouse up")
    // })
    // $(".arrowDown").click(function (){  // Событие при нажатие на класс .arrowDown
    //     const clone = $(this).clone()
    //     $(this).after(clone)
    // })

    // const link = $("menu li a") // Эфеект hover в css.
    // link.mouseover(function (){
    //     $(this).addClass("border")
    // })
    // link.mouseout(function (){
    //     $(this).removeClass("border")
    // })
    // link.hover(function (){   // Эфеект hover в css.
    //     $(this).addClass("border")
    // },function (){
    //     $(this).removeClass("border")
    // })
    // $(".mainText").click(function (e) {
    //     alert(e.screenX + " " + e.screenY)   // Координаты нажатия.Есть ещё pageX and pageY.
    // })
    // $(".mainText").click(function (e) {
    //     alert(e.altKey)   // Если кликнули с зажатой клавишей alt - true,иначе false.Так же есть вариант с ctrl and shift.
    // })
    // $(".mainText").click(function (e) {
    //     alert(e.target)   // При нажатии отслеживается объект.
    // })
    // $(".btn").click(function (e) {
    //     e.preventDefault()   // Отменяет стандартное поведение объекта.
    // })
    // $(".btn").click(function () {
    //    return false   // Отменяет стандартное поведение объекта.Другой способ
    // })
    // $(".btn,.arrowDown").click(function (e){ // Форма конферм,если нажали да,действие выполняется,если нет - то нет.
    //     const answer = confirm("Do you want to send the data?")
    //     if(!answer){
    //         e.preventDefault()
    //     }
    // })

    //ФИЛЬТРЫ ПО ФОРМАМ.ПОЛУЧЕНИЕ ЗНАЧЕНИЙ С ФОРМ.
    // $(":checkbox").fadeOut(1000) // Выборка по type "checkbox"
    // $(":radio").fadeOut(1000) // Выборка по type "radio"и т.д.
    // $(".form1 :checkbox:checked").fadeOut(1000) // Checkbox
    // $(".form1 :radio:checked").fadeOut(1000)
    // $(".form1 :selected").remove() // Удаляет элемент с selected.
    // $(":submit").click(function () { // Принимаем значения из form с помощью метода val().
    //     const value = $("textarea").val()
    //     const value2 = $("input.text1").val()
    //     alert(value)
    //     alert(value2)
    // })
    // $(":submit").click(function () { // Получаем значение из select.
    //     const value = $("#select1 :selected").val();
    //     alert(value)
    // })
    // $(":submit").click(function () { // Получаем значение с checkbox
    //     const value = $(":checkbox:checked").each(function () {
    //         const value = $(this).val()
    //         alert(value)
    //     })
    // })
    // $(".form1").submit(function (e) { // Простейшая валидация формы submit.
    //     if ($(".text1").val() === "") {
    //         e.preventDefault()
    //         alert("You arenot enter fields")
    //     }
    // })
    // $(".text1").focus(function () { // Действие,когда поле находится в фокусе.
    //     $(this).css({
    //         "border": "2px double red",
    //         "background": "green"
    //     })
    // })
    // $(".text1").focus(function () { // Действие,когда поле находится в фокусе.
    //     $(this).addClass("border")
    // })
    // $(".text1").blur(function () { // Действие,когда поле выходит из фокуса.
    //     $(this).removeClass("border")
    // })

    // $("#select1").change(function () {
    //     const value = $("#select1 :selected").val()
    //     if (value === "2") { // Меняем значение в другом селекторе,взависимости от значений.Можно использовать switch or if else.
    //         $("#select2").html("<option value='1'>Value of number 1</option>" +
    //             "<option value='2'>Value number 2</option>")
    //     }
    // })
    // $(":submit").click(function (e){ // Блокирует аттрибут
    //     $(".text2").attr("disabled","disabled")
    //     e.preventDefault()
    // })
    // $(":reset").click(function (e){ // Разблокируем атрибут
    //     $(".text2").removeAttr("disabled")
    //     e.preventDefault()
    // })


});