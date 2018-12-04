var convertidorModule = (function (){

    var errorMessage = function(){
        alert("Algo ha fallado en la aplicaicon, pedimos disculpas por lo ocurrido");
    };

    return{
           getGradoNuevo : async function () {
               await Promise.resolve(axios.get('/Temperatura/' + document.getElementById("numero").value + '/' + document.getElementById("inicial").value + '/' + document.getElementById("final").value))
               .then(function (response){
                     document.getElementById("Resultado").innerHTML = JSON.stringify(response.data);
               })
               .catch(function(){
                    errorMessage();
               })

           }
    }


})();