(function() {
    const titleQuestions = document.querySelectorAll('.questions__title');
    const sliders = [...document.querySelectorAll('.testimony__body')];
    const buttonNext = document.querySelector('#next');
    const buttonBefore = document.querySelector('#before');
    let value;

    // Event listener for clicking on question titles
    titleQuestions.forEach(question => {
        question.addEventListener('click', () => {
            let answer = question.nextElementSibling;

            // Toggle class to expand/collapse the answer
            answer.classList.toggle('questions__show');
        });
    });

    // Event listeners for testimonial slider buttons
    buttonNext.addEventListener('click', () => {
        changePosition(1);
    });

    buttonBefore.addEventListener('click', () => {
        changePosition(-1);
    });

    const changePosition = (add) => {
        const currentTestimony = document.querySelector('.testimony__body--show').dataset.id;
        value = Number(currentTestimony);
        value += add;

        // Remove current show class and apply to the next/previous testimonial
        sliders[Number(currentTestimony) - 1].classList.remove('testimony__body--show');
        if (value === sliders.length + 1 || value === 0) {
            value = value === 0 ? sliders.length : 1;
        }
        sliders[value - 1].classList.add('testimony__body--show');
    };
})();
