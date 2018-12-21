<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>projectInfo</title>
</head>
<%@include file="/WEB-INF/content/public/manager.jsp"%>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<body>
	<div id="container-margin"
		style="height: auto; overflow: auto; background-color: white">
		<div class="pageContent" style="width: 200px;">
			<form onsubmit="return validateCallback(this, dialogAjaxDone);"
				method="post" action="${ctx}/pages/addPro.do"
				class="pageForm required-validate" id="createProForm" style="width: 298px; ">
				<div class="pageFormContent" 
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>项目组编号:</label> <input type="text" size="30" name="priNo"
							class="required textInput"  maxlength="10"
							onblur="checkProName(this);">
					</p>
					<p>
						<label>项目组类型:</label> <input type="radio" name="priType" >开发
							<input type="radio" name="priType" >测试
					</p>
					<!-- 
					<p>
						<label>密码：</label> <input type="password" size="30"
							name="password" id="password" class="required alphanumeric"
							minlength="6" maxlength="18" alt="字母、数字、下划线 6-18位">
					</p>
					<p>
						<label>确认密码：</label> <input type="password" size="30"
							name="confirmPwd" id="confirmPwd" class="required alphanumeric"
							minlength="6" maxlength="18" alt="字母、数字、下划线 6-18位"
							onblur="checkPwd();">
					</p>
					-->
					<p>
						<label>项目组位置:</label> <input type="text" name="priLocation">	
					</p>
					<p>
						<label>开组时间:</label> <input type="text" name="priStartTime">	
					</p>
					<p>
						<label>项目助理:</label> <input type="text" name="priAssistant">	
					</p>
					<p>
						<label>项目组状态:</label> <input type="radio" name="priStatus">实训
						<input type="radio" name="priStatus">就业
					</p>
					
					<p>
						<label>修改时间:</label><input type="text" name="updateTime">
					</p>
					<p>
						<label>创建时间:</label><input type="text" name="creteTime">
					</p>
				</div>
				<div class="formBar">
					<ul>
						<li><div class="buttonActive">
								<div class="buttonContent">
									<button type="submit">保存</button>
								</div>
							</div></li>
						<li>
							<div class="button">
								<div class="buttonContent">
									<button type="button" class="close">取消</button>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript" defer="defer">
		function checkPwd() {
			if ($("#password").val() != $("#confirmPwd").val()) {
				alertMsg.error("两次密码不一致");
			}
		}

		function checkAge(obj) {
			var age = $(obj).val();
			age = parseInt(age);
			if ((age < 0) || (age > 150)) {
				alertMsg.error("年龄不合法");
			}
		} 

		var checkCode = '1';
		function checkStuName(obj) {
			var code = $(obj).val();
			if (code == checkCode) {
				return false;
			}
			$
					.ajax({
						async : false,
						type : "get",
						url : "${ctx}/student/checkStuName.do",
						data : {
							"stuName" : code
						},
						cache : false,
						contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						success : function(json) {
							if (json.statusCode != "200") {
								alertMsg.error(json.message);
								$("#createStuForm").attr("illegal", true);
								checkCode = code;
								$(obj).focus();
							} else {
								$("#createStuForm").removeAttr("illegal");
							}
						}
					});
		}
	</script>

</body>
</html>