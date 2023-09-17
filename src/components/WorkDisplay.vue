<script>
export default{
  props: ['title', 'img', 'desc', 'link']
}
</script>

<template>
  <div>
    <div class="work-display-text">
      <h2 class="work-display-title">{{ title }}</h2>
      <p class="work-display-desc">{{ desc }}</p>
      <a v-show="link != 'none' " class="work-display-link" :href="link">link to site</a>
    </div>
    <img class="work-display-image" :src="img" alt="">
  </div>
</template>

<style scoped>

.work-display{
  width: 90%;
  margin: 0 5% 20px;
  display: flex;
  flex-direction: column-reverse;
  justify-content: center;
}

.work-display-image{
  max-width: 100%;
  max-height: 100%;
}

.work-display-text{
  width: 100%;
  padding: 20px;
  text-align: center;
}

.work-display-title{
  font-size: 2rem;
  margin-bottom: 20px;
}

.work-display-desc{
  text-align: justify;
  margin-bottom: 20px;
}


</style>