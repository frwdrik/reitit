(def VERSION "0.1.0-SNAPSHOT")

(defproject metosin/reitit-spec VERSION
  :description "Reitit: clojure.spec coercion"
  :url "https://github.com/metosin/reitit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-parent "0.3.2"]]
  :parent-project {:path "../../project.clj"
                   :inherit [:deploy-repositories :managed-dependencies]}
  :dependencies [[metosin/reitit-ring]
                 [metosin/spec-tools]])
