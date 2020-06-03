(ns ds-algo.sorting.quicksort )


(comment "This is simple implementation about
         sort algorithm named QuickSort. ")


(defn quicksort
  "
  Best case O(nlogn)
  Worst case O(n^2)
  "
  [arr]
  (if
    (<= (count arr) 1) arr
    (let [pivot (first arr)
          others (rest arr)]
      (concat
        (quicksort (filter #(>= pivot %) others))
        [pivot]
        (quicksort (filter #(< pivot %) others))))))

