import {createRouter, createWebHashHistory} from 'vue-router'
import MoviesView from '../views/MoviesView.vue'

const routes = [{
    path: '/',
    name: 'home',
    component: MoviesView
},

]

const router = createRouter({
    history: createWebHashHistory(),
    routes
})

export default router