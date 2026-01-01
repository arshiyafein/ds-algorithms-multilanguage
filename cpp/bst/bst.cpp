#include <iostream>
using namespace std;

struct Node {
    int key;
    Node* left;
    Node* right;
    Node(int val) : key(val), left(nullptr), right(nullptr) {}
};

class BST {
public:
    Node* root;
    BST() : root(nullptr) {}
    void insert(int key) { root = insertRec(root, key); }
    void inorder() { inorderRec(root); cout << endl; }

private:
    Node* insertRec(Node* node, int key) {
        if(!node) return new Node(key);
        if(key < node->key) node->left = insertRec(node->left, key);
        else node->right = insertRec(node->right, key);
        return node;
    }
    void inorderRec(Node* node) {
        if(node) {
            inorderRec(node->left);
            cout << node->key << " ";
            inorderRec(node->right);
        }
    }
};

int main() {
    BST bst;
    bst.insert(5); bst.insert(3); bst.insert(7); bst.insert(2); bst.insert(4);
    bst.inorder();
}
