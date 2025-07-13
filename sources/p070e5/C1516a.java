package p070e5;

/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class C1516a implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p070e5.C1516a> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f7364Y;

    /* renamed from: Z */
    public final byte[] f7365Z;

    /* renamed from: a0 */
    public final int f7366a0;

    /* renamed from: b0 */
    public final int f7367b0;

    /* renamed from: e5.a$a */
    public class a implements android.os.Parcelable.Creator<p070e5.C1516a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1516a createFromParcel(android.os.Parcel r3) {
                r2 = this;
                e5.a r0 = new e5.a
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1516a[] newArray(int r1) {
                r0 = this;
                e5.a[] r1 = new p070e5.C1516a[r1]
                return r1
        }
    }

    static {
            e5.a$a r0 = new e5.a$a
            r0.<init>()
            p070e5.C1516a.CREATOR = r0
            return
    }

    public C1516a(android.os.Parcel r2, p070e5.C1516a.a r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r3 = r2.readString()
            int r0 = p371v5.C6552b0.f25624a
            r1.f7364Y = r3
            byte[] r3 = r2.createByteArray()
            r1.f7365Z = r3
            int r3 = r2.readInt()
            r1.f7366a0 = r3
            int r2 = r2.readInt()
            r1.f7367b0 = r2
            return
    }

    public C1516a(java.lang.String r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f7364Y = r1
            r0.f7365Z = r2
            r0.f7366a0 = r3
            r0.f7367b0 = r4
            return
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public /* synthetic */ p088f4.C2003e0 mo30D() {
            r1 = this;
            f4.e0 r0 = p427y4.C7111b.m14222b(r1)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public /* synthetic */ byte[] mo31O() {
            r1 = this;
            byte[] r0 = p427y4.C7111b.m14221a(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L35
            java.lang.Class<e5.a> r2 = p070e5.C1516a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L35
        L10:
            e5.a r5 = (p070e5.C1516a) r5
            java.lang.String r2 = r4.f7364Y
            java.lang.String r3 = r5.f7364Y
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            byte[] r2 = r4.f7365Z
            byte[] r3 = r5.f7365Z
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L33
            int r2 = r4.f7366a0
            int r3 = r5.f7366a0
            if (r2 != r3) goto L33
            int r2 = r4.f7367b0
            int r5 = r5.f7367b0
            if (r2 != r5) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
        L35:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7364Y
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            byte[] r1 = r3.f7365Z
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.f7366a0
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.f7367b0
            int r1 = r1 + r0
            return r1
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public /* synthetic */ void mo32p(p088f4.C2021k0.b r1) {
            r0 = this;
            p427y4.C7111b.m14223c(r0, r1)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.f7364Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "mdta: key="
            if (r1 == 0) goto L13
            java.lang.String r0 = r2.concat(r0)
            goto L18
        L13:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L18:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f7364Y
            r1.writeString(r2)
            byte[] r2 = r0.f7365Z
            r1.writeByteArray(r2)
            int r2 = r0.f7366a0
            r1.writeInt(r2)
            int r2 = r0.f7367b0
            r1.writeInt(r2)
            return
    }
}
