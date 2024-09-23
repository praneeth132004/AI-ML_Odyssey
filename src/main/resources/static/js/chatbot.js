function sendMessage() {
    const userInput = document.getElementById("userInput").value;
    if (userInput.trim() === "") return;

    // Display the user message
    const chatbox = document.getElementById("chatbox");
    const userMessage = document.createElement("div");
    userMessage.classList.add("message", "user-message");
    userMessage.innerHTML = `<i class="fas fa-user"></i> ${userInput}`;
    chatbox.appendChild(userMessage);

    // Clear the input field
    document.getElementById("userInput").value = "";

    // Scroll to the bottom of the chatbox
    chatbox.scrollTop = chatbox.scrollHeight;

    // Simulate bot response
    setTimeout(() => {
        const botMessage = document.createElement("div");
        botMessage.classList.add("message", "bot-message");
        botMessage.innerHTML = `<i class="fas fa-robot"></i> This is a simulated AI response. Please wait for the live connection.`;
        chatbox.appendChild(botMessage);
        chatbox.scrollTop = chatbox.scrollHeight;
    }, 1000);
}
 