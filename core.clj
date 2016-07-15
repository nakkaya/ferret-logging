(defnative init []
  (on "defined FERRET_STD_LIB"
      ("ferret-logging/easylogging++.h")
      "INITIALIZE_EASYLOGGINGPP"
      ""))

(defnative info [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(INFO) << msg.cast<String>()->to_string();"))

(defnative warn [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(WARNING) << msg.cast<String>()->to_string();"))

(defnative error [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(ERROR) << msg.cast<String>()->to_string();"))

