package p022b5;

/* renamed from: b5.a */
/* loaded from: classes.dex */
public final class C0680a implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p022b5.C0680a> CREATOR = null;

    /* renamed from: Y */
    public final int f3857Y;

    /* renamed from: Z */
    public final java.lang.String f3858Z;

    /* renamed from: a0 */
    public final java.lang.String f3859a0;

    /* renamed from: b0 */
    public final int f3860b0;

    /* renamed from: c0 */
    public final int f3861c0;

    /* renamed from: d0 */
    public final int f3862d0;

    /* renamed from: e0 */
    public final int f3863e0;

    /* renamed from: f0 */
    public final byte[] f3864f0;

    /* renamed from: b5.a$a */
    public class a implements android.os.Parcelable.Creator<p022b5.C0680a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p022b5.C0680a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                b5.a r0 = new b5.a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p022b5.C0680a[] newArray(int r1) {
                r0 = this;
                b5.a[] r1 = new p022b5.C0680a[r1]
                return r1
        }
    }

    static {
            b5.a$a r0 = new b5.a$a
            r0.<init>()
            p022b5.C0680a.CREATOR = r0
            return
    }

    public C0680a(int r1, java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, int r7, byte[] r8) {
            r0 = this;
            r0.<init>()
            r0.f3857Y = r1
            r0.f3858Z = r2
            r0.f3859a0 = r3
            r0.f3860b0 = r4
            r0.f3861c0 = r5
            r0.f3862d0 = r6
            r0.f3863e0 = r7
            r0.f3864f0 = r8
            return
    }

    public C0680a(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.f3857Y = r0
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.f3858Z = r0
            java.lang.String r0 = r3.readString()
            r2.f3859a0 = r0
            int r0 = r3.readInt()
            r2.f3860b0 = r0
            int r0 = r3.readInt()
            r2.f3861c0 = r0
            int r0 = r3.readInt()
            r2.f3862d0 = r0
            int r0 = r3.readInt()
            r2.f3863e0 = r0
            byte[] r3 = r3.createByteArray()
            r2.f3864f0 = r3
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
            if (r5 == 0) goto L51
            java.lang.Class<b5.a> r2 = p022b5.C0680a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L51
        L10:
            b5.a r5 = (p022b5.C0680a) r5
            int r2 = r4.f3857Y
            int r3 = r5.f3857Y
            if (r2 != r3) goto L4f
            java.lang.String r2 = r4.f3858Z
            java.lang.String r3 = r5.f3858Z
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            java.lang.String r2 = r4.f3859a0
            java.lang.String r3 = r5.f3859a0
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            int r2 = r4.f3860b0
            int r3 = r5.f3860b0
            if (r2 != r3) goto L4f
            int r2 = r4.f3861c0
            int r3 = r5.f3861c0
            if (r2 != r3) goto L4f
            int r2 = r4.f3862d0
            int r3 = r5.f3862d0
            if (r2 != r3) goto L4f
            int r2 = r4.f3863e0
            int r3 = r5.f3863e0
            if (r2 != r3) goto L4f
            byte[] r2 = r4.f3864f0
            byte[] r5 = r5.f3864f0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            return r0
        L51:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f3857Y
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.lang.String r1 = r3.f3858Z
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r3.f3859a0
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            int r1 = r3.f3860b0
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f3861c0
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f3862d0
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f3863e0
            int r0 = r0 + r1
            int r0 = r0 * 31
            byte[] r1 = r3.f3864f0
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public void mo32p(p088f4.C2021k0.b r3) {
            r2 = this;
            byte[] r0 = r2.f3864f0
            int r1 = r2.f3857Y
            r3.m5313b(r0, r1)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f3858Z
            java.lang.String r1 = r4.f3859a0
            r2 = 32
            int r2 = p064e.C1489c.m4038a(r0, r2)
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Picture: mimeType="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", description="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.f3857Y
            r1.writeInt(r2)
            java.lang.String r2 = r0.f3858Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f3859a0
            r1.writeString(r2)
            int r2 = r0.f3860b0
            r1.writeInt(r2)
            int r2 = r0.f3861c0
            r1.writeInt(r2)
            int r2 = r0.f3862d0
            r1.writeInt(r2)
            int r2 = r0.f3863e0
            r1.writeInt(r2)
            byte[] r2 = r0.f3864f0
            r1.writeByteArray(r2)
            return
    }
}
