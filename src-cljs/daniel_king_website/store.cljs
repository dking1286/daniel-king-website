(ns daniel-king-website.store
  (:require [reagent.core :as r]))

(defonce state
  (r/atom {:board [["" "" ""]
                   ["" "" ""]
                   ["" "" ""]]}))

(defn toggle-cell [row col]
  (fn [state]
    (let [cell-value (get-in state [:board row col])]
      (assoc-in state [:board row col] (new-cell-value cell-value)))))

(defn new-cell-value [cell-value]
  (case cell-value
    "" "X"
    "X" "O"
    "O" "X"))