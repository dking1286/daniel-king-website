(ns daniel-king-website.components.board-container
  (:require [daniel-king-website.components.board-row :refer [board-row]]))

(defn board-container []
  [:div
    (map (fn [row-index] [board-row row-index]) (range 3))])