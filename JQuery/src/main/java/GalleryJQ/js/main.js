$(document).ready(function () {
    $(".small a").click(function (e) {
        if ($(".big img").attr("src") !== $(this).attr("href")) {
            $(".big img").hide().attr("src", $(this).attr("href")).fadeIn(500);
        }
        e.preventDefault()
    });

    $(".button").click(function () {
        $(".gallery").slideToggle(400)
        if ($(".button").text() === "-") {
            $(".button").text("+");
        } else {
            $(".button").text("-");
        }
    })
    $(".small a img").click(function () {
        $(".small a img").fadeTo(10, 1).css({
            "border": "none"
        })
        $(this).fadeTo(500, 0.6).css({
            "border": "1px dotted red"
        })
    })
});