import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import {store} from './store' //vuex
import {MotionPlugin} from '@vueuse/motion' //Vue 轻量级手势方向指令。
import ElementPlus from 'element-plus' //ElementUI对vue3的支持
import 'element-plus/dist/index.css'

const app = createApp(App)
app.use(router)
    .use(store)
    .use(ElementPlus)
    .use(MotionPlugin)
    .mount('#app')
