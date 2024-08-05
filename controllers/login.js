let buttonLogin = document.getElementById("login-bartender");

let correctUser = {
    'email': 'jjosevelez2004@gmail.com',
    'password': 'bartender123'
}

buttonLogin.addEventListener('click', function (event) {
    event.preventDefault();
    let emailBantenderBox = document.getElementById("email");
    let emailBartenderValue = emailBantenderBox.value;
    let emailBartenderLowerCase = emailBartenderValue.toLowerCase();

    let passwordBartender = document.getElementById("password");
    let passwordBartenderValue = passwordBartender.value;

    toAccess(emailBartenderLowerCase, passwordBartenderValue);
})


function toAccess(email, password){
    let correctCredentials = validateCredentials(email, password);
    if(correctCredentials) {
        window.location.href = "./drinks.html";
    } else {
        swal.fire({
            icon: "error",
            html: '<p>Incorrect email or password.</p><p>Write them correctly and enter again.</p>'
        });
    }
}



function validateCredentials(email, password) {
    if(correctUser.email.toLocaleLowerCase() == email){
        if(correctUser.password ==  password) {
            return true
        }
    } return false
}