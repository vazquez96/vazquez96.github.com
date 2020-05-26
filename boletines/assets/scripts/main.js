let links = document.querySelectorAll(".close");

links.forEach(function(link){
    link.addEventListener("click",function(ev){
        ev.preventDefault();
        let content = document.querySelector('.content');
        
        //Quitar las animaciones que ya contiene
        content.classList.remove("fadeInLeft");
        content.classList.remove("zoomIn");
        content.classList.remove("rotateInUpRight");
        content.classList.remove("animated");
        
        
        //Agregando animaciones nuevas
        content.classList.add("fadeOutUp");
        content.classList.add("animated");
        
       
        
        
        setTimeout(function(){
            location.href = "../index.html";
        },1000);
        
        return false;
    });
});