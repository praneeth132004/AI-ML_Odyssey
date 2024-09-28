document.addEventListener('DOMContentLoaded', function() {
    const envelopes = document.querySelectorAll('.role-envelope');
    
    envelopes.forEach((envelope) => {
        envelope.addEventListener('mouseenter', () => {
            envelope.style.transform = 'scale(1.05)';
        });
        envelope.addEventListener('mouseleave', () => {
            envelope.style.transform = 'scale(1)';
        });
    });
});
