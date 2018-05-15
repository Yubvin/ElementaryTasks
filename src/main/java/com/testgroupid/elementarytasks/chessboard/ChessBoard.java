package com.testgroupid.elementarytasks.chessboard;

public class ChessBoard {
    private int width;
    private int height;

    public ChessBoard(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void show(){
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if((i-j)%2 == 0){
                    System.out.print('*');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
