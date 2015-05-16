<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>注册</title>
  <link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/style.css">
  <link rel="stylesheet" type="text/css" href="./css/common.css">
  <link rel="stylesheet" type="text/css" href="./css/login.css">
</head>
<body>
  <div class="header">
    <img src="./img/logo.png" alt="" class="login_logo">
  </div>
  <div class="login-wrapper signin">
    <div class="login-box">
      <div class="desc">
        <span class="title">注册 <span class="name">GiftBox</span></span>
        <a href="/login.html" class="signin">已经有账号了，去登录 <span class="icon-arow_right icon"></span></a>
        <p class="info">
          你可以在Giftbox用399或699元购买<br>
          包含6个不同礼物的礼包组合<br>
          赠送给你的亲朋好友<br>
          让他们挑选自己最中意的那个礼物<br>
          感受你对他/她的至臻情谊<br><br>
          这里不只有普通的礼品，更有创新的礼物形式<br>
          ——服务与体验
          <a href="./home" class="get_more">了解更多Giftbox的礼品</a>
        </p>
      </div>
      <form class="form" action="./signin" method="POST">
        <img src="/img/text.png" alt="" class="text">
        <input type="text" class="phone block" name="phone" id="phone" placeholder="手机号">
        <input type="text" class="name block" name="name" id="name" placeholder="用户名">
        <input type="text" class="mail block" name="mail" id="mail" placeholder="邮箱">
        <input type="password" class="password block" name="password" id="password" placeholder="密码">
        <div class="info-btns">
          <input type="checkbox" id="autologin" name="autologin"><label for="autologin" class="autologin">同意我们的《隐私条款》 了解详情</label>
        </div>
        <button type="submit" class="sign-now submit-btn">立即注册</button>
        <!-- <a href="#" class="sign-now submit-btn">立即注册 <span class="icon-arow_right icon"></span></a> -->
      </form>
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
<script data-main="./js/login" src="./js/lib/require.js"></script>
<script src="./js/index.js"></script>
</html>
