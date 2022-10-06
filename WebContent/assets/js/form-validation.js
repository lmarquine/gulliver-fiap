$(document).ready(function() {
    var formValidation = new FormController();
    var currentForm = $('#form_register');

    currentForm.find('input.required').on('blur', function() {
        let form = formValidation.formValid($(this));
        console.log(form);
    });
});