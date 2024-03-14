import {createRouter, createWebHashHistory} from 'vue-router'
import MoviesView from '@/views/MoviesView.vue'
import TicketsView from "@/views/TicketsView.vue";

const routes = [{
    path: '/',
    name: 'home',
    component: MoviesView
},
    {
        path: '/tickets/:id',
        name: 'tickets',
        component: TicketsView // Added route for the tickets page
    },

]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})

export default router