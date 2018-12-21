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
				method="post" action="${ctx}/pages/updateStudent2.do"
				class="pageForm required-validate" id="createStuForm">
				<div class="pageFormContent" layouth="56"
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>编号:</label> <input type="text" size="30" name="stuId" value="${requestScope.studentinfo.stuId }"
							class="required textInput" minlength="2" maxlength="10"
							onblur="checkStuName(this);">
					</p>
					<p>
						<label>姓名:</label> <input type="text" size="30" name="stuName" value="${requestScope.studentinfo.stuName }"
							class="required textInput" onblur="checkStuName(this);">
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
						<label>性别:</label> <input type="radio" name="stuSex" value="1" checked="checked">男
						<input type="radio" name="stuSex" value="2">女
					</p>
					<p>
						<label>年龄:</label> <input type="text" size="10" name="stuAge" value="${requestScope.studentinfo.stuAge }"
							class="textInput number" onblur="checkAge(this);" onblur="checkSex()">
					</p>
					<p>
						<label>联系方式：</label><input type="text" name="stuTel" value="${requestScope.studentinfo.stuTel }">
					</p>
					<p>
						<label>学历:</label><input type="text" name="stuEdu" value="${requestScope.studentinfo.stuEdu }">
					</p>
					<p>
						<label>专业:</label><input type="text" name="stuMaior" value="${requestScope.studentinfo.stuMaior }">
					</p>
					<p>
						<label>毕业院校:</label><input type="text" name="stuGraduate" value="${requestScope.studentinfo.stuGraduate }">
					</p>
					<p>
						<label>家庭住址:</label><input type="text" name="stuAddress" value="${requestScope.studentinfo.stuAddress }">
					</p>
					<p>
						<label>工作经验:</label><input type="text" name="stuExpe" value="${requestScope.studentinfo.stuExpe }">
					</p>
					<p>
						<label>参加实训时间:</label><input type="text" name="stuTrainTime" value="${requestScope.studentinfo.stuTrainTime }">
					</p>
					<p>
						<label>所属项目组:</label><input type="text" name="stuProjectNo" value="${requestScope.studentinfo.stuProjectNo }">
					</p>
					<p>
						<label>迟到次数:</label><input type="text" name="lateCount" value="${requestScope.studentinfo.lateCount }">
					</p>
					<p>
						<label>修改时间:</label><input type="text" name="updateTime" value="${requestScope.studentinfo.updateTime }">
					</p>
					<p>
						<label>创建时间:</label><input type="text" name="creteTime" value="${requestScope.studentinfo.creteTime }">
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
