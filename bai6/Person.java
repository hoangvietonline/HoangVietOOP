package bai6;

/**
 * 
 * @author HoangViet 
 * Create abstract class Person
 */
public abstract class Person {
	private String mId;
	private String mName;
	private String mBrithday;
	private String mAddress;

	public Person() {
		super();
	}

	public Person(String mId, String mName, String mBrithday, String mAddress) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mBrithday = mBrithday;
		this.mAddress = mAddress;
	}

	public String getId() {
		return mId;
	}

	public void setId(String mId) {
		this.mId = mId;
	}

	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public String getBrithday() {
		return mBrithday;
	}

	public void setBrithday(String mBrithday) {
		this.mBrithday = mBrithday;
	}

	public String getAddress() {
		return mAddress;
	}

	public void setAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public abstract float getSalary();

	public abstract void show();
}
