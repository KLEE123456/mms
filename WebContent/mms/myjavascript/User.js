// 用户管理
function UserManageclick(){
		if(access.indexOf("用户管理功能") < 0 ){
            $.messager.alert('警告','该用户没有此功能');
            event.stopPropagation();	
         }
    	if(!$('#output').tabs('exists','用户管理')) {
				     $('#output').tabs('add',{ 
				     	// id:'ECM',   
					    title:'用户管理',    
					      // fit:true,
					     href:'./tabs/User.html',
					    closable:true
					});
				 }
		else
		{
		$('#output').tabs('select', '用户管理');
		}
}
// 用户注销
function logOff(){
	$.get('../Login/LogOff');
	location.href="../login.html";
}