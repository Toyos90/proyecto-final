<script>
export default{
  props: ['title', 'img', 'desc', 'link']
}

</script>

<template>
  <div class="box box-1">
    <div class="cover">
      <p class="box-title">{{ title }}</p>
      <img :src="img" :alt="title">
    </div>
    <button>
      <div></div>
    </button>
  </div>
</template>

<style scoped>

.box-title{
  text-align: center;
  color: rgba(0, 189, 126, 1);
  font-size: 1.5rem;
  opacity: 0;
}

img {
    height: 150px;
}

.box:hover img{
  border-radius: 10px;
  box-shadow: 0 0 20px rgba(0, 189, 126, 1);
}

.box:hover .box-title{
  animation: 1s showing linear infinite alternate;
  animation-iteration-count: 1;
  opacity: 1;
}

@keyframes showing{
  0% {
    opacity: 0;
  }
  100% {
    opacity: 100%;
  }
}

button {
    cursor: pointer;
    outline: 0;
    width: 180px;
    height: 48px;
    border-radius: 8px;
    background-color: #2C3138;
    margin-top: 40px;
    overflow: hidden;
    -webkit-transform: scale(.7);
            transform: scale(.7);
}

button::after {
    content: "";
    position: relative;
    top: -40px;
    display: block;
    width: 48px;
    height: 107%;
    background-color: #000;
    margin-top: -1px;
    margin-left: -7px;
    border-radius: 6px 0 0 6px;
    background-image: url('src/assets/img/info-circle-line.svg');
    background-repeat: no-repeat;
    background-position: center;
    background-size: 80%;
}

button::before {
    content: "";
    display: block;
    width: 48px;
    height: 46px;
    margin-left: -7px;
    margin-top: -1px;
    -webkit-transition: all 200ms cubic-bezier(0.25, 0.75, 0.5, 1.25);
    transition: all 200ms cubic-bezier(0.25, 0.75, 0.5, 1.25);
}

.box-1:hover button::before {
    width: 120%;
    opacity: .8;
    background-color: hsla(160, 100%, 37%, 1);
}

.box {
  margin-top: 20px;
    display: -webkit-box;
    display: -ms-flexbox;
    display: flex;
    -webkit-box-align: center;
        -ms-flex-align: center;
            align-items: center;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
        -ms-flex-direction: column;
            flex-direction: column;
    -webkit-transition: all .3s ease-out;
    transition: all .3s ease-out;
    will-change: transform;
}

.box:hover .cover {
    -webkit-transform: translateY(-14px) scale(1.10);
            transform: translateY(-14px) scale(1.10);
}

.box-1 button {
    border: 1px solid hsla(160, 100%, 37%, 1);
    color: #fff;
    font-size: 22px;
    text-align: right;
    padding-right: 20px;
    line-height: 40px;
}

.box-1 button::after {
    content: "";
    background-color: hsla(160, 100%, 37%, 1);
    top: -85px
}

.cover {
    -webkit-transition: all 400ms ease-in-out;
    transition: all 400ms ease-in-out;
    will-change: transform;
}

.cover img {
    -webkit-transition: all 260ms ease-in-out;
    transition: all 260ms ease-in-out;
}

.box-1 button div::before {
    content: 'website info';
    position: relative;
    top: -44px;
    left: 4px;
    color: hsla(160, 100%, 37%, 1);
    font-size: 21px;
    font-weight: 300;
}

.box-1:hover button div::before {
    color: #fff;
}
</style>