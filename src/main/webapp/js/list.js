require(['jquery', 'common'], function($) {

    function initSelector() {
        //价格选择
        $('.selector-nav').on('click', '.price ', function(e) {
            $(this).addClass('on');
        })

        $('.selector-nav').on('mouseleave', '.price ', function(e) {
            $(this).removeClass('on');
        })

        //类别选择
        $('.selector-nav').on('click', '.type', function(e) {
            $('.type-box').addClass('on');
        })

        $('.selector-nav').on('mouseleave', '.type', function(e) {
            $('.type-box').removeClass('on');
        })

        //星级选择
        $('.selector-nav').on('click', '.score', function(e) {
            $('.score-box').addClass('on');
        })

        $('.selector-nav').on('mouseleave', '.score', function(e) {
            $('.score-box').removeClass('on');
        })

        //tag选择
        $('.selector-nav').on('click', '.tags', function(e) {
            $('.tags-box').addClass('on');
        })

        $('.selector-nav').on('mouseleave', '.tags', function(e) {
            $('.tags-box').removeClass('on');
        })
    }

    function initSlideController() {
        //购物车模块
        var $slideController = $('.slide-controller');
        var $slideCart = $('.slide-cart');
        var $slideCollect = $('.slide-collect');
        var $slideHistroy = $('.slide-histroy');
        var $slideContents = $('.slide-content');
        var $slideBtns = $('.module-btn');
        $slideController.on('click', '.my-cart', function() {
            if (!$slideController.hasClass('open')) {
                $slideBtns.removeClass('on');
                $(this).addClass('on');
                $slideContents.removeClass('show');
                $slideController.animate({
                    'right': '0'
                }, 300).addClass('open');
                $slideCart.addClass('show');
            } else {
                if ($(this).hasClass('on')) {
                    $slideBtns.removeClass('on');
                    $(this).removeClass('on');
                    $slideController.animate({
                        'right': '-190px'
                    }, 300).removeClass('open');
                } else {
                    $slideBtns.removeClass('on');
                    $(this).addClass('on');
                    $slideContents.removeClass('show');
                    $slideCart.addClass('show');
                }
            }
        })
        $slideController.on('click', '.collect', function() {
            if (!$slideController.hasClass('open')) {
                $slideBtns.removeClass('on');
                $(this).addClass('on');
                $slideContents.removeClass('show');
                $slideController.animate({
                    'right': '0'
                }, 300).addClass('open');
                $slideCollect.addClass('show');
            } else {
                if ($(this).hasClass('on')) {
                    $slideBtns.removeClass('on');
                    $(this).removeClass('on');
                    $slideController.animate({
                        'right': '-190px'
                    }, 300).removeClass('open');
                } else {
                    $slideBtns.removeClass('on');
                    $(this).addClass('on');
                    $slideContents.removeClass('show');
                    $slideCollect.addClass('show');
                }
            }
        })
        $slideController.on('click', '.histroy', function() {
            if (!$slideController.hasClass('open')) {
                $slideBtns.removeClass('on');
                $(this).addClass('on');
                $slideContents.removeClass('show');
                $slideController.animate({
                    'right': '0'
                }, 300).addClass('open');
                $slideHistroy.addClass('show');
            } else {
                if ($(this).hasClass('on')) {
                    $slideBtns.removeClass('on');
                    $(this).removeClass('on');
                    $slideController.animate({
                        'right': '-190px'
                    }, 300).removeClass('open');
                } else {
                    $slideBtns.removeClass('on');
                    $(this).addClass('on');
                    $slideContents.removeClass('show');
                    $slideHistroy.addClass('show');
                }
            }
        })

        function checkCounts(){
        	
        }

    }




    initSelector();
    initSlideController();

});
