(defproject daniel-king-website "0.1.0-SNAPSHOT"
  :description "A personal website for Daniel King"
  :url "http://example.com/FIXME"
  :source-paths ["src-clj"]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "0.0-3211"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-ring "0.8.7"]]
  :cljsbuild {
    :builds [{:source-paths ["src-cljs"]
              :compiler {:output-to "resources/public/js/core.js"
                         :optimizations :whitespace
                         :pretty-print true}}]}
  :ring {:handler daniel-king-website.app/app}

  :profiles {:uberjar {:aot :all}})
