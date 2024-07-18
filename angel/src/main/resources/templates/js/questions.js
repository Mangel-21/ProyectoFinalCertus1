(function() {
    const titleQuestions = document.querySelectorAll('.questions__title');

    titleQuestions.forEach(question => {
        question.addEventListener('click', () => {
            const answer = question.nextElementSibling;
            const addPadding = question.parentElement.parentElement;

            addPadding.classList.toggle('questions__padding--add');
            question.children[0].classList.toggle('questions__arrow--rotate');

            if (answer.style.maxHeight) {
                answer.style.maxHeight = null;
                answer.style.padding = '0 30px 0'; // Remover padding al cerrar
            } else {
                answer.style.maxHeight = answer.scrollHeight + 'px';
                answer.style.padding = '30px'; // Añadir padding al abrir
            }
        });
    });
})();
