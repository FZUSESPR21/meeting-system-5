<template>
    <div>
        <AdminHeader/>
        <div class="block"></div>
        <router-view class="mid"/>
    </div>
</template>
<script>
    import AdminHeader from "@/components/admin/AdminHeader";
    import UserNumTable from "@/components/admin/UserNumTable";
    export default {
       name:'admin',
       components:{
           AdminHeader,
           UserNumTable,
       }
    };
</script>
<style scoped>
    .block {
        height:40px;
    }
    .mid {
        /* margin-top: 300px; */
        width:80%;
        margin: 0 auto;
    }
</style>
