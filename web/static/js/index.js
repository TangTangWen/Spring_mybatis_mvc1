$(function () {
    // 后台请求菜单数据
    loadMenu();


})

// 封装菜单项
function loadMenu() {
    // 请求后台 访问数据库  返回菜单的json
    var menustr="";
    $.get("menu_findMenu", function (data) {

         menustr = ' <li> <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> ' + data.menuname + '<span class=\"fa arrow\"></span></a>';

        menustr=  saxMenue(menustr,data);
        menustr += "</li>"
        // 将拼接的菜单添加到菜单位置
        $("#side-menu").append(menustr);
        // 加载菜单栏
        $('#side-menu').metisMenu();
    }, "json")
}

function saxMenue(menustr, data) {
    if(data.items.length>0){

        $.each(data.items,function(i,e){
            menustr+=' <ul class="nav .nav-stacked"><li><a href="'+e.url+'" target="show">'+
                '<i class="fa '+e.icon+' fa-fw"></i>'+e.menuname;

            if(e.items.length>0){

                menustr+= '<span class="fa arrow"></span>'
            }
            menustr +='</a>'
            // 递归调用
            menustr=	 saxMenue(menustr,e)

            menustr +='</li></ul>'
        })
    }

    return  menustr;

}

