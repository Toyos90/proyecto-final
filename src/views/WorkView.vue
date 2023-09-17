<script>
import WorkObject from '@/components/WorkObject.vue'
import WorkDisplay from '@/components/WorkDisplay.vue'

export default {
  components: {
    WorkObject,
    WorkDisplay,
  },
  methods: {
    DisplayItem(id) {
      this.displays[0].title = this.works[id].title,
      this.displays[0].img = this.works[id].img,
      this.displays[0].desc = this.works[id].desc,
      this.displays[0].link = this.works[id].link;
    }
  },
  data() {
    return {
      works: [
        { 
          id: 0, 
          title: 'title: 1', 
          img: 'https://i0.wp.com/boingboing.net/wp-content/uploads/2016/03/OLD.jpg', 
          desc: 'description 1: Short description of the website : Lorem ipsum dolor sit amet consectetur adipisicing elit. In ex quaerat animi, deleniti sequi labore corporis ut quidem et neque minima vel magni incidunt cupiditate sint nesciunt doloremque. Iste, sunt!',
          link:'#',
        },
        {
          id: 1, 
          title: 'title: 2', 
          img: 'https://i0.wp.com/boingboing.net/wp-content/uploads/2016/03/OLD.jpg', 
          desc: 'description 2: Short description of the website : Lorem ipsum dolor sit amet consectetur adipisicing elit. In ex quaerat animi, deleniti sequi labore corporis ut quidem et neque minima vel magni incidunt cupiditate sint nesciunt doloremque. Iste, sunt!',
          link:'#',
        },
        { 
          id: 2, 
          title: 'title: 3', 
          img: 'https://i0.wp.com/boingboing.net/wp-content/uploads/2016/03/OLD.jpg', 
          desc: 'description 3: Short description of the website : Lorem ipsum dolor sit amet consectetur adipisicing elit. In ex quaerat animi, deleniti sequi labore corporis ut quidem et neque minima vel magni incidunt cupiditate sint nesciunt doloremque. Iste, sunt!',
          link:'#',
        },
        { 
          id: 3, 
          title: 'title: 4', 
          img: 'https://i0.wp.com/boingboing.net/wp-content/uploads/2016/03/OLD.jpg', 
          desc: 'description 4: Short description of the website : Lorem ipsum dolor sit amet consectetur adipisicing elit. In ex quaerat animi, deleniti sequi labore corporis ut quidem et neque minima vel magni incidunt cupiditate sint nesciunt doloremque. Iste, sunt!',
          link:'#',
        },
        { 
          id: 4, 
          title: 'title: 5', 
          img: 'https://i0.wp.com/boingboing.net/wp-content/uploads/2016/03/OLD.jpg', 
          desc: 'description 5: Short description of the website : Lorem ipsum dolor sit amet consectetur adipisicing elit. In ex quaerat animi, deleniti sequi labore corporis ut quidem et neque minima vel magni incidunt cupiditate sint nesciunt doloremque. Iste, sunt!',
          link:'#',
        },
        { 
          id: 5, 
          title: 'title: 6', 
          img: 'https://i0.wp.com/boingboing.net/wp-content/uploads/2016/03/OLD.jpg', 
          desc: 'description 6: Short description of the website : Lorem ipsum dolor sit amet consectetur adipisicing elit. In ex quaerat animi, deleniti sequi labore corporis ut quidem et neque minima vel magni incidunt cupiditate sint nesciunt doloremque. Iste, sunt!',
          link:'#',
        },
      ],
      displays: [
        {
        id: 0,
        title: 'Choose a project',
        img: '',
        desc: 'Click on a project to display it here',
        link:'none',
        }
      ]
    }
  }
}
</script>

<template>
  <h1>Some creations</h1>
  <section class="work-section">
    <WorkDisplay class="work-display"
      v-for="display in displays"
      :key="display.id"
      :title="display.title"
      :img="display.img"
      :desc="display.desc"
      :link="display.link"
    />

    <div class="work-nav">
      <div class="work-object" 
        v-for="work in works"
        :key="work.id"
        @click="DisplayItem(work.id)"
      >
      <WorkObject
        :title="work.title"
        :img="work.img"
        :desc="work.desc"
        :link="work.link"
      />
      </div>
    </div>  
  </section>
</template>

<style scoped>
.work-section{
  width: 100%;
  overflow: hidden;
  display: flex;
  flex-direction: column-reverse;
}

.work-nav{
  display: flex;
  width: 90%;
  margin: 0 5% 20px;
  overflow-x: auto;
  overflow-y: hidden;

}

/* chrome */
.work-nav::-webkit-scrollbar{
  background-color: hsla(160, 100%, 37%, 0.5);
  height: 5px;
}
.work-nav::-webkit-scrollbar-thumb{
  background: hsla(160, 100%, 37%, 1);
  border-radius: 5px;
}

.work-object{
  margin: 30px;
  cursor: pointer;
}

</style>
