$(document).ready(function () {
    // Функция для изменения цвета фона
    function changeBackgroundColor() {
        const colors = ['#ff9999', '#99ff99', '#9999ff', '#ffff99', '#ffcc99'];
        const randomColor = colors[Math.floor(Math.random() * colors.length)];
        $('body').css('background-color', randomColor);
    }

    $('#changeColorButton').click(function () {
        changeBackgroundColor();
    });
});