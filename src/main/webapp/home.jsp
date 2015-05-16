<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/home.css">
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
                <span class="icon-cart"></span>
                购物车
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

    <div class="slider">
        <a href="#" class="img-link show">
            <img class="img" src="./img/slide_1.jpg"></img>
        </a>
        <a href="#" class="img-link">
            <img class="img" src="./img/hp_top_banner_2.jpg"></img>
        </a>
        <div class="btn-box">
            <a href="javascript:;" class="prev icon-arrow_left btn"></a>
            <a href="javascript:;" class="next icon-arow_right btn"></a>
        </div>
    </div>

    <div class="wrapper">
        <div class="big-guider">
            <a href="#" class="big-guider-content c1">
                <img class="guide-img" src="./img/hp_entre1.jpg" alt="">
                <span class="txt">输入提取码，领取并挑选礼物</span><span class="icon-arow_right icon"></span>
            </a>
            <div class="big-guider-content c2">
                <div class="price-box">
                    <span class="title">请选择礼物组合的价位</span>
                    <span class="cur-price">399</span>
                    <span class="icon-arow_right ic"></span>
                    <span class="another-price">699</span>
                    <span class="unit">元</span>
                </div>
                <a href="#" class="select">
                    <span class="txt">开始挑选礼物</span><span class="icon-arow_right icon"></span>
                </a>
            </div>
            <a href="#" class="big-guider-content c3">
                <img class="guide-img" src="./img/hp_entre2.jpg" alt="">
                <span class="txt">适合家庭的儿童节礼物</span><span class="icon-arow_right icon"></span>
            </a>        
        </div>
        <div class="home-img-nav">
            <div class="nav">
                <a href="javascript:;" class="nav-one on link">
                    <span class="icon-coffee icon">美食</span>
                </a>
                <a href="javascript:;" class="nav-two link">
                    <span class="icon-smile icon">体验</span>
                </a>
                <a href="javascript:;" class="nav-three link">
                    <span class="icon-idea icon">创意</span>
                </a>
            </div>
            <div class="img-guide-box">
                <div class="guide-one guide on">
                    <a href="#" class="big-pic">
                        <div class="content">
                            <span class="title">烛光晚餐</span>
                            <span class="desc">达芬奇江景餐厅</span>
                        </div>
                        <img src="./i/640x360/01.jpg">
                    </a>
                    <a href="#" class="small-pic-one small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/02.jpg">
                    </a>
                    <a href="#" class="small-pic-two small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/03.jpg">
                    </a>
                    <a href="#" class="small-pic-three small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/04.jpg">
                    </a>
                    <a href="#" class="small-pic-four small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/05.jpg">
                    </a>
                    <a href="#" class="small-pic-five small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/06.jpg">
                    </a>
                </div>
                <div class="guide-two guide">
                    <a href="#" class="big-pic">
                        <div class="content">
                            <span class="title">烛光晚餐2</span>
                            <span class="desc">达芬奇江景餐厅</span>
                        </div>
                        <img src="./i/640x360/02.jpg">
                    </a>
                    <a href="#" class="small-pic-one small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/07.jpg">
                    </a>
                    <a href="#" class="small-pic-two small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/08.jpg">
                    </a>
                    <a href="#" class="small-pic-three small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/09.jpg">
                    </a>
                    <a href="#" class="small-pic-four small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/10.jpg">
                    </a>
                    <a href="#" class="small-pic-five small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/11.jpg">
                    </a>
                </div>
                <div class="guide-three guide">
                    <a href="#" class="big-pic">
                        <div class="content">
                            <span class="title">烛光晚餐3</span>
                            <span class="desc">达芬奇江景餐厅</span>
                        </div>
                        <img src="./i/640x360/03.jpg">
                    </a>
                    <a href="#" class="small-pic-one small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/12.jpg">
                    </a>
                    <a href="#" class="small-pic-two small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/13.jpg">
                    </a>
                    <a href="#" class="small-pic-three small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/14.jpg">
                    </a>
                    <a href="#" class="small-pic-four small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/15.jpg">
                    </a>
                    <a href="#" class="small-pic-five small-pic">
                        <span class="content">这里是礼品的名字啊</span>
                        <img src="./i/320x180/01.jpg">
                    </a>
                </div>
            </div>
        </div>

        <div class="product-wrapper">
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
                    <img src="./i/384x216/03.jpg" alt="" class="img">
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
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/05.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/06.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/07.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/08.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/09.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/10.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/11.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>
            <div class="product">
                <div class="img-box">
                    <a href="#" class="notice">了解详情</a>
                    <img src="./i/384x216/12.jpg" alt="" class="img">
                </div>
                <div class="content">
                    <a href="#" class="title">这里是礼品的名字啊</a>
                    <span class="info"><span class="count">48</span>人购买</span>
                </div>
            </div>

            <div class="get-more-box">
                <a href="./list" class="get-more">更多礼品</a>
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
<script data-main="./js/home" src="./js/lib/require.js"></script>
<script src="./js/index.js"></script>
</html>
