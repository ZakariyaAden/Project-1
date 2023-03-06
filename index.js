import fs from 'fs';

function openNewTab() {
    const body = document.querySelectorAll("body");
    function getRandomInt(max) {
        return Math.floor(Math.random() * max);
    }
    let rgb1 = getRandomInt(300);
    let rgb2 = getRandomInt(300);
    let rgb3 = getRandomInt(300);
    let rgb4 = getRandomInt(300);
    let rgb5 = getRandomInt(300);
    let rgb6 = getRandomInt(300);
    body.style.backgroundColor(`linear-gradient(rbg(${rgb1},${rgb2},${rgb3}), rbg(${rgb4},${rgb5},${rgb6}),);`);
    window.open("https://www.youtube.com/watch?v=dQw4w9WgXcQ", "_blank");

}

function displayStudentInfo(){
    for(let i = 1; i<=10;i++){
        let fileName = "file" + i + ".txt"
        let globalData;
        do{
            fs.readFile(fileName,"utf8",(err,data) => {
                if (err){
                    //do nothing
                }
                else{
                    globalData = data;
                    console.log(data);
                }
            });
        }
        while(!globalData == null);
    }
}

export{openNewTab}