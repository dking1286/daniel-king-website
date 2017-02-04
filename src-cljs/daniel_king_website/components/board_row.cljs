(ns daniel-king-website.components.board-row
  (:require [daniel-king-website.components.board-cell :refer [board-cell]]))

(defn board-row [row-index]
  [:div
    (map (fn [col-index] [board-cell row-index col-index]) (range 3))])