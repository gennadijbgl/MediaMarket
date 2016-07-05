/**
 * Created by Hienadz on 05.07.16.
 */
///<reference path="../lib/jquery.d.ts" />;



class MenuSetter {
    init(){

        var s:string = "\"a[href='"+($(location).attr('pathname'))+"']\"";
        $( "li" ).removeClass( "active" );

        $(s).closest("li.dropdown").addClass("active");
    }
}
var greeter = new MenuSetter();

$( document ).ready(()=>greeter.init());

document.onload = ()=> greeter.init();
