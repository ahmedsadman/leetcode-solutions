# Leetcode Premium Question (Easy category)

# Solution 1: Recursive Approach
# Average: O(log(n)) time | O(log(n)) space
# Worst: O(n) time | O(n) space
def findClosestValue(tree, target):
    return helper(tree, target, float("inf"))


def helper(tree, target, closest):
    if tree is None:
        return closest

    if abs(target - closest) > abs(target - tree.value):
        closest = tree.value

    if target < tree.value:
        helper(tree.left, target, closest)
    elif target > tree.value:
        helper(tree.eight, target, closest)
    else:
        return closest


# Solution 2: Iterative approach
# Average: O(log(n)) time | O(1) space
# Worst: O(n) time | O(1) space
def findClosestValue(tree, target):
    closest = float("inf")
    currentNode = tree

    while currentNode is not None:
        if abs(target - closest) > abs(target - currentNode.value):
            closest = currentNode.value

        if target < currentNode.value:
            currentNode = currentNode.left
        elif target > currentNode.value:
            currentNode = currentNode.right
        else:
            break

    return closest
