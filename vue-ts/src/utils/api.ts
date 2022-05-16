import axios from 'axios'
import {ElNotification} from "element-plus";

//基础地址
let baseURL = '';
//axios配置
const api = axios.create({
    baseURL: `${baseURL}/api`,
    timeout: 2000,
    headers: {
        'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
    },
})
// 请求拦截器
api.interceptors.request.use(config => {
    return config
}, error => {
    return Promise.reject(error)
});

// 响应拦截器
api.interceptors.response.use(success => {
    //业务逻辑错误
    if (success.status && success.status === 200) {
        if (success.data.code === 500 || success.data.code === 401 || success.data.code === 403) {
            ElNotification({
                title: 'Error',
                message: success.data.message,
                type: 'error',
                duration: 2000,
                showClose: false,
                position: 'bottom-right',
            })
            return;
        } else if (success.data.message) {
            ElNotification({
                title: 'Success',
                message: success.data.message,
                type: 'success',
                duration: 2000,
                showClose: false,
                position: 'bottom-right',
            })
        }
    }
    return success.data;
}, error => {
    let originalRequest = error.config
    if (error.code === 'ECONNABORTED' && error.message.indexOf('timeout') !== -1 && !originalRequest._retry) {
        ElNotification({
            title: 'Error',
            message: "连接超时,请检查网络设置",
            type: 'error',
            duration: 2000,
            showClose: false,
            position: 'bottom-right',
        })
    }
    return Promise.reject(error)
});


export default api