class Solution {
       public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
           
        if (image[sr][sc] == newColor) return image;

        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;

        changeColor(image, sr+1, sc, oldColor, newColor );
        changeColor(image, sr-1, sc, oldColor, newColor );
        changeColor(image, sr, sc+1, oldColor, newColor );
        changeColor(image, sr, sc-1, oldColor, newColor );

        return image;

    }

    public static void changeColor (int[][] image, int sr, int sc, int oldColor, int newColor) {

        if (sr >= 0 && sc >= 0 && sr < image.length && sc < image[sr].length && image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            changeColor(image, sr + 1, sc, oldColor, newColor);
            changeColor(image, sr - 1, sc, oldColor, newColor);
            changeColor(image, sr, sc + 1, oldColor, newColor);
            changeColor(image, sr, sc - 1, oldColor, newColor);
        }//recurse and call on 4 match
    }
}