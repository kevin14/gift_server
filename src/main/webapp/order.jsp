<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>订单页</title>
    <link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/order.css">
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

	<form class="wrapper order-form" action="/order" method="POST">
	<div class="wrapper order-wrapper">
		<div class="nav">
			<span class="title">你选择了<span class="zoom">上海</span>地区的<span class="zoom">399</span>元礼包组合，里面将包括如下您挑选的<span class="zoom">6</span>个礼品：</span>
			<a href="/cart.html" class="back2cart">返回购物车重新选择</a>
		</div>
		<div class="order-content">
			<div class="order-product-list">
				<div class="product-detail">
					<div class="image-wrapper">
						<img src="./i/384x216/01.jpg" alt="" class="product-image">
					</div>
					<span class="product-name">这里是礼品的名字啊</span>
					<input type="hidden" name="productId1" value="1">
				</div>
				<div class="product-detail">
					<div class="image-wrapper">
						<img src="./i/384x216/02.jpg" alt="" class="product-image">
					</div>
					<span class="product-name">这里是礼品的名字啊</span>
					<input type="hidden" name="productId2" value="2">
				</div>
				<div class="product-detail">
					<div class="image-wrapper">
						<img src="./i/384x216/03.jpg" alt="" class="product-image">
					</div>
					<span class="product-name">这里是礼品的名字啊</span>
					<input type="hidden" name="productId3" value="3">
				</div>
				<div class="product-detail">
					<div class="image-wrapper">
						<img src="./i/384x216/04.jpg" alt="" class="product-image">
					</div>
					<span class="product-name">这里是礼品的名字啊</span>
					<input type="hidden" name="productId4" value="4">
				</div>
				<div class="product-detail">
					<div class="image-wrapper">
						<img src="./i/384x216/05.jpg" alt="" class="product-image">
					</div>
					<span class="product-name">这里是礼品的名字啊</span>
					<input type="hidden" name="productId5" value="5">
				</div>
				<div class="product-detail">
					<div class="image-wrapper">
						<img src="./i/384x216/06.jpg" alt="" class="product-image">
					</div>
					<span class="product-name">这里是礼品的名字啊</span>
					<input type="hidden" name="productId6" value="6">
				</div>
			</div>
		</div>
			<div class="your-info info">
				<span class="title">您的信息</span>
				<input type="text" class="input input-text" id="yourName" name="giverName" placeholder="送礼时的称呼 / 昵称">
				<input type="text" class="input input-text" id="yourPhone" name="giverCell" placeholder="手机号">
				<input type="text" class="input input-text" id="yourMail" name="giverEmail" placeholder="邮箱">
			</div>
			<div class="your-friend-info info">
				<span class="title">收礼人信息</span>
				<input type="text" class="input input-text" id="hisName" name="recevierName" placeholder="称呼 / 昵称">
				<input type="text" class="input input-text" id="hisPhone" name="receiverCell" placeholder="手机号">
				<input type="text" class="input input-text" id="hisMail" name="receiverEmail" placeholder="邮箱">
			</div>
			<div class="your-friend-info info">
				<span class="title">送礼详情</span><br>
				<input type="text" class="input input-text date" id="date" name="date" placeholder="日期">
				<input type="text" class="input input-text time" id="time" name="time" placeholder="时间">
				<textarea class="input input-textarea" id="words" name="orderComment" placeholder="你对TA的祝福"></textarea>
			</div>
			<div class="order-notice">我们会在订单支付完成后第一时间电话联系您确认订单信息，请务必确保您的信息正确无误，谢谢。</div>
	</div>
	<div class="wrapper order-submit-box">
		<span class="desc">你选择了包含<span class="zoom">6</span>个礼品的六选一礼包组合，总共需要支付<span class="zoom">¥399</span></span>
		<!-- <a href="javascript:;" class="submit">提交订单</a> -->
		<button type="submit" class="submit">提交订单</button>
		<input type="hidden" name="price" value="399">
	</div>
	</form>

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
<script data-main="./js/order" src="./js/lib/require.js"></script>
<script src="./js/index.js"></script>
</html>
