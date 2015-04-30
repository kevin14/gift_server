require(['jquery','common'], function($) {

	//图片导航区域
	$('.home-img-nav .nav').on('click','.link',function(){
		var index = $(this).index();
		$('.home-img-nav .link').removeClass('on');
		$(this).addClass('on');
		$('.img-guide-box .guide').removeClass('on').eq(index).addClass('on');
	})


	//轮播
	var slider = $('.slider');
	var sliderLinks = slider.find('.img-link');
	var totolLength = sliderLinks.length;
	var counter = 0;
	var timer = setInterval(function(){
		counter++;
		if (counter == totolLength) {
			counter = 0;
		};
		sliderLinks.fadeOut(500).eq(counter).fadeIn(500);
	},5000);
	slider.find('.next').on('click',function(){
		clearTimeout(timer);
		counter++;
		if (counter == totolLength) {
			counter = 0;
		};
		sliderLinks.fadeOut(500).eq(counter).fadeIn(500);
		timer = setInterval(function(){
			counter++;
			if (counter == totolLength) {
				counter = 0;
			};
			sliderLinks.fadeOut(500).eq(counter).fadeIn(500);
		},5000);
	})
	slider.find('.prev').on('click',function(){
		clearTimeout(timer);
		counter--;
		if (counter < 0) {
			counter = totolLength - 1;
		};
		sliderLinks.fadeOut(500).eq(counter).fadeIn(500);
		timer = setInterval(function(){
			counter++;
			if (counter == totolLength) {
				counter = 0;
			};
			sliderLinks.fadeOut(500).eq(counter).fadeIn(500);
		},5000);
	})

});