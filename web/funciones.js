/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $("#mas").click(function(){
        aniadir();});
    $("#menos").click(function(){
        eliminar();
    $("#print").click(function(){
        window.print();
        
    });
    });
    $("#gastos_envio").change(function(){
        mostrarEnvio();
    });
});

function aniadir(){
    var max=6;
    var nombre_id;
    var datos = document.getElementById("datos");
    var dato = document.createElement("div");
    var campos = document.createElement("span");
 var count = calculaId();
        for (i=1;i<=max;i++){
        var input = document.createElement("input");
        switch (i){
            case 1:
                nombre_id="cant"+count;
                break;
            case 2:
                nombre_id="art"+count;
                break;
            case 3:
                nombre_id="uso"+count;
                break;
            case 4:
                nombre_id="asig"+count;
                break;
            case 5:
                nombre_id="coste"+count;
                break;
            case 6:
                nombre_id="total"+count;
                break;    
        }
        input.setAttribute("id", nombre_id);
	campos.appendChild(input);
        
           }
           datos.appendChild(dato);
           dato.appendChild(campos);
        }
function calculaId(){
    var id  = document.getElementsByTagName("span");
    var count = id.length+1;
    return count;
}

function eliminar(){
    $("span:last").remove();
}
function  mostrarEnvio(){
    if(document.getElementById("gastos_envio").checked==true){
    var input = document.createElement("input");
    input.id="cuadro_gastos";
    $("#envio").append(input);
    }
    else{
        $("#envio input:last").remove();
    }
}
