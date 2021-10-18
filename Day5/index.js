function c(val){
    document.getElementById("d").value = val;
}
function v(val){
    document.getElementById("d").value+=val;
}
function e(){
    try {
        c(eval(document.getElementById("d").value)); //eval() evaluates or execute an argument

    } catch (error) {
        c('Error');
    }
}