
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 결제Manager from "./components/listers/결제Cards"
import 결제Detail from "./components/listers/결제Detail"

import CookManager from "./components/listers/CookCards"
import CookDetail from "./components/listers/CookDetail"

import 배달Manager from "./components/listers/배달Cards"
import 배달Detail from "./components/listers/배달Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/결제',
                name: '결제Manager',
                component: 결제Manager
            },
            {
                path: '/결제/:id',
                name: '결제Detail',
                component: 결제Detail
            },

            {
                path: '/cooks',
                name: 'CookManager',
                component: CookManager
            },
            {
                path: '/cooks/:id',
                name: 'CookDetail',
                component: CookDetail
            },

            {
                path: '/배달',
                name: '배달Manager',
                component: 배달Manager
            },
            {
                path: '/배달/:id',
                name: '배달Detail',
                component: 배달Detail
            },



    ]
})
