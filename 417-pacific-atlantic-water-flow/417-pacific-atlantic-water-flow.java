class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> ans =new ArrayList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return ans;
        int n=matrix.length;
        int m= matrix[0].length;
        boolean[][] vp=new boolean[n][m];
        boolean[][] va=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            dfs(i,0,matrix,-1,vp);
            dfs(i,m-1,matrix,-1,va);
            
        }
         for(int j=0;j<m;j++)
        {
            dfs(0,j,matrix,-1,vp);
            dfs(n-1,j,matrix,-1,va);
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vp[i][j]&&va[i][j])
                {
                    List<Integer> res=new ArrayList<>();
                    res.add(i);
                    res.add(j);
                    ans.add(res);
                }
            }
        }
        return ans;
       
        

    }
    public void dfs(int i,int j, int[][]matrix,int prevHeight,boolean[][] canReach)
    {
        if(i<0||j<0||i>matrix.length-1||j>matrix[0].length-1||canReach[i][j]||matrix[i][j]<prevHeight)
            return;
        canReach[i][j]=true;
        dfs(i+1,j,matrix,matrix[i][j],canReach);
        dfs(i-1,j,matrix,matrix[i][j],canReach);
        dfs(i,j+1,matrix,matrix[i][j],canReach);
        dfs(i,j-1,matrix,matrix[i][j],canReach);

    }
}