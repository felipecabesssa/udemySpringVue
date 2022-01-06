<template>
  <div class="principal">
    <div class="principal">
      <h1>Products</h1>
      <div v-for="dado in dados" :key="dado.id">
        <ul>
          <li>
            {{ dado.id }} - {{ dado.name }} - {{ dado.amount }} - {{ dado.price }}
          </li>
        </ul>
      </div>
      <hr>
      <div v-for="dado in dados" :key="dado.id" class="mt-4">
        <div v-if="dado.category.name == 'Papelaria'">{{ dado.name }}</div>
      </div>
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
  }
}
</script>

<style>

</style>