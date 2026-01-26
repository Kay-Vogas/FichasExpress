let btnLogin = document.querySelector("#btn-login");
let centralContainer = document.querySelector(".central-container")


const API_URL = "http://localhost:8080/auth/login";

btnLogin.addEventListener("click", authUser);

centralContainer.addEventListener("keydown", (event) => {
    if (event.key === "Enter") {
        authUser();
    }
});

async function authUser(){
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    if (!email || !password) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    const userAuth={
        email: email,
        password: password
    }

    try{    
        const response = await fetch(API_URL , {
            method:"POST",
            headers: { 'Content-Type': 'application/json' },
            body:JSON.stringify(userAuth)
        });        

        
        if(response.ok){

            const data = await response.json(); 

            // Agora sim, acessamos as propriedades do JSON (data.id, data.player)
            localStorage.setItem('userId', data.id);
            localStorage.setItem('userName', data.player);
            
            window.location.href = `/view/mesas.html`;

        }else {
            alert("Usuário ou senha inválidosa.");
        }

    }catch(error){
        console.error("Erro detalhado:", error);
        alert("Erro ao conectar com o servidor. Verifique o console.");
    }
}

 