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
       c.parseFromText(string::to<std::string>(txt));
       el::Loggers::reconfigureAllLoggers(c);"))

(defnative info [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(INFO) << string::to<std::string>(msg);"))

(defnative warn [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(WARNING) << string::to<std::string>(msg);"))

(defnative error [msg]
  (on "defined FERRET_STD_LIB"
      "LOG(ERROR) << string::to<std::string>(msg);"))
