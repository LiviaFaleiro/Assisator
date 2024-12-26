async function buscarNovaCitacao() {
    const textoCitacao = document.getElementById('citacao');
    const textoAutor = document.getElementById('autor');
    const textoObra = document.getElementById('fonte');
    
    textoCitacao.classList.add('carregando');
    textoAutor.classList.add('carregando');
    textoObra.classList.add('carregando');

    try {
        const resposta = await fetch('http://localhost:8080/api/quotes/random');
        const dados = await resposta.json();
        
        textoCitacao.textContent = `"${dados.text}"`;
        textoAutor.textContent = `- ${dados.author}`;
        textoObra.textContent = `Obra: ${dados.book}`;
    } catch (erro) {
        textoCitacao.textContent = "Falha ao carregar citação";
        textoAutor.textContent = "Por favor, tente novamente";
        textoObra.textContent = "Por favor, tente novamente";
    } finally {
        textoCitacao.classList.remove('carregando');
        textoAutor.classList.remove('carregando');
        textoObra.classList.remove('carregando');
    }
}

buscarNovaCitacao();
