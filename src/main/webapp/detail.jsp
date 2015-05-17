<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>详情页</title>
    <link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/detail.css">
</head>
<body>
	<div class="header">
        <div class="content-wrapper">
            <img src="./img/logo.png" alt="" class="logo">
            <div class="area-box">
                送给
                <div class="picker">
                    上海<span class="icon-pulldown"></span>
                    <ul class="city-list">
                        <li>
                            <a href="javascript:;">北京</a>
                            <a href="javascript:;">广州</a>
                            <a href="javascript:;">重庆</a>
                        </li>
                    </ul>
                </div>
                的朋友
            </div>
            <div class="user-box">
                <!-- 登录 -->
                <img class="avatar" src="./img/avater_32.jpg"></img>
                <span class="user-count">2</span>
                <ul class="user-content">
                    <li>
                        <a class="username" href="javascript:;">DreamOver</a>
                    </li>
                    <li>
                        <a href="javascript:;">我的消息<span class="count">2</span></a>
                    </li>
                    <li>
                        <a href="javascript:;">我的订单</a>
                    </li>
                    <li>
                        <a href="javascript:;">我的收藏</a>
                    </li>
                    <li>
                        <a class="quit" href="javascript:;">退出</a>
                    </li>
                </ul>
            </div>
            <div class="cart-box">
                <span class="icon-cart"></span> 购物车
                <ul class="cart-content">
                    <li>
                        <a href="javascript:;">
                            <div class="cart-product">
                                <img src="http://img.la/80x45" alt="">
                                <span>这里是商品的名字</span>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <div class="cart-product">
                                <img src="http://img.la/80x45" alt="">
                                <span>这里是商品的名字</span>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <div class="cart-product">
                                <img src="http://img.la/80x45" alt="">
                                <span>这里是商品的名字</span>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <div class="cart-product">
                                <img src="http://img.la/80x45" alt="">
                                <span>这里是商品的名字</span>
                            </div>
                        </a>
                    </li>
                    <li class="link">
                        <div class="cart-link">
                            <span>还有<span class="num">4</span>件商品</span>
                            <a href="#" class="go-cart">查看购物车</a>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="search-box">
                <input class="search" type="text" placeholder="搜索感兴趣的礼物">
                <a href="#" class="icon-search"></a>
            </div>
            <img src="./img/slogan.png" alt="" class="label">
        </div>
    </div>

	<div class="wrapper">
		<div class="guide">
			<span class="home-icon icon-home"></span><a href="home.html" class="link">首页</a>  / <a href="list.html" class="link"> 399元礼品组合 </a>  /  ${productDetail.productName}
			<span class="current">价值 <span class="cost">399</span> 元 </span>
		</div>
		<div class="product-info">
			<div class="slider-box">
				<div class="slider">
					<img src="./i/768x432/08.jpg" alt="">
				</div>
				<div class="slide-index">
					<a class="index" href="javascript:;">
						<img src="./i/128x72/08.jpg">
					</a>
					<a class="index" href="javascript:;">
						<img src="./i/128x72/02.jpg">
					</a>
					<a class="index" href="javascript:;">
						<img src="./i/128x72/03.jpg">
					</a>
					<a class="index" href="javascript:;">
						<img src="./i/128x72/04.jpg">
					</a>
					<a class="index" href="javascript:;">
						<img src="./i/128x72/05.jpg">
					</a>
				</div>
			</div>
			<div class="info-box">
				<h3 class="title">这里是礼品的名字啊</h3>
				<p class="desc">旅游本是享受，然传统旅游的一成不变的模式，千篇一律的线路，成为游客集中抱怨的焦点，市场需要创新的、随着人们出游意识的不断成熟和旅游市场的完善，成为游客集中客集中抱怨的焦点，游客的意识将受到尊重和满足。</p>
				<div class="score-box">
					<span class="score">95%</span>
					<span class="good">用户好评</span>
					<div class="score-info">
						<div class="star-box star-five">
							<span class="star icon-comment_star star1"></span>
							<span class="star icon-comment_star star2"></span>
							<span class="star icon-comment_star star3"></span>
							<span class="star icon-comment_star star4"></span>
							<span class="star icon-comment_star star5"></span>
						</div>
						<span class="comments-info">
							<span class="count">369</span>人已评价
						</span>
					</div>
				</div>
				<div class="statistics">
					<span class="buy-count count">433</span>人已购买
					<span class="collect-count count">3666</span>人已加入收藏
				</div>
				<a href="#" class="collect-btn btn">
					<span class="icon icon-star_slim"></span>
					<span class="text">加入我的收藏</span>
				</a>
				<a href="javascript:addToCart();" class="buy-btn btn">
					<span class="icon icon-cart_slim"></span>
					<span class="text">加入购物车</span>
				</a>
			</div>

		</div>
		
		<div class="product-detail-box wrapper">
			<ul class="nav">
				<li>
					<a href="#" class="on">礼品详情</a>
				</li>
				<li>
					<a href="#">用户点评</a>
				</li>
			</ul>
			<div class="main detail-on">
				<div class="detail-on-box main-content">
					<div class="module1 module">
						<img src="/img/slide_1.jpg" alt="" class="module1-img">
						<span class="title">这里是商品的名字啊</span>
						<p class="module1-desc">
							礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。礼物是送礼者向受礼者传递信息，情感，意愿的一种载体。通常是人和人之间互相赠送的物件，其目的是为了取悦对方，或表达善意。礼物也用来庆祝节日或重要的日子，比如情人节的玫瑰或生日礼物，不可不送。礼物也可以是非物质的，中国古代有“千里送鹅毛，礼轻情义重”的说法，表示礼物的价值在于送礼者的善意和心意，而非礼物本身的价值。礼物不需要太贵，<br>只要表达了心意就可以了。<br><br>

