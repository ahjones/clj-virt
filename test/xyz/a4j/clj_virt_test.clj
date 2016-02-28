(ns xyz.a4j.clj-virt-test
  (:require [clojure.test :refer :all]
            [xyz.a4j.clj-virt :refer :all]))

(deftest a-test
  (testing "Connect"
    (is (= (type (connect "test:///default" false)) org.libvirt.Connect))))
