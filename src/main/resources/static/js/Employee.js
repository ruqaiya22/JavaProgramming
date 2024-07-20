document.querySelectorAll('.accordion-header').forEach(button => {
    button.addEventListener('click', () => {
        const accordionContent = button.nextElementSibling;

        button.classList.toggle('active');

        if (button.classList.contains('active')) {
            accordionContent.style.maxHeight = accordionContent.scrollHeight + 'px';
        } else {
            accordionContent.style.maxHeight = 0;
        }

        // Close other open accordion items
        document.querySelectorAll('.accordion-header').forEach(otherButton => {
            if (otherButton !== button) {
                otherButton.classList.remove('active');
                otherButton.nextElementSibling.style.maxHeight = 0;
            }
        });
    });
});



// login Form
document.addEventListener('DOMContentLoaded', (event) => {
    const modal = document.getElementById('loginModal');
    const loginButton = document.getElementById('loginButton');
    const closeButton = document.querySelector('.close-button');

    loginButton.onclick = function() {
        modal.style.display = "block";
    }

    closeButton.onclick = function() {
        modal.style.display = "none";
    }

    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }

    const loginForm = document.getElementById('loginForm');
    loginForm.onsubmit = function(event) {
        event.preventDefault();
        // Perform login logic here
        alert('Login submitted!');
        modal.style.display = "none";
    }
});
