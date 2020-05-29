(ns ds-algo.linked-list-test
  (:require [clojure.test :refer :all]
            [ds-algo.linked-list :refer :all]))


(deftest array-test
  (testing "Should create a node"
    (let [first-node (node 4 nil)]
      (is (= 4 (:data first-node)))
      (is (= nil (:next first-node)))))

  (testing "Should add next node"
    (let [thrid-node (node 8 nil)
          second-node (node 5 thrid-node)
          first-node (node 6 second-node)]
      (is (= 6 (:data first-node)))
      (is (= 5 (:data (:next first-node))))
      (is (= 8 (:data (:next (:next first-node))))))))
