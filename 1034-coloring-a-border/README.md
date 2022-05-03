<h2><a href="https://leetcode.com/problems/coloring-a-border/">1034. Coloring A Border</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given an <code style="user-select: auto;">m x n</code> integer matrix <code style="user-select: auto;">grid</code>, and three integers <code style="user-select: auto;">row</code>, <code style="user-select: auto;">col</code>, and <code style="user-select: auto;">color</code>. Each value in the grid represents the color of the grid square at that location.</p>

<p style="user-select: auto;">Two squares belong to the same <strong style="user-select: auto;">connected component</strong> if they have the same color and are next to each other in any of the 4 directions.</p>

<p style="user-select: auto;">The <strong style="user-select: auto;">border of a connected component</strong> is all the squares in the connected component that are either <strong style="user-select: auto;">4-directionally</strong> adjacent to a square not in the component, or on the boundary of the grid (the first or last row or column).</p>

<p style="user-select: auto;">You should color the <strong style="user-select: auto;">border</strong> of the <strong style="user-select: auto;">connected component</strong> that contains the square <code style="user-select: auto;">grid[row][col]</code> with <code style="user-select: auto;">color</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the final grid</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,1],[1,2]], row = 0, col = 0, color = 3
<strong style="user-select: auto;">Output:</strong> [[3,3],[3,2]]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,2,2],[2,3,2]], row = 0, col = 1, color = 3
<strong style="user-select: auto;">Output:</strong> [[1,3,3],[2,3,3]]
</pre><p style="user-select: auto;"><strong style="user-select: auto;">Example 3:</strong></p>
<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> grid = [[1,1,1],[1,1,1],[1,1,1]], row = 1, col = 1, color = 2
<strong style="user-select: auto;">Output:</strong> [[2,2,2],[2,1,2],[2,2,2]]
</pre>
<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">m == grid.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">n == grid[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= m, n &lt;= 50</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= grid[i][j], color &lt;= 1000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= row &lt; m</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= col &lt; n</code></li>
</ul>
</div>