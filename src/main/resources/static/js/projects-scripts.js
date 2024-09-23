document.addEventListener('DOMContentLoaded', () => {
    const envelopes = document.querySelectorAll('.category-envelope');
    envelopes.forEach((envelope, index) => {
        envelope.style.animationDelay = `${index * 0.2}s`;
    });
});