礼物是在社会交往中，为了表达祝福和心意或以示友好，通常是人和人之间互相赠送的物件，其目的是为了取悦对方，或表达善意、敬意。礼物也用来庆祝节日或重要的日子，比如情人节的玫瑰或生日礼物，不可不送。礼物也可以是非物质的，中国古代有“千里送鹅毛，礼轻情义重”的说法，表示礼物的价值在于送礼者的善意和心意，而非礼物本身的价值。礼物不需要太贵，只要表达了心意就可以了。
						</p>
					</div>

					<div class="module2 module">
						<div class="big-image-box">
							<div class="big-wrapper on">
								<img src="./i/832x468/01.jpg" alt="" class="module2-big-image">
								<div class="desc"><span>商品图片描述</span></div>
							</div>
							<div class="big-wrapper on">
								<img src="./i/832x468/01.jpg" alt="" class="module2-big-image">
								<div class="desc"><span>商品图片描述</span></div>
							</div>
							<div class="big-wrapper on">
								<img src="./i/832x468/01.jpg" alt="" class="module2-big-image">
								<div class="desc"><span>商品图片描述</span></div>
							</div>
							<div class="big-wrapper on">
								<img src="./i/832x468/01.jpg" alt="" class="module2-big-image">
								<div class="desc"><span>商品图片描述</span></div>
							</div>
							<div class="big-wrapper on">
								<img src="./i/832x468/01.jpg" alt="" class="module2-big-image">
								<div class="desc"><span>商品图片描述</span></div>
							</div>
						</div>
						<div class="module2-slider">
							<div class="slider">
								<a href="javascript:;" class="module2-slider-picker on">
									<img src="./i/832x468/01.jpg" class="module2-small-image" alt="">
									<div class="desc"><span>商品图片描述</span></div>
								</a>
								<a href="javascript:;" class="module2-slider-picker">
									<img src="./i/832x468/02.jpg" class="module2-small-image" alt="">
									<div class="desc"><span>商品图片描述</span></div>
								</a>
								<a href="javascript:;" class="module2-slider-picker">
									<img src="./i/832x468/03.jpg" class="module2-small-image" alt="">
									<div class="desc"><span>商品图片描述</span></div>
								</a>
								<a href="javascript:;" class="module2-slider-picker">
									<img src="./i/832x468/04.jpg" class="module2-small-image" alt="">
									<div class="desc"><span>商品图片描述</span></div>
								</a>
								<a href="javascript:;" class="module2-slider-picker">
									<img src="./i/832x468/05.jpg" class="module2-small-image" alt="">
									<div class="desc"><span>商品图片描述</span></div>
								</a>
							</div>
						</div>
						<a href="javascript:;" class="btn icon-top_slim prev"></a>
						<a href="javascript:;" class="btn icon-bottom_slim next"></a>
					</div>
	
					<div class="module3 module">
						<span class="title">宣传视频</span>
						<embed src="http://player.youku.com/player.php/sid/XOTM1ODYyNTQw/v.swf" allowFullScreen="true" quality="high" width="480" height="400" align="middle" allowScriptAccess="always" type="application/x-shockwave-flash"></embed>
					</div>

					<div class="module4 module">
						<div class="title">这是一个段落的标题</div>
						<span class="line"></span>
						<p class="desc">礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。</p>
						<div class="content-box">
							<div class="content">
								<img src="./i/520x290/01.jpg" alt="" class="desc-img">
								<div class="content-main">
									<span class="content-main-title"><span class="icon-radius"></span>这是一个标题</span>
									<p class="content-main-desc">
										礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。礼物是送礼者向受礼者传递信息，情感，意愿的一种载体。通常是人和人之间互相赠送的物件，其目的是为了取悦对方，或表达善意、敬意。礼物也用来庆祝节日或重要的日子，不可不送。礼物也可以是非物，中国古代有“千里送鹅毛，礼轻情义重”的说法。
									</p>
									<span class="arrow-left arrow"></span>
								</div>
							</div>
							<div class="content">
								<img src="./i/520x290/02.jpg" alt="" class="desc-img right">
								<div class="content-main left">
									<span class="content-main-title"><span class="icon-radius"></span>这是一个标题</span>
									<p class="content-main-desc">
										礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。礼物是送礼者向受礼者传递信息，情感，意愿的一种载体。通常是人和人之间互相赠送的物件，其目的是为了取悦对方，或表达善意、敬意。礼物也用来庆祝节日或重要的日子，不可不送。礼物也可以是非物，中国古代有“千里送鹅毛，礼轻情义重”的说法。
									</p>
									<span class="arrow-right arrow"></span>
								</div>
							</div>
						</div>
					</div>

					<div class="module5 module">
						<div class="content-box box1">
							<img src="./i/320x180/10.jpg" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<span class="line"></span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。礼物是送礼者向受礼者传递信息，的一种载体。通常是人和人之间互相赠送的物件。
							</p>
						</div>
						<div class="content-box box2">
							<img src="./i/320x180/11.jpg" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<span class="line"></span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。礼物是送礼者向受礼者传递信息，的一种载体。通常是人和人之间互相赠送的物件。
							</p>
						</div>
						<div class="content-box box3">
							<img src="./i/320x180/12.jpg" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<span class="line"></span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意或以示友好，人与人之间互赠的物品。礼物是送礼者向受礼者传递信息，的一种载体。通常是人和人之间互相赠送的物件。
							</p>
						</div>
					</div>

					<div class="module6 module">
						<div class="content-box box1">
							<img src="#" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意示友好，的物品。礼物是送礼者向受礼者传递信息，的一种载体。
							</p>
						</div>
						<div class="content-box box2">
							<img src="#" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意示友好，的物品。礼物是送礼者向受礼者传递信息，的一种载体。
							</p>
						</div>
						<div class="content-box box3">
							<img src="#" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意示友好，的物品。礼物是送礼者向受礼者传递信息，的一种载体。
							</p>
						</div>
						<div class="content-box box3">
							<img src="#" alt="" class="content-img">
							<span class="title">这是一个标题</span>
							<p class="desc">
								礼物是在社会交往中，为了表达祝福和心意示友好，的物品。礼物是送礼者向受礼者传递信息，的一种载体。
							</p>
						</div>
					</div>
						
					<div class="module7 module">
						<span class="title">商家地址</span>
						<div class="content-box">
							<div class="baidu-map" id="baiduMap">
								
							</div>
							<div class="address">
								<div class="nav">
									<div class="nav-slider">
										<a href="javascript:;" class="go-address on">地址一</a>
										<a href="javascript:;" class="go-address">地址二</a>
										<a href="javascript:;" class="go-address">地址三</a>
										<a href="javascript:;" class="go-address">地址四</a>
									</div>
								</div>
								<div class="address-box">
									<div class="address-detail">
										<span class="title">这个（虚拟）礼品的商户全名</span>
										<span class="detail info"><span class="icon-radius"></span>地址：虹桥路1号港汇中心一座703—705室</span>
										<span class="tel info"><span class="icon-radius"></span>电话：021-64477163 021-64477159</span>
										<span class="time info"><span class="icon-radius"></span>营业时间：10:00 – 22:00</span>
										<a href="#" class="go-baidu">完整地图</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					
					<div class="module8 module">
						<span class="title">礼品详细内容</span>
						<div class="content-box">
							<div class="content-title">
								<div class="left">名称</div>
								<div class="middle">规格数量</div>
								<div class="right">备注</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
							<div class="content-line">
								<div class="left">水果点心</div>
								<div class="middle">1份</div>
								<div class="right">啊这个很好吃啊</div>
							</div>
						</div>
					</div>
						
					<div class="module9 module">
						<span class="title">消费提示</span>
						<table class="content-box" border="1">
						<tbody>
							<tr class="content-line">
								<td class="left">礼品有效时间：</td>
								<td class="right">2015年03月28日至2015年09月19日</td>
							</tr>
							<tr class="content-line">
								<td class="left">预约提示：</td>
								<td class="right">请提前至少一天进行预约，3-6月为旺季，最好提前一周预约</td>
							</tr>
							<tr class="content-line">
								<td class="left">使用规则</td>
								<td class="right">团购用户暂不享受店内其他优惠<br>
