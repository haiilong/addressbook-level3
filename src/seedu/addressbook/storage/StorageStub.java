package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub implements Storage {

	@Override
	public AddressBook load() throws StorageOperationException {
		return new AddressBook();
	}

	@Override
	public void save(AddressBook addressBook) throws StorageOperationException {
		// this save method does nothing

	}

	@Override
	public String getPath() {
		return null;
	}

}
