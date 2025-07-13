package androidx.versionedparcelable;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = null;

    /* renamed from: Y */
    public final p367v1.InterfaceC6491e f3732Y;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0632a implements android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> {
        public C0632a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel r2) {
                r1 = this;
                androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public androidx.versionedparcelable.ParcelImpl[] newArray(int r1) {
                r0 = this;
                androidx.versionedparcelable.ParcelImpl[] r1 = new androidx.versionedparcelable.ParcelImpl[r1]
                return r1
        }
    }

    static {
            androidx.versionedparcelable.ParcelImpl$a r0 = new androidx.versionedparcelable.ParcelImpl$a
            r0.<init>()
            androidx.versionedparcelable.ParcelImpl.CREATOR = r0
            return
    }

    public ParcelImpl(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            v1.d r0 = new v1.d
            r0.<init>(r2)
            v1.e r2 = r0.m13197o()
            r1.f3732Y = r2
            return
    }

    public ParcelImpl(p367v1.InterfaceC6491e r1) {
            r0 = this;
            r0.<init>()
            r0.f3732Y = r1
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            v1.d r2 = new v1.d
            r2.<init>(r1)
            v1.e r1 = r0.f3732Y
            r2.m13205w(r1)
            return
    }
}
