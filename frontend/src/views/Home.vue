<template>
  <div class="home">
    <img src="../assets/fundo.jpg" alt="imagem em construção" />
    <div class="items">
      <div class="card text-white bg-danger mb-3" style="max-width: 80%">
        <div class="card-header">Categorias</div>
        <div class="card-body">
          <h5 class="card-title">Categories</h5>
          <p class="card-text">
            Os diversos tipos de produtos são divididos em categorias específicas.
          </p>
        </div>
      </div>
      <div class="card text-white bg-dark mb-3" style="max-width: 80%">
        <div class="card-header">Produtos</div>
        <div class="card-body">
          <h5 class="card-title">Products</h5>
          <p class="card-text">
            Você pode acrescentar no tipo de produto, ou acrescentar, atualizar e deletar produto já existente.
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  name: "Home",
  components: {},
};
</script>
<style lang="scss" scoped>
.home{
  display: flex;
  justify-content: space-around;
  img{
    max-width: 49%;
    height: 395px;
    margin-right: 15px;
    margin-left: 15px;
  }
  .itens{
    max-width: 50%;
  }
}

</style>