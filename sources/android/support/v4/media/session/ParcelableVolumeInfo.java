package android.support.v4.media.session;

@android.annotation.SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> CREATOR = null;

    /* renamed from: Y */
    public int f559Y;

    /* renamed from: Z */
    public int f560Z;

    /* renamed from: a0 */
    public int f561a0;

    /* renamed from: b0 */
    public int f562b0;

    /* renamed from: c0 */
    public int f563c0;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C0169a implements android.os.Parcelable.Creator<android.support.v4.media.session.ParcelableVolumeInfo> {
        public C0169a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.session.ParcelableVolumeInfo createFromParcel(android.os.Parcel r2) {
                r1 = this;
                android.support.v4.media.session.ParcelableVolumeInfo r0 = new android.support.v4.media.session.ParcelableVolumeInfo
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public android.support.v4.media.session.ParcelableVolumeInfo[] newArray(int r1) {
                r0 = this;
                android.support.v4.media.session.ParcelableVolumeInfo[] r1 = new android.support.v4.media.session.ParcelableVolumeInfo[r1]
                return r1
        }
    }

    static {
            android.support.v4.media.session.ParcelableVolumeInfo$a r0 = new android.support.v4.media.session.ParcelableVolumeInfo$a
            r0.<init>()
            android.support.v4.media.session.ParcelableVolumeInfo.CREATOR = r0
            return
    }

    public ParcelableVolumeInfo(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f559Y = r1
            r0.f560Z = r2
            r0.f561a0 = r3
            r0.f562b0 = r4
            r0.f563c0 = r5
            return
    }

    public ParcelableVolumeInfo(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.f559Y = r0
            int r0 = r2.readInt()
            r1.f561a0 = r0
            int r0 = r2.readInt()
            r1.f562b0 = r0
            int r0 = r2.readInt()
            r1.f563c0 = r0
            int r2 = r2.readInt()
            r1.f560Z = r2
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
            int r2 = r0.f559Y
            r1.writeInt(r2)
            int r2 = r0.f561a0
            r1.writeInt(r2)
            int r2 = r0.f562b0
            r1.writeInt(r2)
            int r2 = r0.f563c0
            r1.writeInt(r2)
            int r2 = r0.f560Z
            r1.writeInt(r2)
            return
    }
}
