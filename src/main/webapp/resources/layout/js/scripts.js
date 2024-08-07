/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function mostrarAlerta(){
    alert("alertaaaaa");
}
function imprimirMensaje(){
    console.log("Holaaaa");
}
function alerta2(){
    console.log("alerta2")
}

function ajustarDialogo(){
        var iframe = document.querySelector("#dialogVideo iframe");
        if (iframe){
            var width = iframe.offsetWidth;
            var dialog = PF('mostrarVideo').jq;
            dialog.css('widht', width + 'px');
        }
}