每次消费不限使用糯米券张数<br>
每张糯米券限1人使用，超出收费标准：超出另行购买糯米券<br>
店内会员不可以使用糯米券</td>
							</tr>
							</tbody>
						</table>
					</div>

				</div>
				<div class="comments-on-box main-content">
					<div class="comments-desc">
						<span class="left float"><span class="zoom">250</span>位用户购买了此礼品<span class="zoom">245</span>人最终选择了此礼品</span>
						<div class="progress" style="background-image:url(./img/c95.png)">
							<p>
								<span class="normal-top">其中</span>
								<span class="zoom">95</span><span class="zoomin">%</span>
								<span class="normal-bottom">的消费者</span>
							</p>
						</div>
						<span class="right float">经历了非常美妙的体验，给与了此礼物高度的评价！</span>
					</div>
					<div class="comments-ul">
						<div class="comment">
							<span class="icon-smile status status1"></span>
							<img src="./img/avatar_80.jpg" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<span class="word">非常满意！</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
						<div class="comment">
							<span class="icon-smile status status1"></span>
							<img src="./img/avatar_80.jpg" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<span class="word">非常满意！</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
						<div class="comment">
							<span class="icon-smile status status1"></span>
							<img src="./img/avatar_80.jpg" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<span class="word">非常满意！</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
						<div class="comment">
							<span class="icon-smile status status1"></span>
							<img src="./img/avatar_80.jpg" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<span class="word">非常满意！</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
						<div class="comment">
							<span class="icon-smile status status2"></span>
							<img src="./img/avatar_80.jpg" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
						<div class="comment">
							<span class="icon-smile status status1"></span>
							<img src="./img/avatar_80.jpg" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<span class="word">非常满意！</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
						<div class="comment">
							<span class="icon-smile status status2"></span>
							<img src="#" alt="" class="avatar">
							<div class="comment-user">
								<span class="name">Dreamover</span>
								<p class="comment-detail">
									交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”交际相互馈赠礼物，是人类社会生活中不可缺少的交往内容。中国人一向崇尚礼尚往来。《礼记·曲礼上》说：“礼尚往来，往而不来，非礼也，来而不往，亦非礼也。”
								</p>
							</div>
						</div>
					</div>
					<ul class="pages">
						<li>
							<a class="page icon icon-arrow_left" href="#"></a>
						</li>
						<li>
							<a class="page on" href="#">1</a>
						</li>
						<li>
							<a class="page" href="#">2</a>
						</li>
						<li>
							<a class="page" href="#">3</a>
						</li>
						<li>
							<a class="page" href="#">4</a>
						</li>
						<li>
							<a class="page" href="#">5</a>
						</li>
						<li>
							<a class="page" href="#">6</a>
						</li>
						<li>
							<a class="page icon icon-arow_right" href="#"></a>
						</li>
					</ul>
				</div>
			</div>
		</div>

		<div class="recommand product-wrapper">
			<div class="title">
				您可能感兴趣的产品
				<a href="javascript:;" class="change">换一批<span class="icon icon-refresh"></span></a>
			</div>
			<div class="product">
				<div class="img-box">
					<a href="#" class="notice">了解详情</a>
					<img src="./i/384x216/01.jpg" alt="" class="img">
				</div>
				<div class="content">
					<a href="#" class="title">这里是礼品的名字啊</a>
					<span class="info"><span class="count">48</span>人购买</span>
				</div>
			</div>
			<div class="product">
				<div class="img-box">
					<a href="#" class="notice">了解详情</a>
					<img src="./i/384x216/02.jpg" alt="" class="img">
				</div>
				<div class="content">
					<a href="#" class="title">这里是礼品的名字啊</a>
					<span class="info"><span class="count">48</span>人购买</span>
				</div>
			</div>
			<div class="product">
				<div class="img-box">
					<a href="#" class="notice">了解详情</a>
					<img src="./i/384x216/04.jpg" alt="" class="img">
				</div>
				<div class="content">
					<a href="#" class="title">这里是礼品的名字啊</a>
					<span class="info"><span class="count">48</span>人购买</span>
				</div>
			</div>
		</div>
	</div>

	<div class="footer">
		<div class="content-wrapper">
			<span class="number">客服电话</span>
			<span class="numbers">4008-888-888</span>
			<ul class="footer-nav">
				<li>
					<a href="#">联系我们</a>
				</li>
				<li>
					<a href="#">联系我们</a>
				</li>
				<li>
					<a href="#">联系我们</a>
				</li>
				<li>
					<a href="#">联系我们</a>
				</li>
				<li>
					<a href="#">联系我们</a>
				</li>
			</ul>
			<img src="./img/logo.png" alt="" class="logo">
		</div>
		<div class="footer-bar">
			<span class="copyright">CopyRight © 2007-2016 南京新与力文化传播有限公司 苏ICP备09011225号 NewPower Co. 版权所有 经营许可证编号：苏B2-20120395</span>
		</div>
	</div>
</body>
<script src="./js/lib/jquery-1.11.2.min.js"></script>
<script data-main="./js/home" src="./js/lib/require.js"></script>
<script src="./js/detail.js"></script>
</html>
