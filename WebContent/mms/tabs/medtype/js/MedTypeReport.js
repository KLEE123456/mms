// 浏览药品类别信息begin
function RMTMclick(){
    if(access.indexOf("数据报表功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','药品类别数据报表')) {
        $('#output').tabs('add',{
            title:'药品类别数据报表',
            href:'./tabs/medtype/Report.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '药品类别数据报表');
    }
}

// 浏览药品类别信息end