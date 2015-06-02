<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>订单页</title>
    <link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/extract_step2.css">
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
    <div class="extract-wrapper">
		<div class="extract-box">
			<div class="extract-product-box">
				<div class="extract-product">
					<img src="./i/240x135/01.jpg" alt="">
					<span class="name">这里是产品名字啊</span>
				</div>
				<div class="extract-product">
					<img src="./i/240x135/02.jpg" alt="">
					<span class="name">这里是产品名字啊</span>
				</div>
				<div class="extract-product">
					<img src="./i/240x135/03.jpg" alt="">
					<span class="name">这里是产品名字啊</span>
				</div>
				<div class="extract-product">
					<img src="./i/240x135/04.jpg" alt="">
					<span class="name">这里是产品名字啊</span>
				</div>
				<div class="extract-product">
					<img src="./i/240x135/05.jpg" alt="">
					<span class="name">这里是产品名字啊</span>
				</div>
				<div class="extract-product">
					<img src="./i/240x135/06.jpg" alt="">
					<span class="name">这里是产品名字啊</span>
				</div>
			</div>
			<div class="extract-desc-box">
				<span class="status">提取成功</span>
				<span class="say">${order.giverName} 想对您说：</span>
				<p class="say-content">
					Hi ${order.recevierName}：<br/>${order.orderComment}
				</p>
				<span class="cart icon-cart_slim"></span>
				<p class="our-desc">
					左边出现的就是TA为您精心挑选的六个礼物<br>
					您可以从中任意挑选一个<br>
					您最心仪的礼品
				</p>
                <form action="./detail_choose.html" method="POST">
                    <input type="hidden" value="${order.fetchCode}">
                    <button type="submit" class="next">立即开始挑选</button>
                </form>
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
<script data-main="./js/extract" src="./js/lib/require.js"></script>
<script src="./js/index.js"></script>
</html>
