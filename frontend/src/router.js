
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import SearchStockView from "./components/SearchStockView"
import SearchStockViewDetail from "./components/SearchStockViewDetail"
import OrdernInfomationView from "./components/OrdernInfomationView"
import OrdernInfomationViewDetail from "./components/OrdernInfomationViewDetail"
import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import StockManager from "./components/listers/StockCards"
import StockDetail from "./components/listers/StockDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/searchStocks',
                name: 'SearchStockView',
                component: SearchStockView
            },
            {
                path: '/searchStocks/:id',
                name: 'SearchStockViewDetail',
                component: SearchStockViewDetail
            },
            {
                path: '/ordernInfomations',
                name: 'OrdernInfomationView',
                component: OrdernInfomationView
            },
            {
                path: '/ordernInfomations/:id',
                name: 'OrdernInfomationViewDetail',
                component: OrdernInfomationViewDetail
            },
            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/stocks',
                name: 'StockManager',
                component: StockManager
            },
            {
                path: '/stocks/:id',
                name: 'StockDetail',
                component: StockDetail
            },



    ]
})
