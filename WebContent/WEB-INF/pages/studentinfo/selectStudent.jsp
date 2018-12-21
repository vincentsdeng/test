<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/content/public/dhead.jsp" %>
<div id="jbsxBoxStudentList" class="unitBox">
<div class="pageHeader">
	<form rel="pagerForm" id="pagerForm" onsubmit="return divSearch(this,'jbsxBoxStudentList');" action="${ctx}/pages/findStudent.do" method="post">
	<input type="hidden" name="pageNum" value="1" /> 
	<div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>姓名：</label>
				<input id="stuName" type="text" name="stuName" value=""/>
			</li>
			<li><input type="submit" onclick="return uu();" value="检索"></li>
		</ul>	
	</div>
	</form>
	<div class="panelBar">
		<ul class="toolBar">
			<li class=""><a class="add" href="${ctx}/pages/studentinfo/addStu.do?pageNum=${pageBean.currentPage}" target="dialog" mask="true" title="新增学生"><span>添加</span></a></li>
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
			<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>联系方式</th>
				<th>学历</th>
				<th>专业</th>
				<th>毕业院校</th>
				<th>家庭住址</th>
				<th>工作经验</th>
				<th>参加实训时间</th>
				<th>所属项目组</th>
				<th>迟到次数</th>
				<th>修改时间</th>
				<th>创建时间</th>
				<th>编辑</th>
				<th>删除</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${stuList }" var="stu">
			  <tr>
			  <c:if test="stu.stuName==">
				  	<td>${stu.stuId }</td>
					<td>${stu.stuName }</td>
				    <td>
					    <%-- <c:choose>
						    <c:when test="${stu.stuSex == 1 }">
						    	男
						    </c:when>
						    <c:when test="${stu.stuSex == 2}">
						    	女
						    </c:when>
					    </c:choose> --%>
					    ${stu.stuSex }
				    </td>
				    <td>${stu.stuAge }</td>
				    <td>${stu.stuTel }</td>
					<td>${stu.stuEdu }</td>
					<td>${stu.stuMaior }</td>
					<td>${stu.stuGraduate }</td>
					<td>${stu.stuAddress }</td>
					<td>${stu.stuExpe }</td>
					<td>${stu.stuTrainTime }</td>
					<td>${stu.stuProjectNo }</td>
					<td>${stu.lateCount }</td>
					<td>${stu.updateTime }</td>
					<td>${stu.creteTime }</td>
			 	</c:if>
			    <td>
			    	<a  class="common-img"
					    href="${ctx}/student/toUpdateStuPage.do?id=${stu.stuId }&pageNum=${pageBean.currentPage}" 
					    target="dialog" mask="true" title="修改${stu.stuName }信息">
					   	<img alt="修改" src="${ctx}\images\edit.png">
					</a>
			    </td>
			    <td><a onclick="delStu('${stu.stuId }')" class="f1">删除</a></td>
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
	  if($("#stuName").val() == ""){
		  alert("请输入姓名进行检索");
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
