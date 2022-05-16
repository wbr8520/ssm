import api from '@/utils/api'

//post请求封装
interface userForm {
    username: string,
    password: string
}

export const postRequest = (url: string, params: userForm) => {
    return api({
        method: "post",
        url: url,
        params: params
    })
}
//get请求封装
export const getRequest = (url: string, params: userForm) => {
    return api({
        method: "get",
        url: url,
        params: params
    })
}
//暴露方法
export default {
    postRequest, getRequest,
}