<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>API URL is {{ apiUrl }}</h2>
    <button @click="triggerDate"> Show Date </button>
    <p> {{ dateText }}</p>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      dateText: ''
    }
  },
  props: {
    msg: String,
    apiUrl: String,
    todayDate: Object/Date/Array/String
  },
  methods: {
    triggerDate () {
      this.dateText = this.todayDate
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
