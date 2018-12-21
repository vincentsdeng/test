<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/content/public/dhead.jsp"%>
<div id="jbsxBoxProjectinfoList" class="unitBox">
	<div class="pageHeader">
		<form id="pagerForm"
			onsubmit="return divSearch(this,'jbsxBoxProjectinfoList');"
			action="${ctx}/pages/Projectinfo/ProjectList.do" method="post">
			<input type="hidden" name="pageNum" value="1" />
			<div class="searchBar">
				<ul class="searchContent">
					<li><label>项目组编号：</label> <input id="priNo" type="text"
						value="" /></li>
					<li><input type="submit" onclick="return uu();" value="检索"></li>
				</ul>
			</div>
		</form>
		<div class="panelBar">
			<ul class="toolBar">
				<li class=""><a class="add"
					href="${ctx}/pages/projectinfo/proAdd.do?pageNum=${pageBean.currentPage}"
					target="dialog" mask="true" title="新增项目组"><span>添加</span></a></li>
				<li class="line">line</li>
			</ul>
		</div>
	</div>

	<div class="pageContent">

		<%-- <div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="${ctx}/core/userManager.initCreateUser.do"  width="650" height="300" target="dialog" mask="true" title="新增内部用户" ><span>添加</span></a></li>
		</ul>
		</div> --%>

		<div id="w_list_print">
			<table id="test" class="form" width="100%" layoutH="90"
				targetType="navTab">
				<thead>
					<tr>
						<th>项目组编号</th>
						<th>项目组类型</th>
						<th>项目组位置</th>
						<th>开组时间</th>
						<th>项目助理</th>
						<th>项目组状态</th>
						<th>修改时间</th>
						<th>创建时间</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${proList }" var="pro">
						<tr>
							<td>${pro.priNo }</td>
							<td>${pro.priType }</td>
							<td>${pro.priLocation }</td>
							<td>${pro.priStartTime }</td>
							<td>${pro.priAssistant }</td>
							<td>${pro.priStatus }</td>
							<td>${pro.updateTime }</td>
							<td>${pro.creteTime }</td>
							<td><a class="common-img"
								href="${ctx}/project/toUpdateProPage.do?id=${pro.priNo }&pageNum=${pageBean.currentPage}"
								target="dialog" mask="true" title="修改${pro.priNo }信息"> <img
									alt="修改" src="${ctx}\images\edit.png">
							</a></td>
							<td><a onclick="delPro('${pro.proNo}')" class="f1">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="panelBar">
			<div class="pages">
				<span>共${pageBean.totalRows}条</span>
			</div>

			<div class="pagination" targetType="navTab"
				totalCount="${pageBean.totalRows}" numPerPage="${pageBean.pageSize}"
				pageNumShown="${pageBean.pageSize}"
				currentPage="${pageBean.currentPage}"></div>

		</div>
	</div>
</div>

<script type="text/javascript">
	function uu(){
	  alert(1);
	  if($("#priNo").val() == ""){
		  alert("请输入编号进行检索");
		  $("#test tbody").html("");
		  return false;
	  }
  }
  
  function delPro(id){
	  if(!confirm("确认要删除信息吗")){
		  return ;
	  }
	  alert("${ctx}/pages/delete.do");
	  $.ajax({ 
			async:false,
			type : "get",
			url :   "${ctx}/pages/delete.do",
			data : {"id":id},
			cache : false,
			contentType: "application/x-www-form-urlencoded; charset=UTF-8", 
			success : function(json) {
				navTab.reload();
			}
	   });
  }
</script>
