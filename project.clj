(defproject big-blue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                [com.ibm.watson.developer_cloud/java-sdk "5.1.1"]]
  :main ^:skip-aot big-blue.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
