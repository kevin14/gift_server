define(['jquery'], function($) {

	// 绑定头部事件与交互
	// area-box
	$('body').on('click','.picker',function(e){
		$('.area-box').addClass('on');
	})

	$('body').on('mouseleave','.picker',function(e){
		$('.area-box').removeClass('on');
	})

	$('body').on('click','.cart-box',function(e){
		$('.cart-box').addClass('on');
	})

	$('body').on('mouseleave','.cart-box',function(e){
		$('.cart-box').removeClass('on');
	})

	$('body').on('click','.user-box',function(e){
		$('.user-box').addClass('on');
	})

	$('body').on('mouseleave','.user-box',function(e){
		$('.user-box').removeClass('on');
	})

	$('.picker').on('mouseenter',function(){
		$('.area-box').addClass('showText');
	})
	$('.picker').on('mouseleave',function(){
		$('.area-box').removeClass('showText');
	})


	//商品模块
	$('.product').on('mouseenter','.title',function(){
		$(this).parents('.product').find('.img-box').addClass('hover');
	})

	$('.product').on('mouseleave','.title',function(){
		$(this).parents('.product').find('.img-box').removeClass('hover');
	})


});