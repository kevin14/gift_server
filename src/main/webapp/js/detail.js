require(['jquery','common'], function($) {
	


	//选择按钮
	var selectBtn = $('.select-btn');
	var popLayer = $('.pop-layer');
	selectBtn.on('click',function(){
		popLayer.addClass('show');
	})
	popLayer.find('.forgive').on('click',function(){
		popLayer.removeClass('show');
	})

})