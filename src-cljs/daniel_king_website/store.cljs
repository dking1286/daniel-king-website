(ns daniel-king-website.store
  (:require [reagent.core :as r]))

(defonce state
  (r/atom {:count 0}))