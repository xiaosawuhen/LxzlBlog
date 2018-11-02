<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
	<base href="<%=basePath%>">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="img/favicon.png">

    <title>后台管理系统</title>

    <!-- Bootstrap CSS -->    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="static/css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="static/css/elegant-icons-style.css" rel="stylesheet" />
    <link href="static/css/font-awesome.min.css" rel="stylesheet" />    
    <!-- full calendar css-->
    <link href="static/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
	<link href="static/assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
    <!-- easy pie chart-->
    <link href="static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <!-- owl carousel -->
    <link href="static/css/owl.carousel.css" type="text/css" rel="stylesheet" >
	<link href="static/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
    <!-- Custom styles -->
	<link href="static/css/fullcalendar.css" rel="stylesheet" >
	<link href="static/css/widgets.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <link href="static/css/style-responsive.css" rel="stylesheet" />
	<link href="static/css/xcharts.min.css" rel=" stylesheet">	
	<link href="static/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link rel="stylesheet" href="static/css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="static/css/buttons.dataTables.min.css">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
    <!--[if lt IE 9]>
      <script src="static/js/html5shiv.js"></script>
      <script src="static/js/respond.min.js"></script>
      <script src="static/js/lte-ie7.js"></script>
    <![endif]-->
  </head>

  <body>
  <!-- container section start -->
  <section id="container" class="">
     
      <!-- headerjsp -->
      <c:import url="../common/header.jsp"></c:import>
      <c:import url="../common/menu.jsp"></c:import>
      
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
		  <div class="row">
				<div class="col-lg-12">
					<h3 class="page-header"><i class="fa fa-files-o"></i> 公司信息管理</h3>
					<ol class="breadcrumb">
						<li><i class="fa fa-home"></i><a href="index.html">后台管理</a></li>
						<li><i class="fa fa-laptop"></i>项目信息管理</li>
					</ol>
				</div>
			</div>
              <!-- Form validations -->              
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                             删选条件
                          </header>
                          <div class="panel-body">
                              <form id="selectContidionForm" class="form-horizontal " method="get">
                                  <div class="form-group">
                                      <label class="col-sm-1 control-label">合作伙伴名称</label>
                                      <div class="col-sm-2">
                                          <input type="text" class="form-control" id="nameCdn" name="nameCdn">
                                      </div>
                                  </div>
                                  <button type="submit" class="btn btn-primary">查询</button>
                              </form>
                          </div>
                      </section>
                  </div>
              </div>
              <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              项目列表
                          </header>
                          <div class="table-responsive">
                            <table id="partnerTable" class="table">
                              <thead>
                                <tr>
                                  <th>#</th>
                                  <th>ID</th>
                                  <th>名称</th>
                                  <th>项目描述</th>
                                </tr>
                              </thead>
                            </table>
                          </div>
                      </section>
                  </div>
              </div>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
  </section>
  <!-- container section start -->

    <!-- javascripts -->
    <script src="static/js/jquery.js"></script>
	<script src="static/js/jquery-ui-1.10.4.min.js"></script>
    <script src="static/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="static/js/jquery-ui-1.9.2.custom.min.js"></script>
    <!-- bootstrap -->
    <script src="static/js/bootstrap.min.js"></script>
    <!-- nice scroll -->
    <script src="static/js/jquery.scrollTo.min.js"></script>
    <script src="static/js/jquery.nicescroll.js" type="text/javascript"></script>
    <!-- charts scripts -->
    <script src="static/assets/jquery-knob/js/jquery.knob.js"></script>
    <script src="static/js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="static/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="static/js/owl.carousel.js" ></script>
    <!-- jQuery full calendar -->
    <<script src="static/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
	<script src="static/assets/fullcalendar/fullcalendar/fullcalendar.js"></script>
    <!--script for this page only-->
    <script src="static/js/calendar-custom.js"></script>
	<script src="static/js/jquery.rateit.min.js"></script>
    <!-- custom select -->
    <script src="static/js/jquery.customSelect.min.js" ></script>
	<script src="static/assets/chart-master/Chart.js"></script>
   
    <!--custome script for all page-->
    <script src="static/js/scripts.js"></script>
    <!-- custom script for this page-->
    <script src="static/js/sparkline-chart.js"></script>
    <script src="static/js/easy-pie-chart.js"></script>
	<script src="static/js/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="static/js/jquery-jvectormap-world-mill-en.js"></script>
	<script src="static/js/xcharts.min.js"></script>
	<script src="static/js/jquery.autosize.min.js"></script>
	<script src="static/js/jquery.placeholder.min.js"></script>
	<script src="static/js/gdp-data.js"></script>	
	<script src="static/js/morris.min.js"></script>
	<script src="static/js/sparklines.js"></script>	
	<script src="static/js/charts.js"></script>
	<script src="static/js/jquery.slimscroll.min.js"></script>
    <!-- 导入jquery支持 -->
	<script type="text/javascript" src="static/js/dataTable/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="static/js/dataTable/dataTables.buttons.min.js"></script>
	<script type="text/javascript" src="static/js/dataTable/buttons.colVis.min.js"></script>
  <script>

	$(document).ready(function() {
		//var vdata = [];
	    var employeeTable = $('#partnerTable').DataTable( {
	        dom: 'Bfrtip',    // 动态控制显示列按钮
	        searching:false,
	        info:false,
	        paging:false,
	        autoWidth:false,
	        buttons: [
	        	{ extend: 'colvis', text: '个性化界面' },
            {
	        		extend: 'collection',
                text: '全显示',
	                autoClose: true,
                action: function ( e, dt, node, config ) {
                    dt.columns().visible( true );
                }
            }
	        ]
	    } );
	    
	    var searchList = function(info) {
 		   $.ajax({
 		      url : "partner/listByCondition",
 		      type : "post",
 		      data : JSON.stringify(info),//可能会出现后台接收到的参数值为null的情况，原因是form.js的源码不全，没有data这个参数，需要重新下载官网的源码。
 		      dataType : "json",
 		      contentType: "application/json; charset=utf-8",
 		      async: false,//异步
               success: function(data) {
              	if(data.statusCode = '20000') {
      		    	var dataList = data.data;
      		    	if(dataList.length > 0) {
          		    	// 遍历循环写tbody
          		    	var tableData = new Array(dataList.length);
          		    	
                  		$.each(dataList, function(i, item){
                  			var arrary = new Array(7);
                  			arrary[0] = (i);
                  			arrary[1] = ((dataList[i].pid!=null)?dataList[i].pid:"");

                  			var name = ((dataList[i].name!=null)?dataList[i].name:"");
    		    			var nameHtml = "<span ";
    		    			nameHtml += "pid='"+dataList[i].pid+"' >";
    		    			nameHtml += "<a class=\"partner-name\" href='javascript:void(0);' onclick='detailIfno(this)'";
    		    			nameHtml += ">"+name+"</a></span>";
    		    			
                  			arrary[2] = nameHtml;
                  			arrary[3] = ((dataList[i].description!=null)?dataList[i].description:"");
                  			tableData[i] = arrary;
                  		});
                  		employeeTable = $("#partnerTable").dataTable();   
               	        oSettings = employeeTable.fnSettings(); 
              	        employeeTable.fnClearTable(this);
              	        employeeTable.fnAddData(tableData);
              	        oSettings.aiDisplay = oSettings.aiDisplayMaster.slice();  
              	        employeeTable.fnDraw();
      		    	} 
              	}
               },
               error: function(XMLHttpRequest, textStatus, errorThrown) {
               },
               complete: function(XMLHttpRequest, textStatus) {
               }
 		   });
	    }
		
  	var info = {};
  	info.name = '123';
 		searchList(info);

      $("#selectContidionForm").on("submit", function(){
      	var info = {};
      	info.name = $("#nameCdn").val();
     		searchList(info);
        return false;
      });
	} );
	
      //knob
      $(function() {
        $(".knob").knob({
          'draw' : function () { 
            $(this.i).val(this.cv + '%')
          }
        })
      });

      //carousel
      $(document).ready(function() {
          $("#owl-slider").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });
	  
	  /* ---------- Map ---------- */
	$(function(){
	  $('#map').vectorMap({
	    map: 'world_mill_en',
	    series: {
	      regions: [{
	        values: gdpData,
	        scale: ['#000', '#000'],
	        normalizeFunction: 'polynomial'
	      }]
	    },
		backgroundColor: '#eef3f7',
	    onLabelShow: function(e, el, code){
	      el.html(el.html()+' (GDP - '+gdpData[code]+')');
	    }
	  });
	});

	function detailIfno(which){
		var pid = $(which).parent().attr("pid");
		window.location.href = "partner/edit?pid=" + pid;
	}
  </script>

  </body>
</html>
