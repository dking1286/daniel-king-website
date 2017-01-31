(ns daniel-king-website.components.counter-button
  (:require [daniel-king-website.store :refer [state]]))

(defn increment-counter []
  (swap! state #(update % :count inc)))

(defn ^:export counter-button []
  [:button
    {:on-click increment-counter}
    "Click me!"])