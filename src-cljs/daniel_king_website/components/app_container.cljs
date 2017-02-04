(ns daniel-king-website.components.app-container
  (:require [daniel-king-website.components.board-container :refer [board-container]]))

(defn app-container []
  [:div
    [board-container]])