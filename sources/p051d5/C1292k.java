package p051d5;

/* renamed from: d5.k */
/* loaded from: classes.dex */
public final class C1292k extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1292k> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6799Z;

    /* renamed from: a0 */
    public final byte[] f6800a0;

    /* renamed from: d5.k$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1292k> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1292k createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.k r0 = new d5.k
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1292k[] newArray(int r1) {
                r0 = this;
                d5.k[] r1 = new p051d5.C1292k[r1]
                return r1
        }
    }

    static {
            d5.k$a r0 = new d5.k$a
            r0.<init>()
            p051d5.C1292k.CREATOR = r0
            return
    }

    public C1292k(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "PRIV"
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.f6799Z = r0
            byte[] r3 = r3.createByteArray()
            r2.f6800a0 = r3
            return
    }

    public C1292k(java.lang.String r2, byte[] r3) {
            r1 = this;
            java.lang.String r0 = "PRIV"
            r1.<init>(r0)
            r1.f6799Z = r2
            r1.f6800a0 = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<d5.k> r2 = p051d5.C1292k.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            d5.k r5 = (p051d5.C1292k) r5
            java.lang.String r2 = r4.f6799Z
            java.lang.String r3 = r5.f6799Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L27
            byte[] r2 = r4.f6800a0
            byte[] r5 = r5.f6800a0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f6799Z
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            byte[] r0 = r2.f6800a0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // p051d5.AbstractC1289h
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f6790Y
            java.lang.String r1 = r4.f6799Z
            r2 = 8
            int r2 = p064e.C1489c.m4038a(r0, r2)
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.String r3 = ": owner="
            java.lang.String r0 = p088f4.C2035p.m5377a(r2, r0, r3, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6799Z
            r1.writeString(r2)
            byte[] r2 = r0.f6800a0
            r1.writeByteArray(r2)
            return
    }
}
