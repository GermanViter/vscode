function testForm() {
    let name = document.getElementById("name");
    let lastName = document.getElementById("lastName");
    let email = document.getElementById("email");
    let passwd = document.getElementById("motDePasse");
    let confirmPasswd = document.getElementById("confirmation");
    let requiredElmts = document.getElementsByClassName("required");
    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    
    for (let input of requiredElmts) {
        if (input.value.trim() == "") {
            alert("Tous les champs sont obligatoires");
            return false;
        }
    }
    
    if (!emailRegex.test(email.value)) {
        alert("Email invalide")
        return false;
    }

    if (mdp.value.length < 6) {
    alert("Mot de passe trop court");
    return false;
  }

  if (mdp.value !== conf.value) {
    alert("Les mots de passe ne correspondent pas");
    return false;
  }  
}
