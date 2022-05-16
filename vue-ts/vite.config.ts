import {defineConfig} from 'vite'
import vue from '@vitejs/plugin-vue'
import {resolve} from "path";
//vite svg组件化支持插件
import svgLoader from 'vite-svg-loader'

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [vue(), svgLoader()],
    //配置服务
    server: {
        //network配置
        // host: '127.0.0.1',
        open: true,
        host: '0.0.0.0',
        port: 8082,
        //跨域配置
        proxy: {                 //设置代理
            '/api': {              //设置拦截器  拦截器格式   斜杠+拦截器名字，名字可以自己定
                target: 'http://localhost:8080',     //代理的目标地址
                changeOrigin: true,          //设置是否同源
                rewrite: //路径重写
                    path => path.replace(/^\/api/, '')//选择忽略拦截器里面的内容
            }
        }
    },
    //vite配置别名
    resolve: {
        alias: [
            {
                find: '@',
                replacement: resolve(__dirname, 'src')
            }
        ]
    },
})
