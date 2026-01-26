document.addEventListener("DOMContentLoaded",() => {
    let player = localStorage.getItem('userName');
    
    function carregarNamePlayer(){
        let nameContent = document.querySelector("#name-content");
        nameContent.innerHTML += `<h2>Bem-vindo, ${player}</h2>`;
    }
    
    carregarNamePlayer();
})





