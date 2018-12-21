<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/content/public/dhead.jsp" %>
<div id="jbsxBoxUserList" class="unitBox">
<div class="pageHeader">
	<form rel="pagerForm" id="pagerForm" onsubmit="return divSearch(this,'jbsxBoxUserList');" action="${ctx}/content/user/userList.do" method="post">
	<input type="hidden" name="pageNum" value="1" /> 
	<div class="searchBar">
		<ul class="searchContent">
			<li>
				<label>姓名：</label>
				<input type="text" name="name" value=""/>
			</li>
			<li><input type="submit" value="检索"></li>
		</ul>		
	</div>
	</form>
</div>

<div class="pageContent">  

	<div id="w_list_print">
	<table class="form" width="100%" layoutH="90" targetType="navTab">
		<thead>
			<tr>
				<th>#</th>
				<th>姓名</th>
				<th>职务</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList }" var="user">
			  <tr>
			    <td>${user.id }</td>
			     <td>${user.name }</td>
			      <td>${user.post }</td>
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

  function changeInnerUserStatus(userId, status, obj){
	  alertMsg.confirm("确认修改状态吗？", {
          okCall: function(){
        	  var showid = userId+"changeInnerStatusDiv"+status;
    		  $("#"+showid).show();
    		  $(obj).parent().hide();
    		  var param = {"userInfo.innerUserId":userId,"userInfo.status":status};
    		  var url = "${ctx}/core/userManager.editUser.do";
    		  $.post(url,param,function(data){
    				
    		  });          
          }
    });
  }
</script>
