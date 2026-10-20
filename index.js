import express from 'express'

const app = express()

//request e response, requisisao e resposta
//get é o metodo 
//cannot get é pq nao digitou certo no navegador
app.get("/api", (req, res) => {

    const num1 = Number(req.query.num1)
    const num2 = Number(req.query.num2)

    res.send({ soma: num1 + num2 })

    app.get("/api/sub/:num1/:num2", (req, res) => {


        const num1 = Number(req.params.num1)
        const num2 = Number(req.params.num2)

        res.send({ soma: num1 - num2 })

    })


//http://localhost:3000/api?num1=10&num2=20 para acessar na caralhha do navegador 
//3000 é o numero da api para localizar no navegador 
app.listen(3000, () => { })


