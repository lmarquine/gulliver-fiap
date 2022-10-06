/**
 *
 * @author      Leonardo Marquine Pereira <lmarquine@gmail.com>
 * @copyright   2022 Leonardo (http://web2view.com.br)
 * @license     http://web2view.com.br Copyright
 * @link        http://web2view.com.br
 *
 */

$(document).ready(function(){
    let fields = $('.field');
    $('textarea').empty();

    fields.on('focus', function() {
        fields.removeClass('focused');
        $(this).addClass('focused');
    });
});

function fontSize(operate) {
    let fontSize = new Accessibility();

    fontSize.fontSize(operate);
}

function resetFontSize() {
    let fontReset = new Accessibility();

    fontReset.resetFontSize();
}

function contrastColors() {
    let fontContrast = new Accessibility();

    fontContrast.applyContrast();
}