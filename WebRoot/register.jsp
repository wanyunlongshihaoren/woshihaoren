<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>注册QQ</title>
	<style type="text/css">
		span{
			color:red;
		}
	</style>
	<script type="text/javascript" src="style/js/jquery.min.js"></script>
</head>
<body>
	<center>
		<form  action="#" method="post" onsubmit="return false" id="form1">
			<table>
				<tr>
					<td>昵称</td>
					<td><input type="text" name="nick" placeholder="请输入4-10位汉字" value="${errorMap.nick==null?qqInfo.nick:'' }"><span>${errorMap.nick }</span></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="text" name="password" placeholder="请输入3-6位数字、字母、下划线组合"><span>${errorMap.password }</span></td>
				</tr>
				<tr>
					<td>手机号码</td>
					<td><input type="text" name="phone" placeholder="请输入正确的手机格式"></td>
				</tr>
				<tr>
					<td>邮箱</td>
					<td><input type="text" name="email" placeholder="请输入正确的邮箱格式"></td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" name="age" placeholder="请输入数字"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="注册"><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
		<script type="text/javascript">
			$.fn.serializeObject = function()    
			{    
			   var o = {};    
			   var a = this.serializeArray();    
			   $.each(a, function() {    
			       if (o[this.name]) {    
			           if (!o[this.name].push) {    
			               o[this.name] = [o[this.name]];    
			           }    
			           o[this.name].push(this.value || '');    
			       } else {    
			           o[this.name] = this.value || '';    
			       }    
			   });    
			   //return o;    
			   return JSON.stringify(o);
			};
			
		
			$("input[type=submit]").click(function(){
				$.ajax({
					url:'test7.do',
					type:'post',
					dataType:'json',
					contentType:'application/json',
					data:$("#form1").serializeObject(),
					success:function(flag){
						alert(flag);
					}
				});
			});
		</script>
	</center>
</body>
</html>
