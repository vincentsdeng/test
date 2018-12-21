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
				method="post" action="${ctx}/pages/subjectadd.do"
				class="pageForm required-validate" id="createStuForm">
				<div class="pageFormContent" layouth="56"
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>科目编号:</label> <input type="text" size="30" name="subjectNo"
							class="required textInput" 
							onblur="checkStuName(this);">
					</p>
					<p>
						<label>科目名称：</label><input type="text" name="subjectName">
					</p>
					<p>
						<label>课时：</label><input type="text" name="subjectTimes">
					</p>
					<p>
						<label>项目经理:</label><input type="text" name="subjectPrjManager">
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

</body>
</html>
