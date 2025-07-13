package p051d5;

/* renamed from: d5.a */
/* loaded from: classes.dex */
public final class C1282a extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1282a> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6762Z;

    /* renamed from: a0 */
    public final java.lang.String f6763a0;

    /* renamed from: b0 */
    public final int f6764b0;

    /* renamed from: c0 */
    public final byte[] f6765c0;

    /* renamed from: d5.a$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1282a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1282a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.a r0 = new d5.a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1282a[] newArray(int r1) {
                r0 = this;
                d5.a[] r1 = new p051d5.C1282a[r1]
                return r1
        }
    }

    static {
            d5.a$a r0 = new d5.a$a
            r0.<init>()
            p051d5.C1282a.CREATOR = r0
            return
    }

    public C1282a(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "APIC"
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.f6762Z = r0
            java.lang.String r0 = r3.readString()
            r2.f6763a0 = r0
            int r0 = r3.readInt()
            r2.f6764b0 = r0
            byte[] r3 = r3.createByteArray()
            r2.f6765c0 = r3
            return
    }

    public C1282a(java.lang.String r2, java.lang.String r3, int r4, byte[] r5) {
            r1 = this;
            java.lang.String r0 = "APIC"
            r1.<init>(r0)
            r1.f6762Z = r2
            r1.f6763a0 = r3
            r1.f6764b0 = r4
            r1.f6765c0 = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L39
            java.lang.Class<d5.a> r2 = p051d5.C1282a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L39
        L10:
            d5.a r5 = (p051d5.C1282a) r5
            int r2 = r4.f6764b0
            int r3 = r5.f6764b0
            if (r2 != r3) goto L37
            java.lang.String r2 = r4.f6762Z
            java.lang.String r3 = r5.f6762Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L37
            java.lang.String r2 = r4.f6763a0
            java.lang.String r3 = r5.f6763a0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L37
            byte[] r2 = r4.f6765c0
            byte[] r5 = r5.f6765c0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
        L39:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f6764b0
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.f6762Z
            r2 = 0
            if (r0 == 0) goto L11
            int r0 = r0.hashCode()
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.f6763a0
            if (r0 == 0) goto L1d
            int r2 = r0.hashCode()
        L1d:
            int r1 = r1 + r2
            int r1 = r1 * 31
            byte[] r0 = r3.f6765c0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // p051d5.AbstractC1289h, p427y4.C7110a.b
    /* renamed from: p */
    public void mo32p(p088f4.C2021k0.b r3) {
            r2 = this;
            byte[] r0 = r2.f6765c0
            int r1 = r2.f6764b0
            r3.m5313b(r0, r1)
            return
    }

    @Override // p051d5.AbstractC1289h
    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.f6790Y
            java.lang.String r1 = r6.f6762Z
            java.lang.String r2 = r6.f6763a0
            r3 = 25
            int r3 = p064e.C1489c.m4038a(r0, r3)
            int r3 = p064e.C1489c.m4038a(r1, r3)
            int r3 = p064e.C1489c.m4038a(r2, r3)
            java.lang.String r4 = ": mimeType="
            java.lang.String r5 = ", description="
            java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r3, r0, r4, r1, r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6762Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f6763a0
            r1.writeString(r2)
            int r2 = r0.f6764b0
            r1.writeInt(r2)
            byte[] r2 = r0.f6765c0
            r1.writeByteArray(r2)
            return
    }
}
