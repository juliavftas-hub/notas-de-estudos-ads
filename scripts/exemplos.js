// ctrl + ; automaticamente comenta a linha selecionada
// console.log("batata") - um aparece só no console
// alert("frita") - um aparece na tela para o usuário
// prompt("123") - um aparece na tela e pede algo para o usuário

// const variavel que nao muda
// let variavel que pode ter o valor alterado
// var não usar de jeito nenhum

// getElementById pega um elemento id e salva na variavel vai no dom e pega o id do elemento
//crate element só cria o java script um elemento novo

const footer = document.getElementById("rodape")
footer.style.backgroundColor = "red" // altera a cor do rodape


const h2Criado = document.createElement("h2") // 
h2Criado.textContent = "criando um h2 no footer"
footer.appendChild(h2Criado) //pra colocar o h2 dentro do footer serve pra por oq criou na tela


h2Criado.addEventListener("click", ()=> {
    alert("funcionou")

})

const forms = document.getElementById("formulario")
forms.addEventListener("submit", (event) => {
    //event.preventDefault()
    alert("não enviou nada")
})

footer.addEventListener("mouseover", () => {
    alert("oi 123")
})

