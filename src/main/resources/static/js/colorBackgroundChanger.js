$(document).ready(function () {
    function changeBackgroundColor() {
        const colors = [
            '#ff9999', '#99ff99', '#9999ff', '#ffff99', '#ffcc99',
            '#ff6666', '#66ff66', '#6666ff', '#ffff66', '#ff9966',
            '#d07a7a', '#299b29', '#262686', '#b0b02d', '#ff6633'
        ];
        const randomColor = colors[Math.floor(Math.random() * colors.length)];
        $('body').css('background-color', randomColor);
    }

    setInterval(function () {
        changeBackgroundColor();
    }, 2000);
});
