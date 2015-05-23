<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>详情页</title>
  <link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
  <link rel="stylesheet" type="text/css" href="./css/common.css">
  <link rel="stylesheet" type="text/css" href="./css/cart.css">
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
        <img class="avatar" src="http://img.la/36x36"/>
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
    </div>
  </div>

  <div class="wrapper cart-wrapper">
    <div class="nav">
      <a href="javascript:;" class="link on">
        <span class="zoom">399</span> 元购物车 <span class="zoom">${fn:length(cart1)}</span> 件
      </a>
      <a href="javascript:;" class="link">
        <span class="zoom">699</span> 元购物车 <span class="zoom">${fn:length(cart2)}</span> 件
      </a>
      <span class="title">我的购物车</span>
    </div>

    <div class="cart-product-list">
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
      <div class="cart-detail">
        <img src="http://img.la/160x90" alt="" class="product-image">
        <span class="product-name">这里是礼品的名字啊</span>
        <div class="btn-box">
          <a href="javascript:;" class="add">加入礼包</a>
          <a href="javascript:;" class="collect">移入收藏夹</a>
          <a href="javascript:;" class="remove">移除</a>
        </div>
      </div>
    </div>
  </div>
  <form class="form" action="./order" method="POST">
  <div class="wrapper space-selected-products">
    <div class="selected-product-wrapper">
      <div class="product-box">
        <div class="selected-product hasSelected">
          <div class="img-box">
            <img src="http://img.la/128x72" alt="">
          </div>
          <p class="product-name">请挑选您心仪的礼品</p>
          <a href="javascript:;" class="delete"></a>
          <input type="hidden" name="product1" value="1">
        </div>
        <div class="selected-product">
          <div class="img-box">
            
          </div>
          <p class="product-name">请挑选您心仪的礼品</p>
			<input type="hidden" name="product2" value="2">
        </div>
        <div class="selected-product">
          <div class="img-box">
            
          </div>
          <p class="product-name">请挑选您心仪的礼品</p>
			<input type="hidden" name="product3" value="3">
        </div>
        <div class="selected-product">
          <div class="img-box">
            
          </div>
          <p class="product-name">请挑选您心仪的礼品</p>
			<input type="hidden" name="product4" value="4">
        </div>
        <div class="selected-product">
          <div class="img-box">
            
          </div>
          <p class="product-name">请挑选您心仪的礼品</p>
			<input type="hidden" name="product5" value="5">
        </div>
        <div class="selected-product">
          <div class="img-box">
            
          </div>
          <p class="product-name">请挑选您心仪的礼品</p>
			<input type="hidden" name="product6" value="6">
        </div>
      </div>
    </div>
  </div>
  <div class="wrapper space-notice">
    <div class="selected-notice-wrapper">
      <a href="javascript:;" class="icon toggle"></a>
      <span class="notice">您选择的是</span> <span class="price zoom">399</span> 元礼品组合礼包 , 目前已挑选了 <span class="progress zoom">3/6</span> 个礼品
      <a href="javascript:;" class="deal">结算</a>
    </div>
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
<script data-main="./js/cart" src="./js/lib/require.js"></script>
<script src="./js/index.js"></script>
</html>
