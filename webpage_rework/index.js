function addButtons(){
    const div = document.getElementsByClassName("main_div");
    let button1 = document.createElement('button');
    let button2 = document.createElement('button');
    let buttonAttr1 = document.createAttribute('style');
    let buttonAttr2 = document.createAttribute('style');

    buttonAttr1.value = "backgroud-color: black; height: 50px; width: 50px; border-radius: 50%;";
    buttonAttr2.value = "backgroud-color: black; height: 50px; width: 50px; border-radius: 50%;";


    button1.setAttributeNode(buttonAttr1);
    button2.setAttributeNode(buttonAttr2);
    div[0].append(button1);
    div[0].append(button2);

    div[0].addEventListener('onmouseleave', e => {
        const buttonArr = document.getElementsByTagName('button');
        for(let i = 0; i < buttonArr.length;i++){
            buttonArr[i].remove();
        }
    })
}