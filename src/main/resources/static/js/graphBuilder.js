$(document).ready(function () {
    const graphData = [[${graph}]];
    const graphCanvas = document.getElementById('graphCanvas').getContext('2d');

    new Chart(graphCanvas, {
        type: 'bar', // тип графика
        data: {
            labels: Array.from({length: graphData.length}, (_, i) => i + 1), // метки по оси X
            datasets: [{
                label: 'Graph Data',
                data: graphData, // данные графа
                backgroundColor: 'rgba(75, 192, 192, 0.2)', // цвет плашек графа
                borderColor: 'rgba(75, 192, 192, 1)', // цвет границы плашек графа
                borderWidth: 1 // ширина границы плашек графа
            }]
        }
    });
});