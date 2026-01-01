#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

void dfs(unordered_map<int, vector<int>> &graph, int node, vector<bool> &visited) {
    visited[node] = true;
    cout << node << " ";
    for(int neighbor : graph[node])
        if(!visited[neighbor]) dfs(graph, neighbor, visited);
}

int main() {
    unordered_map<int, vector<int>> graph = {{0,{1,2}}, {1,{3}}, {2,{4}}, {3,{}}, {4,{}}};
    vector<bool> visited(5,false);
    dfs(graph, 0, visited);
}
