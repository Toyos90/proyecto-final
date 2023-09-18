<template>
  <h1>About Me</h1>
  <section class="about-section">    
    <div class="about-group">
      <div class="about-image">
        <img src="https://previews.123rf.com/images/apoev/apoev2107/apoev210700033/171405527-default-avatar-photo-placeholder-gray-profile-picture-icon-business-man-illustration.jpg" alt="">
      </div>
      <div class="about-text">
        <p>
          Lorem, ipsum dolor sit amet consectetur adipisicing elit. Saepe,
          velit odio? Fugiat ratione voluptatem, blanditiis itaque
          doloremque animi cupiditate assumenda, ad expedita vitae,
          reiciendis minima at nisi non eum cumque.
        </p>
        <br>
        <p>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi
          aspernatur earum beatae at aperiam non molestias nam mollitia
          delectus corrupti itaque tempore ut facilis quidem dolor, iusto
          impedit consequatur! Similique?
        </p>
        <br>
        <p>
          Lorem ipsum, dolor sit amet consectetur adipisicing elit. Quod,
          animi possimus provident quo doloremque aspernatur enim hic
          neque aperiam tempora molestiae vel tempore harum voluptatibus
          voluptatem molestias itaque voluptas alias?
        </p>
      </div>
    </div>
  </section>
</template>

<style scoped>

.about-image{
  animation: 1s slideIn linear infinite alternate;
  animation-iteration-count: 1;
}

.about-text{
  animation: 1s revealText linear infinite alternate;
  animation-iteration-count: 1;
}

@keyframes slideIn{
  0% {
    left: -25%;
  }
  100% {
    left: 0;
  }
}

@keyframes revealText{
  0% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.about-group{
  display: flex;
  align-items: center;
  justify-content: center;
  width: 90%;
  margin: 5%;
}

.about-image{
  width: 50%;
}

img{
  width: 100%;
  border-radius: 20px;
  box-shadow: 0 0 20px rgba(0, 189, 126, 1);
}

.about-text{
  margin-left: 5%;
  max-width: 45%;
  text-align: justify;
}

</style>
