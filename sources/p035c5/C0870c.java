package p035c5;

/* renamed from: c5.c */
/* loaded from: classes.dex */
public final class C0870c implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p035c5.C0870c> CREATOR = null;

    /* renamed from: Y */
    public final byte[] f4709Y;

    /* renamed from: Z */
    public final java.lang.String f4710Z;

    /* renamed from: a0 */
    public final java.lang.String f4711a0;

    /* renamed from: c5.c$a */
    public class a implements android.os.Parcelable.Creator<p035c5.C0870c> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p035c5.C0870c createFromParcel(android.os.Parcel r2) {
                r1 = this;
                c5.c r0 = new c5.c
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p035c5.C0870c[] newArray(int r1) {
                r0 = this;
                c5.c[] r1 = new p035c5.C0870c[r1]
                return r1
        }
    }

    static {
            c5.c$a r0 = new c5.c$a
            r0.<init>()
            p035c5.C0870c.CREATOR = r0
            return
    }

    public C0870c(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            byte[] r0 = r2.createByteArray()
            java.util.Objects.requireNonNull(r0)
            r1.f4709Y = r0
            java.lang.String r0 = r2.readString()
            r1.f4710Z = r0
            java.lang.String r2 = r2.readString()
            r1.f4711a0 = r2
            return
    }

    public C0870c(byte[] r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f4709Y = r1
            r0.f4710Z = r2
            r0.f4711a0 = r3
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

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<c5.c> r0 = p035c5.C0870c.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            c5.c r3 = (p035c5.C0870c) r3
            byte[] r0 = r2.f4709Y
            byte[] r3 = r3.f4709Y
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.f4709Y
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public void mo32p(p088f4.C2021k0.b r2) {
            r1 = this;
            java.lang.String r0 = r1.f4710Z
            if (r0 == 0) goto L6
            r2.f9135a = r0
        L6:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4710Z
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4711a0
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.f4709Y
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\""
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            byte[] r2 = r0.f4709Y
            r1.writeByteArray(r2)
            java.lang.String r2 = r0.f4710Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f4711a0
            r1.writeString(r2)
            return
    }
}
