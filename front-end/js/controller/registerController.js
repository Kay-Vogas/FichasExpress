const API_URL = "http://localhost:8080/user/cadastro";

let btnRegister = document.getElementById("btn-register"); 

btnRegister.addEventListener("click",async () =>{

    const player = document.getElementById("player").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    if(confirmPassword!=password){
        alert("As senhas não são iguais!");
        return;
    }

    const userData = {
        player: player,
        email: email,
        password: password
    };

    try{
        
        const response = await fetch(API_URL , {
            method: "POST",
            headers: { 'Content-Type': 'application/json' } ,
            body: JSON.stringify(userData)
        } );

        if(response.status === 201 || response.ok){
            alert("Conta criada com sucesso! Faça login.");
            window.location.href = "/index.html";
        }else{
            alert ("Erro ao cadastrar!");
        }

    }catch(error){
        console.error("Erro ao registar:",error);
    }

})

