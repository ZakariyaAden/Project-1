function addButtons(){
    const div = document.getElementById("main_div");
    let button1 = document.createElement('button');
    let buttonId1 = document.createAttribute('id');
    let buttonAttr1 = document.createAttribute('class');

    let idName1 = 'button';
    buttonId1.value = idName1;
    buttonAttr1.value = "buttons";

    button1.setAttributeNode(buttonAttr1);
    button1.setAttributeNode(buttonId1);  
    div.append(button1);
}
function deleteButtons(){
    const div = document.getElementById("main_div");
    const buttons = document.getElementById('button');
    div.removeChild(buttons); 
}
function showPreview(){
    const backgroundDiv = document.getElementById('backgroundDiv');
    const backgroundDivClass = document.createAttribute('class');
    backgroundDivClass.value = 'backgroundDiv';
    backgroundDiv.setAttributeNode(backgroundDivClass);
}
