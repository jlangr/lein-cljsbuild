(defproject org.clojars.jlangr/lein-cljsbuild "0.3.2.1"
  :description "ClojureScript Autobuilder Plugin"
  :url "http://github.com/emezeske/lein-cljsbuild"
  :license
    {:name "Eclipse Public License - v 1.0"
     :url "http://www.eclipse.org/legal/epl-v10.html"
     :distribution :repo}
  :dependencies [[fs "1.1.2"]]
  :profiles {
    :dev {
      :dependencies [
        [midje "1.5.1"]
        [org.clojars.jlangr/cljsbuild "0.3.2"]]
      :plugins [[lein-midje "2.0.4"]]}}
  :eval-in-leiningen true)
