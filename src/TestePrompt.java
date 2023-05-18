
public class TestePrompt {
    public static void main(String[] args) throws Exception{
        var chatGPTClient = new ChatGPTClient();
        //sem pergunta exemplo
        chatGPTClient.criarPergunta(
            null, 
            "Java", 
            "disssertativa", 
            "ultra hard core",
            "Por que ceu é azul?"
            );
            
    }
}
