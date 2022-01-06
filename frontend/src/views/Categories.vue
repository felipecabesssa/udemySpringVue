<template>
  <div>
    <div class="categories">
      <h1>Categories</h1>
      <!-- <div v-for="dado in dados" :key="dado.id"> -->
      <div class="list">
        {{ categories }}
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      categories: {},
    };
  },
  methods: {
    getCategories() {
      axios.get("http://localhost:8081/categories").then((resp) => {
        this.categories = resp.data;
      });
    },
  },
  created() {
    this.getCategories();
  },
};
</script>

<style>
</style>