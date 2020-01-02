package com.kgc.hello;

public class Greeting {
    //说话的人
    private String person="Nobody";
    //说话的内容
    private  String words="nothing";

    //无参构造
   public Greeting(){

   }

   //有参构造
    public Greeting(String person,String words){
       this.person=person;
       this.words=words;
    }

   /* public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
*/
    //定义说话方法
    public void sayGreeting(){
        System.out.println(person+"说："+words);
    }



}
