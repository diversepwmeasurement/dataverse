This release includes support for counter-processor-0.1.04 for processing Make Data Count metrics. If you are running Make Data Counts support, you should reinstall/reconfigure counter-processor as described in the latest Guides. (For existing installations, note that counter-processor-0.1.04 requires a newer version of python so you will need to follow the full counter-processor install. Also note that if you configure the new version the same way, it will reprocess the days in the current month when it is first run. This is normal and will not affect the metrics in Dataverse.)