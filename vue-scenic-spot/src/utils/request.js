import axios from 'axios';

axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded';// 全局更改
import qs from 'qs';// 配合qs模块转化post请求的参数
/**
  * 封装get方法
  * @param url
  * @param data
  * @returns {Promise}
  */

export function get(url, params = {}) {
    return new Promise((resolve, reject) => {
        axios(
            {
                url:url,
                method:'get',
                baseURL:process.env.VUE_APP_BASE_API,
                data:data,
                headers: {'mp-Token': 123},//设置header信息
            }
        )
            .then(response => {
                resolve(response.data);
            })
            .catch(err => {
                reject(err);
            });
    });
}

/**
  * 封装post请求
  * @param url
  * @param data
  * @returns {Promise}
  */

export function post(url, data = {}) {
    var token = sessionStorage.getItem("token")
    if(token == null){
        token = ''
    }
    return new Promise((resolve, reject) => {
        axios({
                url:url,
                method:'post',
                baseURL:process.env.VUE_APP_BASE_API,
                data:data,
                headers: {'token': token},//设置header信息
            }
        )
            .then(response => {
                resolve(response.data);
            }, err => {
                reject(err);
            });
    });
}