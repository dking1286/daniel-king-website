(ns daniel-king-website.components.board-cell
  (:require [daniel-king-website.store :as store :refer [state]]))

(defn board-cell [row-index col-index]
  [:input {:type "button"
           :value (get-in @state [:board row-index col-index])
           :on-click #(swap! state (store/toggle-cell row-index col-index))}])