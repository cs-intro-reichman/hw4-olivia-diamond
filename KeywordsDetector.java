public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
       
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
       
    

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
   
   //make a new function to find the keywords in the sentences (true/false)
   
   public static boolean findWords(String[] sentences, String[] keywords) {
        for (int j=0; j<sentences.length; j++){
            String sentencesLowerCase = sentences[j].toLowerCase();
              
            for (int i = 0; i< (keywords.length); i++){
                if (sentencesLowerCase.contains(keywords[i].toLowerCase())) {
                     return true;
                }    
            }
        }
            return false;
    }
            
   
   //function to print out if keyword detected (use findWords funtion)
   
   public static void detectAndPrint(String[] sentences, String[] keywords) {
         if (findWords(sentences, keywords) == true) {
            for (int i = 0; i < sentences.length; i++) {
                for (int j = 0; j < keywords.length; j++){
                    String sentencesLowerCase = sentences[i].toLowerCase();
                    if (sentencesLowerCase.contains(keywords[j].toLowerCase())) {
                    System.out.println(sentences[i]);
                    break;
                     }
                }
            }
        }  
    }
}
