(ns xyz.a4j.clj-virt
  (:import [org.libvirt Connect]))

(defn connect
  ([^String uri]
   (Connect. uri))
  ([^String uri read-only]
   (Connect. uri read-only)))
