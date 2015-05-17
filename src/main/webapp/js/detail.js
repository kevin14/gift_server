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

// 添加至购物车
addToCart = function(){

	var pid = GetParameter('pid');

	alert(pid);
	$.ajax({
		url : './detail/addToCart',
		type : 'POST',
		contentType : "application/json",
		data : pid,
		error : function(data) {
		},
		success : function(data) {
			alert(data);
		}
	});
};

function GetParameter(name)
{
	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r!=null)return  unescape(r[2]); return null;
}