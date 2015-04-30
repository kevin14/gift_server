require(['jquery', 'common'], function($) {

	$(document).ready(function(){
		$('.pop-bg').animate({'top':'20px'},800);
		$('.pay-notice').animate({'margin-top':'40px'},500);
		setTimeout(function(){
			$('.cart').animate({'top':'280px'},500);
		},200);

		$('.pay').on('click',function(){
			$('.payment').addClass('show');
		})
		$('.payment-selector').on('click','.payment-type',function(){
			$('.payment-type').removeClass('on');
			$(this).addClass('on');
		})

	})

})
