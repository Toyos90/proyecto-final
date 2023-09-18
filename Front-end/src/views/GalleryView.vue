<script setup>
import dataService from '../services/dataService' 
import { ref, onMounted } from 'vue'

const portfolio = ref(null) 

async function fetchPortfolio() {
  portfolio.value = await dataService.getPortfolio() 
}

onMounted(fetchPortfolio)

console.log(portfolio)
</script>
<template>
  <div>
    <h1>Portfolio</h1>
    <div v-if="portfolio">
      <ul>
        <li v-for="item in portfolio.data" :key="item.id">
          <img :src="item.imgUrl" />
          <h2>{{ item.title }}</h2>
          <p>{{ item.description }}</p>
          <a :href="item.url" target="_blank" class="link">Git</a>

        </li>
      </ul>
    </div>
  </div>
</template>
<style scoped>
body {
  font-family: sans-serif;
}

h1 {
  text-align: center;
  font-size: 2em;
}

ul {
  list-style: none;
  padding: 0;
}

li {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px;
}

img {
  width: 200px;
  height: 200px;
  margin-right: 10px;
}

h2 {
  font-size: 1.5em;
}

p {
  font-size: 1em;
}

a {
  color: #000;
  text-decoration: none;
}

a:hover {
  color: #f00;
}

</style>



