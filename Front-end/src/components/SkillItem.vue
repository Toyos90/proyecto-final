<script>
export default{
  props: ['boundclass','name', 'icon', 'text']
}
</script>

<template>
  <div class="skill-pair">
    <div v-html="icon" class="skill-image">
      
    </div>
    <p :class="boundclass">
      {{ text }}
    </p>
  </div>  
</template>

<style scoped>

</style>