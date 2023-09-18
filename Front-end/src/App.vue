<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <nav>
      <RouterLink to="/">Home</RouterLink>
      <RouterLink to="/about">About</RouterLink>
      <RouterLink to="/skills">Skills</RouterLink>
      <RouterLink to="/Gallery">Work</RouterLink>
      <RouterLink to="/contact">Contact</RouterLink>
    </nav>
  </header>

  <RouterView />
</template>

<style>
@import '@/assets/base.css';

a,
.green {
  text-decoration: none;
  color: hsla(160, 100%, 37%, 1);
  transition: 0.4s;
}

@media (hover: hover) {
  a:hover {
    background-color: hsla(160, 100%, 37%, 0.2);
  }
}

nav{
  display: flex;
  justify-content: space-evenly;
}

nav a.router-link-exact-active {
  color: var(--color-text);
  text-decoration: underline;
  text-underline-offset: 10px;
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
  text-align: center;
  width: 20%;
  font-size: 1.5rem;
}

nav a:first-of-type {
  border: 0;
}

h1{
  margin: 5% 10%;
  font-size: 3rem;
  color: hsla(160, 100%, 37%, 1);
  text-decoration: underline;
  text-underline-offset: 10px;
}

</style>
