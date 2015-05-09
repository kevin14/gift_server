<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>列表页</title>
    <link rel="stylesheet" type="text/css" href="./css/base.css">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/list.css">
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
        <div class="guide"><span class="home-icon icon-home"></span><a href="home.html" class="home">首页</a> / 399元礼品组合</div>
        <div class="selector-nav">
            <div class="title li">您选择了</div>
            <div class="price li">
                <span class="price-box price1"><span class="real-price">399</span>元礼品组合 <span class="icon-pulldown"></span></span>
                <span class="price-box li-content price2"><span class="real-price">699</span>元礼品组合</span>
            </div>
            <div class="type li">
                所有类别 <span class="icon-pulldown"></span>
                <ul class="type-box ef-box">
                    <li class="li-content">美 食</li>
                    <li class="li-content">体 验</li>
                    <li class="li-content">创 意</li>
                </ul>
            </div>
            <div class="score li">
                所有星级评分 <span class="icon-pulldown"></span>
                <ul class="score-box ef-box">
                    <li class="li-content star-content">
                        <div class="star-box star-five">
                            <span class="star star1 icon-star"></span>
                            <span class="star star2 icon-star"></span>
                            <span class="star star3 icon-star"></span>
                            <span class="star star4 icon-star"></span>
                            <span class="star star5 icon-star"></span>
                        </div>
                        五星
                    </li>
                    <li class="li-content star-content">
                        <div class="star-box star-four">
                            <span class="star star1 icon-star"></span>
                            <span class="star star2 icon-star"></span>
                            <span class="star star3 icon-star"></span>
                            <span class="star star4 icon-star"></span>
                            <span class="star star5 icon-star"></span>
                        </div>
                        四星
                    </li>
                    <li class="li-content star-content">
                        <div class="star-box star-three">
                            <span class="star star1 icon-star"></span>
                            <span class="star star2 icon-star"></span>
                            <span class="star star3 icon-star"></span>
                            <span class="star star4 icon-star"></span>
                            <span class="star star5 icon-star"></span>
                        </div>
                        三星
                    </li>
                </ul>
            </div>
            <div class="tags li">
                选择标签 <span class="icon-pulldown"></span>
                <div class="tags-box ef-box">
                    <a href="#" class="tag icon-label_2">有停车场</a>
                    <a href="#" class="tag icon-label_2">有停车场</a>
                    <a href="#" class="tag icon-label_2">有停车场</a>
                    <a href="#" class="tag icon-label_2">有停车场</a>
                    <a href="#" class="tag icon-label_2">有停车场</a>
                    <a href="#" class="tag icon-label_2">有停车场</a>
                </div>
            </div>
        </div>
        <div class="product-list">
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
            <c:forEach items="${list}" var="record" varStatus="s">
                <div class="product">
                    <div class="img-box">
                        <a href="./detail?pid=${record.id}" class="notice">了解详情</a>
                        <img src="./i/384x216/01.jpg" alt="" class="img">
                    </div>
                    <div class="content">
                        <a href="#" class="title">${record.productName}</a>
                        <span class="info"><span class="count">${record.productPick}</span>人购买</span>
                    </div>
                </div>
            </c:forEach>
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
    <div class="slide-controller">
        <div class="slide-nav">
            <a href="javascript:;" class="my-cart module-btn"><span class="icon icon-cart_slim"></span>我<br>的<br>购<br>物<br>车<br><span class="count">12</span></a>
            <a href="/home.html" class="home slide-nav-btn module-btn icon-home_slim"></a>
            <a href="javascript:;" class="collect slide-nav-btn module-btn icon-star_slim"></a>
            <a href="javascript:;" class="histroy slide-nav-btn module-btn icon-histroy_slim"></a>
            <a href="#" class="up slide-nav-btn icon-top_slim"></a>
        </div>
        <div class="slide-content-box">
            <div class="slide-cart slide-content">
                <a href="javascript:;" class="price-title price1"><span class="focus">399</span>礼品<span class="count focus">3</span>件</a>
                <div class="price1-box price-box">
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                </div>
                <a href="javascript:;" class="price-title price2"><span class="focus">699</span>礼品<span class="count focus">3</span>件</a>
                <div class="price2-box price-box">
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                </div>
                <a href="/cart.html" class="go-cart">整理我的购物车</a>
            </div>
            <div class="slide-collect slide-content">
                <span class="slide-main-title">我的收藏</span>
                <a href="javascript:;" class="price-title price1"><span class="focus">399</span>礼品<span class="count focus">3</span>件</a>
                <div class="price1-box price-box">
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                </div>
                <a href="javascript:;" class="price-title price2"><span class="focus">699</span>礼品<span class="count focus">3</span>件</a>
                <div class="price2-box price-box">
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                </div>
            </div>
            <div class="slide-histroy slide-content">
                <span class="slide-main-title">我浏览过的</span>
                <a href="javascript:;" class="price-title price1"><span class="focus">399</span>礼品<span class="count focus">3</span>件</a>
                <div class="price1-box price-box">
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                </div>
                <a href="javascript:;" class="price-title price2"><span class="focus">699</span>礼品<span class="count focus">3</span>件</a>
                <div class="price2-box price-box">
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
                    <div class="slide-product">
                        <a href="javascript:;" class="delete">x</a>
                        <img src="/img/slide_img.jpg" alt="">
                        <p class="name">这里是商品的名字啊</p>
                    </div>
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
<script data-main="./js/list" src="./js/lib/require.js"></script>
<script src="./js/index.js"></script>

</html>
