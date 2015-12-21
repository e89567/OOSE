import java.util.ArrayList;  
import java.util.Iterator;  
public abstract class QuestionComponent {
   publicQuestionItem(String desc) {}
   public void print() {}      
   public void getchild(int i) {}
   //陳建佑 D0280197
}

class QuestionItem extends QuestionComponent{
   String description;
   public QuestionItem(String desc) {
      this.description = desc;
   }
   public void print() {
      System.out.println(desc);
   }      
  
}
class Question extends QuestionComponent{
   String description;
   private ArrayList  QuestionComponents;
   public QuestionItem(String desc) {
      this.description = desc;
   }
   public void print() {
      System.out.println(desc);
   } 
   public void getchild(int i) {
      return QuestionComponents.get(i)
   }
}
