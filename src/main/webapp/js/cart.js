require(['jquery', 'common'], function($) {

    var dealBox = $('.selected-notice-wrapper');
    var selectedCart = $('.selected-product-wrapper');
    var toggleSelectedCartBtn = dealBox.find('.toggle');
    var isSelectedCartFix = false;

    var w = $(window);
    var windowHeight = w.height();

    var headerHeight = 60;
    var marginHeaderHeight = 80;
    var cartHeight = $('.cart-wrapper').height() + 40;
    var selectedCartHeight = 161;
    var dealBoxHeight = 60;
    var totolHeight = headerHeight + marginHeaderHeight + cartHeight + selectedCartHeight + dealBoxHeight;


    if (windowHeight < totolHeight) {
    	dealBox.addClass('fix');
        w.on('scroll', function() {
            var scrollTop = w.scrollTop();
            if (scrollTop > totolHeight - windowHeight) {
                dealBox.removeClass('fix');
                selectedCart.removeClass('fix');
                toggleSelectedCartBtn.hide();
            }else{
            	dealBox.addClass('fix');
            	toggleSelectedCartBtn.show();
            	if (isSelectedCartFix) {
            		selectedCart.addClass('fix');
            	};
            }
        })
    }

    toggleSelectedCartBtn.on('click',function(){
    	if (selectedCart.hasClass('fix')) {
    		selectedCart.removeClass('fix');
    		isSelectedCartFix = false;
    	}else{
    		selectedCart.addClass('fix');
    		isSelectedCartFix = true;
    	}
    })


})
