/**
 *
 * @author      Leonardo Marquine Pereira <lmarquine@gmail.com>
 * @copyright   2022 Leonardo (http://web2view.com.br)
 * @license     http://web2view.com.br Copyright
 * @link        http://web2view.com.br
 *
 */

class FormController {

    constructor() {
        this._formValid = true;
    }

    formValid(currentField) {
        currentField.parent().find('.error-message').remove();
        currentField.removeClass('error');

        if (currentField.val().length < 1) {
            this._formValid = false;
            $(this).addClass('error');
            this.errorHandle(currentField);
        }
        return this._formValid;
    }

    errorHandle(currentField) {
        currentField.addClass('error');
        currentField.parent().find('.error-message').remove();
        currentField.after('<div class="error-message"><span>Campo obrigatório</span></div>');
        return;
    }

}