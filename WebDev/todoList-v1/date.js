// jshint esversion:6

// console.log(module);
exports.getDate = function (){
    const today = new Date();
    // currentDay = today.getDay();
    const options = {
        weekday: "long",
        day: "numeric",
        month: "long"
    };

    return today.toLocaleDateString("en-US", options);

}