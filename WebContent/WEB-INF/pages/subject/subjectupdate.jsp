<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@include file="/WEB-INF/content/public/manager.jsp"%>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
</head>
<body>
	<div id="container-margin"
		style="height: auto; overflow: auto; background-color: white">
		<div class="pageContent" style="width: 200px;">
			<form onsubmit="return validateCallback(this, dialogAjaxDone);"
				method="post" action="${ctx}/pages/subjectupdate2.do"
				class="pageForm required-validate" id="createStuForm">
				<div class="pageFormContent" layouth="56"
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>科目编号:</label> <input type="text" size="30" name="subjectNo" value="${requestScope.subject.subjectNo }"
							class="required textInput" 
							onblur="checkStuName(this);">
					</p>
					<p>
						<label>科目名称：</label> <input type="text" size="30" name="subjectName" value="${requestScope.subject.subjectName }"
							class="required textInput" onblur="checkStuName(this);">
					</p>
					
					
					<p>
						<label>课时：</label> <input type="text" size="10" name="subjectTimes" value="${requestScope.subject.subjectTimes }"
							class="textInput number" onblur="checkAge(this);" onblur="checkSex()">
					</p>
					<p>
						<label>项目经理:</label><input type="text" name="subjectPrjManager" value="${requestScope.subject.subjectPrjManager }">
					</p>
					<p>
						<label>修改时间:</label><input type="text" name="updateTime" value="${requestScope.subject.updateTime }">
					</p>
					<p>
						<label>创建时间:</label><input type="text" name="creteTime" value="${requestScope.subject.creteTime }">
					</p>
				</div>
				<div class="formBar">
					<ul>
						<li><div class="buttonActive">
								<div class="buttonContent">
									<button type="submit" onclick="checkSex()">保存</button>
								</div>
							</div>
						</li>
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
			$.ajax({
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
