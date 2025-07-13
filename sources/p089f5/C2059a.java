package p089f5;

/* renamed from: f5.a */
/* loaded from: classes.dex */
public final class C2059a extends p089f5.AbstractC2060b {
    public static final android.os.Parcelable.Creator<p089f5.C2059a> CREATOR = null;

    /* renamed from: Y */
    public final long f9428Y;

    /* renamed from: Z */
    public final long f9429Z;

    /* renamed from: a0 */
    public final byte[] f9430a0;

    /* renamed from: f5.a$a */
    public class a implements android.os.Parcelable.Creator<p089f5.C2059a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2059a createFromParcel(android.os.Parcel r3) {
                r2 = this;
                f5.a r0 = new f5.a
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2059a[] newArray(int r1) {
                r0 = this;
                f5.a[] r1 = new p089f5.C2059a[r1]
                return r1
        }
    }

    static {
            f5.a$a r0 = new f5.a$a
            r0.<init>()
            p089f5.C2059a.CREATOR = r0
            return
    }

    public C2059a(long r1, byte[] r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f9428Y = r4
            r0.f9429Z = r1
            r0.f9430a0 = r3
            return
    }

    public C2059a(android.os.Parcel r3, p089f5.C2059a.a r4) {
            r2 = this;
            r2.<init>()
            long r0 = r3.readLong()
            r2.f9428Y = r0
            long r0 = r3.readLong()
            r2.f9429Z = r0
            byte[] r3 = r3.createByteArray()
            int r4 = p371v5.C6552b0.f25624a
            r2.f9430a0 = r3
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.f9428Y
            r3.writeLong(r0)
            long r0 = r2.f9429Z
            r3.writeLong(r0)
            byte[] r4 = r2.f9430a0
            r3.writeByteArray(r4)
            return
    }
}
