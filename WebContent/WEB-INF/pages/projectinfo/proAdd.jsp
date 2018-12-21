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
		style="height: auto;overflow: auto;background-color: white">
		<div class="pageContent" style="width: 200px;">
			<form onsubmit="return validateCallback(this, dialogAjaxDone);"
				method="post" action="${ctx}/pages/projectinfo/proAdd.do"
				class="pageForm required-validate" id="createStuForm">
				<div class="pageFormContent" layouth="56"
					style="height: 205px; overflow: auto;">
					<input type="hidden" name="pageNum" value="${pageNum }">
					<p>
						<label>项目组编号：</label>
						<input type="text" size="30" name="projectinfo.priNo" 
							minlength="2" maxlength="10" >
					</p>
							
					<p>
						<label>项目组类型：</label>
						<input type="radio" name="projectinfo.priType" value="1">
						开发
						<input type="radio" name="projectinfo.priType" value="2">
						测试
					</p>
					<p>
						<label>项目组位置：</label>
						<input type="text" name="projectinfo.priLocation">
					</p>
					<p>
						<label>开组时间:</label>
						<input type="text" name="projectinfo.priStartTime">
					</p>
					<p>
						<label>项目助理:</label>
						<input type="text" name="projectinfo.priAssistant">
					</p>
					<p>
						<label>项目组状态:</label>
						<input type="radio" name="projectinfo.priStatus" value="3">实训
						<input type="radio" name="projectinfo.priStatus" value="4">就业
					</p>
					<p>
						<label>修改时间:</label>
						<input type="text" name="projectinfo.updateTime">
					</p>
					<p>
						<label>创建时间:</label>
						<input type="text" name="projectinfo.creteTime">
					</p>
				</div>
				<div class="formBar">
					<ul>
						<li>
							<div class="buttonActive">
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

var checkCode = '1';
function checkProNo(obj){
  var code = $(obj).val();
  if(code == checkCode){
   return false;
  }
  $.ajax({
	async:false,
	type : "get",
	url :   "${ctx}/pages/findProject.do",
	data : {"priNo":code},
	cache : false,
	contentType: "application/x-www-form-urlencoded; charset=UTF-8", 
	success : function(json) {
		if(json.statusCode != "200"){
			alertMsg.error(json.message);
			$("#createStuForm").attr("illegal", true);
			checkCode = code;
			$(obj).focus();
		}else{
			$("#createStuForm").removeAttr("illegal");
		}
	}
  });
}
	</script>
</body>
</html>
