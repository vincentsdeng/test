<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/content/public/dhead.jsp" %>

<div id="jbsxBoxExamList" class="unitBox">
<div class="pageHeader">
	<form rel="pagerForm" id="pagerForm" onsubmit="return divSearch(this,'jbsxBoxExamList');" action="${ctx}/pages/exam.do" method="post">
	<input type="hidden" name="pageNum" value="1" /> 
	<div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>考试描述 ：</label>
				<input id="examName" type="text" name="examinfo.examName" value=""/>
			</li>
			<li><input type="submit" onclick="return uu();" value="检索"></li>
		</ul>	
	</div>
	</form>
	<div class="panelBar">
		<ul class="toolBar">
			<li class=""><a class="add" href="${ctx}/pages/examinfo/examAdd.do?pageNum=${pageBean.currentPage}" target="dialog" mask="true" title="新增考试"><span>添加</span></a></li>
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
	<table id="test" class="form" width="100%" layoutH="90" targetType="navTab">
		<thead>
			<tr>
				<th>考核编号</th>
				<th>考核描述</th>
				<th>考题编号</th>
				<th>考题标题</th>
				<th>子考题编号</th>
				<th>子考题标题</th>
				<th>子考题内容</th>
				<th>子考题分数</th>
				<th>子考题答案</th>
				<th>修改时间</th>
				<th>创建时间</th>
				<th>编辑</th>
				<th>删除</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${examList }" var="exam">
			  <tr>
			    <td>${exam.examId }</td>
				<td>${exam.examName }</td>
			    <td>
				    <%-- <c:choose>
					    <c:when test="${stu.stuSex == 1 }">
					    	男
					    </c:when>
					    <c:when test="${stu.stuSex == 2}">
					    	女
					    </c:when>
				    </c:choose> --%>
				    ${exam.examNo }</td>
			    <td>${exam.examTitle }</td>
			    <td>${exam.subExamNo }</td>
				<td>${exam.subExamTitle }</td>
				<td>${exam.subExamContent }</td>
				<td>${exam.subExamScore }</td>
				<td>${exam.subExamAnwser }</td>
				<td>${exam.updateTime }</td>
				<td>${exam.creteTime }</td>
			    <td>
			    	<a  class="common-img"
					    href="${ctx}/exam/toUpdateExamPage.do?id=${exam.examId }&pageNum=${pageBean.currentPage}" 
					    target="dialog" mask="true" title="修改${exam.examName }信息">
					   	<img alt="修改" src="${ctx}\images\edit.png">
					</a>
			    </td>
			    <td><a onclick="delExam('${exam.examId }')" class="f1">删除</a></td>
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
	  alert(1);
	  if($("#examName").val() == ""){
		  alert("请输入考核编号进行检索");
		  $("#test tbody").html("");
		  return false;
	  }
	  
  }
  
  function delExam(id){
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
