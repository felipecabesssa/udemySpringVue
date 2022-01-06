<template>
  <div class="principal">
    <div class="principal">
      <h1>Products</h1>
      <div>
        <ul>
          <li>
            <div class="dados" id="id"><strong>Id</strong></div>
            <div class="dados" id="descricao"><strong>Nome do Produto</strong></div>
            <div class="dados" id="amount"><strong>Qtd</strong></div>
            <div class="dados" id="price"><strong>Preço</strong></div>
          </li>
        </ul>
      </div>
      <div v-for="dado in dados" :key="dado.id">
        <ul>
          <li>
            <div class="dados" id="id">{{ dado.id }}</div>
            <div class="dados" id="name">{{ dado.name }}</div>
            <div class="dados" id="amount">{{ dado.amount }}</div>
            <div class="dados" id="price">{{ dinheiro(dado.price) }}</div>
          </li>
        </ul>
      </div>
      <hr>
      
    </div>
  </div>
</template>

<script>
import dados from '../data/data.json'
export default {
  data(){
    return{
      dados:dados
    }
  },
  methods:{

    dinheiro(valor){
      return 'R$' + valor.toFixed(2)
    }

  }
}
</script>

<style lang="scss" scoped>
  .principal{
    padding: 1%;
    padding-top: 0.1%;
    ul{
      list-style: none;
      li{
        display: flex;
        justify-content: space-around;
        border: solid 1px rgb(39, 39, 39);
        padding: 1%;
      }
      .dados{
        padding: 0.7%;
        border-right: solid 1px rgb(39, 39, 39);
        border-left: solid 1px rgb(39, 39, 39);
      }
      #id{
        min-width: 10%;
      }

      #name{
        min-width: 35%;
        color: rgb(209, 0, 0);
      }

      #descricao{
        min-width: 35%;
      }

      #amount{
        min-width: 8%;
      }

      #price{
        min-width: 18%;
      }
    }
  }
</style>