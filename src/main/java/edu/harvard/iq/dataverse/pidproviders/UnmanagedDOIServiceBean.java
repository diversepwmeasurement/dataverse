package edu.harvard.iq.dataverse.pidproviders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.lang3.NotImplementedException;

import edu.harvard.iq.dataverse.DOIServiceBean;
import edu.harvard.iq.dataverse.DvObject;
import edu.harvard.iq.dataverse.GlobalId;


// This class is just used to parse DOIs that are not managed by any account configured in Dataverse
// It does not implement any of the methods related to PID CRUD 

@Stateless
public class UnmanagedDOIServiceBean extends DOIServiceBean {

    private static final Logger logger = Logger.getLogger(UnmanagedDOIServiceBean.class.getCanonicalName());

    @PostConstruct
    private void init() {
        // Always on
        isConfigured = true;
    }

    @Override
    public boolean registerWhenPublished() {
        return false;
    }

    @Override
    public boolean alreadyExists(GlobalId pid) {
        return false;
    }

    @Override
    public String createIdentifier(DvObject dvObject) throws Exception {
        throw new NotImplementedException();
    }

    @Override
    public HashMap<String, String> getIdentifierMetadata(DvObject dvObject) {
        throw new NotImplementedException();
    }

    @Override
    public String modifyIdentifierTargetURL(DvObject dvObject) throws Exception {
        throw new NotImplementedException();
    }

    @Override
    public void deleteIdentifier(DvObject dvObject) throws IOException, HttpException {
        throw new NotImplementedException();
    }

    /**
     * Deletes DOI from the DataCite side, if possible. Only "draft" DOIs can be
     * deleted.
     */
    private void deleteDraftIdentifier(DvObject dvObject) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public boolean publicizeIdentifier(DvObject dvObject) {
        throw new NotImplementedException();
    }

    @Override
    public List<String> getProviderInformation() {
        ArrayList<String> providerInfo = new ArrayList<>();
        String providerName = "UnmanagedDOIProvider";
        String providerLink = "";
        providerInfo.add(providerName);
        providerInfo.add(providerLink);
        return providerInfo;
    }

    // PID recognition
    // Done by DOIServiceBean

}
