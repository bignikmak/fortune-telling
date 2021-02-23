function cards() {
    const ctx = document.getElementById('canvas').getContext('2d');
    let card = new Image();
    card.addEventListener('load', function (){
        for (var i = 0; i < 4; i++) {
            for (var j = 0; j < 3; j++) {
                ctx.drawImage(card, 0, 0, 250, 300)
            }
        }
    }, false);
    card.src = 'assets/images/scarabeus500.jpg';

    let card2 = new Image();
    card2.addEventListener('load', function (){
        for (var i = 0; i < 4; i++) {
            for (var j = 0; j < 3; j++) {
                ctx.drawImage(card2, 300, 0, 250, 300)
            }
        }
    }, false);
    card2.src = 'assets/images/scarabeus500.jpg';

    let card3 = new Image();
    card3.addEventListener('load', function (){
        for (var i = 0; i < 4; i++) {
            for (var j = 0; j < 3; j++) {
                ctx.drawImage(card3, 600, 0, 250, 300)
            }
        }
    }, false);
    card3.src = 'assets/images/scarabeus500.jpg';

    let card4 = new Image();
    card4.addEventListener('load', function (){
        for (var i = 0; i < 4; i++) {
            for (var j = 0; j < 3; j++) {
                ctx.drawImage(card4, 900, 0, 250, 300)
            }
        }
    }, false);
    card4.src = 'assets/images/scarabeus500.jpg';
    return card, card2, card3, card4;
}