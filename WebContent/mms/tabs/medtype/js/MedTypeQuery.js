// 信息查询begin
//查询药品类别信息begin
function SMTMclick() {
	if(access.indexOf("信息查询功能") < 0 ){
		$.messager.alert('警告','该用户没有此功能');
		event.stopPropagation();
	}
	if (!$('#output').tabs('exists', '查询药品类别信息')) {
		$('#output').tabs('add', {
			// id:'SMM',
			title: '查询药品类别信息',
			href: './tabs/medtype/Search.html',
			closable: true
		});
	}
	else
	{
		$('#output').tabs('select', '查询药品类别信息');
	}
}
//查询药品类别信息end

// 信息查询end