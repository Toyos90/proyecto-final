<script>

import emailjs from '@emailjs/browser';

export default {
  data() {
    return {
      name: '',
      contact: '',
      purpose: '',
      message: '',
    }
  },
  methods: {
    sendEmail() {
      emailjs.sendForm('service_c283uon', 'template_y2tl2tt', this.$refs.form, 'te7xTOi0jRea5U95N')
        .then((result) => {
            console.log('SUCCESS!', result.text);
        }, (error) => {
            console.log('FAILED...', error.text);
        });
    }
  }
}
</script>

<template>
  <h1>Contact Me</h1>
  <section class="contact-section">
    <img src="" alt="logo">
    <form ref="form" @submit.prevent="sendEmail">
      <div class="input-group">
        <label for="name">Name / Designation</label>
        <input name="name" v-model="name" placeholder="Who are you ?">
        <p>
          {{name}}
        </p>
      </div>
      <div class="input-group">
        <label for="contact">Contact Information</label>
        <input name="contact" v-model="contact" placeholder="How to contact you back ?">
        <p>
          {{contact}}
        </p>
      </div>
      <div class="input-group">
        <label for="purpose">Message Purpose</label>
        <select name="purpose" v-model="purpose">
          <option disabled value=""> What is the purpose of your message ?</option>
          <option>Business opportunity</option>
          <option>Recruitment proposal</option>
          <option>Other purposes</option>
        </select>
        <p>
          {{purpose}}
        </p>
      </div>
      <div class="input-group">
        <label for="message">Message Content</label>
        <textarea name="message" v-model="message" placeholder="What is your message for me ?"></textarea>
        <p>
          {{message}}
        </p>
      </div>
      <input class="form-submit" type="submit" value="Send">
    </form>
  </section>
</template>

<style scoped>

.contact-section{
  display: flex;
  justify-content: center;
  align-items: center;
}

.contact-section img{
  max-width: 40%;
  min-width: 200px;
}

.contact-section form{
  display: flex;
  flex-direction: column;
  text-align: center;
  width: 90%;
  margin: 0 5%;
  max-width: 500px;
}

.input-group{
  display: flex;
  flex-direction: column;
  margin: 20px 0;
}

.input-group label{
  padding: 10px 0;
  font-size: 1.5rem;
  color: rgba(0, 189, 126, 1);
}

.input-group input, select, textarea {
  min-height: 30px;
  border-radius: 10px;
  resize: vertical;
}

.form-submit {
  color: rgba(0, 189, 126, 1);
  font-size: 1.5rem;
  font-weight: bold;
  border-radius: 10px;
  border: solid 3px rgba(0, 189, 126, 1);
  width: 100px;
  margin: 0 calc(50% - 50px);
  cursor: pointer;
}

.form-submit:hover {
  background-color: transparent;
  box-shadow: 0 0 20px rgba(0, 189, 126, 1);
}

@media (max-width: 992px) {
  .contact-section {
    flex-direction: column;
  }
}

</style>
