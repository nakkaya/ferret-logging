(defnative init []
  (on "defined FERRET_STD_LIB"
      ("ferret-logging/easylogging++.h")
      "INITIALIZE_EASYLOGGINGPP"
      ""))

(defnative init-from-text [txt]
  (on "defined FERRET_STD_LIB"
      ("ferret-logging/easylogging++.h")
      "INITIALIZE_EASYLOGGINGPP"
      "el::Configurations c;
       c.setToDefault();
       c.parseFromText(txt.cast<String>()->to_string());
       el::Loggers::reconfigureAllLoggers(c);"))

(defnative info [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(INFO) << msg.cast<String>()->to_string();"))

(defnative warn [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(WARNING) << msg.cast<String>()->to_string();"))

(defnative error [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(ERROR) << msg.cast<String>()->to_string();"))

