/**
 *
 * @author      Leonardo Marquine Pereira <lmarquine@gmail.com>
 * @copyright   2022 Leonardo (http://web2view.com.br)
 * @license     http://web2view.com.br Copyright
 * @link        http://web2view.com.br
 *
 */

document.addEventListener("DOMContentLoaded", function(e) {
    const btnMenuMobile = document.querySelector('#btn-mobile');

    function toggleMenu() {
        const navigation = document.querySelector('#nav');

        navigation.classList.toggle('active');
    }

    btnMenuMobile.addEventListener("click", toggleMenu);
});