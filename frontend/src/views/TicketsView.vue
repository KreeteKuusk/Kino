<template>
  <div class="header">
    <button id="back" @click="goBack()">Go back</button>
    <h1>Buy tickets</h1>
  </div>
  <!-- If the movie is available (fetched) then display ticket buying info and pass movie object -->
  <Ticket v-if="movie" :movie="movie"/>
</template>

<script>
import Ticket from "@/components/TicketItem.vue";
import axios from 'axios';

export default {
  name: "TicketsView",
  components: {
    Ticket
  },

  data() {
    return {
      movie: null
    };
  },

  methods: {
    fetchMovie() {
      const id = this.$route.params.id;
      axios.get(`http://localhost:8080/api/movies/${id}`)
          .then(response => {
            this.movie = response.data;
          })
          .catch(error => {
            console.error(error);
          });
    },

    goBack(){
      this.$router.push("/");
    }

  },

  mounted() {
    this.fetchMovie();
  },
}
</script>

<style scoped>
.header{
  display: flex;
}

#back {
  align-self: center;
  border: none;
  border-radius: 20px;
  width: 100px;
  padding: 10px;
  background: #98C1D9;
}

#back:hover {
  color: #293241;
  background: #E0FBFC;
  cursor: pointer;
}

h1 {
  display: flex;
  justify-content: center;
  padding: 20px;
  margin: auto auto 20px;
  width: 50%;
  font-family: Broadway, serif;
  color: #E0FBFC;
  background-color: #3D5A80;
  border-radius: 10px;
}

</style>
