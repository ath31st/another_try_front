$(document).ready(function () {
    function changeBackgroundColor() {
        const colors = [
            '#ff9999', '#99ff99', '#9999ff', '#ffff99', '#ffcc99',
            '#ff6666', '#66ff66', '#6666ff', '#ffff66', '#ff9966',
            '#ff3333', '#33ff33', '#3333ff', '#ffff33', '#ff6633'
        ];
        const randomColor = colors[Math.floor(Math.random() * colors.length)];
        $('body').css('background-color', randomColor);
    }

    setInterval(function () {
        changeBackgroundColor();
    }, 2000);
});
