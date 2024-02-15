class Loop {
  public static void main(String[] args){
        int[] score = {80, 99, 100};
        String[] name = {"菅原", "村上", "寺島"};

        for (int i = 0; i < score.length; i++){
          System.out.println(name[i] + "さん" + score[i] + "点");
        }
        System.out.println("受験者数:" + name.length + "名");
      }
    }
