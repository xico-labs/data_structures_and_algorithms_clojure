(ns ds-algo.sorting.quicksort-test
  (:require [clojure.test :refer :all]
            [ds-algo.sorting.quicksort :refer :all]))


(deftest quick-test
  (testing "Should sort vec"
    (let [arr [10 8 2 5 4 1 6]]
      (is (= (quicksort arr) [1 2 4 5 6 8 10])))))
