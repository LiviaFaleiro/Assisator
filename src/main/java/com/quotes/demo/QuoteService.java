package com.quotes.demo;

import org.springframework.stereotype.Service;
import com.quotes.demo.Model.Quote;
import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    private final Random random = new Random(); // Make Random a class field for better performance
    private final List<Quote> quotes = List.of(
        new Quote("Machado de Assis", "Cada qual sabe amar a seu modo; o modo, pouco importa; o essencial é que saiba amar.", "Ressurreição"),
        new Quote("Machado de Assis", "Esquecer é uma necessidade. A vida é uma lousa, em que o destino, para escrever um novo caso, precisa de apagar o caso escrito.", "Verba Testamentária"),
        new Quote("Machado de Assis", "Lágrimas não são argumentos.", "Um Esqueleto"),
        new Quote("Machado de Assis", "Deus, para a felicidade do homem, inventou a fé e o amor. O Diabo, invejoso, fez o homem confundir fé com religião e amor com casamento.", "Aforismo"),
        new Quote("Machado de Assis", "Não tive filhos, não transmiti a nenhuma criatura o legado da nossa miséria.", "Memórias Póstumas de Brás Cubas"),
        new Quote("Machado de Assis", "Matamos o tempo; o tempo nos enterra.", "Memórias Póstumas de Brás Cubas"),
        new Quote("Machado de Assis", "Para as rosas, escreveu alguém, o jardineiro é eterno.", "Quincas Borba"),
        new Quote("Machado de Assis", "A loucura, objeto dos meus estudos, era até agora uma ilha perdida no oceano da razão; começo a suspeitar que é um continente.", "O Alienista"),
        new Quote("Machado de Assis", "A vida é uma ópera e uma grande ópera.", "Dom Casmurro"),
        new Quote("Machado de Assis", "Há coisas que se não ajustam nem combinam.", "Dom Casmurro"),
        new Quote("Machado de Assis", "O maior pecado, depois do pecado, é a publicação do pecado.", "Quincas Borba"),
        new Quote("Machado de Assis", "Trata de saborear a vida; e fica sabendo, que a pior filosofia é a do choramingas que se deita à margem do rio para o fim de lastimar o curso incessante das águas.", "Memórias Póstumas de Brás Cubas"),
        new Quote("Machado de Assis", "A saudade é isto mesmo; é o passar e repassar das memórias antigas.", "Dom Casmurro"),
        new Quote("Machado de Assis", "Eu não sou homem que recuse elogios. Amo-os; eles fazem bem à alma e até ao corpo.", "Crônica"),
        new Quote("Machado de Assis", "O amor não é mais que um instrumento de escolha; amar é eleger a criatura que há de ser companheira na vida.", "Crônica"),
        new Quote("Machado de Assis", "A vida sem luta é um mar morto no centro do organismo universal.", "Crônica"),
        new Quote("Machado de Assis", "A ocasião faz o furto; o ladrão já nasce feito.", "Crônica"),
        new Quote("Machado de Assis", "O dinheiro não traz felicidade para quem não sabe o que fazer com ele.", "Crônica"),
        new Quote("Machado de Assis", "A vaidade é um princípio de corrupção.", "Crônica"),
        new Quote("Machado de Assis", "A alma humana é como um abismo, de tal modo profundo que, por mais que se desça, nunca se chega ao fundo.", "Crônica"),
        new Quote("Machado de Assis", "A mentira é muitas vezes tão involuntária como a respiração.", "Crônica"),
        new Quote("Machado de Assis", "A gratidão de quem recebe um benefício é sempre menor que o prazer daquele de quem o faz.", "Crônica"),
        new Quote("Machado de Assis", "A dúvida é o privilégio dos que têm coração.", "Crônica"),
        new Quote("Machado de Assis", "A esperança é um empréstimo que se pede à felicidade.", "Crônica"),
        new Quote("Machado de Assis", "A felicidade é um bem que se multiplica ao ser dividido.", "Crônica"),
        new Quote("Machado de Assis", "A amizade é um amor que nunca morre.", "Crônica"),
        new Quote("Machado de Assis", "A consciência é o melhor livro de moral e aquele que menos se consulta.", "Crônica"),
        new Quote("Machado de Assis", "A desgraça de quem não tem o que fazer é não poder descansar.", "Crônica"),
        new Quote("Machado de Assis", "A melhor definição do amor não vale um beijo de moça namorada.", "Crônica"),
        new Quote("Machado de Assis", "A ocasião faz o furto; o ladrão já nasce feito.", "Crônica")
        
    );

    public Quote getRandomQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }
    
    public List<Quote> getAllQuotes() {
        return quotes;
    }
}
