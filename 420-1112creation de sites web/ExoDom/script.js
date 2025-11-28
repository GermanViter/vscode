
//let image = document.images[0];
function afficherOuCacher(image) {
    if (image.style.display == 'none') {
        image.style.display = 'initial';
    } else {
        image.style.display = 'none';
    }
}