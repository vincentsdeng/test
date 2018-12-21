<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/content/public/dhead.jsp" %>
<div id="jbsxBoxSubjectList" class="unitBox">
<div class="pageHeader">
	<form rel="pagerForm" id="pagerForm" onsubmit="return divSearch(this,'jbsxBoxSubjectList');" action="${ctx}/pages/subject.do" method="post">
	<input type="hidden" name="pageNum" value="1" /> 
	<div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>科目查询：</label>
				<input id="stuName" type="text" name="subject.stuName" value=""/>
			</li>
			<li><input type="submit" onclick="return uu();" value="检索"></li>
		</ul>	
	</div>
	</form>
	<div class="panelBar">
		<ul class="toolBar">
			<li class=""><a class="add" href="${ctx}/pages/subject/subjectadd.do?pageNum=${pageBean.currentPage}" target="dialog" mask="true" title="新增科目"><span>添加</span></a></li>
			<li class="line">line</li>
		</ul>
	</div>
</div>


<div class="pageContent">    
	
	

	<div id="w_list_print">
	<table id="test" class="form" width="100%" layoutH="90" targetType="navTab">
		<thead>
			<tr>
				<th>科目编号</th>
				<th>科目名称</th>
				<th>课时</th>
				<th>项目经理</th>
				<th>修改时间</th>
				<th>创建时间</th>
				<th>编辑</th>
				<th>删除</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${stuList }" var="stu">
			  <tr>
			  <c:if test="stu.subjectName==">
				  <td>${stu.subjectNo }</td>
				<td>${stu.subjectName }</td>
			    <td>${stu.subjectTimes }</td>
			    <td>${stu.subjectPrjManager }</td>
				<td>${stu.updateTime }</td>
				<td>${stu.creteTime }</td>
			 	</c:if>
			    <td>
			    	<a  class="common-img"
					    href="${ctx}/student/toUpdateStuPage.do?id=${stu.subjectNo }&pageNum=${pageBean.currentPage}" 
					    target="dialog" mask="true" title="修改${stu.subjectName }信息">
					   	<img alt="修改" src="${ctx}\images\edit.png">
					</a>
			    </td>
			    <td><a onclick="delStu('${stu.subjectNo }')" class="f1">删除</a></td>
			  </tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div class="panelBar" >
		<div class="pages">
			<span>共${pageBean.totalRows}条</span>
		</div>
		
		<div class="pagination" targetType="navTab" totalCount="${pageBean.totalRows}" 
		numPerPage="${pageBean.pageSize}" pageNumShown="${pageBean.pageSize}" 
		currentPage="${pageBean.currentPage}"></div>

	</div>
</div>

<script type="text/javascript">

  function uu(){
	  if($("#stu.subjectName").val() == ""){
		  alert("请输入科目名称进行检索");
		  $("#test tbody").html("");
		  return false;
	  }
	  
  }
  
  function delStu(id){
	  if(!confirm("确认要删除信息吗")){
		  return ;
	  }
	  alert("${ctx}/pages/delete.do");
	  $.ajax({ 
			async:false,
			type : "get",
			url :   "${ctx}/pages/subjectdelete.do",
			data : {"id":id},
			cache : false,
			contentType: "application/x-www-form-urlencoded; charset=UTF-8", 
			success : function(json) {
				navTab.reload();
			}
	   });
  }
</script>