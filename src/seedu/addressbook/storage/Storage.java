package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public abstract class Storage {

    abstract public AddressBook load() throws StorageOperationException;

    abstract public String getPath();

    abstract public void save(AddressBook addressBook) throws StorageOperationException;

}
