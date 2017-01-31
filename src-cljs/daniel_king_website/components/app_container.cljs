(ns daniel-king-website.components.app-container
  (:require 
    [reagent.core :as r]
    [daniel-king-website.components.counter :refer [counter]]
    [daniel-king-website.components.counter-button :refer [counter-button]]))

(defn app-container []
  [:div
    [counter]
    [counter-button]])