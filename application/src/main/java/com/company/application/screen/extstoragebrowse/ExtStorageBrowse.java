package com.company.application.screen.extstoragebrowse;

import com.company.application.app.StoragesService;
import com.company.application.entity.ExtStorage;
import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import com.company.inventorycontrolsystem.screen.storage.StorageBrowse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@UiController("ics_Storage.browse")
@UiDescriptor("ext-storage-browse.xml")
public class ExtStorageBrowse extends StorageBrowse {
    private static final Logger log = LoggerFactory.getLogger(ExtStorageBrowse.class);

    @Autowired
    private StoragesService storagesService;

    @Subscribe
    public void onInit(InitEvent event) {
        List<Storage> storages = storagesService.fetchStorage();
        List<ExtStorage> extStorages = storagesService.fetchExtStorage();

        log.info("");
    }


}