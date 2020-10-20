### https://www.hackerearth.com/practice/algorithms/graphs/topological-sort/practice-problems/algorithm/oliver-and-the-game-3/
from sys import stdout, stdin, setrecursionlimit
from collections import defaultdict
 
setrecursionlimit(10 ** 6)
 
global c
 
def addEdge(graph, u, v):
    graph[u].append(v)
    graph[v].append(u)
 
def createGraph(n):
    graph = defaultdict(list)
    for _ in range(n - 1):
        u, v = map(int, stdin.readline().split())
        addEdge(graph, u, v)
    return graph
 
def DFSUtil(graph, sn, visited, arrival, final):
    global c
    visited[sn] = True
    arrival[sn] = c
    c += 1
    for i in graph[sn]:
        if not visited[i]:
            DFSUtil(graph, i, visited, arrival, final)
    final[sn] = c
    c += 1
 
def DFS(graph, n, visited, arrival, final):
    for i in range(1, n + 1):
        if not visited[i]:
            DFSUtil(graph, i, visited, arrival, final)
 
def query(type, X, Y, arrival, final):
    if type == 0:
        if arrival[X] < arrival[Y] and final[X] > final[Y]:
            return True
        else:
            return False
    elif type == 1:
        if arrival[X] > arrival[Y] and final[X] < final[Y]:
            return True
        else:
            return False
 
def main():
    global c
    n = int(stdin.readline())
    graph = createGraph(n)
    c = 1
    visited = [False] * (n + 1)
    arrival = [False] * (n + 1)
    final = [0] * (n + 1)
    DFS(graph, n, visited, arrival, final)
    q = int(stdin.readline())
    for _ in range(q):
        t, x, y = map(int, stdin.readline().split())
        if query(t, x, y, arrival, final):
            stdout.write('YES\n')
        else:
            stdout.write('NO\n')
 
if __name__ == '__main__':
    main()

## Sample Input 
## 9
## 1 2
## 1 3
## 2 6
## 2 7
## 6 9
## 7 8
## 3 4
## 3 5
## 5
## 0 2 8
## 1 2 8
## 1 6 5
## 0 6 5
## 1 9 1

## Sample Output
## YES
## NO
## NO
## NO
## YES