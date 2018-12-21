<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/WEB-INF/content/public/manager.jsp"%>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>Insert title here</title>
</head>
<body>
	<div id="container-margin"
		style="height: auto; overflow: auto; background-color: white">
		<div class="pageContent" style="width: 200px;">
			<form onsubmit="return validateCallback(this, dialogAjaxDone);"
				method="post" action="${ctx}/pages/addStu.do"
				class="pageForm required-validate" id="createStuForm">
				<div class="pageFormContent" layouth="56"
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>学号:</label> <input type="text" size="30" name="stuId"
							class="required textInput" minlength="2" maxlength="10"
							onblur="checkStuName(this);">
					</p>
					<p>
						<label>考勤时间:</label><input type="text" name="attendanceime">
					</p>
					<p>
						<label>考勤状态:</label><input type="text" name="attendanceStatus">
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