(ns ds-algo.linked-list-test
  (:require [clojure.test :refer :all]
            [ds-algo.linked-list :refer :all]))


(deftest array-test
  (testing "Should create a node"
    (is (= 4 (:data (node 4 nil))))))
