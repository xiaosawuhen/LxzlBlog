<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<link href="static/css/userStyle.css" rel="stylesheet">
      <header class="header dark-bg">
            <div class="toggle-nav">
                <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
            </div>

            <!--logo start-->
            <a href="index.html" class="logo">Nice <span class="lite">Admin</span></a>
            <!--logo end-->

            <div class="top-nav notification-row">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="static/img/avatar1_small.jpg">
                            </span>
                            <span class="username">Jenifer Smith</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li class="eborder-top">
                                <a href="logout"><i class="icon_key_alt"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->
      
      <!-- 确认消息模态框 -->
	<div class="modal fade" id="confirm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop='static'>
		<div class="modal-dialog" style="width:500px;">
			<div class="modal-content">
				<div class="modal-header" style="font-size:16px; color:#fff; background-color:#0054a6; padding:9px;">
					<button type="button" class="close" data-dismiss="modal" style="color:#fff; opacity:1;" aria-hidden="true">&times;</button>
					<div>确认消息</div>
				</div>
				<div class="modal-body">
					<div id="modalInfo" style="text-align:center; margin:10px 0;"></div>
				</div>
				<div class="cct-popup-content-bjbz-foot">
					<button id="okBtn" type="button" style="margin-right:0px;width: 100px;margin-left:260px;" class="cct-popup-content-bjbz-btn" data-dismiss="modal">OK</button>
					<button id="cancleBtn" type="button" style="margin-right:0px;margin-left:10px;width: 100px;" class="cct-popup-content-bjbz-btn" data-dismiss="modal">Cancel</button>
				</div>
			</div>
		</div>
	</div>
    <script src="static/js/jquery.js"></script>
    <script src="static/js/user/userScript.js"></script>
