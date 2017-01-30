(ns daniel-king-website.views
  (:require 
    [hiccup
      [page :refer [html5]]
      [page :refer [include-js]]]))

(defn index []
  (html5
    [:head
      [:title "Daniel King"]
      (include-js "/js/core.js")]
    [:body
      [:h1 "Hello World!"]]))

(defn not-found []
  (html5
    [:head
      [:title "Daniel King"]]
    [:body
      [:h1 "Not found - 404"]
      [:p "Sorry, we couldn't find that"]]))