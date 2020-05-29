(ns ds-algo.linked-list
  (:require [clojure.string :refer :all]))


(defn node [data next-node]
  {:data data
   :next next-node})


