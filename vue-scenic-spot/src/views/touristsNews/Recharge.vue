<template>
<div id="pay"></div>
</template>

<script>
    export default {
        name: "Recharge",
        mounted(){
            // const div = document.createElement('div');
            console.log(this.$route.query.htmls)
            // div.innerHTML = this.$route.query.htmls;
            // document.body.appendChild(div);
            document.getElementById('pay').innerHTML = this.$route.query.htmls
            document.forms[0].submit();
        },
        methods:{

        }
    }
</script>

<style scoped>

</style>