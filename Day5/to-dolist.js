
var list= document.querySelector("ul");
list.addEventListener('click',function(ev){
    if(ev.target.getElementsByTagName === 'checkbox'){
        ev.target.classList.toggle('checked');
    }
    }, false);
    function newElement() {
       var li = document.createElement("li");
        
        var inputValue = document.getElementById("myInput").value;
        

        var t = document.createTextNode(inputValue);
        li.appendChild(t);
        if (inputValue === '') {
          alert("You must write something!");
        } else {
          document.getElementById("myUL").appendChild(li);
          
        }
        document.getElementById("myInput").value = "";
      
        var span = document.createElement("INPUT");
        var txt = document.createTextNode("\u00D7");
        span.className = "close";
        span.appendChild(checkbox);
        li.appendChild(input);
      
        for (i = 0; i < close.length; i++) {
          close[i].onclick = function() {
            var div = this.parentElement;
            div.style.display = "none";
          }
        }
      }
      