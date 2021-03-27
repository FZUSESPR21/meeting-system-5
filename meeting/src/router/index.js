import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import test from '@/components/test'
import Admin from '@/views/admin/Admin'
import UserNumTable from '@/components/admin/UserNumTable'

Vue.use(Router)

export default new Router({
    routes: [{
            path: '/HelloWorld',
            name: 'HelloWorld',
            component: HelloWorld
        },
        {
            path: '/test',
            name: 'test',
            component: test
        },
        {
            path: '/admin',
            name: 'admin',
            component: Admin,
            children: [{
                path: '/user_num',
                name: 'user_num_table',
                component: UserNumTable
            }]
        }
    ]
})