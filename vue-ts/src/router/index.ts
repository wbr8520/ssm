import {createRouter, createWebHashHistory, RouteRecordRaw} from "vue-router";

import Login from '@/views/Login.vue'
import Home from '@/views/Home.vue'
import Register from '@/views/Register.vue'

const routes: Array<RouteRecordRaw> = [
    {
        path: "/",
        name: "Login",
        component: Login
    },
    {
        path: "/Register",
        name: "Register",
        component: Register
    },
    {
        path: "/Home",
        name: "Home",
        component: Home
    }
]
const router = createRouter({
    history: createWebHashHistory(),
    routes: routes
})
export default router