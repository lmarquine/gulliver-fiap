var $ = jQuery.noConflict();

$(document).ready(function(){
    $('.home-slider').slick({
        arrows: true,
        infinite: true,
        lazyLoad: 'ondemand',
        prevArrow: '<button class="slide-arrow prev-arrow"></button>',
        nextArrow: '<button class="slide-arrow next-arrow"></button>'
    });
});