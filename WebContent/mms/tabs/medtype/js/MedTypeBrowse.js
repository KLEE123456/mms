// 浏览药品类别信息begin
function BMTMclick(){
    if(access.indexOf("信息浏览功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','浏览药品类别信息')) {
        $('#output').tabs('add',{
            title:'浏览药品类别信息',
            href:'./tabs/medtype/Browse.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '浏览药品类别信息');
    }
}

// 浏览药品类别信息end