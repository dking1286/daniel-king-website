(ns daniel-king-website.components.counter
  (:require [daniel-king-website.store :refer [state]]))

(defn counter []
  [:p (str (:count @state))])