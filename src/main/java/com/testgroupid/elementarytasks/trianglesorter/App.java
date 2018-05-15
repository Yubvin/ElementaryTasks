package com.testgroupid.elementarytasks.trianglesorter;

public class App {

    public void execute(){
        TriangleSorter triangleSorter = new TriangleSorter();
        UserConsoleInput userConsoleInput = new UserConsoleInput();
        Validator validator = new Validator();

        do{
            String[] args = userConsoleInput.getArgumentsFromInput();

            try {
                triangleSorter.add(validator.getValidatedTriangleFrom(args));
            }catch (NumberFormatException e){
                System.out.println("Values must be double!");
            }catch (DegenerateTriangleException e){
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }while (!userConsoleInput.isEnd());

        triangleSorter.showTriangleList();
    }

    public static void main(String[] args){
        new App().execute();
    }
}
