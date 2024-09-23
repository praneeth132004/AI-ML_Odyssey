// signup-scripts.js
document.addEventListener('DOMContentLoaded', function() {
    const successPopup = document.querySelector('.success-popup');
    if (successPopup) {
        setTimeout(() => {
            window.location.href = '/login';
        }, 3000);  // Redirect to login after 3 seconds
    }
});
