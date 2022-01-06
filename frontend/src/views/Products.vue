<template>
  <div class="principal">
    <div class="principal">
      <h1>Products</h1>
      <div>
        {{dados}}
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