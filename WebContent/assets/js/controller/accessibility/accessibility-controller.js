class Accessibility {

    constructor() {
        this._normalFontSize = '1rem';
    }

    fontSize(operator) {
        let measure = 'rem';
        let newFontSize;
        let currentFontSize;
        let initialFontSize = [];
        let diffSize = parseFloat('0.1');
        let fontSizeBase = $('body').css('font-size').replace(/\D/g, '');
        let elements = ['h1', 'label', 'a', 'p', 'h3', 'input', 'textarea', '.btn', '.error-message'];

        $(elements).each(function(index, element) {
            if ($(this).length !== 0) {
                currentFontSize = parseFloat($(this).css('font-size'));
                currentFontSize = currentFontSize.toFixed(2);
            }
            let currentFontSizeRem = (currentFontSize / fontSizeBase);
            if (operator == 'minus') {
                newFontSize = currentFontSizeRem - diffSize;
            }
            if (operator == 'plus') {
                newFontSize = currentFontSizeRem + diffSize;
            }

            if (newFontSize >= 1.5) {
                newFontSize += measure;
                $(this).css('font-size', newFontSize);
            }
        });
    }

    resetFontSize() {
        let elements = ['h1', 'label', 'a', 'h3', 'input', 'textarea', '.btn'];

        $(elements).each(function(index, element) {
            $(this).css('font-size', '');
        });
    }

    applyContrast() {
        $('body').toggleClass('contrast');
    }

}