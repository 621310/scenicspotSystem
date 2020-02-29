<template>
    
</template>

<script>
    export default {
        name: "Recharge",
        mounted(){
            const div = document.createElement('div');
            div.innerHTML = this.$route.query.htmls;
            document.body.appendChild(div);
            document.forms[0].submit();
        },
        methods:{

        }
    }
</script>

<style scoped>

</style>