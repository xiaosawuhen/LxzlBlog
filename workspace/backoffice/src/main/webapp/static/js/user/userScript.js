
//图片上传 开始
$(function() {
	jQuery.imageUploadControl=function(imgId, fileId, imgValueId, btnId, url){ 
		$("#" + imgId).click(function() {
			$("#" + fileId).click(); // 隐藏了input:file样式后，点击头像就可以本地上传
			$("#" + fileId).on("change", function() {
				var objUrl = getObjectURL(this.files[0]); // 获取图片的路径，该路径不是图片在本地的路径
				if (objUrl) {
					$("#" + imgId).attr("src", objUrl); // 将图片路径存入src中，显示出图片
				}
			});
		}); 
		
		 //图片上传
	    $("#" + btnId).click(function () {
	        var formData = new FormData();
	        // formData.ppend(name, element);
	        formData.append('file', $('#' + fileId)[0].files[0]);
	        $.ajax({
	            url: url,
	            type: 'POST',
	            data: formData,
	            contentType: false, // 注意这里应设为false
	            processData: false,
	            cache: false,
	            success: function(data) {
	            	var result = $.parseJSON( data );
	                if (result.data.code==200){
	                    //将图片换成默认的+图片
	                    $("#" + imgId).attr("src",result.data.image);
	                    $("#" + imgValueId).attr("value",result.data.image);
	                }
	            },
	            error: function (jqXHR) {
	                console.log(JSON.stringify(jqXHR));
	            }
	        })
	    });
	};  
});

//建立一個可存取到該file的url
function getObjectURL(file) {
	var url = null;
	if (window.createObjectURL != undefined) { // basic
		url = window.createObjectURL(file);
	} else if (window.URL != undefined) { // mozilla(firefox)
		url = window.URL.createObjectURL(file);
	} else if (window.webkitURL != undefined) { // webkit or chrome
		url = window.webkitURL.createObjectURL(file);
	}
	return url;
}
//图片上传 结束

// 确认框 开始
function modalConfirm(data,callback){
	$("#confirm #modalInfo").text(data);
	$("#confirm").modal('show');
	
	$("#confirm #okBtn").unbind("click");
	if( typeof callback != "undefine") {
		$("#confirm #okBtn").bind("click", callback);
	}
}
//确认框 结束

//form转化Json 开始
$(function() {
	jQuery.prototype.serializeObject=function(){  
	    var obj=new Object();  
	    $.each(this.serializeArray(),function(index,param){  
	        if(!(param.name in obj)){  
	        	if(param.name != "imgFile") {
		            obj[param.name]=param.value; 
	        	} 
	        }  
	    });  
	    return obj;  
	};  
});
//form转化Json 结束
