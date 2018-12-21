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
				method="post" action="${ctx}/pages/examinfo/examAdd.do"
				class="pageForm required-validate" id="createStuForm">
				<div class="pageFormContent" layouth="56"
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>考核编号:</label> <input type="text" size="30" name="examinfo.examId"
							class="required textInput" minlength="2" maxlength="10"
							onblur="checkExamName(this);">
					</p>
					<p>
						<label>考核描述:</label> <input type="text" size="30" name="examinfo.examName"
							class="required textInput" onblur="checkExamName(this);">
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
					<!-- <p>
						<label>性别:</label> <input type="radio" name="studentinfo.stuSex" value="1">男
						<input type="radio" name="studentinfo.stuSex" value="2">女
					</p>
					<p>
						<label>年龄:</label> <input type="text" size="10" name="studentinfo.stuAge"
							class="textInput number" onblur="checkAge(this);">
					</p> -->
					<p>
						<label>考题编号：</label><input type="text" name="examinfo.examNo">
					</p>
					<p>
						<label>考题标题:</label><input type="text" name="studentinfo.stuEdu">
					</p>
					<p>
						<label>子考题编号:</label><input type="text" name="studentinfo.stuMaior">
					</p>
					<p>
						<label>子考题标题:</label><input type="text" name="studentinfo.stuGraduate">
					</p>
					<p>
						<label>子考题内容:</label><input type="text" name="studentinfo.stuAddress">
					</p>
					<p>
						<label>子考题分数:</label><input type="text" name="studentinfo.stuExpe">
					</p>
					<p>
						<label>子考题答案:</label><input type="text" name="studentinfo.stuTrainTime">
					</p>
					
					<p>
						<label>修改时间:</label><input type="text" name="studentinfo.updateTime">
					</p>
					<p>
						<label>创建时间:</label><input type="text" name="studentinfo.creteTime">
					</p>
				</div>
				<div class="formBar">
					<ul>
						<li><div class="buttonActive">
								<div class="buttonContent">
									<button type="submit">保存</button>
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

		/* function checkAge(obj) {
			var age = $(obj).val();
			age = parseInt(age);
			if ((age < 0) || (age > 150)) {
				alertMsg.error("年龄不合法");
			}
		} 
 */
		var checkCode = '1';
		function checkExamName(obj) {
			var code = $(obj).val();
			if (code == checkCode) {
				return false;
			}
			$.ajax({
						async : false,
						type : "get",
						url : "${ctx}/exam/checkExamName.do",
						data : {
							"examName" : code
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
