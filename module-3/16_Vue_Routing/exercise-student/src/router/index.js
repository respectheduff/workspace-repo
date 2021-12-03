import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const routes = [
 {
   path: "/",
   name: "Home",
   component: Home
},

{
  path:"/myBooks",
  name: "myBooks",
  component: MyBooks
}

];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
